<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Student registration from</title>
</head>
<body>

    <form:form action="processFrom" modelAttribute="student">
        First name: <form:input path="firstName"/>
        <br><br>
        Last name: <form:input path="lastName"/>
        <br><br>
        <input type="submit" value="Submit"/>

    </form:form>


</body>
</html>