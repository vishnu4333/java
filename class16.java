package Mypackage;
public class class16{
    int id; String surname;
    public void met(){
        System.out.println(id);
        System.out.println(surname);
    }
    public void  met1(){
        int x=id+2;
        System.out.println(x);
        System.out.println(surname.length());
    }


    public static void main(String[] args) {
        class16 su = new class16();
        su.id = 345;
        su.surname = "nandy";
        su.met();
        su.met1();
    }
}

