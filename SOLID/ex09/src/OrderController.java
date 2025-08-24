public class OrderController {

    private final OrderRepo repo;

    public OrderController(OrderRepo repo) {
        this.repo = repo;
    }

    void create(String id) {
        repo.save(id);
        System.out.println("Created order: " + id);
    }
}