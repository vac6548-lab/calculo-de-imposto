package entities;
public class Juridica extends Pessoa{
    private int numberOfEmployees;
    public Juridica(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        Double totalTax = null;
        if(numberOfEmployees > 10){
            totalTax = getAnualIncome() * 0.14;
        }else{
            totalTax = getAnualIncome() * 0.16;
        }
        return totalTax;
    }
}
