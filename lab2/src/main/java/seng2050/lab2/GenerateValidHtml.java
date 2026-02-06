package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GenerateValidHtml extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head> <title> Generated HTML </title> </head>");
        out.println("<body>");
        out.println("\t<h1> Welcome to the webpage!</h1>");
        out.println("\t<p>This is an example paragraph.</p>");
        out.println("</body>");
        out.println("</html>");

    }
}
