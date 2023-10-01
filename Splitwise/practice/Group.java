package Splitwise.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {
    private static int currId = 0;
    private int groupId;
    private String groupName;
    public List<User> userList = new ArrayList<>();
    private int totalExpense = 0;
    private Map<User, Integer> indiExpense = new HashMap<>();

    public Group(String groupName){
        this.groupId = currId++;
        this.groupName = groupName;
    }

    public void addExpense(int expense){
        totalExpense += expense;
        int personalExpenses = expense/userList.size();
        for(User user: this.userList){
            indiExpense.put( user, indiExpense.getOrDefault(user, 0) + personalExpenses );
            user.addExpense(personalExpenses);
        }
    }

    public int getExpense(){
        return totalExpense;
    }

    public String getGroupName(){
        return this.groupName;
    }
    public void addUser(User user){
        userList.add(user);
        //Also add this group to the user
        user.addToGroup(this);
    }

    public void removeUser(User user){
        userList.remove(user);
    }

    public void displayGroupExpenses(){
        System.out.println("Displaying users expenses for group" + this.groupName);
        // for(User user: this.userList){
        //     System.out.println(user.getUserId() + " " +user.getuserName()+ " " + user.getExpense());
        // }

        for(Map.Entry<User, Integer> entry : indiExpense.entrySet()){
            System.out.println(entry.getKey().getuserName() + entry.getValue());
        }
    }
}
