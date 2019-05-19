/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlksk57.Form;

import static qlksk57.MyConnection.getConnection;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import org.apache.commons.lang3.StringUtils;

import qlksk57.control.MenuForm;
import qlksk57.global.managersession;
import qlksk57.models.User;
import qlksk57.models.UserEnum;

@SuppressWarnings("serial")
public class dang_nhap extends JFrame {

	private Connection con = null;
	private Statement st = null;

	/**
	 * Creates new form dang_nhap
	 */
	public dang_nhap() {
		setResizable(false);
		initComponents();
		setLocationDefault(400, 300);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new JPanel();
		txtUser = new JTextField();
		jButton1 = new JButton();
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		Password = new JPasswordField();
		jLabel3 = new JLabel();
		jLabel4 = new JLabel();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(0, 204, 255));

		txtUser.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtUserActionPerformed(evt);
			}
		});

		jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
		jButton1.setText("LOG IN");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel1.setIcon(new ImageIcon(
				getClass().getResource("/qlksk57/Form/hinh/if_preferences-desktop-cryptography_8794.png"))); // NOI18N
		jLabel1.setText("Tài Khoản");

		jLabel2.setIcon(new ImageIcon(getClass().getResource("/qlksk57/Form/hinh/ssssss.png"))); // NOI18N
		jLabel2.setText("Pass");

		jLabel3.setFont(new Font("Times New Roman", Font.BOLD, 20)); // NOI18N
		jLabel3.setText("Quản Lí Khách Sạn");

		jLabel4.setIcon(new ImageIcon(getClass().getResource("/qlksk57/Form/hinh/eeeeeeeeeeeeeee.png"))); // NOI18N

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(51)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 194,
												GroupLayout.PREFERRED_SIZE)
										.addGap(50))
								.addGroup(jPanel1Layout
										.createSequentialGroup()
										.addGroup(jPanel1Layout
												.createParallelGroup(Alignment.LEADING)
												.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 107,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel1))
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
												.addGroup(jPanel1Layout.createSequentialGroup().addGap(18).addComponent(
														jButton1, GroupLayout.PREFERRED_SIZE, 185,
														GroupLayout.PREFERRED_SIZE))
												.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
																.addComponent(Password).addComponent(txtUser,
																		GroupLayout.DEFAULT_SIZE, 189,
																		Short.MAX_VALUE))))
										.addContainerGap(24, GroupLayout.PREFERRED_SIZE)))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
										.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 136,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18))
								.addGroup(Alignment.TRAILING,
										jPanel1Layout.createSequentialGroup()
												.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 67,
														GroupLayout.PREFERRED_SIZE)
												.addGap(47)))
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel1)
								.addComponent(txtUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel2)
								.addComponent(Password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18).addComponent(jButton1).addGap(54)));
		jPanel1.setLayout(jPanel1Layout);

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel1,
				GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtUserActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtUserActionPerformed

	@SuppressWarnings("deprecation")
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

		String userName = txtUser.getText();
		String password = Password.getText();
		
		if (StringUtils.isEmpty(userName)) {
			JOptionPane.showMessageDialog(this, "Vui lòng nhập tài Khoản");
			txtUser.requestFocus();
		} else if (StringUtils.isEmpty(password)) {
			JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu");
			Password.requestFocus();
		} else {
			
			if(checkInjection(userName) || checkInjection(password)) {
				JOptionPane.showMessageDialog(this, "Nhập sai vui lòng nhập lại");
				return;
			}
			
			password = md5(Password.getText()); 
			
			con = getConnection();
			try {
				st = (Statement) con.createStatement();
				String query = String.format("SELECT * FROM users WHERE USERNAME LIKE '%s' AND PASSWORD LIKE '%s'",
						txtUser.getText(), password);

				System.out.println("sql : " + query);
				ResultSet rs = st.executeQuery(query);
				ArrayList<User> listUser = new ArrayList<User>();
				User user;
				while (rs.next()) {
					user = new User(Integer.parseInt(rs.getString(UserEnum.ID.toString())),
							rs.getString(UserEnum.UserName.getText()), rs.getString(UserEnum.Password.getText()), Integer.parseInt(rs.getString("ROLE_ID")));
					listUser.add(user);
				}

				if (listUser.size() > 0) {
					managersession.user = listUser.get(0);
					JOptionPane.showMessageDialog(this, "Đăng đã nhập thành công");
					MenuForm ql = new MenuForm();
					ql.setVisible(true);
					this.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(this, "Tên đăng nhặp hoặc mật khẩu sai.");
				}
				// hienThiDanhSachDichVu();

			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
		// else {
		// JOptionPane.showMessageDialog(this, "Đăng nhập thất bại");
		// }
	}// GEN-LAST:event_jButton1ActionPerformed

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
			java.util.logging.Logger.getLogger(dang_nhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(dang_nhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(dang_nhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(dang_nhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new dang_nhap().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JPasswordField Password;
	private JButton jButton1;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JPanel jPanel1;
	private JTextField txtUser;
	// End of variables declaration//GEN-END:variables
	
	private void setLocationDefault(int w, int h) {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

		int x = (dim.width - w) / 2;
		int y = (dim.height - h) / 2;

		// Move the window
		 this.setLocation(x, y);
	}
	
	private Boolean checkInjection(String val) {
		if(val.contains("\"") ||  val.contains("'"))
			return true;
		return false;
	}
	
	public static String md5(String str){
		String result = "";
		MessageDigest digest;
		try {
			digest = MessageDigest.getInstance("MD5");
			digest.update(str.getBytes());
			BigInteger bigInteger = new BigInteger(1,digest.digest());
			result = bigInteger.toString(16);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
}