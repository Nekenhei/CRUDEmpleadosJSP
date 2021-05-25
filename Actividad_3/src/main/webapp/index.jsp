<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <br>
            <br>
            <h1>Actividad 3 - UMB</h1>
            <p>
                <H3>Esteban Giraldo</H3>
                2021
            </p>
            <p>
                <h4>Ingrese su usuario y contraseña para iniciar sesión</h4>
            </p>
            
            <form class="form-inline" action="srvController">
                <div class="form-group">
                    <label for="usuario">Usuario:</label> 
                    <input class="form-control" type="text" name="txtusuario" id="usuario" placeholder="Ingrese su usuario" required><br>
                </div>
                <div class="form-group">
                    <label for="contrasena">Contraseña:</label>
                    <input class="form-control" type="password" name="txtContrasena" id="contrasena" placeholder="Ingrese la contraseña" required><br>
                </div>
                <input class="btn btn-success btn-lg" type="submit" name="accion" value="Buscar">
            </form>
        </div>
    </body>
</html>
