package kr.or.dgit.bigdata.swmng.dto;

public class Software {
	private int no;
	private String category;
	private String title;
	private int supPrice;
	private int sellPrice;
	private Company coName;
	
	@Override
	public String toString() {
		return String.format("Software [no=%s, category=%s, title=%s, supPrice=%s, sellPrice=%s, coName=%s]", no,
				category, title, supPrice, sellPrice, coName);
	}
	public Software() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Software(int no, String category, String title, int supPrice, int sellPrice, Company coName) {
		this.no = no;
		this.category = category;
		this.title = title;
		this.supPrice = supPrice;
		this.sellPrice = sellPrice;
		this.coName = coName;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getSupPrice() {
		return supPrice;
	}
	public void setSupPrice(int supPrice) {
		this.supPrice = supPrice;
	}
	public int getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}
	public Company getCoName() {
		return coName;
	}
	public void setCoName(Company coName) {
		this.coName = coName;
	}
	
	
}
