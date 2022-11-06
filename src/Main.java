import java.util.Scanner;
import java.time.*;

public class Main {
    public static void main(String[] args) {
          Scanner scann = new Scanner(System.in);
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

        System.out.print("day: ");
        int day = scann.nextByte();
        System.out.print("month: ");
        int month = scann.nextByte();
        System.out.print("year: ");
        int year = scann.nextShort();
        LocalDate userDate = LocalDate.of(year, month, day);
        System.out.println("Your date is : " + userDate + " This day is a " +
                (userDate.getDayOfWeek().getValue() == 6 || userDate.getDayOfWeek().getValue() == 7 ?
                " free day. " : " working day.") + "because in this date, the day was " + userDate.getDayOfWeek() + "\n\n");


        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$LOOPS EXERCISES$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");

        System.out.println("1.List numbers from -20 to 20 using a loop. Then write out:");
        for (int i = -20 ; i < 21 ; i++){
            System.out.print(i+ " ");
        }
        System.out.print("\nFirst 6 numbers: ");
        for (int i = -20; i < -14 ; i++){
            System.out.print( i + " ");
        }
        System.out.print("\nAll even number: ");
        for (int i = -20; i < 21 ; i++){
            System.out.print(i % 2 != 0 ? i + " " : "");
        }
        System.out.print("\nAll number except number 5: ");
        for (int i = -20; i < 21 ; i++){
            System.out.print(i != 5 ? i + " " : "");
        }
        System.out.print("\nAll number up to and including 7: ");
        for (int i = -20; i < 8 ; i++){
            System.out.print(i + " ");
        }
        System.out.print("\nAll number divisible by 3: ");
        int sum = 0;
        for (int i = -20; i < 21 ; i++){
            sum += i;
            System.out.print(i % 3 == 0 && i != 0 ? i + " " : "" );
        }
        System.out.print("\nSum of all number: " + sum);
        int sum2 = 0;
        for (int i = 4 ; i < 21 ; i++){
            sum2 += i;
        }
        System.out.println("\nSum of all numbers greater or equal with 4: " + sum2);
        System.out.println("\nAll numbers and their powers:");
        for (int i = -20 ; i < 21 ; i++){
            System.out.println(i +" "+ Math.pow(i,2));
        }
        System.out.println("\nAll numbers and their modulo 10:");
        for (int i = -20 ; i < 21 ; i++){
            System.out.println(i +" "+ i % 10);
        }
        System.out.println("2.Using a class that offers operations on date and time, get the current time " +
                "(hour, minute, and second) and write these values using the characters \\*, " +
                "whose number equals the given value. To make it difficult," +
                " one line can contain up to 10 * characters.");
        LocalTime timeNow = LocalTime.now().withNano(0);
        System.out.println("Current time: " + timeNow);
        System.out.print("\nHours:");
        for (int i = 0 ; i < timeNow.getHour() ; i++){
            if(i% 10 == 0) System.out.println();
            System.out.print("*");
        }
        System.out.print("\n\nMinute:");
        for (int i = 0 ; i < timeNow.getMinute() ; i++){
            if(i% 10 == 0) System.out.println();
            System.out.print("*");
        }
        System.out.print("\n\nSecond:");
        for (int i = 0 ; i < timeNow.getSecond() ; i++){
            if(i% 10 == 0) System.out.println();
            System.out.print("*");
        }

        System.out.println("3.Download a date or input from user and create a calendar page.");
        System.out.print("day: ");
        int day2 = scann.nextByte();
        System.out.print("month: ");
        int month2 = scann.nextByte();
        System.out.print("year: ");
        int year2 = scann.nextShort();
        LocalDate userDate2 = LocalDate.of(year2, month2, day2);
        int today2 = userDate2.getDayOfMonth();
        int firstDayOFTheMoon = userDate2.withDayOfMonth(1).getDayOfWeek().getValue();
        int lastDayOfTheMoon = userDate2.getMonth().length(userDate2.isLeapYear());
        System.out.println(lastDayOfTheMoon);
        System.out.println("Mo Tu We Th Fr Sa Su");
        int counter = 0;
        for(int day3 = 2 - firstDayOFTheMoon; day3 <= lastDayOfTheMoon ; day3 ++){
            counter ++;
            if( day3 < 1 ){
                System.out.print("   ");
            }else if(day3 < 10){
                System.out.print( " " + day3 +" ");
            }else System.out.print(day3 +" " );
            if (counter == 7) {
                counter = 0;
                System.out.println();
            }
        }
        System.out.println("###############################SIMPLE CLASS AND OBJECT EXERCISES###########################\n");
        System.out.println("1.Create a Person class\n" +

                "\n" +
                "add fields: name, surname, gender, age, pesel\n" +
                "\n" +
                "add a method to check whether a given person has reached retirement age (e.g. hasReachedRetirementAge()); for women, let's assume the retirement age is >=60 years, and for men >=65 years\n" +
                "\n" +
                "add a method that returns the age difference from one person to another\n" +
                "\n" +
                "let the method take a parameter of type Person\n" +
                "\n" +
                "it should not return negative values as the difference of years\n" +
                "\n" +
                "add a method that calculates and returns how many years are left before retirement");

        Person personOne = new Person("Claudiu","Cojocar", Gender.MALE,26,1951130330201L);
        Person personTwo = new Person("Emilia","Barba",Gender.FEMALE,24,2971110330156L);
        personOne.yearsBeforeRetirement();
        personOne.hasReachedRetirementAge();
        personTwo.yearsBeforeRetirement();
        personTwo.hasReachedRetirementAge();
        System.out.println(personTwo.differenceOfYears(personOne)+"\n");
    }
}