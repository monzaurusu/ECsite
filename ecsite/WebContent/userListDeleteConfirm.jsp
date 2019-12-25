<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">

<title>登録ユーザー削除確認画面</title>
</head>
<body>

 <div id="header">
    </div>
    <div id="main">
        <div id="top">
                   <p>UserListDeleteConfirm</p>
        </div>
                <h3>管理人以外のユーザーを削除しますがよろしいですか。</h3>
           <table>
            <tr>
            <td>
                <s:form action="UserListDeleteCompleteAction">
                <input type="hidden" name="deleteFlg" value="1">
                <s:submit value="削除"/>
                </s:form>
            </td>
            <td>
                <s:form action="UserListAction">
                <s:submit value="キャンセル"/>
                </s:form>
            </td>

            </tr>
            </table>


            <div id="text-right">
            <p>HOME<a href='<s:url action="GoHomeAction"/>'>こちら</a>

            <p>LOGOUT<a href='<s:url action="LoginAction"/>'>こちら</a>

            </div>
        </div>


    <div id="footer">
    </div>


</body>
</html>