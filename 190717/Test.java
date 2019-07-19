public class Test{

    public static final String DEPARTMENT = "部门";

    public static void main(String[] args){
        /*
        int i =128;
        byte b = (byte)i;

        System.out.println(i);
        System.out.println(b);
        */
        /*
        char c1 = 'a';
        int i1 = c1;
        System.out.println("char自动类型转换为int后的值等于"+i1);
        char c2 = 'A';
        int i2 = c2+1;
        System.out.println("char类型和int计算后的值等于"+i2);

        int i3 = 123;
        byte b = (byte)i3;
        System.out.println("int强制类型转换为byte后的值等于"+b);

        Test test = new Test();
        System.out.println(test.DEPARTMENT);
        */

        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a+b=" + (a+b));
        System.out.println("a-b=" + (a-b));
        System.out.println("a*b=" + (a*b));
        System.out.println("b/a=" + (b/a));
        System.out.println("b%a=" + (b%a));
        System.out.println("c%a=" + (c%a));
        System.out.println("a++=" + (a++));
        System.out.println("a--=" + (a--));
        System.out.println("d++=" + (d++));
        System.out.println("++d=" + (++d));

    }

}

