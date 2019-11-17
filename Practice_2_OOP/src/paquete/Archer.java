package paquete;

public class Archer extends Player{
	public Archer() {
		super();
		hp=50;
		defense=10;	
		attack=15;
	}

	@Override
	public void special(Playerable attacked) {
		// ataca y gana 10 de HP. No puede exceder MAX de 50
		this.attack(attacked);
		if(this.getHp()+10>50)
			this.setHp(50);
		else
			this.setHp(this.getHp()+10);
	}
}
