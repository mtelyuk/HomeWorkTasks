package week_2;

public class PreventInstanceVariableFromChanging {
    public static void main(String[] args) {

       final int ageLimit = 21; // this can't be changed. Using final you can define variables whose values never change

        System.out.println(ageLimit);

       // ageLimit = 22;

        int age = 25;

        System.out.println(age);
         age = 35;

        System.out.println(age);





    }
}
