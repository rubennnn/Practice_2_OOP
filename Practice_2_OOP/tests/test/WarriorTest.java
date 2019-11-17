package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import paquete.Archer;
import paquete.Knight;
import paquete.Warrior;

class WarriorTest {
	@Test 
	void testWarrior() {
		Warrior warrior = new Warrior();
		Assert.assertTrue(warrior.getAttack()==12);
		Assert.assertTrue(warrior.getDefense()==12);
		Assert.assertTrue(warrior.getHp()==70);
	}
	@Test
	void testWarriorAttacks() {
		Warrior warrior = new Warrior();
		Archer archer = new Archer();

		warrior.attack(archer);
		Assert.assertEquals(48, archer.howMuchHPRemains());
	}
	@Test
	void testHowMuchHPRemains() {
		Warrior warrior = new Warrior();
		Assert.assertEquals(70, warrior.howMuchHPRemains());	
		}
	@Test
	void testWarriorSpecial() {
		Warrior warrior = new Warrior();
		Archer archer = new Archer();
		warrior.special(archer);
		Assert.assertEquals(46, archer.howMuchHPRemains());
	}
	@Test
	void testWarriorIsDead() {
		Warrior warrior = new Warrior();
		Archer archer = new Archer();
		for(int i=0;i<50;i++)
			archer.special(warrior);

		Assert.assertTrue(warrior.isDead());	
		}
}
