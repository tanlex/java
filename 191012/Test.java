import java.util.regex.*;

public class Test{

    public static void main(String args[]){
/*
        String content = "I am noob " + "from runoob.com.";
        String pattern = ".*runoob.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了‘runoob’子字符串？ " + isMatch);
*/

        String line = "This order was placed for GT3000! OK?";
        String pattern = "(\\d+)(.*)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        if(m.find()){
            System.out.println("Found value:"+ m.group(0));
            System.out.println("Found value:"+ m.group(1));
            System.out.println("Found value:"+ m.group(2));
        }else{
            System.out.println("NO MATCH");
        }





    }


}