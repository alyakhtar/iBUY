import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

@WebServlet(urlPatterns = {"/register"})
public class register extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        RequestDispatcher view;
        try {
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
                view=request.getRequestDispatcher("home.jsp");
                view.forward(request, response);
            }
            accessDB.cn.close();
            accessDB.stmnt.close();
        } catch(SQLException e){}
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
