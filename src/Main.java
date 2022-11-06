import java.time.temporal.WeekFields;
import java.util.Scanner;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercises ");
        //1.
        System.out.println("1.Write a program to display Hello, <Your name> instead of Hello, World! on the screen");
        System.out.println("Hello, Claudiu!");
        //2.
        System.out.println("2.Write a program that displays your business card like the one below:");
        System.out.println("+--------------------------+ \n" +
                           "|                          |\n" +
                           "|      Claudiu Cojocar     |\n" +
                           "|  Teodor Mihali 4, ap. 76 |\n" +
                           "|    Cluj-Napoca, Romania  |\n" +
                           "|                          |\n" +
                           "+--------------------------+");
        //3.
        System.out.println("\n3.Create several variables of primitive types based on things that surround you. Display the value.");
        byte cigarettesOnPacket = 20;
        short visibleStarOnSky = 16934;
        int myAccountValue = 1563214;
        long yearsBeforeDeath = 52142142131212300L;
        System.out.println("\ncigarettes :" + cigarettesOnPacket);
        System.out.println("stars on the sky :" + visibleStarOnSky);
        System.out.println("my money: "+ myAccountValue);
        System.out.println("years before I die : " + yearsBeforeDeath);

        //4.
        System.out.println("\n4.Try to assign a value out of range for the variable. See the result and try using casting operator.");
        //cigarettesOnPacket = 220; error
        cigarettesOnPacket = (byte) 22.6;
        System.out.println("\ncigarettes :" + cigarettesOnPacket);;

        //Use wrapper classes and try to create object-oriented
        // equivalents for all variables (of primitive types) from the previous exercise.
        Byte cigarettesValue = cigarettesOnPacket;
        Short starsValue = visibleStarOnSky;
        Integer accountValue = myAccountValue;
        Long yearsValue = yearsBeforeDeath;
        String myName = "Claudiu";
        System.out.println("cigarettes value: " + cigarettesValue.byteValue());
        System.out.println("years value : " + Long.valueOf(yearsValue));

        String constantString = "Baeldung";
        String newString = new String("Baeldung");
        System.out.println(constantString.equals(newString));


        System.out.println("\n%%%%%%%%%%%GEOMETRY EXERCISES%%%%%%%%%%%%%%%%%%%\n");

        System.out.println("1.Declare two variables corresponding to the sides of a rectangle and count its area and circumference");
          Scanner scann = new Scanner(System.in);
        System.out.print("length= ");
        int length = scann.nextInt();
        System.out.print("weight= ");
        int weight = scann.nextInt();
        System.out.println("Area = " + (length*weight));
        System.out.println("Circumference = " + (2*(length+weight))+ "\n\n");


        System.out.println("2.Declare two variables corresponding to the sides of a right-angled triangle and calculate its area.");
        System.out.print("firstSide= ");
        int firstSide = scann.nextInt();
        System.out.print("secondSide = ");
        int secondSide = scann.nextInt();
        System.out.println("Area= " + (firstSide*secondSide/2));
        System.out.println("BONUS!!! hypotenuse= " + (Math.sqrt(Math.pow(firstSide, 2)+ Math.pow(secondSide ,2))));
        System.out.println("testing hypotenuse with Math.hypo : (" + Math.hypot(firstSide,secondSide) + ")\n\n");

        System.out.println("3.Declare the variable corresponding to the diameter of a circle and count its area and circumference.");
        System.out.print("diameter= ");
        int diameter = scann.nextInt();
        System.out.println("Area= " + (Math.PI * Math.pow(diameter/2.0,2)));
        System.out.println("Circumferences= " + (Math.PI  * diameter) + "\n\n");

        System.out.println("4.Declare three variables corresponding to the sides of a triangle and check whether it is right-angled.");
        System.out.print("A= ");
        int a = scann.nextInt();
        System.out.print("B= ");
        int b= scann.nextInt();
        System.out.print("C= ");
        int c= scann.nextInt();
        System.out.print("Triangle with a= " + a + ", b= " + b + " and c= " + c +
                (c == Math.hypot(a,b) ? " its a right-angle.\n\n" : " it is not a right-angle.\n\n"));

        System.out.println("5.Declare a variable corresponding to age; use a ternary operator to display: adult or underage.");
        System.out.print("Age= ");
        int age = scann.nextInt();
        System.out.println(age < 18 ? "No alcohol for you" : "Take your beer. Its on the house!");

        System.out.println("\n###############CONDITIONAL STATEMENTS##################\n");

        System.out.println("1.Simulate a roll of dice. Display the result (even or odd). If the result is 6, write additionally the word WON\n");
        int result;
        do{
            result = (int) (Math.random() * 6 + 1);
            System.out.print(result % 2 == 0 ? result + " is odd." : result + " is even.");
            System.out.println(result == 6 ? "WON!!!\n" : "\n");
            System.out.println("Roll the dice again?   (1-yes ///0-exit)");
            result = scann.nextInt();
        }while(result !=0);


        System.out.println("2.Using a class that offers date and time operations, download:");
        System.out.println("Current time: " + LocalTime.now());
        LocalDate todayDate = LocalDate.now();
        DayOfWeek today = todayDate.getDayOfWeek();
        System.out.println("Number of the day of the week: " + today.getValue());
        System.out.println("Number of the day of the month: " + todayDate.getDayOfMonth());
        Month monthToday = todayDate.getMonth();
        System.out.println("Number of the month: " + monthToday.getValue());

        System.out.println("\n");

        System.out.print("day: ");
        int day = scann.nextByte();
        System.out.print("month: ");
        int month = scann.nextByte();
        System.out.print("year: ");
        int year = scann.nextShort();
        LocalDate userDate = LocalDate.of(year, month, day);
        System.out.println("Your date is : " + userDate + " This day is a " +
                (userDate.getDayOfWeek().getValue() == 6 || userDate.getDayOfWeek().getValue() == 7 ?
                " free day. " : " working day.") + "because in this date, the day was " + userDate.getDayOfWeek());

    }
}