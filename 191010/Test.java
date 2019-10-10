import java.util.Date;
import java.text.*;

public class Test{
    public static void main(String args[]){
/*
         Date date = new Date();
         //c的使用
         System.out.printf("全部日期和时间信息：%tc%n",date);
         //f的使用
         System.out.printf("年-月-日格式：%tF%n",date);
         //d的使用
         System.out.printf("月/日/年格式：%tD%n",date);
         //r的使用
         System.out.printf("HH:MM:SS PM格式（12小时制）：%tr%n",date);
         //t的使用
         System.out.printf("HH:MM:SS格式（23小时制）：%tT%n",date);
         //R的使用
         System.out.printf("HH:MM格式（24小时制）：%tR",date);
*/
         SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

         String input = args.length == 0 ? "1818-11-11" : args[0];
         System.out.print(input + " Parses as ");
         Date t;
         try {
            t = ft.parse(input);
            System.out.println(t);
         } catch(ParseException e) {
            System.out.println("Unparseable using " + ft);
         }





    }

}
