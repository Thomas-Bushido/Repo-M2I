package org.example.jeeexercice5;

import org.example.jeeexercice5.controller.Chien;
import org.example.jeeexercice5.dao.ChienDAO;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChienDAO chiendao = new ChienDAO();
        Chien chien1 = Chien.builder().name("Idefix").race("F").date("2015").build();
        Chien chien2 = Chien.builder().name("Rox").race("H").date("2020").build();
        Chien chien3 = Chien.builder().name("Milou").race("L").date("2023").build();
        Chien chien4 = Chien.builder().name("Bob").race("N").date("2025").build();
        Chien chien5 = Chien.builder().name("Mike").race("X").date("2022").build();

        List<Chien> chiens = List.of(chien1,chien2,chien3,chien4,chien5);

        for(Chien c: chiens){
            chiendao.save(c);
        }

    }
}
