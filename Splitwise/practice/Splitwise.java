package Splitwise.practice;

import java.util.ArrayList;
import java.util.List;

public class Splitwise {
    List<User> users;
    List<Group> groups;

    public Splitwise(){
        this.users = new ArrayList<>();
        this.groups = new ArrayList<>();
    }
    public void addUsers(User user){
        users.add(user);
    }

    public void addGroup(Group group){
        groups.add(group);
    }

    public void removeUser(User user){
        //remove from the userList

        //remove from all the groups user is Part of
    }

    public void addExpenseEquallyToGroup(Group group, int amount){
        group.addExpense(amount);
    }

    public void showAllUsersExpenses(){
        for(User user: users){
            System.out.println("userId: "+ user.getUserId() + "userName: " + user.getuserName()  + " " + user.getExpense());
        }
    }
}
