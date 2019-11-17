package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import paquete.Archer;
import paquete.Warrior;

class ArcherTest {

	@Test
	void testArcher() {
		Archer archer = new Archer();
		Assert.assertTrue(archer.getHp() == 50);
		Assert.assertTrue(archer.getDefense() == 10);
		Assert.assertTrue(archer.getAttack() == 15);
		
	}
	@Test
	void testArcherAttacks() {
		Archer archer = new Archer();
		Warrior warrior = new Warrior();
		archer.attack(warrior);
		Assert.assertEquals(67, warrior.howMuchHPRemains());
	}
	@Test
	void testHowMuchHPRemains() {
		Archer archer = new Archer();
		Assert.assertEquals(50, archer.howMuchHPRemains());	
		}
	@Test
	void testArcherSpecialMAXHP() {
		Archer archer = new Archer();
		Warrior warrior = new Warrior();
		for(int i=0;i<70;i++)
			archer.special(warrior);
		Assert.assertEquals(50, archer.howMuchHPRemains());
	}
	@Test
	void testArcherSpecial() {
		Archer archer = new Archer();
		Warrior warrior = new Warrior();
		archer.special(warrior);

		Assert.assertEquals(67, warrior.howMuchHPRemains());
		Assert.assertEquals(50, archer.howMuchHPRemains());
	}
	@Test
	void testArcherSpecialHP() {
		Archer archer = new Archer();
		Warrior warrior = new Warrior();
		for(int i=0;i<10;i++)
			warrior.special(archer);
		
		archer.special(warrior);
		Assert.assertEquals(67, warrior.howMuchHPRemains());
		Assert.assertEquals(20, archer.howMuchHPRemains());
	}
	@Test
	void testArcherIsDead() {
		Warrior warrior = new Warrior();
		Archer archer = new Archer();
		for(int i=0;i<50;i++)
			warrior.special(archer);

		Assert.assertTrue(archer.isDead());	
		}

}
