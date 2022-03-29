import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


//
public class Time {
    int time;


    public class StopWatch {

        private long startTime = 0;
        private long EndTime = 0;
        private boolean running = false;


        public static void main(String[] args) {
            System.out.println("Kies uit de selectie : World Clock, Alarm , Stopwatch");
            Scanner input = new Scanner(System.in);
            String write = input.nextLine();
            System.out.println("u heeft gekozen voor" + write);
            if (write == "stopwatch"){
                StopWatch watch = new StopWatch();


            }
            else if (write == "world clock"){



            }
            else {



            }
        }


    }
}
