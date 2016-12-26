package kr.or.dgit.bigdata.swmng.dto;

public class Company {
	private int no;
	private String coName;
	private String address;
	private String tel;

	@Override
	public String toString() {
		return String.format("Company [no=%s, coName=%s, address=%s, tel=%s]", no, coName, address, tel);
	}

	public Company(int no, String coName, String address, String tel) {
		this.no = no;
		this.coName = coName;
		this.address = address;
		this.tel = tel;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getCoName() {
		return coName;
	}

	public void setCoName(String coName) {
		this.coName = coName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
