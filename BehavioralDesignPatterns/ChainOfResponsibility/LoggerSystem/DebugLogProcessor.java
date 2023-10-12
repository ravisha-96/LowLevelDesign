package ChainOfResponsibility.LoggerSystem;

public class DebugLogProcessor extends LogProcessor{
    
    DebugLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    public void log(int logLevel, String message){
        if( logLevel==LogProcessor.DEBUG ){
            System.out.println("Debug" + message);
            super.log(logLevel, message);
        }else{
            super.log(logLevel, message);
        }
    }
}
