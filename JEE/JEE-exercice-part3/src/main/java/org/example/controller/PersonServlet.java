package org.example.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.model.Personne;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/persons")
public class PersonServlet extends HttpServlet {

    private List<Personne> personneList;

    @Override
    public void init() throws ServletException {
        this.personneList = new ArrayList<>();
        personneList.add(new Personne("John","Doe",15));
        personneList.add(new Personne("Bill","Bob",55));
        personneList.add(new Personne("James","Dunn",45));
        personneList.add(new Personne("Joel","Bim",22));

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("personnes", personneList);
        req.getRequestDispatcher("/WEB-INF/person/list.jsp").forward(req,resp);
    }
}
