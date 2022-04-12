package assignment.apr12.q2;

public class ShippedOrder extends Order{
    private double shipping=40;

    @Override
    public double computePrice() {
        return (getOrderQuantity() * getUnitCost()) +shipping;
    }
}
