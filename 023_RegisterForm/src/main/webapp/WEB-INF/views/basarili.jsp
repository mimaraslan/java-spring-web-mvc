<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<title>BAŞARILI</title>

</head>
<body>
<div class="container">
		<div class="alert alert-success">
			 <a href="registerform.html">Geri Git</a>
		</div>
</div>


    <div class="form-group">
      <label class="control-label col-sm-2" >Kulllanıcı Adı : </label>
      <div class="col-sm-10"> ${registerForm.kullaniciAdi} </div>
    </div>
    
    
    <div class="form-group">
      <label class="control-label col-sm-2">Parola:</label>
      <div class="col-sm-10"> ${registerForm.parola} </div>
    </div>
    

     <div class="form-group"> <label class="control-label col-sm-2" >Eposta:</label>
      <div class="col-sm-10">  ${registerForm.eposta}  </div>
    </div>
    


</body>
</html>
