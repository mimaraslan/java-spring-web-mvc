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

<title>SONUÇ</title>

</head>
<body>


<div class="container">
        
  <table class="table table-hover">
    <thead>
      <tr>
        <th>ADI</th>
        <th>SOYADI</th>
        <th>EMAIL</th>
      </tr>
    </thead>
    <tbody>
  
      <tr>
        <td>${musteriModel.musteriAdi}</td>
        <td>${musteriModel.musteriSoyadi}</td>
        <td>${musteriModel.musteriEposta}</td>
      </tr>
      
      
    </tbody>
  </table>
</div>




</body>
</html>
