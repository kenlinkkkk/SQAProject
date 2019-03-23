<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hệ thống quản lý điểm PTIT</title>
<link href="css/login.css" rel="stylesheet"/>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="container login-container">
        <div class="row">
            <div class="col-md-6 login-form-1" style="margin: auto;">
                <h3>Đăng nhập</h3>
                <form method="post" action="Login">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Mã sinh viên *" value="" name="username" required="required"/>
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" placeholder="Mật khẩu *" value="" name="password" required="required"/>
                    </div>
                    <div class="form-group">
                        <input type="submit" class="btnSubmit" value="Đăng nhập" />
                    </div>
                    <div class="form-group">
                        <a href="#" class="ForgetPwd">Quên mật khẩu?</a>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>