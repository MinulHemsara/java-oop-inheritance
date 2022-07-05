
class bill{
    protected float unit_consumed;
    protected float unit_charge;

    public bill(float unit_consumed,float unit_charge){
        this.unit_consumed = unit_consumed;
        this.unit_charge = unit_charge;

    }
    public void calculatebill(){
        System.out.println("bill amount is "+unit_consumed * unit_charge);
    }
}
class watertbill extends bill{
    private float tax_fee;
    private float water_bill_amount;
    public watertbill(float unit_consumed, float unit_charge,float tax_fee) {
        super(unit_consumed, unit_charge);
        this.tax_fee = tax_fee;
    }
    public void waterbill(){
        water_bill_amount = unit_consumed * unit_charge + tax_fee;
    }
    public void showbill(){
        System.out.println("water bill amount is "+water_bill_amount);
    }
}
public class Main {
    public static void main(String[] args) {
        bill b = new bill(500,50);
        b.calculatebill();
        watertbill wb = new watertbill(500,60,200);
        wb.waterbill();
        wb.showbill();
    }
}