package gameDemo;


public class ManagerGame implements ServiceGame{

	@Override
	public void add(EntityGame game) {
		System.out.println("Oyun ba�ar�yla eklendi: " + game.getName());
	}
	
	@Override
	public void update(EntityGame game) {
		System.out.println("Oyun ba�ar�yla g�ncellendi: " + game.getName());
	}
	
	@Override
	public void delete(EntityGame game) {
		System.out.println("Oyun ba�ar�yla silindi: " + game.getName());
	}
	
}
