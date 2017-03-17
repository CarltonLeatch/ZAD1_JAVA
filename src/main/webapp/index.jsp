<%--
  Created by IntelliJ IDEA.
  User: Carlton Leatch
  Date: 13.03.2017
  Time: 09:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>TestMe</title>
</head>
<body>
<form action = "calc" method = "post">
  <label>Kwota kredytu: <input type= "number" id = "kkredytu" name= "kkredytu" /></label></br>
  <label>Ilość rat: <input type ="number" id="ilosc_rat" name = "ilosc_rat"></label></br>
  <label>Oprocentowanie: <input type ="text" id="oprocentowanie" name = "oprocentowanie"></label></br>
  <label>Opłata stała: <input type ="number" id="oplata_stala" name = "oplata_stala"></label></br>
  <label><input type ="radio" name="typ" value = "malejaca" checked>Malejąca</label></br>
  <label><input type ="radio" name="typ" value = "stala" >Stała</label></br>
  <input type = "submit" value ="wyślij" />
</form>
</body>
</html>