/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlksk57;

import java.util.Date;

public class NhanVien {
    private String maNV;
    private String tenNV;
    private String chucVu;
    private double luongNV;
    private Date ngaySinh;
    private String gioiTinh;
    private String chuThich;

   



    public NhanVien(String maNV, String tenNV, String chucVu, double luongNV, Date ngaySinh, String gioiTinh,
			String chuThich) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.chucVu = chucVu;
		this.luongNV = luongNV;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.chuThich = chuThich;
	}



	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the tenNV
	 */
	public String getTenNV() {
		return tenNV;
	}



	/**
	 * @param tenNV the tenNV to set
	 */
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}



	/**
	 * @return the chucVu
	 */
	public String getChucVu() {
		return chucVu;
	}



	/**
	 * @param chucVu the chucVu to set
	 */
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}



	/**
	 * @return the luongNV
	 */
	public double getLuongNV() {
		return luongNV;
	}



	/**
	 * @param luongNV the luongNV to set
	 */
	public void setLuongNV(double luongNV) {
		this.luongNV = luongNV;
	}



	/**
	 * @return the ngaySinh
	 */
	public Date getNgaySinh() {
		return ngaySinh;
	}



	/**
	 * @param ngaySinh the ngaySinh to set
	 */
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
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



	@Override
    public String toString() {
        return "NhanVien{" + "MANV=" + maNV + ", TENNV=" + tenNV + ", CHUCVU=" + chucVu + ", LUONGNV=" + luongNV + ", NGAYSINH=" + ngaySinh + ", GIOITINH=" + gioiTinh + ", CHUTHICH=" + chuThich + '}';
    }
    
    
    
    
}