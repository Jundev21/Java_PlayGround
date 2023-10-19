package enumPractice;
//
//
////열거형에 멤버 추가
////열거에 괄호를 사용하여 상수들을 갖을 수 있는데 갯수는 상관이없다.
//// 상수가 작성이되면 변수들과 생성자가 무조건 만들어줘야한다. 상수의 갯수만큼 변수들이 만들어져야하고 생성자의 매개변수도 만들어져야한다.
//
//public enum Direction {
//
//    EAST(1),SOUTH(2),WEST(3), NORTH(4);
//    //괄호안 생성자이다.
//
//    private final int value;
//
//    private static final Direction[] DIR_ARE = Direction.values();
//
//    //생성자는 항상 private로 되어있어 외부에서 호출이 불가능하다.
//    Direction(int value){
//        this.value = value;
//    }
//
//    public int getValue(){
//        return value;
//    }
//
//
//}


public enum Direction {

    EAST(1,0),SOUTH(0,-1),WEST(-1,0), NORTH(0,1);

    private final int x;
    private final int y;

    Direction(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getx(){
        return x;
    }

    public int gety(){
        return y;
    }


}





