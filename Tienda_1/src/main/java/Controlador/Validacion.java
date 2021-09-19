/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Tiendas;
import Modelo.Tiendas_DB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author merynairsaenzrodriguez
 */
public class Validacion extends HttpServlet {

    Tiendas_DB tdDB = new Tiendas_DB();
    Tiendas td = new Tiendas();
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Validacion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Validacion at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion= request.getParameter("accion");
       if(accion.equals("Ingresar")){
           String user=request.getParameter("txtuser");
           String pass=request.getParameter("txtpass");
           td=tdDB.validar(user, pass);
           if(td.getUser() !=null){
               request.getRequestDispatcher("Controlador?accion=Principal").forward(request,response);
           }else{
               request.getRequestDispatcher("index.jsp").forward(request,response);
           }
        }
    }
}