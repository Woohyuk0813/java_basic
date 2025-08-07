package javabasic_02.day12.Test01;

public class Tv {
    private String color;
    private boolean power;
    private int channel;


    Tv(String color, boolean power, int channel) {
        this.color = color;
        this.power = power;
        this.channel = channel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
    public Tv() {
        color = "black";
        power = false;
        channel = 0;

    }

    public void power() {
        if(true){
            power = false;
        }else{
            power = true;
        }
    }

    public void channelUp() {
        channel += 1;
    }

    public void channelDown() {
        channel -= 1;
    }

    public void print() {
        System.out.print("color : " + color + "\tpower : " + power + "\tchannel : " + channel + "\n");
    }


}
