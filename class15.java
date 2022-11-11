package Mypackage;

public class class15 {
    public static int sum(int ...numbers){


        int sum=0;
        for (int j=0; j<numbers.length; j++){
            sum=sum+numbers[j];
        }return sum;
    }

    public static void main(String[] args) {

        class15 cw=new class15();

        System.out.println( cw.sum(10,20,30,40,50));


    }
}