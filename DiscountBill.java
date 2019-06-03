import java.util.ArrayList;
import java.util.List;
public class DiscountBill extends GroceryBill {
    private boolean preferred;
    private int discountCount;
    private double discountAmount;

    public DiscountBill(Employee clerk, boolean preferred) {
        super(clerk);
        this.preferred = preferred;
    }
    public void add(Item i) {
        super.add(i);

        if (preferred && i.getDiscount() > 0 ) {
            discountCount++;
            discountAmount += i.getDiscount();
        }
    }
    public double getTotal() {
        return super.getTotal() - discountAmount;
    }
    public int getDiscountCount(){
        return discountCount;
    }
    public double getDiscountAmount(){
        return discountAmount;
    }

    public double getDiscountPercent() {
        double total = super.getTotal();
        return   discountAmount * 100 / total;
    }
}
