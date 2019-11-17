package paquete;

public class Main {

	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		Archer archer = new Archer();
		Knight knight = new Knight();
		warrior.showAttributes("Warrior");
		knight.showAttributes("Archer");
		archer.showAttributes("Knight");
		
		warrior.attack(knight);
		archer.attack(warrior);
		knight.special(archer);

		
		warrior.showMsg("Warrior, How much HP remains? "+warrior.getHp());
		archer.showMsg("Archer, how much HP remains? "+archer.getHp());
		knight.showMsg("Knight, how much HP remains? "+knight.getHp());
		
		String answer;
		answer=warrior.isDead()==true?"YES x_X":"NOT YET!";
		warrior.showMsg("Is Warrior dead? "+ answer);
		
		answer=knight.isDead()==true?"YES x_X":"NOT YET!";
		knight.showMsg("Is Knight dead? "+ answer);
		
		answer=archer.isDead()==true?"YES x_X":"NOT YET!";
		archer.showMsg("Is Archer dead? "+ answer);

	}

}
