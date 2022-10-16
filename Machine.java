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
        String temp = "The machine has the following items inside:\n";

        for (int i = 0; i < items[i].length; i++) {
            temp += items[i].toString() + "\n";
        }
        return temp;
    }

    public Item getItem(int row, int spot) {
        return items[row - 1][spot - 1];
    }
}
