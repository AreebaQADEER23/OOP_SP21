public class PizzaOrder_Runner {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("small",5,4,3);
        Pizza p2 = new Pizza("large",1,2,3);
        PizzaOrder order1 = new PizzaOrder(p1,p2);
        System.out.println("Current Active orders are: " + PizzaOrder.activeOrders);
        System.out.println("Total cost: $" + order1.calcTotal());
    }
}

