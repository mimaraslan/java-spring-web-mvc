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
<title>Müşteri Bilgisi</title>
<!-- Bootstrap CSS -->
<%-- <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"> --%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
	
	<style type="text/css">
	.myrow-container {
		margin-top: 20px;
	}
	</style>
</head>
<body class=".container-fluid">
	<div class="container myrow-container">
		<div class="panel panel-warning">
			<div class="panel-heading">
				<h3 class="panel-title">Müşteri Bilgisi</h3>
				 <div align="right"><a href="listAllMusteri">Müşteri Listele</a></div>
			</div>
			<div class="panel-body">
				<form:form id="musteriRegisterForm" cssClass="form-horizontal"
					modelAttribute="musteri" method="post" action="saveMusteri">
				
				   <form:hidden path="musteriId" value="${musteriObject.musteriId}" />

					<div class="form-group">
						<form:label path="musteriNo" cssClass="control-label col-xs-3">No</form:label>
						<div class="col-xs-6">
							<form:input cssClass="form-control" path="musteriNo"
								value="${musteriObject.musteriNo}" />
						</div>
					</div>

					<div class="form-group">
						<div class="control-label col-xs-3">
							<form:label path="musteriAdi">Adi</form:label>
						</div>
						<div class="col-xs-6">
							<form:input cssClass="form-control" path="musteriAdi" value="${musteriObject.musteriAdi}" />
						</div>
					</div>


					<div class="form-group">
						<div class="control-label col-xs-3">
							<form:label path="musteriSoyadi">Soyadı</form:label>
						</div>
						<div class="col-xs-6">
							<form:input cssClass="form-control" path="musteriSoyadi"
								value="${musteriObject.musteriSoyadi}" />
						</div>
					</div>


			
					<div class="form-group">
						<div class="row">
							<div class="col-xs-4"></div>
							<div class="col-xs-4">
								<input type="submit" id="saveMusteri" class="btn btn-primary"
									value="Kaydet" onclick="return submitMusteriForm();" />
							</div>
							<div class="col-xs-4"></div>
						</div>
					</div>

				</form:form>
			</div>
		</div>
	</div>

	




	<script type="text/javascript">
		function submitMusteriForm() {

			var musteriAdi = $('#musteriAdi').val().trim();
			var musteriSoyadi = $('#musteriSoyadi').val().trim();
			var musteriNo = $('#musteriNo').val();

			if (musteriAdi.length == 0) {
				alert('Lütfen bir isim giriniz!');
				$('#musteriAdi').focus();
				return false;
			}

			if (musteriSoyadi.length == 0) {
				alert('Lütfen bir soyisim giriniz!');
				$('#musteriSoyadi').focus();
				return false;
			}

			if (musteriNo < 0) {
				alert('Lütfen geçerli bir no giriniz.');
				$('#musteriNo').focus();
				return false;
			}

			return true;
		};
	</script>





</body>
</html>