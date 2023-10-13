package BehavioralDesignPatterns.ChainOfResponsibility.LoggerSystem;

public class ErrorLogProcessor extends LogProcessor{

    ErrorLogProcessor(LogProcessor nexLogProcessor){
        super(nexLogProcessor);
    }

    public void log(int logLevel, String message){
        if( logLevel == LogProcessor.ERROR){
            System.out.println("Error" + message);
        }else{
            super.log(logLevel, message);
        }
    }
}
