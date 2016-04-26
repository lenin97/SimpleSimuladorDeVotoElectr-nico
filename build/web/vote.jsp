<%-- 
    Document   : vote
    Created on : 17-abr-2016, 19:44:02
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
    <%
          String cdt=request.getParameter("candidate");
                    
          if(cdt==null  || cdt.length()==0 ){
              

        %>
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
    int i=0,j=0;
    j=cdao.numOfCandidates();
            while(i<j){
    %>
                    <tr>
                        <td id="namecss"><%=cdao.nmCandidate(i+1)%></td>
                        <td><img src="<%=cdao.pathIcon(i+1)%>" width="200" height="200"></td>
                        <td id="namecss"><input type="radio" name="candidate" value="<%=(i+1)%>"/></td>
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
    <%
          } else{
              CandidateDAO cdao= new CandidateDAO();
             cdao.addVote(Integer.parseInt(cdt)); 
           %>          
           <jsp:forward page="outvote.jsp"></jsp:forward>
        <%
          }
        %>
</html>
