package records.record2;

public record Product(String name, double price,int stock) {

    /*Records are only readable, setter methods cannot be added!!!

    public void setStock(int stock){
        this.stock=stock;
    }

     */

}
