package generic_practice;




//<T extends 클래스>
//아무타입이나 받아 올 수 없도록 제한을 걸어둔 것
// 부모클래스로부터 상속받은 클래스만 사용 가능하다.

public class Generic_main {

    public static void main(String[] args) {

//        MakeHouse firstHouse = new MakeHouse();
//
//        Wood_material wood = new Wood_material();
//
//        firstHouse.setObj(wood);
//
//
//        Wood_material getWood = (Wood_material) firstHouse.getObj();
//
//        System.out.println(getWood.toString());


        MakeHouse<Wood_material> secondHouse = new MakeHouse<Wood_material>();

        secondHouse.setObj(new Wood_material());

        System.out.println(secondHouse.toString());

        MakeHouse<Water_material> thirdHouse = new MakeHouse();



    }
}
