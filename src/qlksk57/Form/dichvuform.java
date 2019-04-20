/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlksk57.Form;

import static qlksk57.MyConnection.getConnection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import qlksk57.DichVu;

/**
 *
 * @author khoa
 */

@SuppressWarnings("serial")
public class dichvuform extends JFrame {

	/**
	 * Creates new form dichvuform
	 */
	public dichvuform() {
		initComponents();
		getConnection();
		hienThiDanhSachDichVu();
	}

	Connection con = null;
	Statement st = null;

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
		String colTieuDe1[] = new String[] { "Mã dịch vụ", "Tên dịch vụ", "Giá dịch vũ" };
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

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

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

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		jPanel7.setBackground(new java.awt.Color(0, 204, 255));

		jLabel18.setBackground(new java.awt.Color(0, 0, 255));
		jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel18.setText("DANH SÁCH DỊCH VỤ");

		GroupLayout jPanel14Layout = new GroupLayout(jPanel14);
		jPanel14.setLayout(jPanel14Layout);
		jPanel14Layout.setHorizontalGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				GroupLayout.Alignment.TRAILING,
				jPanel14Layout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
						.addGap(87, 87, 87)));
		jPanel14Layout.setVerticalGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel14Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel15.setBorder(BorderFactory.createTitledBorder("Thông tin dịch vụ"));

		jLabel19.setText("Mã dịch vụ");

		jLabel20.setText("Tên dịch vụ");

		jLabel21.setText("Giá dịch vụ");

		them2.setIcon(new ImageIcon(getClass().getResource("/qlksk57/Form/hinh/THEM.png"))); // NOI18N
		them2.setText("Thêm");
		them2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				them2ActionPerformed(evt);
			}
		});

		sua2.setIcon(new ImageIcon(getClass().getResource("/qlksk57/Form/hinh/SUA.png"))); // NOI18N
		sua2.setText("Sửa");
		sua2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				sua2ActionPerformed(evt);
			}
		});

		xoa2.setIcon(new ImageIcon(getClass().getResource("/qlksk57/Form/hinh/XOA.png"))); // NOI18N
		xoa2.setText("Xóa");
		xoa2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				xoa2ActionPerformed(evt);
			}
		});

		thoat2.setIcon(new ImageIcon(getClass().getResource("/qlksk57/Form/hinh/THOAT.png"))); // NOI18N
		thoat2.setText("Thoát");
		thoat2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				thoat2ActionPerformed(evt);
			}
		});

		jButtonclear1.setIcon(new ImageIcon(getClass().getResource("/qlksk57/Form/hinh/CLEAR.png"))); // NOI18N
		jButtonclear1.setText("Clear");
		jButtonclear1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
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
												.addComponent(thoat2)
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
		jTableDichvu.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
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
										GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel7Layout.createSequentialGroup().addGap(238, 238, 238).addComponent(jPanel14,
								GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(24, Short.MAX_VALUE)));
		jPanel7Layout
				.setVerticalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel7Layout.createSequentialGroup().addContainerGap()
								.addComponent(jPanel14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(jPanel15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 283,
												GroupLayout.PREFERRED_SIZE))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout
								.createSequentialGroup().addComponent(jPanel7, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(0, 14, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void them2ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_them2ActionPerformed
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

	private void sua2ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_sua2ActionPerformed
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

	private void xoa2ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_xoa2ActionPerformed
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

	private void thoat2ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_thoat2ActionPerformed
		// TODO add your handling code here:
		thoat2.setToolTipText("Click vào thoát chương trình ");
		int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thoát chương trình" + " trên không",
				"Thông báo", JOptionPane.YES_NO_CANCEL_OPTION);
		if (selected == JOptionPane.YES_NO_OPTION) {
			this.dispose();

		}

	}// GEN-LAST:event_thoat2ActionPerformed

	private void jButtonclear1ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButtonclear1ActionPerformed
		// TODO add your handling code here:
		jTextFieldMADV.setText("");
		jTextFieldTENDV.setText("");
		jTextFieldGIADV.setText("");
		jTextFieldMADV.requestFocus();
	}// GEN-LAST:event_jButtonclear1ActionPerformed

	private void jTableDichvuMouseClicked(MouseEvent evt) {// GEN-FIRST:event_jTableDichvuMouseClicked
		// TODO add your handling code here
		int i = jTableDichvu.getSelectedRow();
		TableModel model = jTableDichvu.getModel();
		jTextFieldMADV.setText(model.getValueAt(i, 0).toString());
		jTextFieldTENDV.setText(model.getValueAt(i, 1).toString());
		jTextFieldGIADV.setText(model.getValueAt(i, 2).toString());

	}// GEN-LAST:event_jTableDichvuMouseClicked

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
			java.util.logging.Logger.getLogger(dichvuform.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(dichvuform.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(dichvuform.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(dichvuform.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new dichvuform().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JButton jButtonclear1;
	private JLabel jLabel18;
	private JLabel jLabel19;
	private JLabel jLabel20;
	private JLabel jLabel21;
	private JPanel jPanel14;
	private JPanel jPanel15;
	private JPanel jPanel7;
	private JScrollPane jScrollPane3;
	private JTable jTableDichvu;
	private JTextField jTextFieldGIADV;
	private JTextField jTextFieldMADV;
	private JTextField jTextFieldTENDV;
	private JButton sua2;
	private JButton them2;
	private JButton thoat2;
	private JButton xoa2;
	// End of variables declaration//GEN-END:variables
}
