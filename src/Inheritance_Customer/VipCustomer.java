package Inheritance_Customer;

// 매출에 더 많은 기여를 하는 단골 고객
// 제품을 살때 10%를 할인해 줌
// 보너스 포인트는 제품 가격의 5%를 적립해 줌
// 담당 전문 상담원이 배정됨

public class VipCustomer extends  Customer {
    private int agentId;
    double salesRatio;


    VipCustomer(String customerName, int customerId){

        super((customerName), customerId);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

    }

    public int getAgentId(){
        return agentId;
    }

    @Override
    public  int calcPrice(int price){
        bonusPoint += price * bonusPoint;
        return price - (int)(price * salesRatio);
    }

}
