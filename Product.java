import java.util.Collection;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by superova on 16.06.2015.
 */
public class Product implements Comparable   {
 private  String nameOfProduct;
    private String maker;
    private  Date dateManufacture;
    private String categoryOfProduct;
    private  String unitOfMeasure;
    private int unntPrice;
    private int storageLife;
    private int quantity;
    private String storageConditions;


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


    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public Date getDateManufacture() {
        return dateManufacture;
    }

    public void setDateManufacture(Date dateManufacture) {
        this.dateManufacture = dateManufacture;
    }

    public String getCategoryOfProduct() {
        return categoryOfProduct;
    }

    public void setCategoryOfProduct(String categoryOfProduct) {
        this.categoryOfProduct = categoryOfProduct;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public int getUnntPrice() {
        return unntPrice;
    }

    public void setUnntPrice(int unntPrice) {
        this.unntPrice = unntPrice;
    }

    public int getStorageLife() {
        return storageLife;
    }

    public void setStorageLife(int storageLife) {
        this.storageLife = storageLife;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStorageConditions() {
        return storageConditions;
    }

    public void setStorageConditions(String storageConditions) {
        this.storageConditions = storageConditions;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}