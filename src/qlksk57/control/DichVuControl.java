package qlksk57.control;

import static qlksk57.MyConnection.getConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import qlksk57.models.DichVu;

public class DichVuControl extends CommonControl {

	
	public ArrayList<DichVu> layDanhSachDichVu() {
		ArrayList<DichVu> dsdv = new ArrayList<DichVu>();
		Connection con = getConnection();
		try {
			st = (Statement) con.createStatement();
			String sql = "SELECT * FROM dichvu";
			// Thưcj thi câu lệnh truy vấn
			ResultSet rs = st.executeQuery(sql);

			DichVu dv;
			while (rs.next()) {
				dv = new DichVu(rs.getString("MADV"), rs.getString("TENDV"), rs.getDouble("GIADV"));

				// Thêm vào danh sách
				dsdv.add(dv);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return dsdv;
	}

	
}
