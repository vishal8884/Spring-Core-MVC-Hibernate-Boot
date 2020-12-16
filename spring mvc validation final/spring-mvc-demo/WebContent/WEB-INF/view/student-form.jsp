<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form:form action="processForm" modelAttribute="student">

    First name : <form:input path="firstName" />  <!-- This sets the first name  -->
    <br>
    Last name : <form:input path="lastName" />
    <br>
    Country :
    <form:select path="country">
    
      <form:options items="${student.countryOptions}" />
      
      <%-- <form:option value="Brazil" label="Brazil" />
      <form:option value="France" label="France" />
      <form:option value="Germany" label="Germany" />
      <form:option value="India" label="India" /> --%>
      
    </form:select>
    
    <br><br>
    
    Favorite Language:
    
     <form:radiobuttons path="favourateLanguage" items="${student.favoriteLanguageOptions}"  />  <!-- This puts the selected options to path("favourateLanguage") which can be used in next page -->
   <%--  Java <form:radiobutton path="favourateLanguage" value="Java" />
    c# <form:radiobutton path="favourateLanguage" value="c#" />
    PHP <form:radiobutton path="favourateLanguage" value="PHP" />
    Ruby <form:radiobutton path="favourateLanguage" value="Ruby" /> --%>
    
    
    <br><br>
    
    Operating Systems:
    
    Linux <form:checkbox path="operatingSystems" value="Linux" />
    Mac os <form:checkbox path="operatingSystems" value="mac os" />
    Ms windows <form:checkbox path="operatingSystems" value="ms windows" />
    <input type="submit" value="submit" />
</form:form>






</body>
</html>