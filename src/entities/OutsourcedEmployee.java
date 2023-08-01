package entities;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name + " - $ " + String.format("%.2f", payment()) + "\n");
        return sb.toString();
    }

    @Override
    public Double payment(){
        return super.payment() + additionalCharge * 1.1;
    }

}
