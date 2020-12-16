<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 The student is : ${studente.firstName}  ${student.lastName} <!-- jsp expression language -->
 
 <br><br>
 
 country : ${studente.country}
 
 <br><br>
 
 Favorite Language: ${studente.favourateLanguage}
 
 <br><br>
 
 <ul>
    <c:forEach var="temp" items="${studente.operatingSystems}">
    <li> ${temp}</li>
    </c:forEach>
 </ul>
</body>
</html>