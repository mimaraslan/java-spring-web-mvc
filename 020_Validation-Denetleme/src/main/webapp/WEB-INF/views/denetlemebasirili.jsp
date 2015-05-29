<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Sonuç Başarılı</title>
</head>
<body>

 <table>
      <tr>
        <td>GELEN KULLANICI ADI : </td>   
        <td><c:out value="${kullanici.kullaniciAdi}"/></td> 
      </tr>
  
      <tr>
        <td>GELEN MAAS: </td>    
        <td><c:out value="${kullanici.maas}"/></td> 
      </tr> 
      
       <tr>
        <td>GELEN PAROLA: </td>    
        <td><c:out value="${kullanici.parola}"/></td> 
      </tr> 
      
    
  </table>

<P>    </P>


</body>
</html>
