package Logger_Practice;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


// util.logging 을 사용하는데
// util.logging 에는 7단계가 있다. severe, warning, info, config, fine, finer, finest 의 단계가 있는데
// 왼쪽으로갈수록 심각한 단계 오른쪽으로 갈수록 약한 단계라고 보면된다.

public class MyLogger {

    Logger logger = Logger.getLogger("myLogger");
    private static final MyLogger instance = new MyLogger();
    public static final String errorLog = "log.txt";
    public static final String warningLog = "warning.txt";
    public static final String fineLog = "fine.txt";

    private MyLogger(){

        FileHandler logFile = null;
        FileHandler warningFile = null;
        FileHandler fineFile = null;
        try {
            logFile = new FileHandler(errorLog, true);
            warningFile = new FileHandler(warningLog, true);
            fineFile = new FileHandler(fineLog, true);

        } catch (SecurityException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assert logFile != null;
        logFile.setFormatter(new SimpleFormatter());
        assert warningFile != null;
        warningFile.setFormatter(new SimpleFormatter());
        assert fineFile != null;
        fineFile.setFormatter(new SimpleFormatter());

        logger.setLevel(Level.ALL);
        fineFile.setLevel(Level.FINE);
        warningFile.setLevel(Level.WARNING);

        logger.addHandler(logFile);
        logger.addHandler(warningFile);
        logger.addHandler(fineFile);
    }


    public static MyLogger getLogger(){
        return instance;
    }


    public void log(String msg){

        logger.finest(msg);
        logger.finer(msg);
        logger.fine(msg);
        logger.config(msg);
        logger.info(msg);
        logger.warning(msg);
        logger.severe(msg);

    }

    public void fine(String msg){
        logger.fine(msg);
    }

    public void warning(String msg){
        logger.warning(msg);
    }
}
