package Splitwise.practice;

import java.util.List;

public class Expense {
    private int amount;
    List<User> userList;

    public Expense(int amount, List<User> userList){
        this.userList = userList;
        this.amount = amount;
    }
}
