package ChainOfResponsibility.LoggerSystem;

public class Main {
    public static void main(String[] args){
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.INFO, "  this is the info");
        logProcessor.log(LogProcessor.DEBUG, "  this is for debug");
        logProcessor.log(LogProcessor.ERROR, "  this is for the error");
    }
}
