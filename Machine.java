public class Machine {
    private Item[][] items;

    public Machine(Item[][] items) {
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                this.items[i][j] = new Item(items[i][j]);
            }
        }
    }

    public Item getItem(int row, int spot) {
        return items[row - 1][spot - 1];
    }
}
