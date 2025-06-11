package org.example;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/personne-Servlet")
public class Personne extends HttpServlet {

    public String prenom;
    public String nom;
    public int age;
    public List<Personne> personnes;

    public Personne(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }


    @Override
    public void init() throws ServletException {
        personnes = new ArrayList<>();
        personnes.add(new Personne("John","Doe",15));
        personnes.add(new Personne("Bill","Bob",55));
        personnes.add(new Personne("James","Dunn",45));
        personnes.add(new Personne("Joel","Bim",22));

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("personnes",personnes);

        req.getRequestDispatcher("/list.jsp").forward(req,resp);
    }
}
