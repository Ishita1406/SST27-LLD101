public class SqlOrderRepository implements OrderRepo {

    @Override
    public void save(String id){ 
        System.out.println("Saved order " + id + " to SQL"); 
    }
}
