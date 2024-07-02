package dacclass.assignment.apr12.q2;

public class UseOrder {

    public static void main(String[] args) {

        Order order=new Order();
        order.setCustomerName("Pradeep");
        order.setCustomerNumber(1234567899);
        order.setOrderQuantity(5);
        order.setUnitCost(10);

        System.out.println("order details +"+
                "\n Customer Name : "+ order.getCustomerName()+
                "\n Customer Number : "+   order.getCustomerNumber()+
                "\n Order Quantity : "+ order.getOrderQuantity()+
                "\n UnitCost : "+   order.getUnitCost()+
                "\n Compute Price : "+   order.computePrice()

        );

        ShippedOrder shippedOrder=new ShippedOrder();
        shippedOrder.setCustomerName("Pradeep");
        shippedOrder.setCustomerNumber(1234567899);
        shippedOrder.setOrderQuantity(5);
        shippedOrder.setUnitCost(10);
        System.out.println("order details +"+
                       "\n Customer Name : "+ shippedOrder.getCustomerName()+
                        "\n Customer Number : "+   shippedOrder.getCustomerNumber()+
                        "\n Order Quantity : "+ shippedOrder.getOrderQuantity()+
                        "\n UnitCost : "+   shippedOrder.getUnitCost()+
                        "\n Compute Price : "+   shippedOrder.computePrice()

                );

    }


}
