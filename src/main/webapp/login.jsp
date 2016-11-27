<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<div id="header"></div>
<div id="content">
    <div id="login">
        <div class="head">
            <h1>Начинаем работу</h1>
            <h4>Войдите в вашу учетную запись</h4>
        </div>

        <hr/>
        <c:if test="${not empty param.error}">
            <font color="red"> Login error
                : ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message} </font>
        </c:if>
        <form method="POST" action="<c:url value="/j_spring_security_check"/>" class="form-horizontal">
            <div class="form-group">
                <label for="username" class="col-md-2 control-label"></label>
                <div class="col-md-8">
                    <input id="username" type="email" name="j_username" class="form-control" placeholder="Email"/>
                </div>
            </div>
            <div class="form-group">
                <label for="password" class="col-md-2 control-label"></label>
                <div class="col-md-8">
                    <input id="password" type="password" name="j_password" class="form-control" placeholder="Password"/>
                </div>
            </div>
            <div class="form-group">
                <div class="col-md-offset-2 col-md-10">
                    <input type="submit" value="<spring:message code="label.login" />" class="beatybtn"/>
                    <%--<input type="reset" value="Reset" class="btn btn-default"/>--%>
                </div>
            </div>
        </form>
        <div id="register">
            Если у вас нет аккаунта <a href="/register"><spring:message code="label.registernew" /></a>
        </div>
    </div>
</div>