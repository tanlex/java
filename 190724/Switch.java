public class Switch{

    public static void main(String args[]){

        int x = 10;
        int y = 0;
        switch(x){
            case 10 :
                y = 10 ;break;
            case 20 :
                y = 20 ;break;
            default:
                y = 30;break;
        }
        System.out.print(y);

    }

}