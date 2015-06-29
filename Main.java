import javax.swing.*;
import java.util.*;

/**
 * Created by superova on 19.06.2015.
 */
public class Main {
    public static void main(String[] args) {
       // Date dateManufacture = new Date();
        Set<Product> product = new TreeSet<Product>();

        Set<Product>warehouseCollection2 = new TreeSet<>();

        Warehouse warehouse1 = new Warehouse(1,200,"Promzona","Ivanov");
        Warehouse warehouse2 = new Warehouse(2,500,"Center","Petrov");


        Product product1 = new Product("Milk","Bashtanka", new Date() ,"Perishable","Hackage 0,5 liter",10,5,100,"refrigerator");
        Product product2 = new Product("Milk","AAA", new Date() ,"Perishable","Hackage 1 liter",25,5,50,"refrigerator");
        Product product3 = new Product("Cheese","Bashtanka", new Date() ,"Perishable","Hackage kg",10,8,100,"refrigerator");
        Product product4 = new Product("Rice","ABC", new Date() ," No perishable","Hackage kg",15,300,5000,"not refrigerator");
        Product product5 = new Product("Flour","ABC", new Date() ,"No perishable","Hackage kg",6,300,3000,"not refrigerator");
        Product product6 = new Product("Milk","Bashtanka", new Date() ,"Perishable","Hackage 0,5 liter",15,5,100,"refrigerator");

        product.add(product1);
        product.add(product2);
        product.add(product3);
        product.add(product4);
        product.add(product5);
        product.add(product6);

          for (Product p:product)
        System.out.println(p);

        for (Product p:Warehouse.war1)
            System.out.println(p);



    }


    }

