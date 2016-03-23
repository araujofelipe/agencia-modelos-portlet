<%@page import="br.com.seatecnologia.treinamento.model.*"%>
<%
	Modelo modelo = (Modelo)request.getAttribute("modeloContent");
%>

<%= modelo.getNome() %>