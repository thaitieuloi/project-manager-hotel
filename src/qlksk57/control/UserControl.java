package qlksk57.control;

import static qlksk57.MyConnection.getConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import qlksk57.models.User;

public class UserControl extends CommonControl {

	public ArrayList<User> layDanhSachUser() {
		ArrayList<User> dsp = new ArrayList<User>();
		Connection con = getConnection();
		try {
			st = (Statement) con.createStatement();
			String sql = "SELECT * FROM users";
			ResultSet rs = st.executeQuery(sql);

			User p;
			while (rs.next()) {
				p = new User(Integer.parseInt(rs.getString("ID")), rs.getString("USERNAME"), rs.getString("PASSWORD"),
						Integer.parseInt(rs.getString("ROLE_ID")));

				dsp.add(p);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return dsp;
	}

}
