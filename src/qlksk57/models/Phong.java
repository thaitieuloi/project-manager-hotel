/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlksk57.models;


public class Phong {
    private String maPhong;
    private String tenPhong;
    private String loaiPhong;
    private double giaPhong;
    private String chuThich;
    private String tinhTrang;
    private String maNV;
    private String maDV;

    

    /**
     * 
     * @param maPhong
     * @param tenPhong
     * @param loaiPhong
     * @param giaPhong
     * @param chuThich
     * @param tinhTrang
     * @param maNV
     * @param maDV
     */
    public Phong(String maPhong, String tenPhong, String loaiPhong, double giaPhong, String chuThich, String tinhTrang,
			String maNV, String maDV) {
		super();
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		this.loaiPhong = loaiPhong;
		this.giaPhong = giaPhong;
		this.chuThich = chuThich;
		this.tinhTrang = tinhTrang;
		this.maNV = maNV;
		this.maDV = maDV;
	}

	public Phong() {
    }

    Phong(String string, String string0, String string1, double aDouble, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

	/**
	 * @return the tenPhong
	 */
	public String getTenPhong() {
		return tenPhong;
	}

	/**
	 * @param tenPhong the tenPhong to set
	 */
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	/**
	 * @return the loaiPhong
	 */
	public String getLoaiPhong() {
		return loaiPhong;
	}

	/**
	 * @param loaiPhong the loaiPhong to set
	 */
	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}

	/**
	 * @return the giaPhong
	 */
	public double getGiaPhong() {
		return giaPhong;
	}

	/**
	 * @param giaPhong the giaPhong to set
	 */
	public void setGiaPhong(double giaPhong) {
		this.giaPhong = giaPhong;
	}

	/**
	 * @return the chuThich
	 */
	public String getChuThich() {
		return chuThich;
	}

	/**
	 * @param chuThich the chuThich to set
	 */
	public void setChuThich(String chuThich) {
		this.chuThich = chuThich;
	}

	/**
	 * @return the tinhTrang
	 */
	public String getTinhTrang() {
		return tinhTrang;
	}

	/**
	 * @param tinhTrang the tinhTrang to set
	 */
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	/**
	 * @return the maNV
	 */
	public String getMaNV() {
		return maNV;
	}

	/**
	 * @param maNV the maNV to set
	 */
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	/**
	 * @return the maDV
	 */
	public String getMaDV() {
		return maDV;
	}

	/**
	 * @param maDV the maDV to set
	 */
	public void setMaDV(String maDV) {
		this.maDV = maDV;
	}

	@Override
    public String toString() {
//        return "Phong{" + "MAPHONG=" + maPhong + ", TENPHONG=" + tenPhong + ", LOAIPHONG=" + loaiPhong + ", GIAPHONG=" + giaPhong + ", CHUTHICH=" + chuThich + ", TINHTRANG=" + tinhTrang + ", MANV=" + maNV + ", MADV=" + maDV + '}';
		return tenPhong;
	}
    
    
    
}
