package Splitwise.practice;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        //Create a group
        Group grp1 = new Group("Suvastu");

        //Add users to the group
        User user1 = new User("Ravi", "ravi@gmail.com");
        User user2 = new User("suraj", "suraj@gmail.com");
        User user3 = new User("Anurag", "anurag@gmail.com");
        grp1.addUser(user1);
        grp1.addUser(user2);
        grp1.addUser(user3);

        //Create another Group
        Group grp2 = new Group("SSVR");

        //Add users to the group
        User user4 = new User("Sanyam", "sanyam@gmail.com");
        grp2.addUser(user1);
        grp2.addUser(user2);
        grp2.addUser(user3);
        grp2.addUser(user4);

        //Create splitwise
        Splitwise splitwise = new Splitwise();
        splitwise.addGroup(grp1);
        splitwise.addGroup(grp2);

        splitwise.addUsers(user1);
        splitwise.addUsers(user2);
        splitwise.addUsers(user3);
        splitwise.addUsers(user4);


        //User1 logs in to the app, show him the groups he is member of
        List<Group> user1Groups = user1.getGroups();
        System.out.println("User1 groups: ");
        for(Group grp: user1Groups){
            System.out.println(grp.getGroupName());
        }
        //User4 groups
        List<Group> user4Groups = user4.getGroups();
        System.out.println("User4 groups: ");
        for(Group grp: user4Groups){
            System.out.println(grp.getGroupName());
        }
        System.out.println("Add expense of 1000 to group1: ");
        //User1 adds an expens of 1000 in grp1
        splitwise.addExpenseEquallyToGroup(grp1, 1000);

        grp1.displayGroupExpenses();

        System.out.println("add expense of 2000 to group2");
        //User1 adds an expense of 2000 in grp2
        splitwise.addExpenseEquallyToGroup(grp2, 2000);
        grp2.displayGroupExpenses();
        

        //show the expense of every user
        splitwise.showAllUsersExpenses();

        
    }
}
