package OopsFundamentals;
//Enum representing status of an order in an e-commerce application.
//This defines a clear set of valid statuses for an order.

public class ECommerceApp 
{
    public static void main(String[] args) 
    {
        // Example: Set the current order status
        OrderStatus status = OrderStatus.SHIPPED;

        // Check status and print appropriate message
        if (status == OrderStatus.SHIPPED) {
            System.out.println("Your package is on the way!");
        } else if (status == OrderStatus.PLACED) {
            System.out.println("Your order has been placed successfully!");
        } else if (status == OrderStatus.CONFIRMED) {
            System.out.println("Your order has been confirmed!");
        } else if (status == OrderStatus.DELIVERED) {
            System.out.println("Your package has been delivered!");
        } else if (status == OrderStatus.CANCELLED) {
            System.out.println("Your order has been cancelled!");
        }
    }
}

