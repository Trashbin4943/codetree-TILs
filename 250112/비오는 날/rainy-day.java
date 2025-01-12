import java.util.Scanner;

class Dailyweather {
    String date;
    String weekday;
    String weather;

    public Dailyweather (String date, String weekday, String weather){
        this.date=date;
        this.weekday=weekday;
        this.weather=weather;
    }
};

public class Main {
    public static void main(String[] args) {
        Dailyweather a = new Dailyweather("9999-99-99","","");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++) {
            String date = sc.next();
            String weekday = sc.next();
            String weather = sc.next();
            Dailyweather d = new Dailyweather(date, weekday, weather);

            if (weather.equals("Rain")) {
                if (a.date.compareTo(d.date)>0) {
                    a=d;
                }
            }
        }

        System.out.print(a.date + " " + a.weekday+" "+a.weather);
    }
}