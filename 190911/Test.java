public class Test{
    public static void main(String[] args){
    /*
        int size = 10;
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;

        double total = 0;
        for(int i=0;i<size;i++){
            total += myList[i];
        }
        System.out.println("总和为: "+total);
    */
    /*
        double[] mylist = {1.9, 2.9, 3.4, 3.5};
        for(int i=0;i<mylist.length;i++){
            System.out.println(mylist[i]+" ");
        }

        double total = 0;
        for(int i=0;i<mylist.length;i++){
            total += mylist[i];
        }
        System.out.println("Total is "+total);

        double max = mylist[0];
        for(int i=0;i<mylist.length;i++){
            if(mylist[i] > max) max = mylist[i];
        }
        System.out.println(max);
    */
    /*
        //for-each
        double[] mylist = {1.9, 2.9, 3.4, 3.5};
        for(double x : mylist){
            System.out.println(x);
        }
    */
    /*
        int[] arr = {1,2,4,5};
        printArr(arr);
    */

        int[] arr = returnArr();
        for(int x : arr){
            System.out.println(x);
        }


    }

    public static void printArr(int[] arr){
        for(int a : arr){
            System.out.println(a);
        }
    }

    public static int[] returnArr(){
        int[] arr = {2,1,4,88};
        return arr;
    }
}