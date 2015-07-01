import java.util.Date;

/**
 * Created by superova on 28.06.2015.
 */
public class Order {
    int Nomer;
    Date DateOrder;
    String User;


    public Order(int nomer, Date dateOrder, String user) {
        Nomer = nomer;
        DateOrder = dateOrder;
        User = user;
    }

    public Order createOrder(int Nomer,Date DateOrder,String User){
        return new Order(Nomer,DateOrder,User);
    }
}
