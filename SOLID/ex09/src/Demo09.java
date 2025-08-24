public class Demo09 {
    public static void main(String[] args) {
        OrderRepo repo = new SqlOrderRepository();
        OrderController controller = new OrderController(repo);
        controller.create("ORD-1");
    }
}
