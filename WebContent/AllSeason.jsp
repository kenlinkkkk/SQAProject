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
<title>Điểm cá nhân</title>
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
							<%
								MainCtr ctr = new MainCtr(sinhVien);
								ArrayList<Diem> listDiems = new ArrayList<Diem>();
								listDiems = ctr.getAllMark();
								for(int i = 0; i < listDiems.size(); i ++){
							%>
							<tr>
								<td><%= i+1 %></td>
								<td><%= listDiems.get(i).getMamon() %></td>
								<td><%= listDiems.get(i).getMonHoc().getTen() %></td>
								<td><%= listDiems.get(i).getMonHoc().getSotc() %></td>
								<td><%= listDiems.get(i).getMonHoc().getCc() %></td>
								<td><%= listDiems.get(i).getMonHoc().getKt() %></td>
								<td><%= listDiems.get(i).getMonHoc().getTh() %></td>
								<td><%= listDiems.get(i).getMonHoc().getBt() %></td>
								<td><%= listDiems.get(i).getMonHoc().getThi() %></td>
								<td><%= listDiems.get(i).getDiemcc() %></td>
								<td><%= listDiems.get(i).getDiemkt() %></td>
								<td><%= listDiems.get(i).getDiemth() %></td>
								<td><%= listDiems.get(i).getDiembt() %></td>
								<td><%= listDiems.get(i).getDiemthi() %></td>
								<td><%= listDiems.get(i).getDiem10() %></td>
								<td><%= listDiems.get(i).getDiem4() %></td>
								<td><%= listDiems.get(i).getDiemchu() %></td>
							</tr>
							<%
								}
							%>
					</table>
				</div>
				<%
					double diem10 = ctr.avgPoint10(listDiems);
					double diem4 = ctr.avgPoint4(diem10);
					String xephang = ctr.xeploai(diem4);
				%>
				<p class="point">Điểm trung bình hệ 10: <%=diem10 %></p>
				<p class="point">Điểm trung bình tích lũy hệ 4: <%=diem4 %></p>
				<p class="point">Xếp loại: <%=xephang %></p>
			</div>
		</div>
	</div>
</body>
</html>