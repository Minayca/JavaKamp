package gameDemo;


public class ManagerGame implements ServiceGame{

	@Override
	public void add(EntityGame game) {
		System.out.println("Oyun baþarýyla eklendi: " + game.getName());
	}
	
	@Override
	public void update(EntityGame game) {
		System.out.println("Oyun baþarýyla güncellendi: " + game.getName());
	}
	
	@Override
	public void delete(EntityGame game) {
		System.out.println("Oyun baþarýyla silindi: " + game.getName());
	}
	
}
