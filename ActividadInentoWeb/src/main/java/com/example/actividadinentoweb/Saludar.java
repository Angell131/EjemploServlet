package com.example.actividadinentoweb;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/Saludar")
public class Saludar extends HttpServlet {

    public Saludar(){
        super();
    }

    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //response.setContentType("text/html");

        // Hello
        PrintWriter salida = response.getWriter();
        response.setContentType("text/html");
        String nombre = request.getParameter("nombre");
        salida.append("<!DOCTYPE html>");
        salida.append("<html>");
        salida.append("<head>");
        salida.append("<meta charset='UTF-8'>");
        salida.append("<title>Web dinámica</title>");
        salida.append("</head>");
        salida.append("<body>");

        salida.append("Hola Mundo");
        salida.append("<h1>¿Qué pasa contigo?</h1>");

        salida.append("</body>");
        salida.append("</html>");
    }

    public void destroy() {
    }
}