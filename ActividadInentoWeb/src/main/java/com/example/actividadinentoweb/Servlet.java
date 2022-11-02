package com.example.actividadinentoweb;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        description = "Esto es una pruena",
        urlPatterns = {"/Ejemplo"},
        initParams = {
                @WebInitParam(name = "Autor", value = "Angel"),
                @WebInitParam(name = "Fecha", value = "25/10/2022")
        }
)
public class Servlet extends HttpServlet {
    private String autor;
    private String fecha;

    public Servlet() {
        super();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        // TODO Auto-generated method stub
        super.init(config);
        autor = config.getInitParameter("Autor");
        fecha = config.getInitParameter("Fecha");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter salida = response.getWriter();

        response.setContentType("text/html");
        salida.append("<!DOCTYPE html>");
        salida.append("<html>");
        salida.append("<head>");
        salida.append("<meta charset='UTF-8'>");
        salida.append("<title>Web dinámica</title>");
        salida.append("</head>");
        salida.append("<body>");


        salida.append("<h1>¿Qué pasa contigo?</h1>");
        salida.append("<h1>¿Deberías de estar atendiendo a Amelia?</h1>");
        salida.append("Autor: "+autor+"<br/>");
        salida.append("Fecha: "+fecha);

        salida.append("</body>");
        salida.append("</html>");
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }



}
