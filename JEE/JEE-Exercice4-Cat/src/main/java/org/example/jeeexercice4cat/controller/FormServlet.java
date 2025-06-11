package org.example.jeeexercice4cat.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/form")
public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/addCat.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String race = req.getParameter("race");
        String food = req.getParameter("repaFavori");
        String date = req.getParameter("dateNaissance");
        System.out.println("vous avez poster un chat : ");
        System.out.println("nom : "+ name);
        System.out.println("race : "+race);
        System.out.println("repas favoris : "+food);
        System.out.println("date : "+date);
        doGet(req,resp);
    }
}