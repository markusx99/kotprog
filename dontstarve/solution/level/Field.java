package prog1.kotprog.dontstarve.solution.level;

import prog1.kotprog.dontstarve.solution.inventory.items.AbstractItem;

public class Field implements BaseField{
    /**
     * @return
     */

    private int color;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public boolean isWalkable() {

            return color == MapColors.WATER;
    }

    /**
     * @return
     */
    @Override
    public boolean hasTree() {
        return color == MapColors.TREE;
    }

    /**
     * @return
     */
    @Override
    public boolean hasStone() {
        return color == MapColors.STONE;

    }

    /**
     * @return
     */
    @Override
    public boolean hasTwig() {
        return color == MapColors.TWIG;
    }

    /**
     * @return
     */
    @Override
    public boolean hasBerry() {
        return color == MapColors.BERRY;
    }

    /**
     * @return
     */
    @Override
    public boolean hasCarrot() {
        return color == MapColors.CARROT;
    }

    /**
     * @return
     */
    @Override
    public boolean hasFire() {
        return false ;
    }

    /**
     * @return
     */
    @Override
    public AbstractItem[] items() {
        return new AbstractItem[0];
    }
}
