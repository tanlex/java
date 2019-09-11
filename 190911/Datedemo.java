import java.util.Date;
import java.util.*;
import java.text.*;

public class Datedemo {
    public static void main(String[] args){
    /*
        Date date = new Date();
        System.out.println(date.toString());
    */
    /*
        Date dnow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间为："+ft.format(dnow));
    */
    /*
        Date date = new Date();
        System.out.printf("全部日期和时间信息：%tc%n",date);
        System.out.printf("年-月-日格式：%tF%n",date);
        System.out.printf("月/日/年格式：%tD%n",date);
        System.out.printf("HH:MM:SS PM格式（12小时制）：%tr%n",date);
        System.out.printf("HH:MM:SS(24小时制)：%tT%n",date);
        System.out.printf("HH:MM格式（24小时制）：%tR",date);
    */

        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String input = args.length == 0 ? "1919-11-11" : args[0];
        System.out.print(input+"Parses as ");
        Date t;
        try{
            t = ft.parse(input);
            System.out.println(t);
        }catch(ParseException e){
            System.out.println("Unparseable using"+ft);
        }



    }
}









