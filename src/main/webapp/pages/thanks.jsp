<%--
  Created by IntelliJ IDEA.
  User: yakovlev
  Date: 2019-01-10
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="prefix.jsp">
    <jsp:param name="title" value="${title}" />
</jsp:include>
<h1>Thank you for this!</h1>
<p>you document sended on email</p>

<jsp:include page="postfix.jsp" />