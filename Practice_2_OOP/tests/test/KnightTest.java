package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import paquete.Archer;
import paquete.Knight;
import paquete.Warrior;

class KnightTest {

	@Test
	void testKnight() {
		Warrior warrior = new Warrior();
		Knight knight = new Knight();
		Assert.assertTrue(knight.getHp() == 100);
		Assert.assertTrue(knight.getDefense()== warrior.getDefense()+warrior.getDefense()/2);
		Assert.assertTrue(knight.getAttack() == warrior.getAttack()/2);
		
	}
	@Test
	void testKnightAttacks() {
		Warrior warrior = new Warrior();
		Knight knight = new Knight();
		
		knight.attack(warrior);
		
		Assert.assertEquals(70, warrior.howMuchHPRemains());
	}
	@Test
	void testHowMuchHPRemains() {
		Knight knight = new Knight();
		Warrior warrior = new Warrior();
		warrior.attack(knight);
		Assert.assertEquals(100, knight.howMuchHPRemains());	
		}
	
	@Test
	void testKnightSpecialHPZero() {
		Knight knight = new Knight();
		Warrior warrior = new Warrior();
		knight.special(warrior);
		Assert.assertEquals(0, knight.howMuchHPRemains());
		Assert.assertTrue(knight.isDead());
	}
	@Test
	void testKnightSpecialDamage() {
		Knight knight = new Knight();
		Warrior warrior = new Warrior();
		knight.special(warrior);
		Assert.assertEquals(35, warrior.howMuchHPRemains()); //as knight has 6 of attack, he can not 
		
	}
	@Test
	void testKnightSpecialAttacksTwice() {
		Knight knight = new Knight();
		Archer archer = new Archer();
		knight.special(archer);
		Assert.assertEquals(25, archer.howMuchHPRemains()); 
		
	}
	@Test
	void testArcherIsDead() {
		Warrior warrior = new Warrior();
		Knight knight = new Knight();
		knight.special(warrior);
		Assert.assertTrue(knight.isDead());	
		}

}
