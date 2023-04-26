package prog1.kotprog.dontstarve.solution.character;

import prog1.kotprog.dontstarve.solution.character.actions.Action;
import prog1.kotprog.dontstarve.solution.inventory.BaseInventory;
import prog1.kotprog.dontstarve.solution.utility.Position;

public class Character implements BaseCharacter{
    /**
     * @return
     */
    @Override
    public float getSpeed() {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public float getHunger() {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public float getHp() {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public BaseInventory getInventory() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public Position getCurrentPosition() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public Action getLastAction() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public String getName() {
        return null;
    }
}
