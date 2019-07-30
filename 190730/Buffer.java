public class Buffer{

    public static void main(String[] args){

        StringBuffer sBuffer = new StringBuffer("教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);

        sBuffer.reverse();
        System.out.println(sBuffer);

        sBuffer.delete(0,4);
        System.out.println(sBuffer);

    }

}