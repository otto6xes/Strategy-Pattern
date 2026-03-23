package Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

/**
 * [Brief description of what this class does]
 *
 * @author Ethan Shelley
 * @version 0.1.1
 * @since 3/23/2026
 */
public abstract class Monster {

    private int hp;
    private int maxHP;
    private int xp = 10;
    private HashMap<String, Integer> items;

    int agility = 10;
    int strength = 10;
    int defense = 10;
    Attack attack;


    public Monster(int maxHP, int xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefense() {
        return defense;
    }

    /*
    this method returns an integer value between min and max
    since rand.nextInt(n) give a number between 0 and n
    we get a number between 0 and (max-min) then add min back in
     */
    public int getAttribute(int min, int max) {
        Random rand = new Random();
        if(min > max){
            int temp = min;
            min = max;
            max = temp;
        }
        //returns a random number between min and max inclusive
        return rand.nextInt(max - min) + min;
    }

    public boolean takeDamage(int damage){
        System.out.println("The creature was hit for " + damage + " damage.");
        if(damage > 0){
            hp -= damage;
        }
        if(hp <= 0){
            System.out.println("Oh no! The creature has perished!");
            System.out.println(toString());
            return false;
        }
        System.out.println(toString());
        return true;
    }

    public int attackTarget(Monster target){
        int damage = attack.attack(target);
        target.takeDamage(damage);
        return damage;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Monster monster)) return false;
        return hp == monster.hp && maxHP == monster.maxHP && xp == monster.xp && Objects.equals(items, monster.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, maxHP, xp, items);
    }

    public String toString() {
        return "hp=" + hp + "/" + maxHP;
    }
}
