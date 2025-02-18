package Strategy_Pattern;



/*
strategy pattern - 전략 왜 사용하는가?
어떤 행위에대해서 행위가 변경될때마다 분기처리로 코드를 직접 하나씩 추가해야한다.
코드가 길어지기 때문에 유지 보수적 측면에서 좋지 않다.
객체지향 설계원칙 클래스를 설계야해야한다.
OCP 원칙을 통해서 분리 설계
*/

import javax.smartcardio.Card;

public class Main {
    public static void main(String[] args) {

        PurchaseService purchaseService = new PurchaseService();


        System.out.println(purchaseService.pay(new CardPay()));
        System.out.println(purchaseService.pay(new CashPay()));



        System.out.println("result end");

    }
}
