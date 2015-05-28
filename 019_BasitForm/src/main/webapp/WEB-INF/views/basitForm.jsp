
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Anasayfa</title>
</head>
<body>

<form:form action="formsonuc.html" commandName="kullanici">

 <table>
      <tr>
        <td>Kullanıcı Adı: </td>   
        <td><form:input path="kullaniciAdi"/></td> 
      </tr>
  
      <tr>
        <td>Email: </td>   
        <td><form:input path="email"/></td> 
      </tr> 
      
       <tr>
        <td></td>   
        <td><input type="submit" value="Gönder"/></td> 
      </tr> 
  </table>
 
</form:form>



</body>
</html>
