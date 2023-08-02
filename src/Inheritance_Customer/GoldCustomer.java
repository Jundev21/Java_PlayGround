package Inheritance_Customer;

// vip 멤버보다는 낮고 일반 고객보다는 높은 등급
// 일반 고객 상속 - 다형성 사용
// 골드 고객 제품살때 10퍼센트 할인
// 보너스 포인트 2% 적립

public class GoldCustomer extends Customer{

    double salesRatio;


    GoldCustomer(String customerName, int customerId){
        super(customerName,customerId);
        bonusRatio = 0.02;
        salesRatio = 0.1;
        customerGrade = "GOLD";
    }


    @Override
    public int calcPrice(int price) {

        bonusPoint += price*bonusRatio;
        return price - (int) (price * salesRatio);
    }
}
