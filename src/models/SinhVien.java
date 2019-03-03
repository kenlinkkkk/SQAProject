/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author macos
 */
public class SinhVien {
    public String masv;
    public String hoten;
    public String ngaysinh;
    public String gioitinh;
    public int khoa;
    public String password;
    public int sokydahoc;
    public String chuyennganh;

    
    public SinhVien(String masv, String hoten, String ngaysinh, String gioitinh, int khoa, String password,
			int sokydahoc, String chuyennganh) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.khoa = khoa;
		this.password = password;
		this.sokydahoc = sokydahoc;
		this.chuyennganh = chuyennganh;
	}

    
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public String getMasv() {
		return masv;
	}


	public void setMasv(String masv) {
		this.masv = masv;
	}


	public String getHoten() {
		return hoten;
	}


	public void setHoten(String hoten) {
		this.hoten = hoten;
	}


	public String getNgaysinh() {
		return ngaysinh;
	}


	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}


	public String getGioitinh() {
		return gioitinh;
	}


	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}


	public int getKhoa() {
		return khoa;
	}


	public void setKhoa(int khoa) {
		this.khoa = khoa;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getSokydahoc() {
		return sokydahoc;
	}


	public void setSokydahoc(int sokydahoc) {
		this.sokydahoc = sokydahoc;
	}


	public String getChuyennganh() {
		return chuyennganh;
	}


	public void setChuyennganh(String chuyennganh) {
		this.chuyennganh = chuyennganh;
	}


	@Override
    public String toString() {
        return "SinhVien{" + "masv=" + masv + ", hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + ", khoa=" + khoa + ", password=" + password + ", sokydahoc=" + sokydahoc + ", chuyennganh=" + chuyennganh + '}';
    }
    
}
