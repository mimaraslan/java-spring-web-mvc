<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<title>Anasayfa</title>
</head>
<body>
	<div class="container">
		<h2>Anasayfa</h2>
		
		<div class="alert alert-warning">
			Müşteri <br>
			<a href="newMusteri">Ekle</a> | <a href="listAllMusteri">Listele</a>
			
		</div>
		<div class="alert alert-success">
			Kategori <br>
			<a href="newKategori">Ekle</a> | <a href="listAllMusteri">Listele</a>
		</div>

		<div class="alert alert-info">
		Ürün <br>
			<a href="newUrun">Ekle</a> | <a href="listAllUrun">Listele</a>
		</div>


		
		<div class="alert alert-danger">
			Sipariş <br>
			<a href="newSiparis">Ekle</a> | <a href="listAllSiparis">Listele</a>
		</div>
	</div>

</body>
</html>