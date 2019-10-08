import java.util.Date;
import java.text.*;

public class Test{
    public static void main(String args[]){
        Date date = new Date();
        System.out.println(date.toString());

        //格式化日期
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间为："+ ft.format(date));

    }
}

