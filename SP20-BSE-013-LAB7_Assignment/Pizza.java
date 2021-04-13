public class Pizza {
    private String size;
    private int cheese, peperoni, ham;
    public Pizza()
    {
        size = "small"; //default size
        cheese = peperoni = ham = 0;
    }
    public Pizza(String size, int cheese, int peperoni, int ham)
    {
        if (checkSize(size))
        {
            this.size = size;
        }
        else
        {
            System.out.println("Invalid Size!Setting size to default");
            this.size = "small";
        }
        this.cheese = cheese;
        this.peperoni = peperoni;
        this.ham = ham;
    }
    public Pizza(Pizza other) {
        this.size = other.size;
        this.cheese = other.cheese;
        this.peperoni = other.peperoni;
        this.ham = other.ham;
    }
    public double calCost()
    {
        double cost = 0;
        cost = (cheese * 2) + (peperoni * 2) + (ham * 2);
        if (size.equals("large")){
            cost += 14;
        }
        else if (size.equals("medium")){
            cost += 12;}
        else
            cost += 10;
        return cost;
        
    }
    public String getDescription()
    {
        return String.format("Pizza Size: %s, Cheese toppings: %d, Peperoni toppings: %d, Ham toppings: %d", size, cheese, peperoni,
                ham);
    }
    public String getSize()
    {
        return size;
    }
    public int getCheeseToppings()
    {
        return cheese;
    }
    public int getPeperoniToppings()
    {
        return peperoni;
    }
    public int getHamToppings()
    {
        return ham;
    }
    public void setSize(String size)
    {
        if (checkSize(size))
        {
            this.size = size;
        }
        else
        {
            System.out.println("Invalid Size!Setting size to default");
            this.size = "small";
        }
    }
    public void setCheeseToppings(int cheese)
    {
        this.cheese = cheese;
    }
    public void setPeperoniToppings(int peperoni)
    {
        this.peperoni = peperoni;
    }
    public void setHamToppings(int ham)
    {
        this.ham = ham;
    }
    private boolean checkSize(String s)
    {
        if (s.equals("small") || s.equals("medium") || s.equals("large"))
            return true;
        else
            return false;
    }
}
