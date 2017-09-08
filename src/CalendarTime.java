import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTime {
    public static void main(String []args){
        //构造一个日历对象
        LocalDate date = LocalDate.now();
        //获取当前月和日

        int month = date.getMonthValue();

        int today = date.getDayOfMonth();

        date = date.minusDays(today-1);//设置为这个月的第一天
        DayOfWeek dayOfWeek = date.getDayOfWeek();//得到这一天是星期几

        int valve = dayOfWeek.getValue();//
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        for (int i = 1; i< valve;i++)
            System.out.println("    ");
        while (date.getMonthValue() == month){
            //date遍历日历中的每一天
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth() == today)

            System.out.print("*");
            else
                System.out.print("");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() ==1)System.out.println();


        }
        if (date.getDayOfWeek().getValue() != 1)System.out.println();



    }
}
