<%--
  Created by IntelliJ IDEA.
  User: Titan
  Date: 03/05/2020
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <h1>Schüler anzeigen</h1>

    <form method="post" action="/students/search">
        <div class="form-group">
            <label for="searchString">Suchbegriff</label>
            <input type="text" class="form-control" id="searchString" name="searchString">
            <%--            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
        </div>

        <button type="submit" class="btn btn-primary">Suchen</button>
    </form>

    <table class="table">
        <thead>
        <tr>
            <th>Vorname</th>
            <th>Nachname</th>
            <th>Geburtstag</th>
            <th>Beigetreten am</th>
            <th><a href="${pageContext.request.contextPath}/students/add">Neu</a></th>
        </tr>
        </thead>
        <tr>
            <td>Maxi</td>
            <td>Moser</td>
            <td>19.11.1997</td>
            <td>03.05.2020</td>
            <td><a href="/students/edit">Bearbeiten</a> <a href="/students/delete">Löschen</a></td>
        </tr>
        <tbody>

        </tbody>
    </table>
</div>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>

</body>
</html>
