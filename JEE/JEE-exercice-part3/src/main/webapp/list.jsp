<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2025
  Time: 09:23
  To change this template use File | Settings | File Templates.
--%>

<jsp:useBean id="personnes" type="java.util.ArrayList<java.lang.String>" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>La liste des personnes</title>
</head>
<body>

<% for (String p: personnes) {%>
<p><%= p %></p>

<% } %>

</body>
</html>
