import Monsters.Imp;
import Monsters.Kobold;
import Monsters.Monster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * [Brief description of what this class does]
 *
 * @author Ethan Shelley
 * @version 0.1.0
 * @since 3/23/2026
 */
public class Driver {
    public static void main(String[] args){
        HashMap<String, Integer> items = new HashMap<>();
        items.put("gold", 5);
        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Imp(15,20,items));
        monsters.add(new Kobold(1,5,items));

        for(Monster m : monsters){
            System.out.println(m);
        }
    }
}
