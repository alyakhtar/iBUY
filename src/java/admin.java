import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.*;

@WebServlet(urlPatterns = {"/admin"})
public class admin extends HttpServlet {
    static Connection cn;
    static Statement stmnt;
    static String URL="jdbc:mysql://localhost:3306/";
    static String username="root";
    static String pass="password";
    String str;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher view;
        PrintWriter out = response.getWriter();
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){}
        try{
            cn= DriverManager.getConnection(URL,username,pass);
            stmnt=cn.createStatement();
        }catch(SQLException ex){}
        try{
            stmnt.execute("USE onlineproject");            
        }catch(SQLException exep){}       
        
        
        try {
            String s=request.getParameter("admin");
            if(s.equals("deleteuser")){
            str=request.getParameter("deleteUser");
            try{
                stmnt.executeUpdate("DELETE FROM customer WHERE c_name='"+str+"'");
            }catch(SQLException e){}
            view=request.getRequestDispatcher("actionperformed.jsp");
            view.forward(request, response);
            }
            
            if(s.equals("Add user")){
            accessDB.connectDB();
            String name=request.getParameter("name");
            String ph=request.getParameter("phone");            
            String email=request.getParameter("email");
            String passwd=request.getParameter("passwd");            
            String cpasswd=request.getParameter("cpasswd");
            String add1=request.getParameter("add1");
            String add2=request.getParameter("add2");
            String city=request.getParameter("city");
            String state=request.getParameter("state");
            String pin=request.getParameter("pin");
            String amount=request.getParameter("amount");
            if(name.equals("")||ph.equals("")||email.equals("")||passwd.equals("")||add1.equals("")||add2.equals("")||city.equals("")||state.equals("")||pin.equals("")||amount.equals(""))
            {
                view=request.getRequestDispatcher("Alldetails.jsp");
                view.forward(request, response);                
            }
            if(!passwd.equals(cpasswd)){
                view=request.getRequestDispatcher("Correctpass.jsp");
                view.forward(request, response);
            }
            else{
                accessDB.createUser(name,ph,email,passwd,cpasswd,add1,add2,city,state,pin,amount);
                view=request.getRequestDispatcher("actionperformed.jsp");
                view.forward(request, response);
            }
            }
            
            /*if(s.equals("View User")){
                String st=request.getParameter("uname");
                //ArrayList ar=new ArrayList();
                int i=0;
                try{
                    ResultSet r=stmnt.executeQuery("SELECT * FROM customer WHERE c_name='"+st+"'");
                    for(i=2;i<3;i++){
                        ar.add(r.getString(i));
                    }
                    request.setAttribute("name", r.getString(2));
                    
                    //i=r.getInt(1);
                    //ResultSet rs=stmnt.executeQuery("SELECT * FROM address WHERE c_id="+i);
                    for(i=2;i<7;i++){
                        ar.add(rs.getString(i));
                    }
                    //request.setAttribute("first", ar);
                    view=request.getRequestDispatcher("userdetail.jsp");
                    view.forward(request, response);
                }catch(SQLException e){}
                finally{
                
                }    */     
            if(s.equals("deletecomment")){
                try{
                    String cid=request.getParameter("cid");
                    String iid=request.getParameter("iid");
                    stmnt.executeUpdate("DELETE FROM ratings WHERE c_id="+cid+" AND i_id="+iid);
                    view=request.getRequestDispatcher("actionperformed.jsp");
                    view.forward(request, response);
                }catch(SQLException e){}
            
            }
            if(s.equals("additem")){
                String name=request.getParameter("name");
                String price=request.getParameter("price");
                String specs=request.getParameter("specs");
                String avail=request.getParameter("avail");
                String acc=request.getParameter("acc");
                String img=request.getParameter("img");
                try{
                    stmnt.executeUpdate("INSERT INTO items(i_name,avail,price,specs,img,acc) VALUES('"+name+"',"+avail+","+price+",'"+specs+"','"+img+"','"+acc+"')");
                    view=request.getRequestDispatcher("actionperformed.jsp");
                    view.forward(request, response);
                }catch(SQLException e){}
                
            }
            
        }finally {            
            out.close();            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
