package paquete;
public class Knight extends Warrior implements Playerable{
	public Knight() {
		super();
		hp=100;
		defense=getDefense()+getDefense()/2;	
		attack=getAttack()/2;
	}
	
	@Override
	public void special(Playerable attacked) {
		super.special(attacked);
		super.setHp(0);
		int damage=attacked.getHP()/2;
		attacked.setHP(damage);
	}
}
