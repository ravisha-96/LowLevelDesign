package CreationalDesignPatterns.SingletonPattern;

public class DBConnectionDoubleLocking {
    public static DBConnectionDoubleLocking doubleLockConn;

    private DBConnectionDoubleLocking(){

    }

    public static DBConnectionDoubleLocking getDbConnection(){
        if(doubleLockConn == null){
            synchronized(DBConnectionDoubleLocking.class){
                if(doubleLockConn == null){
                    doubleLockConn = new DBConnectionDoubleLocking();
                }
            }
        }
        return doubleLockConn;
    }
}
