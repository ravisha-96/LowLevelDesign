package CreationalDesignPatterns.SingletonPattern;

public class Main {
    public static void main(String[] args) {

        System.out.println(DBConnectionEager.getDbConnection());

        System.out.println(DBConnectionLazy.getDbConnection());

        System.out.println(DBConnectionSynchronized.getDbConnection());

        System.out.println(DBConnectionDoubleLocking.getDbConnection());
    }
}
