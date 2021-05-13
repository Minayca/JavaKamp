package gameDemo;


public class ManagerGame implements ServiceGame{

	@Override
	public void add(EntityGame game) {
		System.out.println("Oyun başarıyla eklendi: " + game.getName());
	}
	
	@Override
	public void update(EntityGame game) {
		System.out.println("Oyun başarıyla güncellendi: " + game.getName());
	}
	
	@Override
	public void delete(EntityGame game) {
		System.out.println("Oyun başarıyla silindi: " + game.getName());
	}
	
}
