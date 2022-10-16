public class Machine {
    private Item[][] items;

    public Machine(Item[][] items) {
        this.items = new Item[items.length][items[0].length];
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                this.items[i][j] = new Item(items[i][j]);
            }
        }
    }

    public String toString() {
        String temp = "";

        for (int i = 0; i < items.length; i++) {
            temp += "\t";
            for (int j = 0; j < items[i].length; j++) {
                temp += items[i][j].toString() + "   ";
            }
            temp += "\n";
        }
        temp += "\t****************************************************";
        return temp;
    }

    public Item getItem(int row, int spot) {
        return new Item(items[row - 1][spot - 1]);
    }

    public void setItem(Item item, int row, int spot) {
        this.items[row - 1][spot - 1] = new Item(item);
    }

    public boolean dispense(int row, int spot) {
        if (items[row - 1][spot - 1].getQuantity() > 0) {
            items[row - 1][spot - 1].setQuantity(items[row - 1][spot - 1].getQuantity() - 1);
            return true;
        }
        else {
            return false;
        }
    }

}
