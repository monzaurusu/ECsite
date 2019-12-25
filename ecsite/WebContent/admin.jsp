<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/style2.css">


<title>管理者画面</title>
</head>
<body>

<div id="header">
    </div>
    <div id="main">
      <div id="top">
               <p>管理者画面</p>
      </div>
      <div id="text-center">

       <div class=a>
        <table>
             <tr>
                 <th>商品</th>
	         </tr>

	         <tr>
	             <td><s:form action="ItemCreateAction">
	             <s:submit value="新規登録"/>
	             </s:form></td>
	             <td><s:form action="ItemListAction">
	             <s:submit value="一覧"/>
	             </s:form></td>
             </tr>
        </table>
        </div>

        <div class=b>
        <table>
             <tr>
                 <th>ユーザー</th>
             </tr>

             <tr>
                 <td><s:form action="UserCreateAction">
	             <s:submit value="新規登録"/>
	             </s:form>
	             </td>
	             <td><s:form action="UserListAction">
	             <s:submit value="一覧"/>
	             </s:form></td>
	         </tr>

        </table>
        </div>
                <div id="text-right">
               <p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
               </div>

      </div>
    </div>
    <div id="footer">
    </div>

</body>
</html>