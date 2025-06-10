package org.example.jeeexercice1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servlet2", value="/servlet2")
public class Servlet2 extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("ok");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/htm");
        PrintWriter writer = resp.getWriter();
        writer.println("ce texte est en html");
    }
}

