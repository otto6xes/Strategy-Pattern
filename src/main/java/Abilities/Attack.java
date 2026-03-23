package Abilities;

import Monsters.Monster;

/**
 * [Brief description of what this class does]
 *
 * @author Ethan Shelley
 * @version 0.1.0
 * @since 3/23/2026
 */
public interface Attack extends Ability {

    public int attack(Monster m);

}
