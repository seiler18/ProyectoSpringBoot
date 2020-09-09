<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de Ingreso</title>
</head>
<!--CSS de Bootstrap 4.2.1-->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
  <!--Mi CSS-->
  <link rel="stylesheet" href="style.css">
 
    
<body>
  <div class="container">
    <div class="row">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card card-signin my-4">
          <div class="card-body">
            <h5 class="card-title text-center">Ingresar al sistema</h5>
           
           
            <form class="form-signin" action="SistemaWeb" method="get">
              <div class="form-label-group">
                <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
                <label for="inputEmail">&nbsp;&nbsp; Correo electronico</label>
              </div>

              <div class="form-label-group">
                <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
                <label for="inputPassword">&nbsp;&nbsp; Contraseña</label>
              </div>

              <div class="custom-control custom-checkbox mb-3">
                <input type="checkbox" class="custom-control-input" id="customCheck1">
                <label class="custom-control-label" for="customCheck1">Recordar contraseña</label>
              </div>
              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Ingresar al sistema</button>
              <br>
              <button class="btn btn-lg btn-primary btn-block text-uppercase" onclick="location.href='Bienvenidos.html'">Volver al inicio</button>

            </form>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
   <!--Ajax-->
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
  <!--jQuery 3.3.1 -->
    <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
  <!--Mi script-->
    <script src="script.js"></script>
</body>
</html>