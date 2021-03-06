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
    <h1>Schüler bearbeiten</h1>

    <form method="post">
        <div class="form-group">
            <label for="firstName">Vorname</label>
            <input type="text" class="form-control" id="firstName" name="firstName">
            <label for="lastName">Nachname</label>
            <input type="text" class="form-control" id="lastName" name="lastName">
            <label for="contactEmail">Email</label>
            <input type="text" class="form-control" id="contactEmail" name="contactEmail">
            <label for="contactPhone">Telefonnummer</label>
            <input type="tel" class="form-control" id="contactPhone" name="contactPhone">
            <label for="birthDate">Geburtsdatum</label>
            <input type="date" class="form-control" id="birthDate" name="birthDate">

            <label for="parentFirstName">Vorname Eltern</label>
            <input type="text" class="form-control" id="parentFirstName" name="parentFirstName">
            <label for="parentLastName">Nachname Eltern</label>
            <input type="text" class="form-control" id="parentLastName" name="parentLastName">
            <label for="parentContactEmail">Email Eltern</label>
            <input type="email" class="form-control" id="parentContactEmail" name="parentContactEmail">
            <label for="parentContactPhone">Telefonnummer Eltern</label>
            <input type="tel" class="form-control" id="parentContactPhone" name="parentContactPhone">
            <%--            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
        </div>

        <button type="submit" class="btn btn-primary">Speichern</button>
    </form>
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
