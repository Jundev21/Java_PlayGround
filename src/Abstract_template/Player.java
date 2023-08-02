package Abstract_template;

public class Player{


    private PlayerLevel pl;



    Player(){
        pl = new BeginnerLevel();
        pl.showLevelMessage();
    }

    public void getLevel(){

    }

    public void upgradeLevel(PlayerLevel level){

        pl = level;
        level.showLevelMessage();

    }

    public void play(int count){

        pl.go(count);

    }
}
