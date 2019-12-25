<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">

<title>削除完了画面</title>
</head>
<body>

    <div id="header">
    </div>
    <div id="main">
        <div id="top">
                  <p>ItemListDeleteComplete</p>
        </div>

                  <h3><s:property value="message"/></h3>



            <div id="text-right">
            <p>HOME<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>



            </div>

    </div>
    <div id="footer">
    </div>


</body>
</html>