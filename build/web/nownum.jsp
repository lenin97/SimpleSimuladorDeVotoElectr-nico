<%-- 
    Document   : nownum
    Created on : 17-abr-2016, 19:45:23
    Author     : Lenin
--%>

<%@page import="modelo.CandidateDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            
            #formcss{
	  	width: 500px;
	  	background-color: #00F;
	  	text-align: center;
	  	margin: 15px auto;
	  	padding: 15px;
	  	border: 3px solid #BFE8F4;
	  	border-radius: 15px;
	  	box-shadow: #999 45px 5px 10px;
	  	background: -moz-radial-gradient(center, ellipse, #2BDF4C,#DDED67);
	  	background: -webkit-linear-gradient(bottom,#2BDF4C,#DDED67);
	  	background: -ms-linear-gradient(bottom,#2BDF4C,#DDED67);
	  	/*outline: 2px dashed #00F;*/
	  	/*-moz-transform:scale(2,-1);*/
	  	/*-moz-transform:rotate(30deg);*/
	  	/*-moz-transform:skew(30deg);*/
                -moz-transition:-moz-transform 1s ease 0.5s;

	  }
          
          #table1{
              margin: auto;
              
          }
          #namecss{
              padding: 10px;
              border: 3px solid #BFE8F4;
	  	border-radius: 15px;
          }
          #btncss{
              margin: 30px;
              padding: 10px;
              border: 3px solid #BFE8F4;
	  	border-radius: 15px;
          }

	  #formcss:hover{
	         -moz-transform:rotate(30deg);	
	  }
        </style>
        
    </head>
    <body>
        <h1>Conteo hasta el momento</h1>
        
        <table border="0" id="table1">
                <thead>
                    <tr>
                        <th id="namecss">Nombre del Partido</th>
                        <th id="namecss">Votos emitidos</th>
                    </tr>
                </thead>
                <tbody>
                    <%
    CandidateDAO cdao= new CandidateDAO();
    %>
                    <tr>
                        <td id="namecss"><%=cdao.nmCandidate(1)%></td>
                        <td id="namecss"><%=cdao.numVotes(1)%></td>
                    </tr>
                    <tr>
                        <td id="namecss"><%=cdao.nmCandidate(2)%></td>
                        <td id="namecss"><%=cdao.numVotes(2)%></td>
                    </tr>
                    <tr>
                        <td id="namecss"><%=cdao.nmCandidate(3)%></td>
                        <td id="namecss"><%=cdao.numVotes(3)%></td>
                    </tr>
                    <tr>
                        <td><a href="index.html" >Regresar a Inicio</a><br></td>
                    </tr>
                </tbody>
            </table>
                        
    </body>
</html>
