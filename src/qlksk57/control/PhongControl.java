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

				// Thêm vào danh sách
				dsp.add(p);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return dsp;
	}


}
