package Abilities;

import Monsters.Monster;

/**
 * [Brief description of what this class does]
 *
 * @author Ethan Shelley
 * @version 0.1.0
 * @since 3/23/2026
 */
public class MeleeAttack implements Attack{

    Monster attacker;

    public MeleeAttack(Monster attacker){
        this.attacker = attacker;
    }

    @Override
    public int attack(Monster target){
        System.out.println(attacker + " uses a melee attack on " + target);
        return -1;
    }
}
