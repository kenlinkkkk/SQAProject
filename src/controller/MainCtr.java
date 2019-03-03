package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import model.Diem;
import model.SinhVien;

public class MainCtr {
	private SinhVien sinhVien;
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
		String SQLcmd = "SELECT * FROM diem WHERE masv = ?";
		PreparedStatement preparedStatement = (PreparedStatement) DBConnection.connectDatabase().prepareStatement(SQLcmd);
		preparedStatement.setString(1, sinhVien.getMasv());
		ResultSet resultSet = preparedStatement.executeQuery();
		ArrayList<Diem> listDiem = new ArrayList<Diem>();
		while (resultSet.next()) {
			Diem diem = new Diem();
			diem.setDiem10(resultSet.getDouble("diem10"));
			diem.setDiem4(resultSet.getDouble("diem4"));
			diem.setDiembt(resultSet.getDouble("diembt"));
			diem.setDiemcc(resultSet.getDouble("diemcc"));
			diem.setDiemchu(resultSet.getString("diemchu"));
			diem.setDiemkt(resultSet.getDouble("diemkt"));
			diem.setDiemth(resultSet.getDouble("diemth"));
			diem.setDiemthi(resultSet.getDouble("diemthi"));
			diem.setKyhoc(resultSet.getInt("kyhoc"));
			diem.setMamon(resultSet.getInt("mamon"));
			diem.setMasv(resultSet.getString("masv"));
			
			listDiem.add(diem);
		}
		return listDiem; 
	}
	
//	public static void main(String[] args) throws SQLException {
//		SinhVien sVien = new SinhVien("b15dccn646","123456");
//		MainCtr ctr = new MainCtr(sVien);
//		System.out.println(ctr.getInfo());
//	}
}