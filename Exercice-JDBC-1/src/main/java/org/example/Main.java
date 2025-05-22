package org.example;
import org.example.ConnectionUtils;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);
        Connection connection = null;
        try {
            connection = ConnectionUtils.getSQLConnection();
           /* System.out.println("On viens de se connecter a la BDD !!!");
            System.out.println("Merci de saisir le prénom : ");
            String firstName = scanner.nextLine();
            System.out.println("Merci de saisir le nom : ");
            String lastName = scanner.nextLine();
            System.out.println("Merci de saisir la date de diplome : ");
            String dateDiplome = scanner.nextLine();
            System.out.println("Merci de saisir le numéro de classe: ");
            int numClasse = scanner.nextInt();
             String request = "INSERT INTO etudiants (Prenom,Nom, Date, NumClass) values (?,?,?,?)";
            */
            String request2 = "SELECT * FROM etudiants ";
            PreparedStatement preparedStatement = connection.prepareStatement(request2);
            PreparedStatement statement = connection.prepareStatement(request2);
            ResultSet resultSet = statement.executeQuery(request2);
            System.out.println("Les étudiants: ");
            while(resultSet.next()){

                System.out.println("Son nom "+resultSet.getString("Nom"));
                System.out.println("Son prenom "+resultSet.getString("Prenom"));
                System.out.println("Son nom "+resultSet.getString("Date"));
                System.out.println("Son prenom "+resultSet.getInt("NumClass"));
            }
           /* preparedStatement.setString(1,firstName);
            preparedStatement.setString(2,lastName);
            preparedStatement.setString(3,dateDiplome);
            preparedStatement.setInt(4,numClasse);
            */
            /*
            int nbrRows = preparedStatement.executeUpdate(); // retour int qui correspond au nombres de ligne affecter
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            System.out.println("Nombre de ligne : "+nbrRows);
            if(resultSet.next()){
                System.out.println("Id de la ligne inserer : "+resultSet.getInt(1));
            }
            */
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            // fermer la connexion dans le bloc finally pour garantir sa fermeture
            if (connection != null){
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

    }
}