package week_2;

public class UnreachableStatement {
    public static void main(String[] args) {

        /*
        System.out.println("My code will run");

        return;

        // ironically, this code will never run
        // here’s an unreachable code message a developer gets.
        System.out.println("My code will run");

         */

        try {
            throw new Exception("Custom Exception");
            // Unreachable code
           // System.out.println("Hello");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }

        for (int i = 0; i < 5; i++)
        {
            continue;
           // System.out.println("Hello");
        }


            for(int i=1;i<5;i++)
            {
                System.out.println(i);
                break;
              //  System.out.println("Code after break");
            }

    }
}
