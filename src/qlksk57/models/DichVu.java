/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlksk57.models;


public class DichVu {
    private String maDV;
    private String tenNVL;
    private double giaDV;

    

   
	public DichVu(String maDV, String tenNVL, double giaDV) {
		super();
		this.maDV = maDV;
		this.tenNVL = tenNVL;
		this.giaDV = giaDV;
	}



	public DichVu() {
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



	/**
	 * @return the tenNVL
	 */
	public String getTenNVL() {
		return tenNVL;
	}



	/**
	 * @param tenNVL the tenNVL to set
	 */
	public void setTenNVL(String tenNVL) {
		this.tenNVL = tenNVL;
	}



	/**
	 * @return the giaDV
	 */
	public double getGiaDV() {
		return giaDV;
	}



	/**
	 * @param giaDV the giaDV to set
	 */
	public void setGiaDV(double giaDV) {
		this.giaDV = giaDV;
	}



	@Override
    public String toString() {
//        return "DichVu{" + "MADV=" + maDV + ", TENNVL=" + tenNVL + ", GIADV=" + giaDV + '}';
		return tenNVL;
    }
    
    
    
}
