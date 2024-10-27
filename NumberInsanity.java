import java.util.Scanner;


public class NumberInsanity {


   public NumberInsanity() { }


   public void go() {
       Scanner myScanner = new Scanner(System.in);
       System.out.print("Enter a positive integer: ");
       int num = myScanner.nextInt();
       String msg = result(num); // call helper method and store result 
       System.out.println(msg);
   }


   // helper method that returns string containing message to be printed
   private String result(int num) {
    String message = "";

    if (num == 0 || num <= 0){
    message = "That's not positive";
}

    else if (num % 2 != 0){
        if (num % 5 == 0 && num % 7 == 0){
            message = "Divisible by both 5 and 7!";
        }
        else if (num % 5 == 0){
            message = "Divisible by 5!";
        }
        else if (num % 7 == 0){
            message = "Divisible by 7!";
        }
        else{
            message = "Not divisible by 5 or 7!";
        }
}

    else if (num % 2 == 0){
        if (num < 50){
            message = "Small even number!";
        }
        if (num >= 50){
            message = "Medium even number!";
        }
        if (num >= 100){
            message = "Big even number!";
        }
    
}

return message;

       // complete the code for this method;
       // make no other changes to the program
   }
}
