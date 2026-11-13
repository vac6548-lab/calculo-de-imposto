package entities;
public class Fisica extends Pessoa{
    private Double healthExpenditures;
    public Fisica(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }
    public Double getHealthExpenditures() {
        return healthExpenditures;
    }
    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
    @Override
    public Double tax(){
        Double totalTax = null;
        Double discount  = null;
        if(getAnualIncome()< 20000.00){
            totalTax = (getAnualIncome() * 0.15);
        }else if(getAnualIncome() >= 20000.00);
        {
            totalTax = (getAnualIncome() * 0.25);
        }
        discount = healthExpenditures * 0.5;
        return totalTax - discount;
    }
}
