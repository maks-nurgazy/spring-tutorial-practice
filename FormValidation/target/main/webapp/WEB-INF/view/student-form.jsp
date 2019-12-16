<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <title>Student registration from</title>
</head>
<body>

    ${pageContext.request.contextPath}

    <form:form action="processFrom" modelAttribute="student">
        First name: <form:input path="firstName"/>
        <br><br>
        Last name: <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>
        <br><br>

        <form:select path="country">
            <form:options items="${theCountryOptions}"/>
        </form:select>

        <br><br>

        Java <form:radiobutton path="favoriteLanguage" value="Java"/>
        C# <form:radiobutton path="favoriteLanguage" value="C#"/>
        PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
        Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
        <br><br>

        Linux<form:checkbox path="operatingSystems" value="Linux"/>
        Mac OS<form:checkbox path="operatingSystems" value="Max OS"/>
        MS Windows<form:checkbox path="operatingSystems" value="MS Windows"/>

        <br><br>
        <input type="submit" value="Submit"/>

    </form:form>




</body>
</html>