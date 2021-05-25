<%-- 
    Document   : listar
    Created on : 23/04/2021, 11:42:19 PM
    Author     : bryan
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="model.Cliente"%>
<%@page import="model.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    
    </head>
    <body>
        <div class="container">
            <h1>Clientes</h1>
            <br>
            <br>
            <%
                ClienteDAO dao = new ClienteDAO();
                String usuario = request.getParameter("txtusuario");
                String pass = request.getParameter("txtContrasena");
                Cliente cl = dao.list(usuario, pass);
                if (cl.getNombre() != null) {
             
                %>
            <table class="table table-sm table-hover table-bordered">
                <thead class="bg-info">
                    <tr>
                        <th class="text-center" scope="col">ID</th>
                        <th class="text-center" scope="col">Tipo Id</th>
                        <th class="text-center" scope="col">Nombre</th>
                        <th class="text-center" scope="col">Apellido</th>
                        <th class="text-center" scope="col">Usuario</th>
                        <th class="text-center" scope="col">Contrasena</th>
                        <th class="text-center" scope="col">Celular</th>
                        <th class="text-center" scope="col">Correo</th>
                    </tr>
                </thead>
                
                <tbody>
                    <tr scope="row">
                        <td class="text-center"><%=cl.getNroId()%></td>
                        <td class="text-center"><%=cl.getTipoId() %></td>
                        <td class="text-center"><%=cl.getNombre() %></td>
                        <td class="text-center"><%=cl.getApellido() %></td>
                        <td class="text-center"><%=cl.getUsuario() %></td>
                        <td class="text-center"><%=cl.getContrasena() %></td>
                        <td class="text-center"><%=cl.getNoCelular() %></td>
                        <td class="text-center"><%=cl.getCorreo() %></td>
                    </tr>
                </tbody>
            </table>
            <%
                }else{
                    System.out.println("error");
            %>
            <h4>Error en el inicio de sesión, verifique los datos</h4>
            <%
                }             
            %>
            <a class="btn btn-primary " href="index.jsp">Home</a>
        </div>
    </body>
</html>
