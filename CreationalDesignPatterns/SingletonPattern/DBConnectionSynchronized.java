package CreationalDesignPatterns.SingletonPattern;

public class DBConnectionSynchronized {
    public static DBConnectionSynchronized syncConn;

    private DBConnectionSynchronized(){

    }

    //synchronize puts lock on the method so at once only one thread can invoke this method
    //Here, we lock the method even if a single object is already created
    synchronized public static DBConnectionSynchronized getDbConnection(){
        if(syncConn == null){
            syncConn = new DBConnectionSynchronized();
        }
        return syncConn;
    }
}
