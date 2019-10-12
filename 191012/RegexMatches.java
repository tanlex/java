import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches{

/*
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";
*/
/*
    private static final String REGEX = "foo";
    private static final String INPUT = "fooooooooooooooooo";
    private static final String INPUT2 = "ooooofoooooooooooo";
    private static Pattern pattern;
    private static Matcher matcher;
    private static Matcher matcher2;
    */
    /*
    private static String REGEX = "dog";
    private static String INPUT = "The dog says meow. " + "All dogs say meow.";
    private static String REPLACE = "cat";
    */
    private static String REGEX = "a*b";
    private static String INPUT = "aabfooaabfooabfoobkkk";
    private static String REPLACE = "-";


    public static void main(String args[]){
    /*
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);

        int count = 0;
        while(m.find()){
            count++;
            System.out.println("Match number " + count);
            System.out.println("start(): " + m.start());
            System.out.println("end(): " + m.end());
        }
    */
    /*
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);
        matcher2 = pattern.matcher(INPUT2);

        System.out.println("Current REGEX is:"+REGEX);
        System.out.println("Current INPUT is:"+INPUT);
        System.out.println("Current INPUT2 is:"+INPUT2);

        System.out.println("lookingAt():"+matcher.lookingAt());
        System.out.println("matches():"+matcher.matches());
        System.out.println("lookingAt():"+matcher2.lookingAt());
    */
    /*
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);
    */
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while(m.find()){
            m.appendReplacement(sb,REPLACE);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());




    }

}