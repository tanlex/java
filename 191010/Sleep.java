import java.util.*;

public class Sleep{
    public static void main(String args[]){
    /*
        try {
            System.out.println(new Date() + "\n");
            Thread.sleep(1000*3);
            System.out.println(new Date() + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
*/
/*
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");
            Thread.sleep(5*60*10);
            System.out.println(new Date() + "\n");
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Difference is :"+ diff);
        } catch(Exception e) {
            System.out.println("Got an exception!");
        }
*/
/*
        String months[] = {
            "Jan","Feb","Mar","Apr",
            "May","Jun","Jul","Aug",
            "Sep","Oct","Nov","Dec"
        };

        int year;

        //初始化Gregorian
        GregorianCalendar gcalendar = new GregorianCalendar();

        System.out.print("Date: ");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gcalendar.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));

        //测试当前年份是否为闰年
        if(gcalendar.isLeapYear(year)) {
            System.out.println("当前年份是闰年");
        }else{
            System.out.println("当前年份不是闰年");
        }
*/

        Calendar cl = Calendar.getInstance();
        cl.set(2017,1,1);
        System.out.println(cl.get(Calendar.YEAR) + "-" + cl.get(Calendar.MONTH) + "-" + cl.get(Calendar.DATE));
        cl.set(2017,1,0);
        System.out.println(cl.get(Calendar.YEAR) + "-" + cl.get(Calendar.MONTH) + "-" + cl.get(Calendar.DATE));




    }


}