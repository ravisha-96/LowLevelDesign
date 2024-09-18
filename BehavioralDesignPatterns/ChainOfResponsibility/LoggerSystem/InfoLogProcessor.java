package BehavioralDesignPatterns.ChainOfResponsibility.LoggerSystem;

public class InfoLogProcessor extends LogProcessor{

    InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    public void log(int logLevel, String message){
        /* If you want to log only one out of (INFO, DEBUG, ERROR, use below code */
        // if( logLevel == LogProcessor.INFO){
        //     System.out.println("INFO: " + message);
        // }else{
        //     super.log(logLevel, message);
        // }

        /*If you want to use chained logging use below code */
        if( logLevel == LogProcessor.INFO){
            System.out.println("INFO: " + message);
            super.log(DEBUG, message);
        }else{
            super.log(logLevel, message);
        }
    }
}
