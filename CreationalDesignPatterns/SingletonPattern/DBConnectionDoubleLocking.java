package CreationalDesignPatterns.SingletonPattern;

public class DBConnectionDoubleLocking {
    private static DBConnectionDoubleLocking doubleLockConn;

    private DBConnectionDoubleLocking(){

    }

    public static DBConnectionDoubleLocking getDbConnection(){
        if(doubleLockConn == null){
            //synchronized(this) will synchronize all threads that deal concretely with this instance of DBConnectionDoubleLocking class
            //synchornized(DBConnectionDoubleLocking.class) will synchronize all threads independently of the object on which this getDbConnection() method was called

            synchronized(DBConnectionDoubleLocking.class){
                if(doubleLockConn == null){
                    doubleLockConn = new DBConnectionDoubleLocking();
                }
            }
        }
        return doubleLockConn;
    }
}
