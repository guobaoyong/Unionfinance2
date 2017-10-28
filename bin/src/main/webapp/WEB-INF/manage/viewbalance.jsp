<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>2</title>
<link rel="stylesheet" href="${rootPath }css/bootstrap.css">
<link rel="stylesheet" href="${rootPath }css/viewbalance.css">
</head>

<body>

<div class="container">
  <div class="row">
            <p>当前位置：首页>>查看余额</p>     
  </div>
</div><!-- container 结束-->
<div id="body-one">
  <div class="table-responsive">
    <table class="table table-bordered table-hover table-striped">     
      <tbody>
        <tr>
          <td>序号</td>
          <td>工会</td>
          <td>余额</td>
        </tr>
        <c:forEach items="${allBalance}" var="b" varStatus="status">
				<tr>
					<td>${status.index + 1}</td>
					<td>${b.id.inUnion}</td>
					<td>${b.id.balance}</td>
				</tr>
				</c:forEach>
      </tbody>
    </table>
</div><!-- 表格结束 -->
</div>
</body>
</html>