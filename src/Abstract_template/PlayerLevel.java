package Abstract_template;

 public abstract class PlayerLevel {

     public abstract void run();

     public abstract void jump();

     public abstract void turn();

     public abstract void showLevelMessage();


    //템플릿 메서드 메서드가 순서대로 호출된다.

    public void go(int count){

        run();

        for(int i =0 ; i<count; i++){
            jump();
        }

        turn();

        showLevelMessage();
    }

}
