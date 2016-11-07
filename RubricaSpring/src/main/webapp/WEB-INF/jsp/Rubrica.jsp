<%@page import="it.alfasoft.gruppo.model.Voce"%>
<%@page import="java.util.List"%>
<%@page import="it.alfasoft.gruppo.dao.VoceDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" 
uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border ="1">
<thead>

<tr>
<th>nome</th> <th>cognome</th> <th>telefono</th>
</tr>

</thead>
<%
VoceDao vdao=new VoceDao();

List<Voce> voci=vdao.readAllVoci(1);

session.setAttribute("lista",voci);
%>
 <c:forEach items="${lista}" var="v">

	<tr>
	<td> <c:out value="${v.nomeVoce}"/></td>
	<td>  <c:out value="${v.cognomeVoce}"/></td>
	<td>  <c:out value="${v.telefono}"/></td>
	
	</tr>

</c:forEach> 
</table>
</body>
</html>