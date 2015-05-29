
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

<form:form action="denetlemeform.html" commandName="kullanici">

 <table>
      <tr>
        <td>Kullanıcı Adı:   </td>   
        <td><form:input path="kullaniciAdi"/>    <font color="red"><form:errors path="kullaniciAdi" /> </font>    </td> 
      </tr>
  
   	   <tr>
        <td>Maas: </td>  <td><form:input path="maas"/>    <font color="red"><form:errors path="maas" /> </font>    </td> 
      </tr> 
      
      
      <tr>
        <td>Email: </td>      <td><form:password path="parola"/>    <font color="red"><form:errors path="parola" /> </font>    </td> 
      </tr> 
      
       <tr>
        <td></td>   
        <td><input type="submit" value="Gönder"/></td> 
      </tr> 
  </table>
 
</form:form>



</body>
</html>
