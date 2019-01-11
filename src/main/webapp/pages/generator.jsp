<%--
  Created by IntelliJ IDEA.
  User: yakovlev
  Date: 2019-01-10
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="prefix.jsp">
    <jsp:param name="title" value="${title}" />
</jsp:include>
<h1>On-line generator</h1>
<form method="post" action="generator">
    <input type="text" placeholder="payer">
    <input type="text" placeholder="recipient">
    <input type="text" placeholder="number">
    <input type="text" placeholder="date">
    <input type="text" placeholder="productName">
    <input type="text" placeholder="value">
    <input type="text" placeholder="cost">
    <input type="text" placeholder="mail">
    <button type="submit">submit</button>
</form>
<jsp:include page="postfix.jsp" />