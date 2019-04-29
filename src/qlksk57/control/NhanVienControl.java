package qlksk57.control;

import static qlksk57.MyConnection.getConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import qlksk57.models.NhanVien;

public class NhanVienControl extends CommonControl  {

	
	public ArrayList<NhanVien> layDanhSachNhanVien() {
        ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
        Connection con = getConnection();
        try {
            st = (Statement) con.createStatement();
            String sql = "SELECT * FROM nhanvien";
            ResultSet rs = st.executeQuery(sql);

            NhanVien nv;
            while (rs.next()) {
                nv = new NhanVien(rs.getString("MANV"), rs.getString("TENNV"), rs.getString("CHUCVU"), rs.getDouble("LUONGNV"), rs.getDate("NGAYSINH"), rs.getString("GIOITINH"), rs.getString("CHUTHICH") );

                dsnv.add(nv);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return dsnv;
    }


}
