<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">

<title>商品確認画面</title>
</head>
<body>

    <div id="header">
    </div>
    <div id="main">
        <div id="top">
                   <p>itemCreateComplete</p>


        </div>
        <div>
                   <h3>商品登録が完了しました。</h3>
                   <div>
                       <a href='<s:url action ="AdminAction"/>'>管理者ＴＯＰへ</a>
                   </div>

        </div>

    </div>
    <div id="footer">
    </div>

</body>
</html>