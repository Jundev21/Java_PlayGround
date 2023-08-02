package Inheritance_Customer;

// 고객에는 일반고객도 있고 VIP 고객도 있다. 이를 효율적으로 작성하기위해서는
// 고객 클래스를 작성 한 후에 세부적인 고객들 예를들면 VIP 고객들은 상속받아서 기능, 변수들을 추가해 주면된다.

//super 연상자는 하위 클래스가 상위 클래스의 참조값을 갖고있으며 상위 디폴트 컨스트럴터를 호출한다.
// 만약 상위 디폴트 컨스트럭터가 없을경우에는 상위 컨스트럭터에 맞게 하위 클래스에서 작성해야한다.
public class InheritanceMain {
    public static void main(String[] args) {
//        Customer customerLee = new Customer();
//        customerLee.setCustomerName("이순신");
//        customerLee.setCustomerId(10010);
//        customerLee.bonusPoint = 1000;
//        System.out.println(customerLee.showCustomerInfo());

//
//        VipCustomer customerKim = new VipCustomer();
//        customerKim.setCustomerName("김유신");
//        customerKim.setCustomerId(10020);
//        customerKim.bonusPoint = 10000;
//        System.out.println(customerKim.showCustomerInfo());


        Customer customerLee = new Customer("이순신",10010);
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
//        System.out.println(customerLee.showCustomerInfo());


        VipCustomer customerKim = new VipCustomer("김유신", 10020);
        customerKim.bonusPoint = 10000;
        price = customerKim.calcPrice(1000);
//        System.out.println(customerKim.showCustomerInfo());

        Customer customerPark = new VipCustomer("name", 12345);
        price = customerPark.calcPrice(1000);


        Customer customercha = new GoldCustomer("goldKim", 678910);
        customercha.bonusPoint = 10000;
        price = customercha.calcPrice(1000);
        System.out.println(customercha.showCustomerInfo());



    }
}
