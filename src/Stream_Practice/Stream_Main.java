package Stream_Practice;

public class Stream_Main {
    public static void main(String[] args) {

        Customer customerLee = new Customer("Lee", 40, 100);
        Customer customerLee2 = new Customer("Lee", 40, 100);

        Customer customerKim = new Customer("Kim", 20, 100);
        Customer customerHong = new Customer("Hong", 13, 50);

        Calc_Cost calc = new Calc_Cost();

        calc.addCustomer(customerLee);
        calc.addCustomer(customerLee2);
        calc.addCustomer(customerKim);
        calc.addCustomer(customerHong);

//        calc.getAllName();
//        calc.getAllCost();
//        calc.getFilterAge();


        calc.getDistinct();


    }
}
