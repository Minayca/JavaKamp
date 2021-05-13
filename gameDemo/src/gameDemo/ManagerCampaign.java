package gameDemo;

public class ManagerCampaign {
	
	public void add(EntityCampaign campaign) {
		System.out.println("Kampanya eklendi: " + campaign.getName());
	}
	
	public void update(EntityCampaign campaign) {
		System.out.println("Kampanya güncellendi: " + campaign.getName());
	}
	
	public void delete(EntityCampaign campaign) {
		System.out.println("Kampanya silindi: " + campaign.getName());
	}
}
