public class Operators{
    public static void main(String[] args){
        /*
        int a = 10;
        int b = 20;
        System.out.println("a==b = " + (a==b));
        System.out.println("a!=b = " + (a!=b));
        System.out.println("a>b = " + (a>b));
        System.out.println("a<b = " + (a<b));
        System.out.println("b>=a = " + (b>=a));
        System.out.println("b<=a = " + (b<=a));
        */
        /*
        Test test = new Test();
        System.out.println(test);

        int a = 60;
        System.out.println("a = ");
        test.binaryToDecimal(a);
        int b = 13;
        System.out.println("b = ");
        test.binaryToDecimal(b);
        int c = 0;
        c = a & b;
        System.out.println("a & b = " + c);
        test.binaryToDecimal(c);
        c = a | b;
        System.out.println("a | b = " + c);
        test.binaryToDecimal(c);
        c = a ^ b;
        System.out.println("a ^ b = " + c);
        test.binaryToDecimal(c);
        c = ~a;
        System.out.println("~a = " + c);
        test.binaryToDecimal(c);
        c = a << 2;
        System.out.println("a << 2 = " + c);
        test.binaryToDecimal(c);
        c = a >> 2;
        System.out.println("a >> 2 = " + c);
        test.binaryToDecimal(c);
        c = a >>> 2;
        System.out.println("a >>> 2 = " + c);
        test.binaryToDecimal(c);
        */
        /*
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!(a && b) = " + !(a && b));
        */

        //instanceof
        String name = "James";
        boolean result = name instanceof String;
        System.out.println(result);

    }

    public void binaryToDecimal(int n){
        String result = Integer.toBinaryString(n);
        System.out.println(result);
    }


}