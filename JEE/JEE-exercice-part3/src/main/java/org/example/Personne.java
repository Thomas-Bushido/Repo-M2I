package org.example;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "personne", value = "/personne")
public class Personne extends HttpServlet {

    private String prenom;
    private String nom;
    private int age;
    private List<Personne> personnes;

    public Personne(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }

    @Override
    public void init() throws ServletException {
        prenom = "John";
        nom = "Doe";
        age = 19;
        personnes = new ArrayList<>();
        personnes.add(new Personne("John","Doe",15));
        personnes.add(new Personne("Bill","Bob",55));
        personnes.add(new Personne("James","Dunn",45));
        personnes.add(new Personne("Joel","Bim",22));

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("nom",nom);
        req.setAttribute("prenom",prenom);
        req.setAttribute("age",age);
        req.getRequestDispatcher("/list.jsp").forward(req,resp);
    }
}
