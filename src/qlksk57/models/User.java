/**
 * 
 */
package qlksk57.models;


public class User {

    private int id;
	private String userName;
    private String password;
    private int role;
   
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public User(int id, String userName, String password, int role) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

	public User() {
    }

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	
}
