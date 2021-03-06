<%@page import="model.Diem"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.MainCtr"%>
<%@page import="model.SinhVien"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Xem điểm cá nhân</title>
<link href="css/Style.css" rel="stylesheet"/>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" type="text/css">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
</head>
<body>
	<div class="container">
	    <div class="row">
	        <div class="col-xs-12 col-sm-6 col-md-6 div-margin" style="background-color: #e3f2fd; ">
	            <div class="well well-sm">
	                <div class="row">
	                    <div class="col-sm-6 col-md-8 bg-light div-margin">
	                    <%
	                    	SinhVien sinhVien = (SinhVien) request.getSession().getAttribute("sVien");
	                    %>
	                        <h4><%= sinhVien.getHoten() %></h4>
	                        <p>
	                            <strong>Mã sinh viên: </strong> <%= sinhVien.getMasv() %>
	                            <br>
	                            <strong>Giới tính: </strong> <%= sinhVien.getGioitinh() %>
	                            <br>
	                            <strong>Ngày sinh: </strong><%= sinhVien.getNgaysinh() %>
	                            <br>
	                            <strong>Khóa: </strong></i><%= sinhVien.getKhoa() %>
	                            <br>
	                            <strong>Chuyên ngành: </strong><%= sinhVien.getChuyennganh() %>
	                            <br>
	                        </p>
	                    </div>
	                </div>
	            </div>
	        </div>        
	    </div>
	    <div class="row">
	    	<div class="col-md-6" style="margin: auto; padding-top: 10px;">
	        	<form action="SeasonScore" method="post" class="form-inline">
	        		<strong style="padding-right: 30px;">Xem điểm theo kỳ: </strong>
	        		<input type="number" required="required" maxlength="6" name="kyhoc" placeholder="20161" class="form-control form-control-sm">
	        		<input type="submit" name="btnSubmit" value="Xem" class="btn btn-sm btn-outline-success" style="margin-left: 30px;">
	        	</form>   
	        	<strong><a href="AllSeason.jsp">Xem bảng điểm cá nhân</a></strong>
	    	</div>			
		</div>
	</div>
	<div class="container">
    	<div class="row">
			<div class="col-md-12">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="panel-title">Điểm cá nhân</h3>
					</div>
					<table class="table table-hover" id="dev-table">
							<tr>
								<th>STT</th>
								<th>Mã môn</th>
								<th>Tên môn</th>
								<th>TC</th>
								<th>% CC</th>
								<th>% KT</th>
								<th>% TH</th>
								<th>% BT</th>
								<th>% Thi</th>
								<th>Điểm CC</th>
								<th>Điểm KT</th>
								<th>Điểm TH</th>
								<th>Điểm BT</th>
								<th>Thi</th>
								<th>TK(10)</th>
								<th>TK(4)</th>
								<th>Điểm chữ</th>
							</tr>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
