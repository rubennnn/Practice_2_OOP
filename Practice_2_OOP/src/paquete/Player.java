package paquete;

public abstract class Player implements Playerable{
	
	protected int hp;
	protected int attack;
	protected int defense;
	
	public void attack(Playerable attacked) {
			if(this.getAttack()> attacked.getDefense())
				attacked.setHP(this.getAttack()-attacked.getDefense());
	}
	public void showMsg(String msg) {
		System.out.println(msg);
	}
	@Override
	public String toString() {
		return "Player [hp=" + hp + ", attack=" + attack + ", defense=" + defense + "]";
	}
	public void showAttributes() {
		System.out.println(this.toString()); 
	}
	public String toString(String name) {
		return name+" [hp=" + hp + ", attack=" + attack + ", defense=" + defense + "]";
	}
	public void showAttributes(String msg) {
		System.out.println(this.toString(msg)); 
	}
	public boolean isDead() {
		return this.getHp()==0?true:false;
	}
	public int howMuchHPRemains() {
		return this.getHp();
	}

	public abstract void special(Playerable attacked);
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense1() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}

	@Override
	public int getDefense() {
		return this.getDefense1();
	}
	@Override
	public int getHP() {
		return this.getHp();
		
	}
	@Override
	public void setHP(int value) {
		int n;
		n= this.getHp()>=value?this.getHp()-value:0;
		this.setHp(n);
	}
	
}
