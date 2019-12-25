<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">

<title>ユーザー一覧</title>
</head>
<body>

    <div id="header">
    </div>
        <div id="main">
            <div id="top">
                      <p>UserList</p>

            </div>
            <div>
            <s:if test="==null">
                            <h3>登録ユーザーがいません。</h3>
            </s:if>
            <s:elseif test="message == null">
                            <h3>登録ユーザーは以下の通りです。</h3>
                            <table border="1">
                            <tr>
                                <th>登録ＩＤ</th>
                                <th>ユーザー名</th>
                                <th>ログインＩＤ</th>
                                <th>パスワード</th>
                                <th>登録日</th>
                            </tr>

                            <s:iterator value="userInfoDTO">
                            <tr>
                                <td><s:property value="id"/></td>
                                <td><s:property value="userName"/></td>
                                <td><s:property value="loginId"/></td>
                                <td><s:property value="loginPassword"/></td>
                                <td><s:property value="insert_date"/></td>
                            </tr>
                            </s:iterator>
                            </table>

                <s:form action="UserListDeleteConfirmAction">
                <s:submit value="削除"/>
            </s:form>
          </s:elseif>


            <div id="text-right">
            <p>HOME<a href='<s:url action="GoHomeAction"/>'>こちら</a>

            <p>LOGOUT<a href='<s:url action="LoginAction"/>'>こちら</a>
            </div>



            </div>
        </div>
        <div id="footer">
        </div>
</body>
</html>