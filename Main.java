import javax.swing.*;
import java.util.*;

/**
 * Created by superova on 19.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        Date dateManufacture = new Date();
        Set<Product> product = new TreeSet<Product>();

        Product product1 = new Product("Milk","Bashtanka", dateManufacture ,"Perishable","Hackage 0,5 liter",10,5,100,"refrigerator");
        Product product2 = new Product("Milk","AAA", dateManufacture ,"Perishable","Hackage 1 liter",25,5,50,"refrigerator");
        Product product3 = new Product("Cheese","Bashtanka", dateManufacture ,"Perishable","Hackage kg",10,8,100,"refrigerator");
        Product product4 = new Product("Rice","ABC", dateManufacture ," No perishable","Hackage kg",15,300,5000,"not refrigerator");
        Product product5 = new Product("Flour","ABC", dateManufacture ,"No perishable","Hackage kg",6,300,3000,"not refrigerator");

        product.add(product1);
        product.add(product2);
        product.add(product3);
        product.add(product4);
        product.add(product5);






    }

}
