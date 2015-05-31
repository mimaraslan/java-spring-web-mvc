<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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


<!-- 
<link rel="stylesheet" href="/resources/css/bootstrap.min.css" >
<link rel="stylesheet" href="/resources/css/bootstrap-theme.min.css" >
<script src="/resources/js/bootstrap.min.js"></script>
 -->



<title>Anasayfa</title>



</head>
<body>




	<div class="container">
		<h2>AÇILIŞ SAYFASI</h2>
		<div class="alert alert-success">
			<strong>Success!</strong> This alert box could indicate a successful
			or positive action.
		</div>
		<div class="alert alert-info">
			<strong>Info!</strong> This alert box could indicate a neutral
			informative change or action.
		</div>
		<div class="alert alert-warning">
			<strong>Warning!</strong> This alert box could indicate a warning
			that might need attention.
		</div>
		<div class="alert alert-danger">
			<strong>Danger!</strong> This alert box could indicate a dangerous or
			potentially negative action.
		</div>
	</div>



	<form id="musteriForm" name="musteriForm" method="post" action="listele.htm">

		<table>
			<tr>
				<td>Müşteri Adı :</td>
				<td><input type="text" name="musteriAdi" title=" Müşteri Adı"
					value="" /></td>

			</tr>

			<tr>
				<td>Müşteri Soyadı :</td>
				<td><input type="text" name="musteriSoyadi"
					title=" Müşteri Soyadı" value="" /></td>

			</tr>

			<tr>
				<td>Müşteri E-Posta :</td>
				<td><input type="text" name="musteriEposta"
					title=" Müşteri Adı" value="" /></td>
			</tr>

			<tr>
				<td></td>
				<td>
					<button type="submit">Ekle</button>
					<button type="reset">İptal</button>
				</td>
			</tr>
		</table>

	</form>



</body>
</html>








