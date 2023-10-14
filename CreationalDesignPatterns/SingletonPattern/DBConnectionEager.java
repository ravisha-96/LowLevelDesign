package CreationalDesignPatterns.SingletonPattern;

public class DBConnectionEager {
    private static final DBConnectionEager conObject= new DBConnectionEager();

    //Restrict the creation of object
    private DBConnectionEager(){

    }

    public static DBConnectionEager getDbConnection(){
        return conObject;
    }
}
