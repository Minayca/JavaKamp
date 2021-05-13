package gameDemo;

public class ManagerMarket implements ServiceMarket{
	
	@Override
	public void buy(EntityPlayer player, EntityGame game) {
		
		if (player.isReal == true) {
			System.out.println(player.getFirstName() + " " + player.getLastName()+": ");
			System.out.println("Aldýðýnýz oyun: " + game.getName());
			System.out.println("Tutar: " + game.getPrice());
		}
		else {
			System.out.println("HATA");
		}
		
	}

	@Override
	public void buy(EntityPlayer player, EntityGame game, EntityCampaign campaign) {
		
		if (player.isReal == true) {
			double lastPrice = game.getPrice() - (game.getPrice()*campaign.getDiscountAmount()/100);
			
			System.out.println(player.getFirstName() + " " + player.getLastName()+": ");
			System.out.println("Aldýðýnýz oyun: " + game.getName());
			System.out.println("Kampanyadan önceki tutar: " + game.getPrice());
			System.out.println("Tutar: " + lastPrice);
		}
		else {
			System.out.println("HATA");
		}
	}
}
