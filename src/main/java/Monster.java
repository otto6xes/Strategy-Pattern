import java.util.HashMap;
import java.util.Objects;

/**
 * [Brief description of what this class does]
 *
 * @author Ethan Shelley
 * @version 0.1.0
 * @since 3/23/2026
 */
public abstract class Monster {

    private int hp;
    private int maxHP;
    private int xp = 10;
    private HashMap<String, Integer> items;


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
