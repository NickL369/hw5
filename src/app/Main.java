class Product {
    private String name;
    private int quota;
    private double price;
    private double deliveryCost;

    public Product(String name, int quota, double price, double deliveryCost) {
        this.name = name;
        this.quota = quota;
        this.price = price;
        this.deliveryCost = deliveryCost;
    }

    public double calculateBaseCost() {
        return quota * price;
    }

    public double calculateTotalCost() {
        return calculateBaseCost() + deliveryCost;
    }

    public void printCostInfo() {
        System.out.println("Product: " + name + ", quota is " + quota + " pcs., price is EUR " + price);
        System.out.println("Cost is EUR " + calculateBaseCost());
        System.out.println("Cost with delivery is EUR " + calculateTotalCost());
    }

    public static void main(String[] args) {
        Product product = new Product("abc", 5, 2.5, 7.0);
        product.printCostInfo();
    }
}
