package org.example;

import org.example.dao.ProduitDAO;
import org.example.entity.Produit;
import org.example.util.SessionFactorySingleton;

import java.time.LocalDate;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProduitDAO produitDAO = new ProduitDAO(SessionFactorySingleton.getSession());

        Produit produit1 = Produit.builder().marque("V").dateAchat(LocalDate.now()).reference("XMFFNJNZKEJND13561161").price(125.55).stock(525).build();
        produitDAO.save(produit1);
    }
}