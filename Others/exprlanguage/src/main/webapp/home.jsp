<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Expression Language</title>
</head>
<body>
    <form action="" method="post">
        <fieldset>
            <div>
                <label for="firstName">Imię</label>
                <input name="firstName" id="firstName">
            </div>
            <div>
                <label for="lastName">Nazwisko</label>
                <input name="lastName" id="lastName">
            </div>
            <div>
                <label for="age">Wiek</label>
                <input type="number" name="age" id="age">
            </div>
        </fieldset>
        <input type="submit" value="Wyślij">
    </form>
<%
    if ((request.getAttribute("person")) != null) {
%>
    <h2>Cześć ${person.firstName}</h2>
    <p style="color: ${person.age ge 18 ? 'green' : 'red'}">
    ${person.age ge 18 ? 'Jesteś pełnoletni' : 'Jesteś niepełnoletni'}
    </p>
    <p>Informacje o Twojej przeglądarce: ${header['user-agent']}</p>
<%
    }
%>
</body>
</html>