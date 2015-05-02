import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import java.sql.*;

@WebServlet(urlPatterns = {"/guestcheck"})
public class guestcheck extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        RequestDispatcher view;
        String str;
        int i=0;
        String name="";
        int j=0;
        ResultSet res=null;
        try {
            accessDB.connectDB();
            String s=accessDB.getUser();
            if(s.equals("")){
                view=request.getRequestDispatcher("guest.jsp");
                view.forward(request, response);
            }
            else{              
                str=request.getParameter("check");
                if(str.equals("Add To Cart")){
                    int it=accessDB.getItem();
                    String user=accessDB.getUser();
                    int ci=accessDB.getCustId(user);
                    res=accessDB.getCart(it,ci);
                    //request.setAttribute("cart",res);
                    try{
                    name=res.getString(1);
                    i=res.getInt(2);
                    j=res.getInt(2);
                    }catch(SQLException e){}
                    int total=accessDB.getTotal(it,ci);
                    request.setAttribute("product",name);
                    request.setAttribute("price",i);
                    request.setAttribute("count",j);
                    
                    request.setAttribute("total", total);    
                    view=request.getRequestDispatcher("cart.jsp");
                    view.forward(request, response);   
                }
                else
                    if(str.equals("Add")){
                        String comment=request.getParameter("comment");
                        int id=accessDB.getItem();
                        accessDB.addComment(comment,id);
                        view=request.getRequestDispatcher("home.jsp");
                        view.forward(request, response);                            
                                                
                    }
            }
            accessDB.stmnt.close();
            accessDB.cn.close();
                
        }catch(SQLException e){} 
        finally {
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
