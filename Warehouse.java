import java.util.*;

/**
 * Created by superova on 19.06.2015.
 */
public class Warehouse  {

    int namber;
    int area;
    String address;
    String materiallyResponsible;

    static Vector<Product> war1 =new Vector<Product>();

    public Warehouse(int namber, int area, String address, String materiallyResponsible) {
        this.namber = namber;
        this.area = area;
        this.address = address;
        this.materiallyResponsible = materiallyResponsible;

    }
    public void warehouse1(String unitOfMeasure,Set<Product> product){

        Iterator<Product> productIterator1 =product.iterator();
        while (productIterator1.hasNext()){
            Product temp =productIterator1.next();
            if (temp.getUnitOfMeasure().equals(unitOfMeasure)){
                war1.add(temp);
            }
        }


    }

}



