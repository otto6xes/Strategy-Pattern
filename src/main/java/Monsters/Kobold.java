package Monsters;

import Abilities.RangedAttack;

import java.util.HashMap;

/**
 * [Brief description of what this class does]
 *
 * @author Ethan Shelley
 * @version 0.1.1
 * @since 3/23/2026
 */
public class Kobold extends Monster{

    public Kobold(int maxHP, int xp, HashMap<String, Integer> items){
        super(maxHP, xp, items);
        int maxStr = 15;
        int maxDef = 6;
        int maxAgi = 3;

        attack = new RangedAttack(this);

        strength = super.getAttribute(strength, maxStr);
        defense = super.getAttribute(defense, maxDef);
        agility = super.getAttribute(agility, maxAgi);
    }

    @Override
    public String toString(){
        return "Monsters.Kobold has : " + super.toString();
    }
}
