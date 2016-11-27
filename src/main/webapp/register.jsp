<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>



<%--<form:form method="post" action="create" commandName="user" cssClass="form-horizontal">--%>
        <%--<div class="form-group">--%>
            <%--<form:label path="username" cssClass="col-md-2 control-label">--%>
                <%--<spring:message code="label.email" />--%>
            <%--</form:label>--%>
            <%--<div class="col-md-4">--%>
                <%--<form:input path="username" cssClass="form-control"/>--%>
                <%--<form:errors path="username" cssClass="alert-danger"/>--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<div class="form-group">--%>
            <%--<form:label path="password" cssClass="col-md-2 control-label">--%>
                <%--<spring:message code="label.password" />--%>
            <%--</form:label>--%>
            <%--<div class="col-md-4">--%>
                <%--<form:password path="password" cssClass="form-control"/>--%>
                <%--<form:errors path="password" cssClass="alert-danger"/>--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<div class="form-group">--%>
            <%--<div class="col-md-offset-2 col-md-10">--%>
                <%--<input type="submit" class="btn btn-default" value="<spring:message code="label.register"/>" />--%>
            <%--</div>--%>
        <%--</div>--%>
<%--</form:form>--%>

<div id="header"></div>
<div id="content">
    <div id="login">
        <div class="head">
            <h1>Регистрация</h1>
            <h4>Получите доступ к просмотру диаграмм</h4>
        </div>

        <hr/>
        <form:form method="post" action="create" commandName="user" cssClass="form-horizontal">
            <div class="form-group">
                <form:label path="username" cssClass="col-md-2 control-label">
                    <%--<spring:message code="label.email" />--%>
                </form:label>
                <div class="col-md-8">
                    <input name="username" class="form-control" id="username" type="email" value="" placeholder="Email">
                    <form:errors path="username" cssClass="alert-danger"/>
                </div>
            </div>
            <div class="form-group">
                <form:label path="password" cssClass="col-md-2 control-label">
                    <%--<spring:message code="label.password" />--%>
                </form:label>
                <div class="col-md-8">
                    <input name="password" class="form-control" id="password" type="password" value="" placeholder="Password">
                    <form:errors path="password" cssClass="alert-danger" />

                </div>
            </div>
            <div class="form-group">
                <div class="col-md-offset-2 col-md-10">
                    <input type="submit" value="<spring:message code="label.register" />" class="beatybtn"/>
                    <%--<input type="reset" value="Reset" class="btn btn-default"/>--%>
                </div>
            </div>
        </form:form>
        <div id="register">
            Если у вас есть аккаунт <a href="/"><spring:message code="label.login" /></a>
        </div>
    </div>
</div>