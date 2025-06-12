package org.example.jeeexercice5.controller;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.jeeexercice5.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "chienServlet", value = "/chien-servlet")
public class ChienServlet extends HttpServlet {
private String message;
protected Session session;
private SessionFactory sessionFactory;


    public void init() {
        message = "test";
        sessionFactory = HibernateSession.getSessionFactory();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(new Chien("TEST"));
        session.getTransaction().commit();
        session.close();
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
