<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hệ thống quản lý điểm PTIT</title>
<link href="css/Style.css" rel="stylesheet"/>
</head>
<body>
	<div class="clearfix">
		<div class="login-form" style="text-align: center;">
			<h3>ĐĂNG NHẬP</h3>
		</div>
		<div class="login-form">
			<form action="Login" method="post">
				<table>
					<tr>
						<td><label>Tên đăng nhập:</label></td>
						<td><input type="text" name="username" required="required"></td>
					</tr>
					<tr>
						<td><label>Mật Khẩu:</label></td>
						<td><input type="password" name="password" required="required"></td>
					</tr>
					<tr><td colspan="2" align="center"><input type="submit" name="btnSubmit" value="Đăng Nhập"></td></tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>