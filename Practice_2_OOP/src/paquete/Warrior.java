package paquete;

public class Warrior extends Player{
	
	public Warrior() {
		super();
		hp=70;
		attack=12;
		defense=12;	
	}
	
	@Override
	public void special(Playerable attacked) {
		this.attack(attacked);
		this.attack(attacked);
	}
}
