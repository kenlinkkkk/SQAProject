package model;

public class MonHoc {
	private int mamh;
	private String ten;
	private int sotc;
	private int cc;
	private int th;
	private int kt;
	private int bt;
	private int thi;
	
	
	public MonHoc(int mamh, String ten, int sotc, int cc, int th, int kt, int bt, int thi) {
		super();
		this.mamh = mamh;
		this.ten = ten;
		this.sotc = sotc;
		this.cc = cc;
		this.th = th;
		this.kt = kt;
		this.bt = bt;
		this.thi = thi;
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

	@Override
	public String toString() {
		return "MonHoc [mamh=" + mamh + ", ten=" + ten + ", sotc=" + sotc + ", cc=" + cc + ", bt=" + bt + ", kt=" + kt
				+ ", thi=" + thi + ", th=" + th + "]";
	}
	
	
}
