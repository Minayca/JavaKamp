package gameDemo;

public class ManagerPlayer implements ServicePlayer{
	
	private ServicePlayerCheck playerCheckService;

	public ManagerPlayer(ServicePlayerCheck playerCheckService) {
		
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(EntityPlayer player) {
		
		if (playerCheckService.checkIfRealPerson(player)) {
			System.out.println("Oyuncu eklendi: " + player.getFirstName() + " " + player.getLastName());
			player.isReal = true;
		} else {
			System.out.println("Girdi�iniz bilgiler hatal�.");
			player.isReal = false;
		}
		
	}

	@Override
	public void update(EntityPlayer player) {
		System.out.println("Oyuncu g�ncellendi: " + player.getFirstName() + " " + player.getLastName());
	}

	@Override
	public void delete(EntityPlayer player) {
		System.out.println("Oyuncu silindi: " + player.getFirstName() + " " + player.getLastName());
	}

}
