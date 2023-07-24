import java.util.Objects;

public class Time {
    private int hours;
    private int minutes;

    public Time() {
        this.hours=0;
        this.minutes=0;
    }

    public Time(int min) {
        if (min<0){
            min *= -1;
        }

        int temp1 = min/60;
        int temp2 = min%60;

        if (temp1>=24){
            temp1 %= 24;
        }

        this.hours = temp1;
        this.minutes = temp2;
    }

    public Time(int hr, int min){
        if (hr<0){
            hr *= -1;
        }
        if (min<0){
            min *= -1;
        }
        int temp1 = min/60;
        int temp2 = min%60;
        int newhr = hr + temp1;

        if (newhr>=24){
            newhr %= 24;
        }

        this.hours = newhr;
        this.minutes = temp2;
    }

    public int toMinutes(){
        return ((this.hours*60) + this.minutes);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 24){
            hours %= 24;
        }
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.hours += minutes/60;
        this.minutes = minutes%60;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hours == time.hours && minutes == time.minutes;
    }

    public int compareTo(Time anotherObj){
        int hourDifference = this.hours - anotherObj.getHours();
        int minuteDifference = this.minutes - anotherObj.getMinutes();

        int hourDifferenceInMin = hourDifference * 60;

        return hourDifferenceInMin + minuteDifference;


    }

    @Override
    public String toString() {

        String printHours = "";
        String printMinutes = "";

        if (this.hours<10){
            printHours = "0" + this.hours;
        }
        else{
            printHours = ""+this.hours;
        }

        if (this.minutes<10){
            printMinutes = "0" + this.minutes;
        }
        else{
            printMinutes = ""+this.minutes;
        }


        return printHours + ":" + printMinutes;
    }

    public int diff(Time anotherObj){

        int minutesOfAnotherObj;
        int minutesOfCurrentObj;

        if (this.hours>anotherObj.getHours()){
            int diffHour = 24 - (this.hours+1);
            int diffMinutes = 60 - this.minutes;
            minutesOfAnotherObj = anotherObj.toMinutes();
            return (diffHour*60) + diffMinutes + minutesOfAnotherObj;
        }
        else {
            minutesOfAnotherObj = anotherObj.toMinutes();
            minutesOfCurrentObj = this.toMinutes();
            return minutesOfAnotherObj - minutesOfCurrentObj;
        }



    }

}
