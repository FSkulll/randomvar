<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//RU" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><tiles:getAsString name="title"/></title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <style>
        *{
            margin:0;
            padding:0;
        }
        html, body {
            height:100%;
        }
        #container {
            position: fixed;
            top:0;
            left: 0;
            height: 100%;
            width: 100%;
            background-color: ghostwhite;
        }
        #content {
            min-height:60%;
            height:60%;
            padding: 5%;
            /*background-color: limegreen;*/
            background-image: url("/resources/images/new.jpeg");
            background-size: cover;
        }
        #login {
            width:800px;
            margin: 0 auto;
            height: 400px;
        }
        #header,#footer {
            min-height:20%;
        }
        .head {
            width: 360px;
            margin: 0 auto;
            color: white;
        }

        section {
            width: 50%;
            height: 50%;
            padding: .5em;
            float: left;
        }

        .sect {
            border: 1px dotted green;
            height: 100%;
            padding: 1em;
        }

        #login h1 {
            text-align: center;
        }
        #login h4{
            text-align: center;
        }
        #register {
            width: 100%;
            color: white;
            text-align: center;
        }

        #register a {
            text-decoration: underline;
            color: white;
        }
        .beatybtn {
            background-color: transparent;
            width: 520px;
            display: inline-block;
            color: white;
            font-weight: 700;
            text-decoration: none;
            user-select: none;
            padding: .5em 2em;
            outline: none;
            border: 2px solid;
            border-radius: 1px;
            transition: 0.2s;
        }
        #register a:hover {color:antiquewhite;}
        .beatybtn:hover { background: antiquewhite; color:limegreen;}
        .beatybtn:active { background: limegreen; }
    </style>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
        google.charts.load('current', {'packages':['corechart']});
        google.charts.setOnLoadCallback(drawChart);
        function drawChart() {
            var data1 = google.visualization.arrayToDataTable([${method0}]);
            var data2 = google.visualization.arrayToDataTable([${method1}]);
            var data3 = google.visualization.arrayToDataTable([${method2}]);
            var data4 = google.visualization.arrayToDataTable([${method3}]);
            var options = {
                bar: {groupWidth: "100%"},
                legend: {position:"none"},
                title: "M = ${m0}. D = ${d0} "

            };
            var options2 = {
                bar: {groupWidth: "100%"},
                legend: {position:"none"},
                title: "M = ${m1}. D = ${d1}"

            };
            var options3 = {
                bar: {groupWidth: "100%"},
                legend: {position:"none"},
                title: "M = ${m2}. D = ${d2}"

            };
            var options4 = {
                bar: {groupWidth: "100%"},
                legend: {position:"none"},
                title: "M = ${m3}. D = ${d3}"

            };
            var chart1 = new google.visualization.ColumnChart(document.getElementById('chart1'));
            var chart2 = new google.visualization.ColumnChart(document.getElementById('chart2'));
            var chart3 = new google.visualization.ColumnChart(document.getElementById('chart3'));
            var chart4 = new google.visualization.ColumnChart(document.getElementById('chart4'));
            chart1.draw(data1, options);
            chart2.draw(data2, options2);
            chart3.draw(data3, options3);
            chart4.draw(data4, options4);
        }
    </script>

</head>
<body>
    <div id="container">

        <tiles:insertAttribute name="header"/>
        <tiles:insertAttribute name="content"/>
        <tiles:insertAttribute name="footer"/>
    </div>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

</body>
</html>
