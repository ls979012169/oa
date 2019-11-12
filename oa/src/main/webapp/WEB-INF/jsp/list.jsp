<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="" method="post">
			<table width="100%" border=1>
				<tr>
					<th>did</th>
					<th>eid</th>
					<th>wdef</th>
					<th>wdate</th>
				</tr>
				<c:forEach var="inv" items="${list}">
					<tr>
						<td>${inv.did}</td>
						<td>${inv.eid}</td>
						<td>${inv.wdef}</td>
						<td>${inv.wdate}</td>
					</tr>
				</c:forEach>
				<tr>
					<td colspan="4"><input value="添加" type="button" /> <input
						value="删除" type="submit" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html> --%>