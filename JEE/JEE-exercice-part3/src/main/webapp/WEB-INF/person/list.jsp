<%@ page import ="org.example.model.Personne" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2025
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="personnes" type="java.util.ArrayList<org.example.model.Personne>" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste des personnes</title>
</head>
<body>
<h1>Liste des personnes</h1>
<%
for(Personne p : personnes){
    %>
   <p> <%= p.getNom()%><p>
   <p><%= p.getPrenom()%><p>
   <p><%= p.getAge()%><p>

<%}%>
</body>
</html>
