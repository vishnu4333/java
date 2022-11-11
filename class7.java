package Mypackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class7 {
    public static void main(String[] args) throws IOException {
        int planet;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your planet");
        planet=Integer.parseInt(br.readLine());
        switch (planet){
            case  1:
                System.out.println("mercury");
                break;
            case  2:
                System.out.println("venus");
                break;
            case  3:
                System.out.println("earth");
                break;
            case  4:
                System.out.println("mars");
                break;
            case 5:
                System.out.println("saturn");
                break;
            default:
                System.out.println("no planet entered");
        }


    }
}

