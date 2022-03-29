import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


//
public class Time {
    int hours;
    int minutes;
    int seconds;


    public Time(Integer hours, Integer minutes, Integer seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
        if (hours > -1 && hours < 24) {
            this.hours = hours;
        } else {

        }


    }
    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }
}
class StopWatch {

        private long startTime = 0;
        private long EndTime = 0;
        private boolean running = false;


    public  StopWatch(){




    }
        public static void main(String[] args) {
            System.out.println("Kies uit de selectie : World Clock, Alarm , Stopwatch");
            Scanner input = new Scanner(System.in);
            String write = input.nextLine();
            System.out.println("u heeft gekozen voor" + write);
            if (write == "stopwatch"){



            }
            else if (write == "world clock"){



            }
            else {



            }
        }


    }


