package prog1.kotprog.dontstarve.solution.inventory;

import prog1.kotprog.dontstarve.solution.inventory.items.AbstractItem;
import prog1.kotprog.dontstarve.solution.inventory.items.EquippableItem;
import prog1.kotprog.dontstarve.solution.inventory.items.ItemType;

public class Inventory implements BaseInventory{
    /**
     * @param item a hozzáadni kívánt tárgy
     * @return
     */
    @Override
    public boolean addItem(AbstractItem item) {
        return false;
    }

    /**
     * @param index a slot indexe, amelyen lévő itemet szeretnénk eldobni
     * @return
     */
    @Override
    public AbstractItem dropItem(int index) {
        return null;
    }

    /**
     * @param type   a törlendő item típusa
     * @param amount a törlendő item mennyisége
     * @return
     */
    @Override
    public boolean removeItem(ItemType type, int amount) {
        return false;
    }

    /**
     * @param index1 a slot indexe, amelyen az első item található
     * @param index2 a slot indexe, amelyen a második item található
     * @return
     */
    @Override
    public boolean swapItems(int index1, int index2) {
        return false;
    }

    /**
     * @param index    a mozgatni kívánt item pozíciója az inventory-ban
     * @param newIndex az új pozíció, ahova mozgatni szeretnénk az itemet
     * @return
     */
    @Override
    public boolean moveItem(int index, int newIndex) {
        return false;
    }

    /**
     * @param index1 első item pozíciója az inventory-ban
     * @param index2 második item pozíciója az inventory-ban
     * @return
     */
    @Override
    public boolean combineItems(int index1, int index2) {
        return false;
    }

    /**
     * @param index a kézbe venni kívánt tárgy pozíciója az inventory-ban
     * @return
     */
    @Override
    public boolean equipItem(int index) {
        return false;
    }

    /**
     * @return
     */
    @Override
    public EquippableItem unequipItem() {
        return null;
    }

    /**
     * @param index A megfőzni kívánt item pozíciója az inventory-ban
     * @return
     */
    @Override
    public ItemType cookItem(int index) {
        return null;
    }

    /**
     * @param index A megenni kívánt item pozíciója az inventory-ban
     * @return
     */
    @Override
    public ItemType eatItem(int index) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public int emptySlots() {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public EquippableItem equippedItem() {
        return null;
    }

    /**
     * @param index a lekérdezni kívánt pozíció
     * @return
     */
    @Override
    public AbstractItem getItem(int index) {
        return null;
    }
}
