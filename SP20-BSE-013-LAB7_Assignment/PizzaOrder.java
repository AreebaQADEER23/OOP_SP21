
public class PizzaOrder {
    private Pizza p1, p2, p3;
    public static int activeOrders = 0;
    public PizzaOrder()
    {
        p1 = p2 = p3 = null;
    }
    public PizzaOrder(Pizza pizza1)
    {
        if (pizza1 != null)
        {
            this.p1 = new Pizza(pizza1);
            activeOrders++;
        }
    }
    public PizzaOrder(Pizza pizza1, Pizza pizza2)
    {
        if (pizza1 != null)
        {
            this.p1 = new Pizza(pizza1);
            activeOrders++;
        }
        if (pizza2 != null)
        {
            this.p2 = new Pizza(pizza2);
            activeOrders++;
        }
    }
    public PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3)
    {
        if (pizza1 != null)
        {
            this.p1 = new Pizza(pizza1);
            activeOrders++;
        }
        if (pizza2 != null)
        {
            this.p2 = new Pizza(pizza2);
            activeOrders++;
        }
        if (pizza3 != null)
        {
            this.p3 = new Pizza(pizza3); //deep copy
            activeOrders++;
        }
    }
    public void setPizza1(Pizza pizza1)
    {
        if (p1 == null)  // if initial order was empty
            activeOrders++;
        p1 = new Pizza(pizza1);
    }
    public void setPizza2(Pizza pizza2)
    {
        if (p2 == null) //if initially order was empty
            activeOrders++;
        p2 = new Pizza(pizza2);
    }
    public void setPizza3(Pizza pizza3)
    {
        if (p3 == null) //if initially order was empty
            activeOrders++;
        p3 = new Pizza(pizza3);
    }
    public double calcTotal()
    {
        double total = 0;
        if (p1 != null)
            total += p1.calCost();
        if (p2 != null)
            total += p2.calCost();
        if (p3 != null)
            total += p3.calCost();
        return total;
    }
}

