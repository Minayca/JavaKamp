package gameDemo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		ManagerPlayer playerManager = new ManagerPlayer(new AdapterMernisService());

		EntityPlayer player1 = 
				new EntityPlayer(1, "Engin", "DEMÝROÐ", LocalDate.of(1985, 1, 6) , "***********");
		
		playerManager.add(player1);
		
		EntityPlayer player2 = 
				new EntityPlayer(2, "Aylin", "DENÝZ", LocalDate.of(1990, 4, 7) , "12345678901");
		
		playerManager.add(player2);
		
		EntityGame game1 = new EntityGame(1, "GTA V", 60.0);
		EntityGame game2 = new EntityGame(2, "Dead or Alive", 40.0);
		EntityGame game3 = new EntityGame(3, "Need for Speed", 80.0);
		
		ManagerGame gameManager = new ManagerGame();
        gameManager.add(game1);
        gameManager.add(game2);
        gameManager.add(game3);
        
        EntityCampaign campaign1 = new EntityCampaign(1, "Kýþ", 10);
        EntityCampaign campaign2 = new EntityCampaign(2, "Yaz", 20);
        
        ManagerMarket marketManager = new ManagerMarket();
        marketManager.buy(player1, game3);
        marketManager.buy(player1, game2, campaign2);
        marketManager.buy(player1, game1, campaign1);
        marketManager.buy(player2, game3);
        marketManager.buy(player2, game1, campaign1);
       
	}

}
