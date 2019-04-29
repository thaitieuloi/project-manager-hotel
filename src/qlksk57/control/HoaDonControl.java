package qlksk57.control;

import static qlksk57.MyConnection.getConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import qlksk57.models.HoaDon;

public class HoaDonControl extends CommonControl {

	public ArrayList<HoaDon> layDanhSachHoaDon() {
		ArrayList<HoaDon> dshd = new ArrayList<HoaDon>();
		Connection con = getConnection();
		try {
			st = (Statement) con.createStatement();
			String sql = "SELECT * FROM hoadon";
			// Thưcj thi câu lệnh truy vấn
			ResultSet rs = st.executeQuery(sql);

			HoaDon hd;
			while (rs.next()) {
				hd = new HoaDon(rs.getString("MAHD"), rs.getString("MANV"), rs.getString("MAPHONG"), rs.getDate("NGAY"),
						rs.getDouble("GIAHD"));

				// Thêm vào danh sách
				dshd.add(hd);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return dshd;
	}
}
