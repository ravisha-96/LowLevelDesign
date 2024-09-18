package BehavioralDesignPatterns.ChainOfResponsibility.LoggerSystem;

public class DebugLogProcessor extends LogProcessor{
    
    DebugLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    public void log(int logLevel, String message){
        /* If you want to log only one out of (INFO, DEBUG, ERROR, use below code */
        // if(logLevel == LogProcessor.DEBUG ){
        //     System.out.println("Debug" + message);
        // }else{
        //     super.log(logLevel, message);
        // }
        
        /*If you want to use chained logging use below code */
        
        if(logLevel == LogProcessor.DEBUG ){
            System.out.println("Debug" + message);
            super.log(ERROR, message);
        }else{
            super.log(logLevel, message);
        }
    }
}
