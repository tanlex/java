public class Test{

    public static void main(String[] args){
        /*
        int x = 10;
        while(x < 20){
           System.out.println("value of x:" + x);
           x++;
           System.out.println("\n");
        }

        int y = 10;
        do{
            System.out.print("value of y:" + y);
            y++;
            System.out.print("\n");
        }while(y < 20);

        for(int i=10;i<20;i++){
            System.out.print("value of i:" + i);
            System.out.print("\n");
        }
        */

        int [] numbers = {10,20,30,40,50};
        for(int x : numbers){
            System.out.print(x);
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names = {"James","Larry","Ton","Lacy","King","Tolis","Tely"};
        for(String name : names){

            if(name == "Ton"){
                continue;
            }
            if(name == "Tolis"){
                break;
            }
            System.out.print(name);
            System.out.print(",");
        }
        System.out.print("\n");



    }
}