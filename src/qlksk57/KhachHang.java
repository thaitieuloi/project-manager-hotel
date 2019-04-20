/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlksk57;


public class KhachHang {
    private String maKH;
    private String tenKH;
    private String cmnd;
    private String quocTich;
    private String gioiTinh;
    private int tuoi;
    private String sdt;
    private String maPhong;

   

    

	public KhachHang(String maKH, String tenKH, String cmnd, String quocTich, String gioiTinh, int tuoi, String sdt,
			String maPhong) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.cmnd = cmnd;
		this.quocTich = quocTich;
		this.gioiTinh = gioiTinh;
		this.tuoi = tuoi;
		this.sdt = sdt;
		this.maPhong = maPhong;
	}

	public KhachHang() {
    }

    KhachHang(String string, String string0, String string1, String string2, String string3, int aInt, String string4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   

	/**
	 * @return the maKH
	 */
	public String getMaKH() {
		return maKH;
	}

	/**
	 * @param maKH the maKH to set
	 */
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	/**
	 * @return the tenKH
	 */
	public String getTenKH() {
		return tenKH;
	}

	/**
	 * @param tenKH the tenKH to set
	 */
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	/**
	 * @return the cmnd
	 */
	public String getCmnd() {
		return cmnd;
	}

	/**
	 * @param cmnd the cmnd to set
	 */
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	/**
	 * @return the quocTich
	 */
	public String getQuocTich() {
		return quocTich;
	}

	/**
	 * @param quocTich the quocTich to set
	 */
	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	/**
	 * @return the gioiTinh
	 */
	public String getGioiTinh() {
		return gioiTinh;
	}

	/**
	 * @param gioiTinh the gioiTinh to set
	 */
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	/**
	 * @return the tuoi
	 */
	public int getTuoi() {
		return tuoi;
	}

	/**
	 * @param tuoi the tuoi to set
	 */
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	/**
	 * @return the sdt
	 */
	public String getSdt() {
		return sdt;
	}

	/**
	 * @param sdt the sdt to set
	 */
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	/**
	 * @return the maPhong
	 */
	public String getMaPhong() {
		return maPhong;
	}

	/**
	 * @param maPhong the maPhong to set
	 */
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	@Override
    public String toString() {
        return "khachHang{" + "MAKH=" + maKH + ", TENKH=" + tenKH + ", CMND=" + cmnd + ", QUOCTICH=" + quocTich + ", GIOITINH=" + gioiTinh + ", tuoi=" + tuoi + ", SDT=" + sdt + ", MAPHONG=" + maPhong + '}';
    }
    
    
    
    
}
