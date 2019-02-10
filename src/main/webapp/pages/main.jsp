<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="prefix.jsp">
    <jsp:param name="title" value="${title}"/>
</jsp:include>
<h1>Main page</h1>
<h3>From server: ${test}</h3>
<p>Date: <%=request.getAttribute("date")%></p>
</br>
<ui>
    <li><a href="main">Main</a></li>
    <li><a href="catalog">Catalog</a></li>
    <li><a href="product">Product</a></li>
    <li><a href="cart">Cart</a></li>
    <li><a href="order">Order</a></li>
</ui>
</br>
<h2>Scriplet</h2>
<ui>
<% for (String value: (List<String>)request.getAttribute("list")) {%>
    <li><%=value%></li>
<%}%>
</ui>

<h2>JSTL</h2>

<p>Date: <c:out value="test"/></p>
<ui>

<c:forEach var="val" items="#{list}" varStatus="iterator">
    <li>${iterator.index+1} <c:out value="${val}" /></li>
</c:forEach>
</ui>
<jsp:include page="postfix.jsp" />