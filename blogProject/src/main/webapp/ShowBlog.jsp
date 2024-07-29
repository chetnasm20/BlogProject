<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="org.hibernate.Query" %>
    <%@page import="com.connection.FactoryProvider" %>
    <%@page import="org.hibernate.Session" %>
    <%@page import="com.model.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="all_css.html" %>
<br><br>
<div class="container w-50 text-white text-center">

<table class="table table-bordered w-75 bg-info">
<caption><h1>Blog Info</h1></caption>
<thead>
<tr>
<th>Blog Title</th>
<th>Author</th>
<th>Description</th>
<th colspan=2>Action<th>
</tr>
</thead>

<%

Session session1=FactoryProvider.getFactory().openSession();
Query q=session1.createQuery("from Blog");
List<Blog>list=q.list();

for(Blog b:list)
{

%>
<tbody>
<tr>
<td><%=b.getTitle() %></td>
<td><%=b.getAuthor() %></td>
<td><%=b.getDescription() %></td>


<td><a href="UpdateServlet?id=<%=b.getBlogId()%>">Edit</a></td>
<td><a href="DeleteServlet?id=<%=b.getBlogId()%>">Delete</a></td>
</tr>
</tbody>

<% 
}
%>
</table>
</div>
</body>
</html>