import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import java.sql.*;

@WebServlet(urlPatterns = {"/details"})
public class details extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        RequestDispatcher view;
        ResultSet r=null;//Initializing a ResultSet
        String name;
        String i_name;
        String img;
        int price;
        int id;
        int avail;
        String specs;
        String access;
        try {
            accessDB.connectDB();
            name=request.getParameter("Details");
            if(name.equals("iMac Details"))
                r=accessDB.itemdata("iMAC");
            if(name.equals("iMac Retina Details"))
                r=accessDB.itemdata("iMAC Retina");
            if(name.equals("iMac Mini Details"))
                r=accessDB.itemdata("iMAC Mini");
            if(name.equals("Macbook Air Details"))
                r=accessDB.itemdata("Macbook Air");
            if(name.equals("Macbook Pro Details"))
                r=accessDB.itemdata("Macbook Pro");
            if(name.equals("iPhone 4s Details"))
                r=accessDB.itemdata("iPhone 4s");
            if(name.equals("iPhone 5 Details"))
                r=accessDB.itemdata("iPhone 5");
            if(name.equals("iPhone 5s Details"))
                r=accessDB.itemdata("iPhone 5s");
            if(name.equals("iPhone 6 Details"))
                r=accessDB.itemdata("iPhone 6"); 
            if(name.equals("iPad Air 2 Details"))
                r=accessDB.itemdata("iPad Air 2");
            if(name.equals("iPad Air Details"))
                r=accessDB.itemdata("iPad Air");
            if(name.equals("iPad Mini 3 Details"))
                r=accessDB.itemdata("iPad Mini3");
            if(name.equals("iPad Mini 2 Details"))
                r=accessDB.itemdata("iPad Mini2");
            if(name.equals("iPad Mini Details"))
                r=accessDB.itemdata("iPad Mini");
            if(name.equals("iPod Touch Details"))
                r=accessDB.itemdata("iPod Touch");
            if(name.equals("iPod Nano Details"))
                r=accessDB.itemdata("iPod Nano");
            if(name.equals("iPod Shuffle Details"))
                r=accessDB.itemdata("iPod Shuffle");
            i_name=r.getString(2);
            id=r.getInt(1);
            img=r.getString(6);
            price=r.getInt(4);
            avail=r.getInt(3);
            specs=r.getString(5);
            access=r.getString(7);
            accessDB.setItem(id);
            request.setAttribute("i_name",i_name);
            request.setAttribute("img",img);
            request.setAttribute("price",price);
            request.setAttribute("avail",avail);
            request.setAttribute("specs",specs);
            request.setAttribute("access",access);
            r=accessDB.getComments(id);
            request.setAttribute("rates",r);
            view=request.getRequestDispatcher("product.jsp");
            view.forward(request, response);
            accessDB.stmnt.close();
            accessDB.cn.close();
            r.close();
            
        }catch(SQLException e){} finally {
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
