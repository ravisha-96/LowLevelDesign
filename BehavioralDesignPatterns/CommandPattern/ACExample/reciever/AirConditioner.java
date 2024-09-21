package BehavioralDesignPatterns.CommandPattern.ACExample.reciever;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnACOn(){
        isOn = true;
        System.out.println("AC turned on");
    }

    public void turnACOff(){
        isOn = false;
        System.out.println("AC turned off");
    }

    public void setTemp(int temp){
        this.temperature = temp;
        System.out.println("Temperature set to "+temp);
    }
}
