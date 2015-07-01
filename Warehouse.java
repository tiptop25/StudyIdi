import java.util.*;

/**
 * Created by superova on 19.06.2015.
 */
public class Warehouse  {
   // Set<Product>warehouse1 = new TreeSet<>();
  //  Set<Product>warehouse2 = new TreeSet<>();
    int namber;
    int area;
    String address;
    String materiallyResponsible;



    public Warehouse(int namber, int area, String address, String materiallyResponsible) {
        this.namber = namber;
        this.area = area;
        this.address = address;
        this.materiallyResponsible = materiallyResponsible;

    }
    public Vector<Product> warehouse1(String unitOfMeasure, Set<Product> product){
        Vector<Product> war1 =new Vector<Product>();
        Iterator<Product> productIterator1 =product.iterator();
        while (productIterator1.hasNext()){
            Product temp =productIterator1.next();
            if (temp.getUnitOfMeasure().equals(unitOfMeasure)){
                war1.add(temp);
            }
        }

       return war1;
    }


}



