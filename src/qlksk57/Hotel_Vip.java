/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlksk57;

import static qlksk57.MyConnection.getConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author khoa
 */
@SuppressWarnings("serial")
public class Hotel_Vip extends JFrame {

	/**
	 * Creates new form Hotel_Vip
	 */
	public Hotel_Vip() {
		initComponents();
		layDanhSachNhanVien();
//		hienThiDanhSachNhanVien();
//		layDanhSachDichVu();
//		hienThiDanhSachDichVu();
//		layDanhSachPhong();
//		hienThiDanhSachPhong();
//		layDanhSachKhachHang();
//		hienThiDanhSachKhachHang();
//		layDanhSachHoaDon();
//		hienThiDanhSachHoaDon();
	}

	Connection con = null;
	Statement st = null;

	public ArrayList<NhanVien> layDanhSachNhanVien() {
		ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
		Connection con = getConnection();
		try {
			st = (Statement) con.createStatement();
			String sql = "SELECT * FROM nhanvien";
			// ThÆ°cj thi cÃ¢u lá»‡nh truy váº¥n
			ResultSet rs = st.executeQuery(sql);

			NhanVien nv;
			while (rs.next()) {
				nv = new NhanVien(rs.getString("MANV"), rs.getString("TENNV"), rs.getString("CHUCVU"),
						rs.getDouble("LUONGNV"), rs.getDate("NGAYSINH"), rs.getString("GIOITINH"),
						rs.getString("CHUTHICH"));

				// ThÃªm vÃ o danh sÃ¡ch
				dsnv.add(nv);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return dsnv;
	}

	public void hienThiDanhSachNhanVien() {
		String colTieuDe1[] = new String[] { "Mã nhân vien", "Tên nhân viên", "Chức vụ", "Lương", "Ngày Sinh",
				"Giới tính", "Chú thích" };
		ArrayList<NhanVien> dsnv = layDanhSachNhanVien();

		DefaultTableModel model = new DefaultTableModel(colTieuDe1, 0);

		Object[] row;

		for (int i = 0; i < dsnv.size(); i++) {

			row = new Object[7];

			// GÃ�N GIÃ� TRá»Š
			row[0] = dsnv.get(i).getMaNV();
			row[1] = dsnv.get(i).getTenNV();
			row[2] = dsnv.get(i).getChucVu();
			row[3] = dsnv.get(i).getLuongNV();
			row[4] = dsnv.get(i).getNgaySinh();
			row[5] = dsnv.get(i).getGioiTinh();
			row[6] = dsnv.get(i).getChuThich();

			model.addRow(row);
		}

		// }catch(ArrayIndexOutOfBoundsException ex){

		jTableNhanvien.setModel(model);

	}

	public ArrayList<KhachHang> layDanhSachKhachHang() {
		ArrayList<KhachHang> dskh = new ArrayList<KhachHang>();
		Connection con = getConnection();
		try {
			st = (Statement) con.createStatement();
			String sql = "SELECT * FROM khachhang";
			// ThÆ°cj thi cÃ¢u lá»‡nh truy váº¥n
			ResultSet rs = st.executeQuery(sql);

			KhachHang kh;
			while (rs.next()) {
				kh = new KhachHang(rs.getString("MAKH"), rs.getString("TENKH"), rs.getString("CMND"),
						rs.getString("QUOCTICH"), rs.getString("GIOITINH"), rs.getInt("TUOI"), rs.getString("SDT"),
						rs.getString("MAPHONG"));

				// ThÃªm vÃ o danh sÃ¡ch
				dskh.add(kh);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return dskh;
	}

	public void hienThiDanhSachKhachHang() {
		String colTieuDe1[] = new String[] { "Mã khách hàng", "Tên khách hàng", "Chứng minh nhân dân", "Quốc tịch",
				"Giới tính", "Tuổi", "Số điện thoại", "Mã phòng" };
		ArrayList<KhachHang> dskh = layDanhSachKhachHang();

		DefaultTableModel model = new DefaultTableModel(colTieuDe1, 0);

		Object[] row;

		for (int i = 0; i < dskh.size(); i++) {

			row = new Object[8];

			// GÃ�N GIÃ� TRá»Š
			row[0] = dskh.get(i).getMaKH();
			row[1] = dskh.get(i).getTenKH();
			row[2] = dskh.get(i).getCmnd();
			row[3] = dskh.get(i).getQuocTich();
			row[4] = dskh.get(i).getGioiTinh();
			row[5] = dskh.get(i).getTuoi();
			row[6] = dskh.get(i).getSdt();
			row[7] = dskh.get(i).getMaPhong();

			model.addRow(row);
		}

		// }catch(ArrayIndexOutOfBoundsException ex){

		jTableKhachhang.setModel(model);

	}

	public ArrayList<DichVu> layDanhSachDichVu() {
		ArrayList<DichVu> dsdv = new ArrayList<DichVu>();
		Connection con = getConnection();
		try {
			st = (Statement) con.createStatement();
			String sql = "SELECT * FROM dichvu";
			// ThÆ°cj thi cÃ¢u lá»‡nh truy váº¥n
			ResultSet rs = st.executeQuery(sql);

			DichVu dv;
			while (rs.next()) {
				dv = new DichVu(rs.getString("MADV"), rs.getString("TENDV"), rs.getDouble("GIADV"));

				// ThÃªm vÃ o danh sÃ¡ch
				dsdv.add(dv);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return dsdv;
	}

	public void hienThiDanhSachDichVu() {
		String colTieuDe1[] = new String[] { "Mã dịch vụ", "Tên dịch vụ", "Giá dịch vụ" };
		ArrayList<DichVu> dsdv = layDanhSachDichVu();

		DefaultTableModel model = new DefaultTableModel(colTieuDe1, 0);

		Object[] row;

		for (int i = 0; i < dsdv.size(); i++) {

			row = new Object[3];

			// GÃ�N GIÃ� TRá»Š
			row[0] = dsdv.get(i).getMaDV();
			row[1] = dsdv.get(i).getTenNVL();
			row[2] = dsdv.get(i).getGiaDV();

			model.addRow(row);
		}

		// }catch(ArrayIndexOutOfBoundsException ex){

		jTableDichvu.setModel(model);

	}

	public ArrayList<Phong> layDanhSachPhong() {
		ArrayList<Phong> dsp = new ArrayList<Phong>();
		Connection con = getConnection();
		try {
			st = (Statement) con.createStatement();
			String sql = "SELECT * FROM phong";
			// ThÆ°cj thi cÃ¢u lá»‡nh truy váº¥n
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

	public void hienThiDanhSachPhong() {
		String colTieuDe1[] = new String[] { "Mã Phòng", "Tên Phòng", "Loại Phòng", "Gía Phòng", "Chú Thích",
				"Tình Trạng", "Mã Nhân Viên", "Mã Dịch Vụ" };
		ArrayList<Phong> dsp = layDanhSachPhong();

		DefaultTableModel model = new DefaultTableModel(colTieuDe1, 0);

		Object[] row;

		for (int i = 0; i < dsp.size(); i++) {

			row = new Object[8];

			// GÃ�N GIÃ� TRá»Š
			row[0] = dsp.get(i).getMaPhong();
			row[1] = dsp.get(i).getTenPhong();
			row[2] = dsp.get(i).getLoaiPhong();
			row[3] = dsp.get(i).getGiaPhong();
			row[4] = dsp.get(i).getChuThich();
			row[5] = dsp.get(i).getTinhTrang();
			row[6] = dsp.get(i).getMaNV();
			row[7] = dsp.get(i).getMaDV();

			model.addRow(row);
		}

		// }catch(ArrayIndexOutOfBoundsException ex){

		jTablePHONG.setModel(model);

	}

	public ArrayList<HoaDon> layDanhSachHoaDon() {
		ArrayList<HoaDon> dshd = new ArrayList<HoaDon>();
		Connection con = getConnection();
		try {

			st = (Statement) con.createStatement();
			String sql = "SELECT * FROM hoadon";
			// ThÆ°cj thi cÃ¢u lá»‡nh truy váº¥n
			ResultSet rs = st.executeQuery(sql);

			HoaDon hd;
			while (rs.next()) {
				hd = new HoaDon(rs.getString("MAHD"), rs.getString("MANV"), rs.getString("MAPHONG"), rs.getDate("NGAY"),
						rs.getDouble("GIAHD"));

				// ThÃªm vÃ o danh sÃ¡ch
				dshd.add(hd);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return dshd;
	}

	public void hienThiDanhSachHoaDon() {
		String colTieuDe1[] = new String[] { "MÃ HÓA ĐƠN", "MÃ NHÂN VIÊN", "MÃ PHÒNG", "NGÀY", "GiÁ HÓA ĐƠN" };
		ArrayList<HoaDon> dshd = layDanhSachHoaDon();

		DefaultTableModel model = new DefaultTableModel(colTieuDe1, 0);

		Object[] row;

		for (int i = 0; i < dshd.size(); i++) {

			row = new Object[5];

			// GÃ�N GIÃ� TRá»Š
			row[0] = dshd.get(i).getMaHD();
			row[1] = dshd.get(i).getMaNV();
			row[2] = dshd.get(i).getMaPhong();
			row[3] = dshd.get(i).getNgay();
			row[4] = dshd.get(i).getGiaHD();

			model.addRow(row);
		}

		// }catch(ArrayIndexOutOfBoundsException ex){

		jTableHOADON.setModel(model);

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel2 = new JPanel();
		jPanel1 = new JPanel();
		jTabbedPane1 = new JTabbedPane();
		jPanel4 = new JPanel();
		jPanel12 = new JPanel();
		jLabel10 = new JLabel();
		jLabel11 = new JLabel();
		jLabel12 = new JLabel();
		jLabel13 = new JLabel();
		jLabel14 = new JLabel();
		jLabel15 = new JLabel();
		jLabel16 = new JLabel();
		jLabel17 = new JLabel();
		jTextFieldMAKH = new JTextField();
		jTextFieldTENKH = new JTextField();
		jTextFieldCMND = new JTextField();
		jTextFieldQUOCTICH = new JTextField();
		jTextFieldGIOITINHKH = new JTextField();
		jTextFieldTUOI = new JTextField();
		jTextFieldSDT = new JTextField();
		jTextFieldMAPHONGKH = new JTextField();
		them1 = new JButton();
		sua1 = new JButton();
		xoa1 = new JButton();
		thoat1 = new JButton();
		jButtonclear2 = new JButton();
		jPanel11 = new JPanel();
		jLabel9 = new JLabel();
		jScrollPane2 = new JScrollPane();
		jTableKhachhang = new JTable();
		jPanel5 = new JPanel();
		jPanel17 = new JPanel();
		jLabel22 = new JLabel();
		jPanel19 = new JPanel();
		jScrollPane4 = new JScrollPane();
		jTablePHONG = new JTable();
		jPanel18 = new JPanel();
		jLabel23 = new JLabel();
		jLabel24 = new JLabel();
		jLabel25 = new JLabel();
		jLabel26 = new JLabel();
		jLabel27 = new JLabel();
		jLabel28 = new JLabel();
		jTextFieldMAPHONG = new JTextField();
		jTextFieldTENPHONG = new JTextField();
		jTextFieldLOAIPHONG = new JTextField();
		jTextFieldGIAPHONG = new JTextField();
		jTextFieldCHUTHICHP = new JTextField();
		jTextFieldTINHTRANG = new JTextField();
		them3 = new JButton();
		sua3 = new JButton();
		xoa3 = new JButton();
		thoat3 = new JButton();
		jLabel29 = new JLabel();
		jLabel30 = new JLabel();
		jTextFieldMANVP = new JTextField();
		jTextFieldMADVP = new JTextField();
		jButtonclear3 = new JButton();
		jPanel6 = new JPanel();
		jPanel20 = new JPanel();
		jLabel31 = new JLabel();
		jPanel21 = new JPanel();
		jLabel32 = new JLabel();
		jLabel33 = new JLabel();
		jLabel34 = new JLabel();
		jLabel35 = new JLabel();
		jLabel36 = new JLabel();
		jTextFieldMAHD = new JTextField();
		jTextFieldMANVHD = new JTextField();
		jTextFieldMAPHONGHD = new JTextField();
		jTextFieldNGAY = new JTextField();
		jTextFieldGIAHD = new JTextField();
		them4 = new JButton();
		sua4 = new JButton();
		xoa4 = new JButton();
		thoat4 = new JButton();
		jButtonclear4 = new JButton();
		jPanel22 = new JPanel();
		jScrollPane5 = new JScrollPane();
		jTableHOADON = new JTable();
		jPanel3 = new JPanel();
		jPanel8 = new JPanel();
		jLabel1 = new JLabel();
		jPanel9 = new JPanel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		jLabel4 = new JLabel();
		jLabel5 = new JLabel();
		jLabel6 = new JLabel();
		jLabel7 = new JLabel();
		jLabel8 = new JLabel();
		jTextFieldMANV = new JTextField();
		jTextFieldTENNV = new JTextField();
		jTextFieldCHUCVU = new JTextField();
		jTextFieldLUONG = new JTextField();
		jTextFieldNGAYSINH = new JTextField();
		jTextFieldGIOITINH = new JTextField();
		jTextFieldCHUTHICH = new JTextField();
		them = new JButton();
		sua = new JButton();
		xoa = new JButton();
		thoat = new JButton();
		jButtonclear = new JButton();
		jScrollPane1 = new JScrollPane();
		jTableNhanvien = new JTable();
		jPanel7 = new JPanel();
		jPanel14 = new JPanel();
		jLabel18 = new JLabel();
		jPanel15 = new JPanel();
		jLabel19 = new JLabel();
		jLabel20 = new JLabel();
		jLabel21 = new JLabel();
		jTextFieldMADV = new JTextField();
		jTextFieldTENDV = new JTextField();
		jTextFieldGIADV = new JTextField();
		them2 = new JButton();
		sua2 = new JButton();
		xoa2 = new JButton();
		thoat2 = new JButton();
		jButtonclear1 = new JButton();
		jScrollPane3 = new JScrollPane();
		jTableDichvu = new JTable();

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 100, Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 100, Short.MAX_VALUE));

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 100, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 100, Short.MAX_VALUE));

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		jPanel12.setBorder(BorderFactory.createTitledBorder("Thông tin khách hàng"));

		jLabel10.setText("Mã khách hàng");

		jLabel11.setText("Tên khách hàng");

		jLabel12.setText("Chứng minh nhân dân");

		jLabel13.setText("Quốc tịch");

		jLabel14.setText("Giới tính");

		jLabel15.setText("Tuổi");

		jLabel16.setText("Số điện thoại");

		jLabel17.setText("Mã phòng");

		jTextFieldMAKH.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldMAKHActionPerformed(evt);
			}
		});

		jTextFieldTENKH.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldTENKHActionPerformed(evt);
			}
		});

		jTextFieldMAPHONGKH.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldMAPHONGKHActionPerformed(evt);
			}
		});

		them1.setText("Thêm");
		them1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				them1ActionPerformed(evt);
			}
		});

		sua1.setText("Sửa");
		sua1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sua1ActionPerformed(evt);
			}
		});

		xoa1.setText("Xóa");
		xoa1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				xoa1ActionPerformed(evt);
			}
		});

		thoat1.setText("Thoát");
		thoat1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				thoat1ActionPerformed(evt);
			}
		});

		jButtonclear2.setText("Clear");
		jButtonclear2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonclear2ActionPerformed(evt);
			}
		});

		GroupLayout jPanel12Layout = new GroupLayout(jPanel12);
		jPanel12.setLayout(jPanel12Layout);
		jPanel12Layout
				.setHorizontalGroup(
						jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(
										jPanel12Layout
												.createSequentialGroup().addGap(22, 22, 22).addGroup(jPanel12Layout
														.createParallelGroup(GroupLayout.Alignment.LEADING)
														.addGroup(jPanel12Layout.createSequentialGroup().addGroup(
																jPanel12Layout
																		.createParallelGroup(
																				GroupLayout.Alignment.LEADING, false)
																		.addComponent(them1, GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(xoa1, GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
																.addGap(32, 32, 32)
																.addGroup(jPanel12Layout.createParallelGroup(
																		GroupLayout.Alignment.LEADING).addComponent(
																				thoat1)
																		.addGroup(jPanel12Layout.createSequentialGroup()
																				.addComponent(sua1).addGap(18, 18, 18)
																				.addComponent(jButtonclear2))))
														.addGroup(jPanel12Layout
																.createSequentialGroup().addGroup(jPanel12Layout
																		.createParallelGroup(
																				GroupLayout.Alignment.LEADING)
																		.addComponent(jLabel10).addComponent(jLabel11)
																		.addComponent(jLabel12).addComponent(jLabel13)
																		.addComponent(jLabel14).addComponent(jLabel15)
																		.addComponent(jLabel16).addComponent(jLabel17))
																.addGap(18, 18, 18)
																.addGroup(jPanel12Layout
																		.createParallelGroup(
																				GroupLayout.Alignment.LEADING)
																		.addComponent(jTextFieldQUOCTICH,
																				GroupLayout.PREFERRED_SIZE, 84,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(jTextFieldCMND,
																				GroupLayout.PREFERRED_SIZE, 84,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(jTextFieldTENKH,
																				GroupLayout.PREFERRED_SIZE, 84,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(jTextFieldMAKH,
																				GroupLayout.PREFERRED_SIZE, 84,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(jTextFieldGIOITINHKH,
																				GroupLayout.PREFERRED_SIZE, 84,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(jTextFieldTUOI,
																				GroupLayout.PREFERRED_SIZE, 84,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(jTextFieldSDT,
																				GroupLayout.PREFERRED_SIZE, 84,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(jTextFieldMAPHONGKH,
																				GroupLayout.PREFERRED_SIZE, 84,
																				GroupLayout.PREFERRED_SIZE))))
												.addContainerGap(36, Short.MAX_VALUE)));
		jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel12Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel10).addComponent(jTextFieldMAKH, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel11).addComponent(jTextFieldTENKH, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel12).addComponent(jTextFieldCMND, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel13).addComponent(jTextFieldQUOCTICH, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel14).addComponent(jTextFieldGIOITINHKH, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel15).addComponent(jTextFieldTUOI, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel16).addComponent(jTextFieldSDT, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel17).addComponent(jTextFieldMAPHONGKH, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(41, 41, 41)
						.addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(them1)
								.addComponent(sua1).addComponent(jButtonclear2))
						.addGap(28, 28, 28).addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(xoa1).addComponent(thoat1))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel9.setText("QUẢN LÍ KHÁCH HÀNG");

		GroupLayout jPanel11Layout = new GroupLayout(jPanel11);
		jPanel11.setLayout(jPanel11Layout);
		jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel11Layout.createSequentialGroup().addGap(18, 18, 18)
						.addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE).addContainerGap()));
		jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel11Layout.createSequentialGroup().addGap(27, 27, 27)
						.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(27, Short.MAX_VALUE)));

		jTableKhachhang
				.setModel(new DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jTableKhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTableKhachhangMouseClicked(evt);
			}
		});
		jScrollPane2.setViewportView(jTableKhachhang);

		GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addGap(36, 36, 36)
						.addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(27, 27, 27)
						.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jPanel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 574,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(34, Short.MAX_VALUE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addGap(27, 27, 27).addGroup(jPanel4Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel4Layout.createSequentialGroup()
								.addComponent(jPanel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(22, 22, 22).addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 275,
										GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(292, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Khách Hàng", jPanel4);

		jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel22.setText("QUẢN LÍ PHÒNG");

		GroupLayout jPanel17Layout = new GroupLayout(jPanel17);
		jPanel17.setLayout(jPanel17Layout);
		jPanel17Layout.setHorizontalGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel17Layout.createSequentialGroup().addContainerGap(123, Short.MAX_VALUE)
						.addComponent(jLabel22, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)));
		jPanel17Layout.setVerticalGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel17Layout.createSequentialGroup().addGap(23, 23, 23)
						.addComponent(jLabel22, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(30, 30, 30)));

		GroupLayout jPanel19Layout = new GroupLayout(jPanel19);
		jPanel19.setLayout(jPanel19Layout);
		jPanel19Layout.setHorizontalGroup(
				jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 416, Short.MAX_VALUE));
		jPanel19Layout.setVerticalGroup(
				jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 272, Short.MAX_VALUE));

		jTablePHONG
				.setModel(new DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jTablePHONG.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTablePHONGMouseClicked(evt);
			}
		});
		jScrollPane4.setViewportView(jTablePHONG);

		jPanel18.setBorder(BorderFactory.createTitledBorder("Thông tin phòng"));

		jLabel23.setText("Mã phòng");

		jLabel24.setText("Tên phòng");

		jLabel25.setText("Loại phòng");

		jLabel26.setText("Giá phòng");

		jLabel27.setText("Chú thích");

		jLabel28.setText("Tình trạng");

		them3.setText("Thêm ");
		them3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				them3ActionPerformed(evt);
			}
		});

		sua3.setText("Sửa");
		sua3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sua3ActionPerformed(evt);
			}
		});

		xoa3.setText("Xóa");
		xoa3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				xoa3ActionPerformed(evt);
			}
		});

		thoat3.setText("Thoát");
		thoat3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				thoat3ActionPerformed(evt);
			}
		});

		jLabel29.setText("Mã Nhân Viên");

		jLabel30.setText("Mã Dịch Vụ");

		jButtonclear3.setText("Clear");
		jButtonclear3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonclear3ActionPerformed(evt);
			}
		});

		GroupLayout jPanel18Layout = new GroupLayout(jPanel18);
		jPanel18.setLayout(jPanel18Layout);
		jPanel18Layout
				.setHorizontalGroup(
						jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel18Layout
								.createSequentialGroup().addGap(21, 21, 21).addGroup(jPanel18Layout.createParallelGroup(
										GroupLayout.Alignment.LEADING)
										.addGroup(jPanel18Layout.createSequentialGroup().addGroup(jPanel18Layout
												.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
												.addGroup(jPanel18Layout.createSequentialGroup().addComponent(xoa3)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(thoat3))
												.addGroup(jPanel18Layout.createSequentialGroup().addComponent(them3)
														.addGap(34, 34, 34).addComponent(sua3)))
												.addGap(18, 18, 18).addComponent(jButtonclear3))
										.addGroup(jPanel18Layout.createSequentialGroup().addGroup(jPanel18Layout
												.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(jLabel23).addComponent(jLabel24).addComponent(jLabel25)
												.addComponent(jLabel26).addComponent(jLabel27).addComponent(jLabel28)
												.addComponent(jLabel29).addComponent(jLabel30)).addGap(71, 71, 71)
												.addGroup(jPanel18Layout
														.createParallelGroup(GroupLayout.Alignment.LEADING, false)
														.addComponent(jTextFieldMAPHONG, GroupLayout.DEFAULT_SIZE, 79,
																Short.MAX_VALUE)
														.addComponent(jTextFieldTENPHONG)
														.addComponent(jTextFieldLOAIPHONG)
														.addComponent(jTextFieldGIAPHONG)
														.addComponent(jTextFieldCHUTHICHP)
														.addComponent(jTextFieldTINHTRANG).addComponent(jTextFieldMANVP)
														.addComponent(jTextFieldMADVP))))
								.addContainerGap(15, Short.MAX_VALUE)));
		jPanel18Layout.setVerticalGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel18Layout.createSequentialGroup().addGap(22, 22, 22)
						.addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel23).addComponent(jTextFieldMAPHONG, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel24).addComponent(jTextFieldTENPHONG, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jLabel25).addComponent(jTextFieldLOAIPHONG, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jLabel26).addComponent(jTextFieldGIAPHONG, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jLabel27).addComponent(jTextFieldCHUTHICHP, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jLabel28).addComponent(jTextFieldTINHTRANG, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jLabel29).addComponent(jTextFieldMANVP, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jLabel30).addComponent(jTextFieldMADVP, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(25, 25, 25)
						.addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(them3)
								.addComponent(sua3).addComponent(jButtonclear3))
						.addGap(18, 18, 18).addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(xoa3).addComponent(thoat3))
						.addContainerGap(16, Short.MAX_VALUE)));

		GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup()
						.addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap()
										.addComponent(jPanel18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(jPanel5Layout.createSequentialGroup().addGap(103, 103, 103)
														.addComponent(jPanel19, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel5Layout.createSequentialGroup()
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 343,
																GroupLayout.PREFERRED_SIZE))))
								.addGroup(jPanel5Layout.createSequentialGroup().addGap(86, 86, 86).addComponent(
										jPanel17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel5Layout.createSequentialGroup().addGap(49, 49, 49)
										.addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 285,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel19,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel5Layout.createSequentialGroup()
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel18,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Phòng", jPanel5);

		jLabel31.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
		jLabel31.setText("Hóa đơn");

		GroupLayout jPanel20Layout = new GroupLayout(jPanel20);
		jPanel20.setLayout(jPanel20Layout);
		jPanel20Layout.setHorizontalGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				GroupLayout.Alignment.TRAILING,
				jPanel20Layout.createSequentialGroup().addContainerGap(156, Short.MAX_VALUE)
						.addComponent(jLabel31, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
						.addGap(151, 151, 151)));
		jPanel20Layout.setVerticalGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
						.addContainerGap(46, Short.MAX_VALUE).addComponent(jLabel31).addGap(40, 40, 40)));

		jPanel21.setBorder(BorderFactory.createTitledBorder("Thông tin hóa đơn"));

		jLabel32.setText("Mã hóa đơn");

		jLabel33.setText("Mã nhân viên");

		jLabel34.setText("Mã phòng");

		jLabel35.setText("Ngày");

		jLabel36.setText("Giá hóa đơn");

		jTextFieldMAHD.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldMAHDActionPerformed(evt);
			}
		});

		jTextFieldMAPHONGHD.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldMAPHONGHDActionPerformed(evt);
			}
		});

		them4.setText("Thêm");
		them4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				them4ActionPerformed(evt);
			}
		});

		sua4.setText("Sửa");
		sua4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sua4ActionPerformed(evt);
			}
		});

		xoa4.setText("Xóa");
		xoa4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				xoa4ActionPerformed(evt);
			}
		});

		thoat4.setText("Thoát");
		thoat4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				thoat4ActionPerformed(evt);
			}
		});

		jButtonclear4.setText("Clear");
		jButtonclear4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonclear4ActionPerformed(evt);
			}
		});

		GroupLayout jPanel21Layout = new GroupLayout(jPanel21);
		jPanel21.setLayout(jPanel21Layout);
		jPanel21Layout.setHorizontalGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel21Layout.createSequentialGroup().addGap(23, 23, 23)
						.addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jLabel32).addComponent(jLabel33).addComponent(jLabel34)
								.addComponent(jLabel35).addComponent(jLabel36)
								.addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
										.addComponent(xoa4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(them4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGap(40, 40, 40)
						.addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(jTextFieldGIAHD, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
										.addComponent(jTextFieldNGAY).addComponent(jTextFieldMAPHONGHD)
										.addComponent(jTextFieldMANVHD).addComponent(jTextFieldMAHD))
								.addGroup(jPanel21Layout.createSequentialGroup().addGroup(jPanel21Layout
										.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
										.addComponent(sua4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(thoat4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
										.addComponent(jButtonclear4)))
						.addContainerGap()));
		jPanel21Layout.setVerticalGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel21Layout.createSequentialGroup().addGap(26, 26, 26)
						.addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel32).addComponent(jTextFieldMAHD, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jLabel33).addComponent(jTextFieldMANVHD, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jLabel34).addComponent(jTextFieldMAPHONGHD, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jLabel35).addComponent(jTextFieldNGAY, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jLabel36).addComponent(jTextFieldGIAHD, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(34, 34, 34)
						.addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(them4)
								.addComponent(sua4).addComponent(jButtonclear4))
						.addGap(26, 26, 26).addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(xoa4).addComponent(thoat4))
						.addContainerGap(32, Short.MAX_VALUE)));

		jTableHOADON
				.setModel(new DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jTableHOADON.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTableHOADONMouseClicked(evt);
			}
		});
		jScrollPane5.setViewportView(jTableHOADON);

		GroupLayout jPanel22Layout = new GroupLayout(jPanel22);
		jPanel22.setLayout(jPanel22Layout);
		jPanel22Layout.setHorizontalGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				GroupLayout.Alignment.TRAILING,
				jPanel22Layout.createSequentialGroup().addContainerGap(27, Short.MAX_VALUE)
						.addComponent(jScrollPane5, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
						.addGap(25, 25, 25)));
		jPanel22Layout.setVerticalGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel22Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane5, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE).addContainerGap()));

		GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup()
						.addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel6Layout.createSequentialGroup().addGap(18, 18, 18)
										.addComponent(jPanel21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(42, 42, 42).addComponent(jPanel22, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel6Layout.createSequentialGroup().addGap(112, 112, 112).addComponent(
										jPanel20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(309, Short.MAX_VALUE)));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addGap(15, 15, 15)
						.addComponent(jPanel20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(jPanel21, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jPanel22, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
						.addContainerGap(237, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Hóa đơn", jPanel6);

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel1.setText("QUẢN LÍ NHÂN VIÊN");

		GroupLayout jPanel8Layout = new GroupLayout(jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup().addGap(140, 140, 140)
						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(59, Short.MAX_VALUE)));
		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				GroupLayout.Alignment.TRAILING,
				jPanel8Layout.createSequentialGroup().addContainerGap(25, Short.MAX_VALUE)
						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addGap(22, 22, 22)));

		jPanel9.setBorder(BorderFactory.createTitledBorder("Thông tin nhân viên"));

		jLabel2.setText("Mã nhân viên");

		jLabel3.setText("Tên nhân viên");

		jLabel4.setText("Chức vụ");

		jLabel5.setText("Lương");

		jLabel6.setText("Ngày Sinh");

		jLabel7.setText("Giới tính");

		jLabel8.setText("Chú thích");

		jTextFieldTENNV.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldTENNVActionPerformed(evt);
			}
		});

		jTextFieldLUONG.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldLUONGActionPerformed(evt);
			}
		});

		them.setText("Thêm");
		them.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				themActionPerformed(evt);
			}
		});

		sua.setText("Sửa");
		sua.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				suaActionPerformed(evt);
			}
		});

		xoa.setText("Xóa");
		xoa.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				xoaActionPerformed(evt);
			}
		});

		thoat.setText("Thoát");
		thoat.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				thoatActionPerformed(evt);
			}
		});

		jButtonclear.setText("Clear");
		jButtonclear.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonclearActionPerformed(evt);
			}
		});

		GroupLayout jPanel9Layout = new GroupLayout(jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup().addGroup(jPanel9Layout
						.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addGroup(jPanel9Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(them, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(xoa, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
								.addGap(18, 18, 18)
								.addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(jPanel9Layout.createSequentialGroup().addComponent(thoat).addGap(0, 0,
												Short.MAX_VALUE))
										.addGroup(jPanel9Layout.createSequentialGroup()
												.addComponent(sua, GroupLayout.PREFERRED_SIZE, 61,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(
														jButtonclear, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))))
						.addGroup(GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
								.addGap(19, 19, 19)
								.addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
										.addGroup(jPanel9Layout.createSequentialGroup().addGroup(jPanel9Layout
												.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(GroupLayout.Alignment.TRAILING, jPanel9Layout
														.createParallelGroup(GroupLayout.Alignment.LEADING)
														.addGroup(GroupLayout.Alignment.TRAILING, jPanel9Layout
																.createSequentialGroup()
																.addGroup(jPanel9Layout
																		.createParallelGroup(
																				GroupLayout.Alignment.LEADING)
																		.addComponent(jLabel3).addComponent(jLabel2))
																.addGap(18, 18, 18))
														.addGroup(jPanel9Layout.createSequentialGroup()
																.addComponent(jLabel4).addGap(47, 47, 47)))
												.addGroup(jPanel9Layout.createSequentialGroup().addComponent(jLabel5)
														.addGap(57, 57, 57)))
												.addGroup(jPanel9Layout
														.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
														.addComponent(jTextFieldLUONG)
														.addComponent(jTextFieldCHUCVU, GroupLayout.Alignment.LEADING)
														.addComponent(jTextFieldMANV).addComponent(jTextFieldTENNV,
																GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
										.addGroup(GroupLayout.Alignment.LEADING,
												jPanel9Layout.createSequentialGroup().addGroup(jPanel9Layout
														.createParallelGroup(GroupLayout.Alignment.LEADING)
														.addGroup(jPanel9Layout
																.createParallelGroup(GroupLayout.Alignment.TRAILING,
																		false)
																.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(jLabel6, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
														.addComponent(jLabel8)).addGap(39, 39, 39)
														.addGroup(jPanel9Layout
																.createParallelGroup(GroupLayout.Alignment.LEADING)
																.addComponent(jTextFieldGIOITINH)
																.addComponent(jTextFieldNGAYSINH)
																.addComponent(jTextFieldCHUTHICH))))))
						.addContainerGap()));
		jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel9Layout.createSequentialGroup().addGap(19, 19, 19)
						.addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(jTextFieldMANV, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(jTextFieldTENNV, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4).addComponent(jTextFieldCHUCVU, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(jTextFieldLUONG, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(jTextFieldNGAYSINH, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel7).addComponent(jTextFieldGIOITINH, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel8).addComponent(jTextFieldCHUTHICH, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(them)
								.addComponent(sua).addComponent(jButtonclear))
						.addGap(18, 18, 18).addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(xoa).addComponent(thoat))
						.addContainerGap(31, Short.MAX_VALUE)));

		jTableNhanvien
				.setModel(new DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jTableNhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTableNhanvienMouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(jTableNhanvien);

		GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup().addGap(68, 68, 68).addComponent(jPanel8,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel3Layout.createSequentialGroup().addGap(49, 49, 49)
								.addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(36, 36, 36).addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 367,
										GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(267, Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup().addGap(21, 21, 21)
								.addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 315,
												GroupLayout.PREFERRED_SIZE))
								.addContainerGap(228, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Nhân viên", jPanel3);

		jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel18.setText("DANH SÁCH DỊCH VỤ");

		GroupLayout jPanel14Layout = new GroupLayout(jPanel14);
		jPanel14.setLayout(jPanel14Layout);
		jPanel14Layout.setHorizontalGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				GroupLayout.Alignment.TRAILING,
				jPanel14Layout.createSequentialGroup().addContainerGap(46, Short.MAX_VALUE)
						.addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
						.addGap(27, 27, 27)));
		jPanel14Layout.setVerticalGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				GroupLayout.Alignment.TRAILING,
				jPanel14Layout.createSequentialGroup().addContainerGap(20, Short.MAX_VALUE)
						.addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addGap(19, 19, 19)));

		jPanel15.setBorder(BorderFactory.createTitledBorder("Thông tin dịch vụ"));

		jLabel19.setText("Mã dịch vụ");

		jLabel20.setText("Tên dịch vụ");

		jLabel21.setText("Giá dịch vụ");

		them2.setText("Thêm");
		them2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				them2ActionPerformed(evt);
			}
		});

		sua2.setText("Sửa");
		sua2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sua2ActionPerformed(evt);
			}
		});

		xoa2.setText("Xóa");
		xoa2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				xoa2ActionPerformed(evt);
			}
		});

		thoat2.setText("Thoát");
		thoat2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				thoat2ActionPerformed(evt);
			}
		});

		jButtonclear1.setText("Clear");
		jButtonclear1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonclear1ActionPerformed(evt);
			}
		});

		GroupLayout jPanel15Layout = new GroupLayout(jPanel15);
		jPanel15.setLayout(jPanel15Layout);
		jPanel15Layout.setHorizontalGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel15Layout.createSequentialGroup().addGap(26, 26, 26).addGroup(jPanel15Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel21).addComponent(jLabel20).addComponent(jLabel19))
						.addComponent(them2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(xoa2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
								jPanel15Layout.createSequentialGroup().addGap(25, 25, 25).addGroup(jPanel15Layout
										.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(jTextFieldMADV, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
										.addComponent(jTextFieldTENDV).addComponent(jTextFieldGIADV)))
								.addGroup(jPanel15Layout.createSequentialGroup().addGap(18, 18, 18)
										.addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(thoat2, GroupLayout.PREFERRED_SIZE, 72,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(jPanel15Layout.createSequentialGroup()
														.addComponent(sua2, GroupLayout.PREFERRED_SIZE, 72,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18).addComponent(jButtonclear1)))))
						.addContainerGap(31, Short.MAX_VALUE)));
		jPanel15Layout
				.setVerticalGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel15Layout.createSequentialGroup().addGap(21, 21, 21)
								.addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel19).addComponent(jTextFieldMADV, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(jPanel15Layout
										.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel20)
										.addComponent(jTextFieldTENDV, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(23, 23, 23)
								.addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel21)
										.addComponent(jTextFieldGIADV, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(31, 31, 31)
								.addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(them2).addComponent(sua2).addComponent(jButtonclear1))
								.addGap(18, 18, 18)
								.addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(xoa2).addComponent(thoat2))
								.addContainerGap(43, Short.MAX_VALUE)));

		jTableDichvu
				.setModel(new DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jTableDichvu.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTableDichvuMouseClicked(evt);
			}
		});
		jScrollPane3.setViewportView(jTableDichvu);

		GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup().addGroup(jPanel7Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel7Layout.createSequentialGroup().addGap(46, 46, 46)
								.addComponent(jPanel15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jScrollPane3,
										GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel7Layout.createSequentialGroup().addGap(121, 121, 121).addComponent(jPanel14,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup().addGap(36, 36, 36)
						.addComponent(jPanel14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(jPanel15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
						.addContainerGap(264, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Dịch vụ", jPanel7);

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup()
						.addComponent(jTabbedPane1, GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE).addContainerGap()));
		layout.setVerticalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup()
						.addComponent(jTabbedPane1, GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE).addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jTextFieldTENNVActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldTENNVActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldTENNVActionPerformed

	private void jTextFieldLUONGActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldLUONGActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldLUONGActionPerformed

	private void jTableNhanvienMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTableNhanvienMouseClicked

		// TODO add your handling code here:
		int i = jTableNhanvien.getSelectedRow();
		TableModel model = jTableNhanvien.getModel();
		jTextFieldMANV.setText(model.getValueAt(i, 0).toString());
		jTextFieldTENNV.setText(model.getValueAt(i, 1).toString());
		jTextFieldCHUCVU.setText(model.getValueAt(i, 2).toString());
		jTextFieldLUONG.setText(model.getValueAt(i, 3).toString());
		jTextFieldNGAYSINH.setText(model.getValueAt(i, 4).toString());
		jTextFieldGIOITINH.setText(model.getValueAt(i, 5).toString());
		jTextFieldCHUTHICH.setText(model.getValueAt(i, 6).toString());
	}// GEN-LAST:event_jTableNhanvienMouseClicked

	private void themActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_themActionPerformed
		// TODO add your handling code here:
		Connection con = getConnection();
		try {
			// Táº¡o má»™t Ä‘á»‘i tÆ°á»£ng Ä‘á»ƒ thá»±c hiá»‡n cÃ´ng viá»‡c
			st = (Statement) con.createStatement();
			String query = "INSERT INTO NhanVien(MANV,TENNV,CHUCVU, LUONGNV, NGAYSINH, GIOITINH, CHUTHICH) VALUES('"
					+ jTextFieldMANV.getText() + "'," + "'" + jTextFieldTENNV.getText() + "','"
					+ jTextFieldCHUCVU.getText() + "','" + jTextFieldLUONG.getText() + "','"
					+ jTextFieldNGAYSINH.getText() + "','" + jTextFieldGIOITINH.getText() + "','"
					+ jTextFieldCHUTHICH.getText() + "')";

			st.execute(query);
			hienThiDanhSachNhanVien();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}// GEN-LAST:event_themActionPerformed

	private void suaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_suaActionPerformed
		// TODO add your handling code here:

		if (jTableNhanvien.getSelectedRow() == -1) {
			if (jTableNhanvien.getRowCount() == 0) {
				// lblError.setText("Table is empty");
			} else {
				// lblError.setText("You must select a Tennis Player");
			}
		} else {
			DefaultTableModel model = (DefaultTableModel) jTableNhanvien.getModel();
			model.setValueAt(jTextFieldMANV.getText(), jTableNhanvien.getSelectedRow(), 0);
			model.setValueAt(jTextFieldTENNV.getText().toString(), jTableNhanvien.getSelectedRow(), 1);
			model.setValueAt(jTextFieldCHUCVU.getText(), jTableNhanvien.getSelectedRow(), 2);
			model.setValueAt(jTextFieldLUONG.getText(), jTableNhanvien.getSelectedRow(), 2);
			model.setValueAt(jTextFieldNGAYSINH.getText(), jTableNhanvien.getSelectedRow(), 2);
			model.setValueAt(jTextFieldGIOITINH.getText(), jTableNhanvien.getSelectedRow(), 2);
			model.setValueAt(jTextFieldCHUTHICH.getText(), jTableNhanvien.getSelectedRow(), 2);
		}

	}// GEN-LAST:event_suaActionPerformed

	private void jTextFieldMAPHONGKHActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldMAPHONGKHActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldMAPHONGKHActionPerformed

	private void jTextFieldMAKHActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldMAKHActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldMAKHActionPerformed

	private void jTextFieldTENKHActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldTENKHActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldTENKHActionPerformed

	private void xoaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_xoaActionPerformed
		// TODO add your handling code here:
		Connection con = getConnection();
		try {
			// Táº¡o má»™t Ä‘á»‘i tÆ°á»£ng Ä‘á»ƒ thá»±c hiá»‡n cÃ´ng viá»‡c
			st = (Statement) con.createStatement();
			String query = "DELETE FROM NhanVien WHERE MANV = '" + jTextFieldMANV.getText() + "'";
			st.executeUpdate(query);
			hienThiDanhSachNhanVien();

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}// GEN-LAST:event_xoaActionPerformed

	private void thoatActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_thoatActionPerformed
		// TODO add your handling code here:
		thoat.setToolTipText("Click vào thoát chương trình ");
		int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thoát chương trình" + " trên không",
				"Thông báo", JOptionPane.YES_NO_CANCEL_OPTION);
		if (selected == JOptionPane.YES_NO_OPTION) {
			this.dispose();

		}
	}// GEN-LAST:event_thoatActionPerformed

	private void them2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_them2ActionPerformed
		// TODO add your handling code here:
		Connection con = getConnection();
		try {
			// Táº¡o má»™t Ä‘á»‘i tÆ°á»£ng Ä‘á»ƒ thá»±c hiá»‡n cÃ´ng viá»‡c
			st = (Statement) con.createStatement();
			String query = "INSERT INTO DichVu(MADV,TENDV, GIADV) VALUES('" + jTextFieldMADV.getText() + "'," + "'"
					+ jTextFieldTENDV.getText() + "','" + jTextFieldGIADV.getText() + "')";

			st.execute(query);
			hienThiDanhSachDichVu();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}// GEN-LAST:event_them2ActionPerformed

	private void xoa2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_xoa2ActionPerformed
		// TODO add your handling code here:
		Connection con = getConnection();
		try {
			// Táº¡o má»™t Ä‘á»‘i tÆ°á»£ng Ä‘á»ƒ thá»±c hiá»‡n cÃ´ng viá»‡c
			st = (Statement) con.createStatement();
			String query = "DELETE FROM dichvu WHERE MADV = '" + jTextFieldMADV.getText() + "'";
			st.executeUpdate(query);
			hienThiDanhSachDichVu();

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}// GEN-LAST:event_xoa2ActionPerformed

	private void thoat2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_thoat2ActionPerformed
		// TODO add your handling code here:
		thoat2.setToolTipText("Click  vào thoát chương trình");
		int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thoát chương trình" + " trên không",
				"Thông báo", JOptionPane.YES_NO_CANCEL_OPTION);
		if (selected == JOptionPane.YES_NO_OPTION) {
			this.dispose();

		}

	}// GEN-LAST:event_thoat2ActionPerformed

	private void sua2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sua2ActionPerformed
		// TODO add your handling code here:
		if (jTableDichvu.getSelectedRow() == -1) {
			if (jTableDichvu.getRowCount() == 0) {
				// lblError.setText("Table is empty");
			} else {
				// lblError.setText("You must select a Tennis Player");
			}
		} else {
			DefaultTableModel model = (DefaultTableModel) jTableDichvu.getModel();
			model.setValueAt(jTextFieldMADV.getText(), jTableDichvu.getSelectedRow(), 0);
			model.setValueAt(jTextFieldTENDV.getText().toString(), jTableDichvu.getSelectedRow(), 1);
			model.setValueAt(jTextFieldGIADV.getText(), jTableDichvu.getSelectedRow(), 2);
		}

	}// GEN-LAST:event_sua2ActionPerformed

	private void them3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_them3ActionPerformed
		// TODO add your handling code here
		Connection con = getConnection();
		try {
			// Táº¡o má»™t Ä‘á»‘i tÆ°á»£ng Ä‘á»ƒ thá»±c hiá»‡n cÃ´ng viá»‡c
			st = (Statement) con.createStatement();
			String query = "INSERT INTO phong(MAPHONG,TENPHONG, LOAIPHONG, GIAPHONG, CHUTHICH, TINHTRANG, MANV, MADV) VALUES('"
					+ jTextFieldMAPHONG.getText() + "'," + "'" + jTextFieldTENPHONG.getText() + "','"
					+ jTextFieldLOAIPHONG.getText() + "', '" + jTextFieldGIAPHONG.getText() + "', '"
					+ jTextFieldCHUTHICHP.getText() + "', '" + jTextFieldTINHTRANG.getText() + "', '"
					+ jTextFieldMANVP.getText() + "', '" + jTextFieldMADVP.getText() + "')";

			st.execute(query);
			hienThiDanhSachPhong();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}// GEN-LAST:event_them3ActionPerformed

	private void jTableDichvuMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTableDichvuMouseClicked
		// TODO add your handling code here
		int i = jTableDichvu.getSelectedRow();
		TableModel model = jTableDichvu.getModel();
		jTextFieldMADV.setText(model.getValueAt(i, 0).toString());
		jTextFieldTENDV.setText(model.getValueAt(i, 1).toString());
		jTextFieldGIADV.setText(model.getValueAt(i, 2).toString());

	}// GEN-LAST:event_jTableDichvuMouseClicked

	private void xoa3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_xoa3ActionPerformed
		// TODO add your handling code here:
		Connection con = getConnection();
		try {
			// Táº¡o má»™t Ä‘á»‘i tÆ°á»£ng Ä‘á»ƒ thá»±c hiá»‡n cÃ´ng viá»‡c
			st = (Statement) con.createStatement();
			String query = "DELETE FROM phong WHERE MAPHONG = '" + jTextFieldMAPHONG.getText() + "'";
			st.executeUpdate(query);
			hienThiDanhSachPhong();

		} catch (Exception ex) {

			ex.printStackTrace();
		}

	}// GEN-LAST:event_xoa3ActionPerformed

	private void jTablePHONGMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTablePHONGMouseClicked
		// TODO add your handling code here:
		int i = jTablePHONG.getSelectedRow();
		TableModel model = jTablePHONG.getModel();
		jTextFieldMAPHONG.setText(model.getValueAt(i, 0).toString());
		jTextFieldTENPHONG.setText(model.getValueAt(i, 1).toString());
		jTextFieldLOAIPHONG.setText(model.getValueAt(i, 2).toString());
		jTextFieldGIAPHONG.setText(model.getValueAt(i, 3).toString());
		jTextFieldCHUTHICHP.setText(model.getValueAt(i, 4).toString());
		jTextFieldTINHTRANG.setText(model.getValueAt(i, 5).toString());
		jTextFieldMANVP.setText(model.getValueAt(i, 6).toString());
		jTextFieldMADVP.setText(model.getValueAt(i, 7).toString());
	}// GEN-LAST:event_jTablePHONGMouseClicked

	private void thoat3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_thoat3ActionPerformed
		// TODO add your handling code here:
		thoat3.setToolTipText("Click vào thoát chương trình ");
		int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thoát chương trình" + " trên không",
				"Thông báo", JOptionPane.YES_NO_CANCEL_OPTION);
		if (selected == JOptionPane.YES_NO_OPTION) {
			this.dispose();

		}
	}// GEN-LAST:event_thoat3ActionPerformed

	private void them1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_them1ActionPerformed
		// TODO add your handling code here:
		Connection con = getConnection();
		try {
			// Táº¡o má»™t Ä‘á»‘i tÆ°á»£ng Ä‘á»ƒ thá»±c hiá»‡n cÃ´ng viá»‡c
			st = (Statement) con.createStatement();
			String query = "INSERT INTO khachhang(MAKH,TENKH, CMND, QUOCTICH, GIOITINH, TUOI, SDT, MAPHONG) VALUES('"
					+ jTextFieldMAKH.getText() + "'," + "'" + jTextFieldTENKH.getText() + "','"
					+ jTextFieldCMND.getText() + "', '" + jTextFieldQUOCTICH.getText() + "', '"
					+ jTextFieldGIOITINHKH.getText() + "', '" + jTextFieldTUOI.getText() + "', '"
					+ jTextFieldSDT.getText() + "', '" + jTextFieldMAPHONGKH.getText() + "')";

			st.execute(query);
			hienThiDanhSachKhachHang();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}// GEN-LAST:event_them1ActionPerformed

	private void jTableKhachhangMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTableKhachhangMouseClicked
		// TODO add your handling code here:
		int i = jTableKhachhang.getSelectedRow();
		TableModel model = jTableKhachhang.getModel();
		jTextFieldMAKH.setText(model.getValueAt(i, 0).toString());
		jTextFieldTENKH.setText(model.getValueAt(i, 1).toString());
		jTextFieldCMND.setText(model.getValueAt(i, 2).toString());
		jTextFieldQUOCTICH.setText(model.getValueAt(i, 3).toString());
		jTextFieldGIOITINHKH.setText(model.getValueAt(i, 4).toString());
		jTextFieldTUOI.setText(model.getValueAt(i, 5).toString());
		jTextFieldSDT.setText(model.getValueAt(i, 6).toString());
		jTextFieldMAPHONGKH.setText(model.getValueAt(i, 7).toString());
	}// GEN-LAST:event_jTableKhachhangMouseClicked

	private void xoa1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_xoa1ActionPerformed
		// TODO add your handling code here:
		Connection con = getConnection();
		try {
			// Táº¡o má»™t Ä‘á»‘i tÆ°á»£ng Ä‘á»ƒ thá»±c hiá»‡n cÃ´ng viá»‡c
			st = (Statement) con.createStatement();
			String query = "DELETE FROM khachhang WHERE MAKH = '" + jTextFieldMAKH.getText() + "'";
			st.executeUpdate(query);
			hienThiDanhSachKhachHang();

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}// GEN-LAST:event_xoa1ActionPerformed

	private void thoat1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_thoat1ActionPerformed
		// TODO add your handling code here:
		thoat1.setToolTipText("Click vào thoát chương trình");
		int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thoát chương trình" + " trên không",
				"Thông báo", JOptionPane.YES_NO_CANCEL_OPTION);
		if (selected == JOptionPane.YES_NO_OPTION) {
			this.dispose();

		}
	}// GEN-LAST:event_thoat1ActionPerformed

	private void jTextFieldMAHDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldMAHDActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldMAHDActionPerformed

	private void jTextFieldMAPHONGHDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldMAPHONGHDActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldMAPHONGHDActionPerformed

	private void them4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_them4ActionPerformed
		// TODO add your handling code here:
		Connection con = getConnection();
		try {
			// Táº¡o má»™t Ä‘á»‘i tÆ°á»£ng Ä‘á»ƒ thá»±c hiá»‡n cÃ´ng viá»‡c
			st = (Statement) con.createStatement();
			String query = "INSERT INTO hoadon(MAHD,MANV, MAPHONG, NGAY, GIAHD) VALUES('" + jTextFieldMAHD.getText()
					+ "'," + "'" + jTextFieldMANVHD.getText() + "','" + jTextFieldMAPHONGHD.getText() + "', '"
					+ jTextFieldNGAY.getText() + "', '" + jTextFieldGIAHD.getText() + "')";

			st.execute(query);
			hienThiDanhSachHoaDon();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}// GEN-LAST:event_them4ActionPerformed

	private void jTableHOADONMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTableHOADONMouseClicked
		// TODO add your handling code here:
		int i = jTableHOADON.getSelectedRow();
		TableModel model = jTableHOADON.getModel();
		jTextFieldMAHD.setText(model.getValueAt(i, 0).toString());
		jTextFieldMANVHD.setText(model.getValueAt(i, 1).toString());
		jTextFieldMAPHONGHD.setText(model.getValueAt(i, 2).toString());
		jTextFieldNGAY.setText(model.getValueAt(i, 3).toString());
		jTextFieldGIAHD.setText(model.getValueAt(i, 4).toString());
	}// GEN-LAST:event_jTableHOADONMouseClicked

	private void xoa4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_xoa4ActionPerformed
		// TODO add your handling code here:
		Connection con = getConnection();
		try {
			// Táº¡o má»™t Ä‘á»‘i tÆ°á»£ng Ä‘á»ƒ thá»±c hiá»‡n cÃ´ng viá»‡c
			st = (Statement) con.createStatement();
			String query = "DELETE FROM hoadon WHERE MAHD = '" + jTextFieldMAHD.getText() + "'";
			st.executeUpdate(query);
			hienThiDanhSachHoaDon();

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}// GEN-LAST:event_xoa4ActionPerformed

	private void thoat4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_thoat4ActionPerformed
		// TODO add your handling code here:
		thoat4.setToolTipText("Click vào để thoát chương trình ");
		int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thoát chương trình" + " trên không",
				"Thông báo", JOptionPane.YES_NO_CANCEL_OPTION);
		if (selected == JOptionPane.YES_NO_OPTION) {
			this.dispose();

		}
	}// GEN-LAST:event_thoat4ActionPerformed

	private void sua3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sua3ActionPerformed
		// TODO add your handling code here:
		if (jTablePHONG.getSelectedRow() == -1) {
			if (jTablePHONG.getRowCount() == 0) {
				// lblError.setText("Table is empty");
			} else {
				// lblError.setText("You must select a Tennis Player");
			}
		} else {
			DefaultTableModel model = (DefaultTableModel) jTablePHONG.getModel();
			model.setValueAt(jTextFieldMAPHONG.getText(), jTablePHONG.getSelectedRow(), 0);
			model.setValueAt(jTextFieldTENPHONG.getText().toString(), jTablePHONG.getSelectedRow(), 1);
			model.setValueAt(jTextFieldLOAIPHONG.getText(), jTablePHONG.getSelectedRow(), 2);
			model.setValueAt(jTextFieldGIAPHONG.getText(), jTablePHONG.getSelectedRow(), 3);
			model.setValueAt(jTextFieldCHUTHICHP.getText(), jTablePHONG.getSelectedRow(), 4);
			model.setValueAt(jTextFieldTINHTRANG.getText(), jTablePHONG.getSelectedRow(), 5);
			model.setValueAt(jTextFieldMANVP.getText(), jTablePHONG.getSelectedRow(), 6);
			model.setValueAt(jTextFieldMADVP.getText(), jTablePHONG.getSelectedRow(), 7);
		}
	}// GEN-LAST:event_sua3ActionPerformed

	private void sua1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sua1ActionPerformed
		// TODO add your handling code here:
		if (jTableKhachhang.getSelectedRow() == -1) {
			if (jTableKhachhang.getRowCount() == 0) {
				// lblError.setText("Table is empty");
			} else {
				// lblError.setText("You must select a Tennis Player");
			}
		} else {
			DefaultTableModel model = (DefaultTableModel) jTableKhachhang.getModel();
			model.setValueAt(jTextFieldMAKH.getText(), jTableKhachhang.getSelectedRow(), 0);
			model.setValueAt(jTextFieldTENKH.getText().toString(), jTableKhachhang.getSelectedRow(), 1);
			model.setValueAt(jTextFieldCMND.getText(), jTableKhachhang.getSelectedRow(), 2);
			model.setValueAt(jTextFieldQUOCTICH.getText(), jTableKhachhang.getSelectedRow(), 3);
			model.setValueAt(jTextFieldGIOITINHKH.getText(), jTableKhachhang.getSelectedRow(), 4);
			model.setValueAt(jTextFieldTUOI.getText(), jTableKhachhang.getSelectedRow(), 5);
			model.setValueAt(jTextFieldSDT.getText(), jTableKhachhang.getSelectedRow(), 6);
			model.setValueAt(jTextFieldMAPHONGKH.getText(), jTableKhachhang.getSelectedRow(), 7);
		}
	}// GEN-LAST:event_sua1ActionPerformed

	private void sua4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sua4ActionPerformed
		// TODO add your handling code here:
		if (jTableHOADON.getSelectedRow() == -1) {
			if (jTableHOADON.getRowCount() == 0) {
				// lblError.setText("Table is empty");
			} else {
				// lblError.setText("You must select a Tennis Player");
			}
		} else {
			DefaultTableModel model = (DefaultTableModel) jTableHOADON.getModel();
			model.setValueAt(jTextFieldMAHD.getText(), jTableHOADON.getSelectedRow(), 0);
			model.setValueAt(jTextFieldMANVHD.getText().toString(), jTableHOADON.getSelectedRow(), 1);
			model.setValueAt(jTextFieldMAPHONGHD.getText(), jTableHOADON.getSelectedRow(), 2);
			model.setValueAt(jTextFieldNGAY.getText(), jTableHOADON.getSelectedRow(), 3);
			model.setValueAt(jTextFieldGIAHD.getText(), jTableHOADON.getSelectedRow(), 4);
		}

	}// GEN-LAST:event_sua4ActionPerformed

	private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonclearActionPerformed
		// TODO add your handling code here:
		jTextFieldMANV.setText("");
		jTextFieldTENNV.setText("");
		jTextFieldCHUCVU.setText("");
		jTextFieldLUONG.setText("");
		jTextFieldNGAYSINH.setText("");
		jTextFieldGIOITINH.setText("");
		jTextFieldCHUTHICH.setText("");
		jTextFieldMANV.requestFocus();
	}// GEN-LAST:event_jButtonclearActionPerformed

	private void jButtonclear1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonclear1ActionPerformed
		// TODO add your handling code here:
		jTextFieldMADV.setText("");
		jTextFieldTENDV.setText("");
		jTextFieldGIADV.setText("");
		jTextFieldMADV.requestFocus();
	}// GEN-LAST:event_jButtonclear1ActionPerformed

	private void jButtonclear2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonclear2ActionPerformed
		// TODO add your handling code here:
		jTextFieldMAKH.setText("");
		jTextFieldTENKH.setText("");
		jTextFieldCMND.setText("");
		jTextFieldQUOCTICH.setText("");
		jTextFieldGIOITINHKH.setText("");
		jTextFieldTUOI.setText("");
		jTextFieldSDT.setText("");
		jTextFieldMAPHONGKH.setText("");
		jTextFieldMAKH.requestFocus();

	}// GEN-LAST:event_jButtonclear2ActionPerformed

	private void jButtonclear3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonclear3ActionPerformed
		// TODO add your handling code here:
		jTextFieldMAPHONG.setText("");
		jTextFieldTENPHONG.setText("");
		jTextFieldLOAIPHONG.setText("");
		jTextFieldGIAPHONG.setText("");
		jTextFieldCHUTHICHP.setText("");
		jTextFieldTINHTRANG.setText("");
		jTextFieldSDT.setText("");
		jTextFieldMANVP.setText("");
		jTextFieldMADVP.setText("");
		jTextFieldMAPHONG.requestFocus();

	}// GEN-LAST:event_jButtonclear3ActionPerformed

	private void jButtonclear4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonclear4ActionPerformed
		// TODO add your handling code here:
		jTextFieldMAHD.setText("");
		jTextFieldMANVHD.setText("");
		jTextFieldMAPHONGHD.setText("");
		jTextFieldNGAY.setText("");
		jTextFieldGIAHD.setText("");
		jTextFieldMAHD.requestFocus();

	}// GEN-LAST:event_jButtonclear4ActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Hotel_Vip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Hotel_Vip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Hotel_Vip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Hotel_Vip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Hotel_Vip().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JButton jButtonclear;
	private JButton jButtonclear1;
	private JButton jButtonclear2;
	private JButton jButtonclear3;
	private JButton jButtonclear4;
	private JLabel jLabel1;
	private JLabel jLabel10;
	private JLabel jLabel11;
	private JLabel jLabel12;
	private JLabel jLabel13;
	private JLabel jLabel14;
	private JLabel jLabel15;
	private JLabel jLabel16;
	private JLabel jLabel17;
	private JLabel jLabel18;
	private JLabel jLabel19;
	private JLabel jLabel2;
	private JLabel jLabel20;
	private JLabel jLabel21;
	private JLabel jLabel22;
	private JLabel jLabel23;
	private JLabel jLabel24;
	private JLabel jLabel25;
	private JLabel jLabel26;
	private JLabel jLabel27;
	private JLabel jLabel28;
	private JLabel jLabel29;
	private JLabel jLabel3;
	private JLabel jLabel30;
	private JLabel jLabel31;
	private JLabel jLabel32;
	private JLabel jLabel33;
	private JLabel jLabel34;
	private JLabel jLabel35;
	private JLabel jLabel36;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JPanel jPanel1;
	private JPanel jPanel11;
	private JPanel jPanel12;
	private JPanel jPanel14;
	private JPanel jPanel15;
	private JPanel jPanel17;
	private JPanel jPanel18;
	private JPanel jPanel19;
	private JPanel jPanel2;
	private JPanel jPanel20;
	private JPanel jPanel21;
	private JPanel jPanel22;
	private JPanel jPanel3;
	private JPanel jPanel4;
	private JPanel jPanel5;
	private JPanel jPanel6;
	private JPanel jPanel7;
	private JPanel jPanel8;
	private JPanel jPanel9;
	private JScrollPane jScrollPane1;
	private JScrollPane jScrollPane2;
	private JScrollPane jScrollPane3;
	private JScrollPane jScrollPane4;
	private JScrollPane jScrollPane5;
	private JTabbedPane jTabbedPane1;
	private JTable jTableDichvu;
	private JTable jTableHOADON;
	private JTable jTableKhachhang;
	private JTable jTableNhanvien;
	private JTable jTablePHONG;
	private JTextField jTextFieldCHUCVU;
	private JTextField jTextFieldCHUTHICH;
	private JTextField jTextFieldCHUTHICHP;
	private JTextField jTextFieldCMND;
	private JTextField jTextFieldGIADV;
	private JTextField jTextFieldGIAHD;
	private JTextField jTextFieldGIAPHONG;
	private JTextField jTextFieldGIOITINH;
	private JTextField jTextFieldGIOITINHKH;
	private JTextField jTextFieldLOAIPHONG;
	private JTextField jTextFieldLUONG;
	private JTextField jTextFieldMADV;
	private JTextField jTextFieldMADVP;
	private JTextField jTextFieldMAHD;
	private JTextField jTextFieldMAKH;
	private JTextField jTextFieldMANV;
	private JTextField jTextFieldMANVHD;
	private JTextField jTextFieldMANVP;
	private JTextField jTextFieldMAPHONG;
	private JTextField jTextFieldMAPHONGHD;
	private JTextField jTextFieldMAPHONGKH;
	private JTextField jTextFieldNGAY;
	private JTextField jTextFieldNGAYSINH;
	private JTextField jTextFieldQUOCTICH;
	private JTextField jTextFieldSDT;
	private JTextField jTextFieldTENDV;
	private JTextField jTextFieldTENKH;
	private JTextField jTextFieldTENNV;
	private JTextField jTextFieldTENPHONG;
	private JTextField jTextFieldTINHTRANG;
	private JTextField jTextFieldTUOI;
	private JButton sua;
	private JButton sua1;
	private JButton sua2;
	private JButton sua3;
	private JButton sua4;
	private JButton them;
	private JButton them1;
	private JButton them2;
	private JButton them3;
	private JButton them4;
	private JButton thoat;
	private JButton thoat1;
	private JButton thoat2;
	private JButton thoat3;
	private JButton thoat4;
	private JButton xoa;
	private JButton xoa1;
	private JButton xoa2;
	private JButton xoa3;
	private JButton xoa4;
	// End of variables declaration//GEN-END:variables
}
