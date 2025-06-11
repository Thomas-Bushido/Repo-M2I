<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2025
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Formulaire</title>
</head>
<body>
<h1>Formulaire :</h1>
<form action="form" method="post">
  <div>
    <label for="name">name : </label>
    <input type="text" name="name" id="name">
  </div>
  <div>
    <label for="race">race : </label>
    <input type="text" name="race" id="race">
  </div>
  <div>
    <label for="food">food: </label>
    <input type="text" name="food" id="food">
  </div>
  <div>
    <label for="date">date: </label>
    <input type="text" name="date" id="date">
  </div>
  <button>Ajouter</button>
</form>

</body>
</html>
