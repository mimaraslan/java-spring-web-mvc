<%--
  User: Mimar Aslan
  Date: 25/11/2015
  Time: 9:00 PM
  --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="author" content="Mimar Aslan">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Müşteri Listele</title>
    <!-- Bootstrap CSS -->
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>    
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    
    <%-- <script src="<c:url value="/resources/js/jquery-2.1.3.js"/>"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>    --%>
    <%-- <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"> --%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <style type="text/css">
        .myrow-container {
            margin: 20px;
        }
    </style>
    
    
</head>
<body class=".container-fluid">
<div class="container myrow-container">
    <div class="panel panel-warning">
        <div class="panel-heading">
            <h3 class="panel-title">
                <div align="left"><b>Müşteri Listele</b> </div>
                <div align="right"><a href="newMusteri">Müşteri Ekle</a></div>
            </h3>
        </div>
        <div class="panel-body">
            <c:if test="${empty musteriListe}">
                Kayıt yok.
            </c:if>
            <c:if test="${not empty musteriListe}">   
            
            	<form action="searchMusteri">
            		<div class="row">
					  <div class="col-md-4">
						  Ada göre ara: <input type='text'  name='searchAdi' id='searchAdi'/> 
						  <input class="btn btn-warning" type='submit' value='Ara'/>
					  </div>
					</div>
            	</form>         	
            	            	
                <table class="table table-hover table-bordered">
                    <thead style="background-color: #F2F5A9;">
                    <tr>
                        <th>Id</th>
                        <th>No</th>
                        <th>Adı</th>
                        <th>Soyadı</th>
                        <th>Düzenle</th>
                        <th>Sil</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${musteriListe}" var="mus">
                        <tr>
                        	<th><c:out value="${mus.musteriId}"/></th>
                        	<th><c:out value="${mus.musteriNo}"/></th>
                        	<th><c:out value="${mus.musteriAdi}"/></th>
                        	<th><c:out value="${mus.musteriSoyadi}"/></th>
                        	<th><a href="editMusteri?id=<c:out value='${mus.musteriId}'/>">Düzenle</a></th>
                        	<th><a href="removeMusteri?id=<c:out value='${mus.musteriId}'/>">Sil</a></th>                         	
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
    </div>
 </div>   
   

</body>
</html>