package ChainOfResponsibility.LoggerSystem;

public abstract class LogProcessor {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;

    LogProcessor nexLogProcessor;

    LogProcessor(LogProcessor logProcessor){
        nexLogProcessor = logProcessor;
    }

    public void log(int logLevel, String message){
        if( nexLogProcessor != null){
            nexLogProcessor.log(logLevel, message);
        }
    }
}
