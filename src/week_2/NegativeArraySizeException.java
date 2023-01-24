package week_2;

public class NegativeArraySizeException {

    public static void main(String[] args) {

        try{
            int[] array = new int[-5];
        }catch (Exception e ){
            e.printStackTrace();
            //handle the exception
        }
        System.out.println("Continue execution...");

        /*
        In the above example, the lines that throw the NegativeArraySizeException are placed within a try-catch block.
        The NegativeArraySizeException is caught in the catch clause and its stack trace is printed to the console.
        Any code that comes after the try-catch block continues its execution normally.
         */

    }
}
