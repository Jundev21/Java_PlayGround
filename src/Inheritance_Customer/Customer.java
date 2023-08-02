package Inheritance_Customer;


// 커스텀에는 회원 아이디, 이름, 등급, 포인트, 보너스 포인트가 있다.
public class Customer {
    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

//    Customer(){
//
//        System.out.println("INIT CUSTOMER CONSTRUCTOR");
//        bonusRatio = 0.01;
//        customerGrade="SILVER";
//
//        System.out.println("bonusRatio" + bonusRatio + " Grade " + customerGrade);
//    }


    Customer(String customerName, int customerId){

        this.customerName = customerName;
        this.customerId = customerId;
        bonusRatio = 0.01;
        customerGrade="SILVER";

    }

    public int calcPrice(int price){

        bonusPoint += price * bonusPoint;
        return price;
    }

    public String showCustomerInfo(){

        return customerName + " 님의 등급은 " + customerGrade + " 이며, 보너스 포인트는 " + bonusPoint + " 입니다";

    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
}
