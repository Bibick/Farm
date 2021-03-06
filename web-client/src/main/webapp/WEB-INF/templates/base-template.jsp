<%--
  Created by IntelliJ IDEA.
  User: istrakhouski
  Date: 2/10/14
  Time: 12:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>
        <tiles:getAsString name="title" />
    </title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/ext-all.css" type="text/css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/ext-all-debug.js"></script>
</head>
<body>

<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="navigation" />
<tiles:insertAttribute name="content" />
<tiles:insertAttribute name="footer" />

</body>
</html>
