<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">

<title>商品一覧</title>
</head>
<body>

    <div id="header">
    </div>
    <div id="main">
        <div id="top">
                   <p>ItemList</p>
        </div>
        <div>
        <s:if test="itemInfoDTO==null">
                <h3>登録商品がありません。</h3>
        </s:if>
        <s:elseif test="message  == null">
                <h3>商品情報は以下の通りです。</h3>
                <table border="1">
                <tr>
                    <th>商品ＩＤ</th>
                    <th>商品名</th>
                    <th>値段</th>
                    <th>ストック</th>
                    <th>登録日</th>
                </tr>

                <s:iterator value="itemInfoDTO">
                <tr>
                    <td><s:property value="id"/></td>
                    <td><s:property value="itemName"/></td>
                    <td><s:property value="itemPrice"/></td>
                    <td><s:property value="itemStock"/></td>
                    <td><s:property value="insert_date"/></td>


                </tr>
                </s:iterator>
                </table>




            <s:form action="ItemListDeleteConfirmAction">
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