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

<title>Bilgi Giriş Formu</title>

</head>
<body>


<div class="container">
  <h2>Bilgi Giriş Formu</h2>
  
  <form class="form-horizontal" role="form" action="sonuc.htm" method="post" >
  
    <div class="form-group">
      <label class="control-label col-sm-2" for="kullaniciAdi"> Adı:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="kullaniciAdi" placeholder="Kullanıcı adını giriniz.">
      </div>
    </div>
    
    
     <div class="form-group">
      <label class="control-label col-sm-2" for="kullaniciSoyadi"> Soyadı:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="kullaniciSoyadi" placeholder="Kullanıcı soyadını giriniz.">
      </div>
    </div>
    
    
      <div class="form-group">
      <label class="control-label col-sm-2" for="eposta">Eposta:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" name="eposta" placeholder="Epostanızı giriniz.">
      </div>
    </div>
    
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Gönder</button>
      </div>
    </div>
  </form>
</div>


</body>
</html>
