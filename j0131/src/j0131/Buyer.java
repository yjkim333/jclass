package j0131;

public class Buyer {
	
	private String id;
	private String pw;
	private String userName;
	private String address;
	private int money;
	private int my_point;
	
	public Buyer(){}
	public Buyer(String id, String pw, String userName, String address, int money, int my_point) {
		this.id = id;
		this.pw = pw;
		this.userName = userName;
		this.address = address;
		this.money = money;
		this.my_point = my_point;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMy_point() {
		return my_point;
	}
	public void setMy_point(int my_point) {
		this.my_point = my_point;
	}

	
	
}
