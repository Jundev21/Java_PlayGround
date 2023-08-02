package Abstract_template;

public class AdvancedLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("빨리달립니다");
    }

    @Override
    public void jump() {
        System.out.println(" 높이 jump 합니다");
    }

    @Override
    public void turn() {

        System.out.println("Turn 할 줄 몰라");


    }

    @Override
    public void showLevelMessage() {
        System.out.println("--- 중급자 레벨입니다 ---");    }


}
