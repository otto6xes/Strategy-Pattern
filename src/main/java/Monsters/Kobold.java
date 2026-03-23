package Monsters;

import java.util.HashMap;

/**
 * [Brief description of what this class does]
 *
 * @author Ethan Shelley
 * @version 0.1.0
 * @since 3/23/2026
 */
public class Kobold extends Monster{

    public Kobold(int maxHP, int xp, HashMap<String, Integer> items){
        super(maxHP, xp, items);
    }

    @Override
    public String toString(){
        return "Kobold has : " + super.toString();
    }
}
