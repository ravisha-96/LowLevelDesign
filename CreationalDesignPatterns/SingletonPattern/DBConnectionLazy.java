package CreationalDesignPatterns.SingletonPattern;

//Lazy Initialization
public class DBConnectionLazy {
    private static DBConnectionLazy conObject;

    //Restrict the creation of object
    private DBConnectionLazy(){

    }

    public static DBConnectionLazy getDbConnection(){
        if( conObject==null ){ // Lazy initialization
            //If 2 threads simulateneously comes at null check, then 2 objects will be created
            conObject =  new DBConnectionLazy();
        }
        return conObject;
    }
}
