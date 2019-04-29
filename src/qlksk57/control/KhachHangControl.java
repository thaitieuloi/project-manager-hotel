package qlksk57.control;

import static qlksk57.MyConnection.getConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import qlksk57.models.KhachHang;

public class KhachHangControl extends CommonControl  {


	public ArrayList<KhachHang> layDanhSachKhachHang() {
		ArrayList<KhachHang> dskh = new ArrayList<KhachHang>();
		Connection con = getConnection();
		try {
			st = (Statement) con.createStatement();
			String sql = "SELECT * FROM khachhang";
			// Thưcj thi câu lệnh truy vấn
			ResultSet rs = st.executeQuery(sql);

			KhachHang kh;
			while (rs.next()) {
				kh = new KhachHang(rs.getString("MAKH"), rs.getString("TENKH"), rs.getString("CMND"),
						rs.getString("QUOCTICH"), rs.getString("GIOITINH"), rs.getInt("TUOI"), rs.getString("SDT"),
						rs.getString("MAPHONG"));

				// Thêm vào danh sách
				dskh.add(kh);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return dskh;
	}

	
}
