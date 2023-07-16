public class Main {
    public static void main(String[] args) {
        //Algorithm to find the largest of 3 given numbers//
        int number1=2;
        int number2=1;
        int number3=5;
        if (number1>number2&&number1>number3){
            System.out.println("Largest number="+number1);
            System.out.println("Congratulations...");
        }
        else if (number2>number3&&number2>number1){
            System.out.println("Largest number="+number2);
            System.out.println("Congratulations...");
    }
        else {
            System.out.println("Largest number="+number3);
            System.out.println("Congratulations...");
        }
}}