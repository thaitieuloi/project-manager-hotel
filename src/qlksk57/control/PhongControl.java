package qlksk57.control;

import static qlksk57.MyConnection.getConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import qlksk57.models.Phong;

public class PhongControl extends CommonControl {



	public ArrayList<Phong> layDanhSachPhong() {
		ArrayList<Phong> dsp = new ArrayList<Phong>();
		Connection con = getConnection();
		try {
			st = (Statement) con.createStatement();
			String sql = "SELECT * FROM phong";
			ResultSet rs = st.executeQuery(sql);

			Phong p;
			while (rs.next()) {
				p = new Phong(rs.getString("MAPHONG"), rs.getString("TENPHONG"), rs.getString("LOAIPHONG"),
						rs.getDouble("GIAPHONG"), rs.getString("CHUTHICH"), rs.getString("TINHTRANG"),
						rs.getString("MANV"), rs.getString("MADV"));

				// ThÃªm vÃ o danh sÃ¡ch
				dsp.add(p);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return dsp;
	}


	public ArrayList<Phong> layDanhSachEmpty() {
		ArrayList<Phong> dsp = new ArrayList<Phong>();
		Connection con = getConnection();
		try {
			st = (Statement) con.createStatement();
			String sql = "SELECT * FROM phong where TINHTRANG like 'Trống'";
			ResultSet rs = st.executeQuery(sql);

			Phong p;
			while (rs.next()) {
				p = new Phong(rs.getString("MAPHONG"), rs.getString("TENPHONG"), rs.getString("LOAIPHONG"),
						rs.getDouble("GIAPHONG"), rs.getString("CHUTHICH"), rs.getString("TINHTRANG"),
						rs.getString("MANV"), rs.getString("MADV"));

				// ThÃªm vÃ o danh sÃ¡ch
				dsp.add(p);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return dsp;
	}
	
	
	public ArrayList<Phong> layDanhSachNotEmpty() {
		ArrayList<Phong> dsp = new ArrayList<Phong>();
		Connection con = getConnection();
		try {
			st = (Statement) con.createStatement();
			String sql = "SELECT * FROM phong where TINHTRANG not like 'Trống'";
			ResultSet rs = st.executeQuery(sql);

			Phong p;
			while (rs.next()) {
				p = new Phong(rs.getString("MAPHONG"), rs.getString("TENPHONG"), rs.getString("LOAIPHONG"),
						rs.getDouble("GIAPHONG"), rs.getString("CHUTHICH"), rs.getString("TINHTRANG"),
						rs.getString("MANV"), rs.getString("MADV"));

				dsp.add(p);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return dsp;
	}
}
