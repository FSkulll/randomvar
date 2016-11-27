<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<div class="header">

    <c:if test="${username != 'guest' && user != null && username != null}">
        <nav class="navbar navbar-default">
            <div class="container">
                <form  action="/calculate" method="POST" class="navbar-form navbar-left">
                    <div class="form-group">
                        <input  type="number" name="str" class="form-control" value="${temp}"/>
                    </div>
                    <button type="submit" class="btn btn-default"><spring:message code="label.search"/></button>
                </form>
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><spring:message code="label.hello" />, ${username}<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="<c:url value="/logout" />"><spring:message code="label.logout"/> </a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
    </c:if>
</div>


