package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.naming.java.javaURLContextFactory;

import model.Diem;
import model.MonHoc;
import model.SinhVien;

public class MainCtr {
	public SinhVien sinhVien;
	
	public MainCtr (SinhVien sinhVien) {
		this.sinhVien = sinhVien;
	}
	
	public boolean checkInfo() throws SQLException{
		String SQLcmd = "SELECT * FROM sinhvien WHERE masv = ? AND password = ?";
		PreparedStatement preparedStatement = DBConnection.connectDatabase().prepareStatement(SQLcmd);
		preparedStatement.setString(1, sinhVien.getMasv());
		preparedStatement.setString(2, sinhVien.getPassword());
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while (resultSet.first()) {
			return true;
		}
		return false;
	}
	
	public SinhVien getInfo() throws SQLException{
		String SQLcmd  = "SELECT * FROM sinhvien WHERE masv = ? AND password = ?";
		PreparedStatement preparedStatement = (PreparedStatement) DBConnection.connectDatabase().prepareStatement(SQLcmd);
		preparedStatement.setString(1, sinhVien.getMasv());
		preparedStatement.setString(2, sinhVien.getPassword());
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.first()) {
			sinhVien.setChuyennganh(resultSet.getString("chuyennganh"));
			sinhVien.setGioitinh(resultSet.getString("gioitinh"));
			sinhVien.setHoten(resultSet.getString("hoten"));
			sinhVien.setKhoa(resultSet.getInt("khoa"));
			sinhVien.setNgaysinh(resultSet.getString("ngaysinh"));
			sinhVien.setSokydahoc(resultSet.getInt("sokydahoc"));
			
			return sinhVien;
		}else {
			return null;
		}
	}
	
	public ArrayList<Diem> getAllMark() throws SQLException {
		String SQLcmd = "SELECT * FROM monhoc JOIN diem ON monhoc.mamh = diem.mamon WHERE masv = ?";
		PreparedStatement preparedStatement = (PreparedStatement) DBConnection.connectDatabase().prepareStatement(SQLcmd);
		preparedStatement.setString(1, sinhVien.getMasv());
		ResultSet resultSet = preparedStatement.executeQuery();
		ArrayList<Diem> listDiem = new ArrayList<Diem>();
		while (resultSet.next()) {
			MonHoc monHoc = new MonHoc(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getInt(4), resultSet.getInt(5), resultSet.getInt(6), resultSet.getInt(7), resultSet.getInt(8));
			Diem diem = new Diem();
			diem.setId(resultSet.getInt("ID"));
			diem.setMamon(resultSet.getInt("mamon"));
			diem.setMasv(resultSet.getString("masv"));
			diem.setNamhoc(resultSet.getInt("namhoc"));
			diem.setKyhoc(resultSet.getInt("kyhoc"));
			diem.setDiem10(resultSet.getDouble("diem10"));
			diem.setDiem4(resultSet.getDouble("diem4"));
			diem.setDiemchu(resultSet.getString("diemchu"));
			diem.setDiemthi(resultSet.getDouble("diemthi"));
			diem.setDiemcc(resultSet.getDouble("diemcc"));
			diem.setDiemth(resultSet.getDouble("diemth"));
			diem.setDiemkt(resultSet.getDouble("diemkt"));
			diem.setDiembt(resultSet.getDouble("diembt"));
			diem.setMonHoc(monHoc);
			
			listDiem.add(diem);
		}
		return listDiem; 
	}
	
	public ArrayList<Diem> getAllMarkbySeasson(String key) throws SQLException {
		String SQLcmd = "SELECT * FROM monhoc JOIN diem ON monhoc.mamh = diem.mamon WHERE diem.masv = ? AND diem.namhoc = ? AND diem.kyhoc = ?";
		PreparedStatement preparedStatement = (PreparedStatement) DBConnection.connectDatabase().prepareStatement(SQLcmd);
		preparedStatement.setString(1, sinhVien.getMasv());
		preparedStatement.setString(2, key.substring(0,4));
		preparedStatement.setString(3, key.substring(4));
		ResultSet resultSet = preparedStatement.executeQuery();
		ArrayList<Diem> listDiem = new ArrayList<Diem>();
		while (resultSet.next()) {
			MonHoc monHoc = new MonHoc(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getInt(4), resultSet.getInt(5), resultSet.getInt(6), resultSet.getInt(7), resultSet.getInt(8));
			Diem diem = new Diem();
			diem.setId(resultSet.getInt("ID"));
			diem.setMamon(resultSet.getInt("mamon"));
			diem.setMasv(resultSet.getString("masv"));
			diem.setNamhoc(resultSet.getInt("namhoc"));
			diem.setKyhoc(resultSet.getInt("kyhoc"));
			diem.setDiem10(resultSet.getDouble("diem10"));
			diem.setDiem4(resultSet.getDouble("diem4"));
			diem.setDiemchu(resultSet.getString("diemchu"));
			diem.setDiemthi(resultSet.getDouble("diemthi"));
			diem.setDiemcc(resultSet.getDouble("diemcc"));
			diem.setDiemth(resultSet.getDouble("diemth"));
			diem.setDiemkt(resultSet.getDouble("diemkt"));
			diem.setDiembt(resultSet.getDouble("diembt"));
			diem.setMonHoc(monHoc);
			
			listDiem.add(diem);
		}
		return listDiem; 
	}
	
	public double avgPoint10(ArrayList<Diem> listDiems) {
		int tongtc = 0;
		double tongdiem = 0;
		for (int i = 0; i < listDiems.size(); i++) {
			if (listDiems.get(i).getDiemchu() != "F") {
				tongdiem += listDiems.get(i).getDiem10() * listDiems.get(i).getMonHoc().getSotc();
				tongtc += listDiems.get(i).getMonHoc().getSotc();
			}
		}
		return tongdiem/tongtc;
	}
	
	public double avgPoint4(double point10) {
		if (point10 >= 9) {
			return 4;
		} else if (point10 >= 8.5) {
			return 3.5;
		} else if (point10 >= 8) {
			return 3;
		} else if (point10 >= 7) {
			return 2.5;
		} else if (point10 >= 6.5) {
			return 2;
		} else if (point10 >= 5.5) {
			return 1.5;
		} else if (point10 >= 5) {
			return 1;
		} else if (point10 >= 4) {
			return 0.5;
		} else {
			return 0;
		}
	}
	
	public String xeploai(double point4) {
		if (point4 >= 3.6) {
			return "Xuất sắc";
		} else if (point4 >= 3.2) {
			return "Giỏi";
		} else if (point4 >= 2.5) {
			return "Khá";
		} else if (point4 >= 2) {
			return "Trung bình";
		} else if (point4 >= 1) {
			return "Yếu";
		} else {
			return "Kém";
		}
	}
}