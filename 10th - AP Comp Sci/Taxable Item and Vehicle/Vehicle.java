public class Vehicle extends TaxableItem{
    private double dealerCost;
    private double dealerMarkup;
    public Vehicle(double dealerCost, double dealerMarkup, double taxRate){
        super(taxRate);
        this.dealerCost = dealerCost;
        this.dealerMarkup = dealerMarkup;
    }
    public double getDealerCost(){
        return dealerCost;
    }
    public double getDealerMarkup(){
        return dealerMarkup;
    }
    public double changeMarkup(int x){
        dealerMarkup = x;
        return dealerMarkup;
    }
    public double getListPrice(){
        return ((getDealerCost() + getDealerMarkup()));
    }
}