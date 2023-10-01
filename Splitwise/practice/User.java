package Splitwise.practice;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static int currId;
    private int userId;
    private String name;
    private String emailId;
    private int totalExpense=0;
    private List<Group> groups = null;

    public User(String name, String emailId){
        this.userId = currId++;
        this.emailId = emailId;
        this.name = name;
        this.groups = new ArrayList<>();
    }

    public void addToGroup(Group group){
        groups.add(group);
    }

    public String getuserName(){
        return this.name;
    }

    public int getUserId(){
        return this.userId;
    }
    public List<Group> getGroups(){
        return this.groups;
    }
    public int getExpense(){
        return totalExpense;
    }

    public void addExpense(int expense){
        totalExpense += expense;
    }
}
