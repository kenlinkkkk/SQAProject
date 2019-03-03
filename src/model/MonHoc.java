package model;

public class MonHoc {
	private int mamh;
	private String ten;
	private int sotc;
	private int cc;
	private int bt;
	private int kt;
	private int thi;
	private int th;
	
	public MonHoc(int mamh, String ten, int sotc, int cc, int bt, int kt, int thi, int th) {
		super();
		this.mamh = mamh;
		this.ten = ten;
		this.sotc = sotc;
		this.cc = cc;
		this.bt = bt;
		this.kt = kt;
		this.thi = thi;
		this.th = th;
	}

	public int getMamh() {
		return mamh;
	}

	public void setMamh(int mamh) {
		this.mamh = mamh;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getSotc() {
		return sotc;
	}

	public void setSotc(int sotc) {
		this.sotc = sotc;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getBt() {
		return bt;
	}

	public void setBt(int bt) {
		this.bt = bt;
	}

	public int getKt() {
		return kt;
	}

	public void setKt(int kt) {
		this.kt = kt;
	}

	public int getThi() {
		return thi;
	}

	public void setThi(int thi) {
		this.thi = thi;
	}

	public int getTh() {
		return th;
	}

	public void setTh(int th) {
		this.th = th;
	}
	
	
}
