import java.util.Comparator;
import java.util.Date;

/**
 * Created by superova on 16.06.2015.
 */
public class Product implements Comparable <Product>  {
 private  String nameOfProduct;
    private String maker;
    private  Date dateManufacture;
    private String categoryOfProduct;
    private  String unitOfMeasure;
    private int unitPrice;
    private int storageLife;
    private int quantity;
    private String storageConditions;


    public Product(String nameOfProduct, String maker, Date dateManufacture, String categoryOfProduct,
                   String unitOfMeasure, int unitPrice, int storageLife, int quantity, String storageConditions) {
        this.nameOfProduct = nameOfProduct;
        this.maker = maker;
        this.dateManufacture = dateManufacture;
        this.categoryOfProduct = categoryOfProduct;
        this.unitOfMeasure = unitOfMeasure;
        this.unitPrice = unitPrice;
        this.storageLife = storageLife;
        this.quantity = quantity;
        this.storageConditions = storageConditions;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameOfProduct='" + nameOfProduct + '\n' +
                ", maker='" + maker + '\n' +
                ", dateManufacture=" + dateManufacture +
                ", categoryOfProduct='" + categoryOfProduct + '\n' +
                ", unitOfMeasure='" + unitOfMeasure + '\n' +
                ", storageLife=" + storageLife +
                ", quantity=" + quantity +
                ", storageConditions='" + storageConditions +
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

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
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
    public int compareTo(Product product) {

            return  this.nameOfProduct.compareTo(product.nameOfProduct) + this.maker.compareTo(product.maker) +
                    this.unitOfMeasure.compareTo(product.unitOfMeasure) + (this.unitPrice - product.unitPrice);

    }

    public  class UnitOfMeasureComparator implements Comparator<Product> {

        @Override
        public int compare(Product o1, Product o2) {
             o1.getUnitOfMeasure().compareTo(o2.getUnitOfMeasure());
              return 1;

        }

    }  }