/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlksk57;

import java.util.Date;


public class HoaDon {
    private String maHD;
    private String maNV;
    private String maPhong;
    private Date ngay;
    private double giaHD;

   


	public HoaDon(String maHD, String maNV, String maPhong, Date ngay, double giaHD) {
		super();
		this.maHD = maHD;
		this.maNV = maNV;
		this.maPhong = maPhong;
		this.ngay = ngay;
		this.giaHD = giaHD;
	}


	public HoaDon() {
    }

   
    
	/**
	 * @return the maHD
	 */
	public String getMaHD() {
		return maHD;
	}


	/**
	 * @param maHD the maHD to set
	 */
	public void setMaHD(String maHD) {
		this.maHD = maHD;
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
	 * @return the ngay
	 */
	public Date getNgay() {
		return ngay;
	}


	/**
	 * @param ngay the ngay to set
	 */
	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}


	/**
	 * @return the giaHD
	 */
	public double getGiaHD() {
		return giaHD;
	}


	/**
	 * @param giaHD the giaHD to set
	 */
	public void setGiaHD(double giaHD) {
		this.giaHD = giaHD;
	}


	@Override
    public String toString() {
        return "HoaDon{" + "MAHD=" + maHD + ", MANV=" + maNV + ", MAPHONG=" + maPhong + ", NGAY=" + ngay + ", GIAHD=" + giaHD + '}';
    }
    
    
    
    
}
