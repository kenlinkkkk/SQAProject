package model;

public class Diem {
	private int id;
	private int mamon;
	private String masv;
	private int namhoc;
	private int kyhoc;
	private double diem10;
	private double diem4;
	private String diemchu;
	private double diemthi;
	private double diemcc;
	private double diembt;
	private double diemkt;
	private double diemth;
	private MonHoc monHoc;
	
	public Diem(int id, int mamon, String masv, int namhoc, int kyhoc, double diem10, double diem4, String diemchu,
			double diemthi, double diemcc, double diembt, double diemkt, double diemth, MonHoc monHoc) {
		super();
		this.id = id;
		this.mamon = mamon;
		this.masv = masv;
		this.namhoc = namhoc;
		this.kyhoc = kyhoc;
		this.diem10 = diem10;
		this.diem4 = diem4;
		this.diemchu = diemchu;
		this.diemthi = diemthi;
		this.diemcc = diemcc;
		this.diembt = diembt;
		this.diemkt = diemkt;
		this.diemth = diemth;
		this.monHoc = monHoc;
	}
	
	public Diem(int id, int mamon, String masv, int namhoc, int kyhoc, double diem10, double diem4, String diemchu,
			double diemthi, double diemcc, double diembt, double diemkt, double diemth) {
		super();
		this.id = id;
		this.mamon = mamon;
		this.masv = masv;
		this.namhoc = namhoc;
		this.kyhoc = kyhoc;
		this.diem10 = diem10;
		this.diem4 = diem4;
		this.diemchu = diemchu;
		this.diemthi = diemthi;
		this.diemcc = diemcc;
		this.diembt = diembt;
		this.diemkt = diemkt;
		this.diemth = diemth;
	}

	

	public Diem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMamon() {
		return mamon;
	}

	public void setMamon(int mamon) {
		this.mamon = mamon;
	}

	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public int getNamhoc() {
		return namhoc;
	}

	public void setNamhoc(int namhoc) {
		this.namhoc = namhoc;
	}

	public int getKyhoc() {
		return kyhoc;
	}

	public void setKyhoc(int kyhoc) {
		this.kyhoc = kyhoc;
	}

	public double getDiem10() {
		return diem10;
	}

	public void setDiem10(double diem10) {
		this.diem10 = diem10;
	}

	public double getDiem4() {
		return diem4;
	}

	public void setDiem4(double diem4) {
		this.diem4 = diem4;
	}

	public String getDiemchu() {
		return diemchu;
	}

	public void setDiemchu(String diemchu) {
		this.diemchu = diemchu;
	}

	public double getDiemthi() {
		return diemthi;
	}

	public void setDiemthi(double diemthi) {
		this.diemthi = diemthi;
	}

	public double getDiemcc() {
		return diemcc;
	}

	public void setDiemcc(double diemcc) {
		this.diemcc = diemcc;
	}

	public double getDiembt() {
		return diembt;
	}

	public void setDiembt(double diembt) {
		this.diembt = diembt;
	}

	public double getDiemkt() {
		return diemkt;
	}

	public void setDiemkt(double diemkt) {
		this.diemkt = diemkt;
	}

	public double getDiemth() {
		return diemth;
	}

	public void setDiemth(double diemth) {
		this.diemth = diemth;
	}

	@Override
	public String toString() {
		return "Diem [id=" + id + ", mamon=" + mamon + ", masv=" + masv + ", namhoc=" + namhoc + ", kyhoc=" + kyhoc
				+ ", diem10=" + diem10 + ", diem4=" + diem4 + ", diemchu=" + diemchu + ", diemthi=" + diemthi
				+ ", diemcc=" + diemcc + ", diembt=" + diembt + ", diemkt=" + diemkt + ", diemth=" + diemth
				+ ", monHoc=" + monHoc + "]";
	}

	public MonHoc getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(MonHoc monHoc) {
		this.monHoc = monHoc;
	}	
}
