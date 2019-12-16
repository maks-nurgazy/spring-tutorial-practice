<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Student confirmation</title>
</head>
<body>

    The student is confirmed: ${student.firstName}${student.lastName}
    <br><br>
    Country : ${student.country}
    <hr>
    <br><br>
    Favorite Language: ${student.favoriteLanguage}
    <hr>
    <br><br>
    Operating Systems: <br>

    <c:forEach var="systems" items="${student.operatingSystems}">
        <li>${systems}</li>
    </c:forEach>

</body>
</html>