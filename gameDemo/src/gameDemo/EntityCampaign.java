package gameDemo;

public class EntityCampaign {
	
	private int id; 
	private String name; 
	private int discountAmount;
	
	public EntityCampaign() {}
	
	public EntityCampaign(int id, String name, int discountAmount) {
		this.id = id;
		this.name = name;
		this.discountAmount = discountAmount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}
	public int getId() {
		return id;
	} 
}
