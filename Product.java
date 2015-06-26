import java.util.Collection;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by superova on 16.06.2015.
 */
public class Product  {
    String nameOfProduct;
    String maker;
    Date dateManufacture;
    String categoryOfProduct;
    String unitOfMeasure;
    int unntPrice;
    int storageLife;
    int quantity;
    String storageConditions;


    public Product(String nameOfProduct, String maker, Date dateManufacture, String categoryOfProduct,
                   String unitOfMeasure, int unntPrice, int storageLife, int quantity, String storageConditions) {
        this.nameOfProduct = nameOfProduct;
        this.maker = maker;
        this.dateManufacture = dateManufacture;
        this.categoryOfProduct = categoryOfProduct;
        this.unitOfMeasure = unitOfMeasure;
        this.unntPrice = unntPrice;
        this.storageLife = storageLife;
        this.quantity = quantity;
        this.storageConditions = storageConditions;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                ", maker='" + maker + '\'' +
                ", dateManufacture=" + dateManufacture +
                ", categoryOfProduct='" + categoryOfProduct + '\'' +
                ", unitOfMeasure='" + unitOfMeasure + '\'' +
                ", unntPrice=" + unntPrice +
                ", storageLife=" + storageLife +
                ", quantity=" + quantity +
                ", storageConditions='" + storageConditions + '\n' +
                '}';
    }



}