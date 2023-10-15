package StructuralDesignPatterns.FacadePattern.airconditioner;

public class ACInternUnit {
    public void acceptUserTempCmd(){
        System.out.println("accepting user temp command");
    }

    public void acceptUserOnCmd(){
        System.out.println("accepting user on command");
    }

    public void acceptUserOffCmd(){
        System.out.println("accepting user off command");
    }
}
