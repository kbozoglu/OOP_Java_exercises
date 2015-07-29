package com.kb.oop.exercises1;

/**
 * Created by kbozoglu on 23.07.2015.
 */
public class MyTime {

    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second){
        if(hour > 24 || minute > 59 || second > 59){
            throw new IllegalArgumentException("wrong hour or minute or second");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public MyTime nextSecond(){
        if(second < 59){
            second += 1;
        }
        else{
            second = 0;
            nextMinute();
        }
        return this;
    }

    public MyTime nextMinute(){
        if(minute < 59){
            minute += 1;
        }
        else{
            minute = 0;
            nextHour();
        }
        return this;
    }

    public MyTime nextHour(){
        if(hour < 23){
            hour += 1;
        }
        else{
            hour = 0;
        }
        return this;
    }
//TODO: previous hour, minute, second

    public String toString(){
        return twoDigit(hour) + ":" + twoDigit(minute) + ":" + twoDigit(second);
    }

    private String twoDigit(int time){
        if(time < 10){
            return "0" + time;
        }
        else{
            return "" + time;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
