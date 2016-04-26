<%-- 
    Document   : prueba
    Created on : 19-abr-2016, 13:26:17
    Author     : Lenin
--%>

<%@page import="modelo.CandidateDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">CEDULA DE VOTACION</div>
        <form action="vote.jsp" id="formcss" method="post">
            <table border="0" id="table1">
                <thead>
                    <tr>
                        <th id="namecss">Nombre del Partido</th>
                        <th id="namecss">Simbolo</th>
                    </tr>
                </thead>
                <tbody>
                    <%
    CandidateDAO cdao= new CandidateDAO();
            int i=0;
            while(i<3){
            
    %>
                    <tr>
                        <td id="namecss"><%=cdao.nmCandidate(i+1)%></td>
                        <td><img src="<%=cdao.pathIcon(i+1)%>" width="200" height="200"></td>
                        <td id="namecss"><input type="radio" name="candidate" value="1"/></td>
                    </tr>    
                    <%
           i=i+1;
            }
                    %>
                    <tr>
                        <td><input type="submit" value="Registrar" id="btncss"/></td>
                        <td><input type="reset" value="Cancelar" id="btncss"/></td>          
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
