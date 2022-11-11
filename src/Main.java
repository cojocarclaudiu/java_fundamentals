import java.util.Scanner;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        //i use this if to skip finished exercises
        if (false) {
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
            System.out.println("my money: " + myAccountValue);
            System.out.println("years before I die : " + yearsBeforeDeath);

            //4.
            System.out.println("\n4.Try to assign a value out of range for the variable. See the result and try using casting operator.");
            //cigarettesOnPacket = 220; error
            cigarettesOnPacket = (byte) 22.6;
            System.out.println("\ncigarettes :" + cigarettesOnPacket);
            ;

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
            System.out.println("Area = " + (length * weight));
            System.out.println("Circumference = " + (2 * (length + weight)) + "\n\n");


            System.out.println("2.Declare two variables corresponding to the sides of a right-angled triangle and calculate its area.");
            System.out.print("firstSide= ");
            int firstSide = scann.nextInt();
            System.out.print("secondSide = ");
            int secondSide = scann.nextInt();
            System.out.println("Area= " + (firstSide * secondSide / 2));
            System.out.println("BONUS!!! hypotenuse= " + (Math.sqrt(Math.pow(firstSide, 2) + Math.pow(secondSide, 2))));
            System.out.println("testing hypotenuse with Math.hypo : (" + Math.hypot(firstSide, secondSide) + ")\n\n");

            System.out.println("3.Declare the variable corresponding to the diameter of a circle and count its area and circumference.");
            System.out.print("diameter= ");
            int diameter = scann.nextInt();
            System.out.println("Area= " + (Math.PI * Math.pow(diameter / 2.0, 2)));
            System.out.println("Circumferences= " + (Math.PI * diameter) + "\n\n");

            System.out.println("4.Declare three variables corresponding to the sides of a triangle and check whether it is right-angled.");
            System.out.print("A= ");
            int a = scann.nextInt();
            System.out.print("B= ");
            int b = scann.nextInt();
            System.out.print("C= ");
            int c = scann.nextInt();
            System.out.print("Triangle with a= " + a + ", b= " + b + " and c= " + c +
                    (c == Math.hypot(a, b) ? " its a right-angle.\n\n" : " it is not a right-angle.\n\n"));

            System.out.println("5.Declare a variable corresponding to age; use a ternary operator to display: adult or underage.");
            System.out.print("Age= ");
            int age = scann.nextInt();
            System.out.println(age < 18 ? "No alcohol for you" : "Take your beer. Its on the house!");

            System.out.println("\n###############CONDITIONAL STATEMENTS##################\n");

            System.out.println("1.Simulate a roll of dice. Display the result (even or odd). If the result is 6, write additionally the word WON\n");
            int result;
            do {
                result = (int) (Math.random() * 6 + 1);
                System.out.print(result % 2 == 0 ? result + " is odd." : result + " is even.");
                System.out.println(result == 6 ? "WON!!!\n" : "\n");
                System.out.println("Roll the dice again?   (1-yes ///0-exit)");
                result = scann.nextInt();
            } while (result != 0);


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
            for (int i = -20; i < 21; i++) {
                System.out.print(i + " ");
            }
            System.out.print("\nFirst 6 numbers: ");
            for (int i = -20; i < -14; i++) {
                System.out.print(i + " ");
            }
            System.out.print("\nAll even number: ");
            for (int i = -20; i < 21; i++) {
                System.out.print(i % 2 != 0 ? i + " " : "");
            }
            System.out.print("\nAll number except number 5: ");
            for (int i = -20; i < 21; i++) {
                System.out.print(i != 5 ? i + " " : "");
            }
            System.out.print("\nAll number up to and including 7: ");
            for (int i = -20; i < 8; i++) {
                System.out.print(i + " ");
            }
            System.out.print("\nAll number divisible by 3: ");
            int sum = 0;
            for (int i = -20; i < 21; i++) {
                sum += i;
                System.out.print(i % 3 == 0 && i != 0 ? i + " " : "");
            }
            System.out.print("\nSum of all number: " + sum);
            int sum2 = 0;
            for (int i = 4; i < 21; i++) {
                sum2 += i;
            }
            System.out.println("\nSum of all numbers greater or equal with 4: " + sum2);
            System.out.println("\nAll numbers and their powers:");
            for (int i = -20; i < 21; i++) {
                System.out.println(i + " " + Math.pow(i, 2));
            }
            System.out.println("\nAll numbers and their modulo 10:");
            for (int i = -20; i < 21; i++) {
                System.out.println(i + " " + i % 10);
            }
            System.out.println("2.Using a class that offers operations on date and time, get the current time " +
                    "(hour, minute, and second) and write these values using the characters \\*, " +
                    "whose number equals the given value. To make it difficult," +
                    " one line can contain up to 10 * characters.");
            LocalTime timeNow = LocalTime.now().withNano(0);
            System.out.println("Current time: " + timeNow);
            System.out.print("\nHours:");
            for (int i = 0; i < timeNow.getHour(); i++) {
                if (i % 10 == 0) System.out.println();
                System.out.print("*");
            }
            System.out.print("\n\nMinute:");
            for (int i = 0; i < timeNow.getMinute(); i++) {
                if (i % 10 == 0) System.out.println();
                System.out.print("*");
            }
            System.out.print("\n\nSecond:");
            for (int i = 0; i < timeNow.getSecond(); i++) {
                if (i % 10 == 0) System.out.println();
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
            for (int day3 = 2 - firstDayOFTheMoon; day3 <= lastDayOfTheMoon; day3++) {
                counter++;
                if (day3 < 1) {
                    System.out.print("   ");
                } else if (day3 < 10) {
                    System.out.print(" " + day3 + " ");
                } else System.out.print(day3 + " ");
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

            Person personOne = new Person("Claudiu", "Cojocar", Gender.MALE, 26, 1951130330201L);
            Person personTwo = new Person("Emilia", "Barba", Gender.FEMALE, 24, 2971110330156L);
            personOne.yearsBeforeRetirement();
            personOne.hasReachedRetirementAge();
            personTwo.yearsBeforeRetirement();
            personTwo.hasReachedRetirementAge();
            System.out.println(personTwo.differenceOfYears(personOne) + "\n");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Final assignments@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");

            System.out.println("1.Write a program that will display a multiplication table to one hundred.(use format)\n");
            for (int i = 1; i < 101; i++) {
                System.out.printf("%4s", i);
                if (i % 10 == 0) System.out.println();
            }

            System.out.println("\n2.Extend the multiplication table with horizontal and vertical lines and borders composed\n " +
                    "of characters |, - and +.\n");
            int matrix[][] = new int[5][2];
            int num = 1;
            //populating the array;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = num++;
                }
            }
            //display the array
            for (int numbers[] : matrix) {
                displayLine(matrix);
                for (int number : numbers) {
                    System.out.print(String.format("|%2s ", number));
                }
                System.out.print("|\n");
            }
            displayLine(matrix);

            System.out.println("3.Write a program that would draw the following patterns.\n");

            System.out.println("\nTriangle 1");
            for (int k = 1; k <= 8; k++) {
                for (int kk = 0; kk < k; kk++) {
                    System.out.print(" #");
                }
                System.out.println();
            }

            System.out.println("\nTriangle 2");
            for (int k = 8; k > 0; k--) {
                for (int kk = 0; kk < k; kk++) {
                    System.out.print(" #");
                }
                System.out.println();
            }

            System.out.println("\nTriangle 3");
            String count = "              ";
            for (int k = 1; k <= 8; k++) {
                System.out.print(count);
                for (int kk = 0; kk < k; kk++) {
                    System.out.print(" #");
                }
                if (count.length() > 1) {
                    count = count.substring(2);
                }
                System.out.println();
            }

            System.out.println("\nTriangle 4");
            String count2 = "";
            for (int k = 8; k >= 0; k--) {
                System.out.print(count2);
                for (int kk = 0; kk < k; kk++) {
                    System.out.print(" #");
                }
                if (count.length() < 8) {
                    count2 = count2.concat("  ");
                }
                System.out.println();
            }
            System.out.println("\nSquare ");
            for (int i = 0; i < 8; i++) {
                System.out.println(i == 0 || i == 7 ? " # # # # # # # #" : " #             #");
            }
            System.out.println("\nLetter S");
            String firstString = " ";
            for (int i = 0; i < 8; i++) {
                System.out.println(i == 0 || i == 7 ? " # # # # # # # #" : (firstString + "# "));
                firstString = firstString.concat("  ");
            }
            System.out.println("\nLetter Z");
            String lastString = "               ";
            for (int i = 0; i < 8; i++) {
                System.out.println(i == 0 || i == 7 ? " # # # # # # # #" : (lastString + "#"));
                if (lastString.length() > 1) lastString = lastString.substring(2);
            }
            System.out.println("4.Write a program multiplies the digits for a given number (as String) until the result is a one-digit number. \n");
            System.out.print("number= ");
            long numberToReduce = scann.nextLong();
            numberToReduce(numberToReduce);
            System.out.println("5.Write a program that checks who won a Tic-Tac-Toe game.\n");
            String userTicTacToe = "XOXXOOOXO";
            whoWinAtTicTacToe(userTicTacToe);
            System.out.println("7.A Car class is provided:" +
                    "Generate getter and setter methods for all fields; use key shortcuts Alt+Ins\n" +
                    "\n" +
                    "Test the Car class using the Main class" +
                    "Add a field to store the mileage (int mileage) to the Car program; set the default value to 0\n" +
                    "\n" +
                    "Add (generate) a getter type method for this field (getMileage())\n" +
                    "\n" +
                    "Add the drive(int mileage) method that increases the mileage\n" +
                    "\n" +
                    "Test the program operation\n" +
                    "\n" +
                    "Modify the drive(int mileage) method to set the used field to the appropriate value; " +
                    "if the mileage is positive, the used field should have value true\n" +
                    "\n" +
                    "Test the operation\n");

            Car audi = new Car();
            audi.setModel("R16");
            audi.setColor("Pearled-White");
            audi.setProductionYear(2022);
            audi.setUsed(false);

            System.out.println(audi.getModel() + " " + audi.getColor() + " " + audi.getProductionYear() + " " + audi.isUsed());
            audi.drive(100);
            System.out.println(audi.getModel() + " " + audi.getColor() + " " + audi.getProductionYear() + " " + audi.isUsed());

            System.out.println("8.The Calculator and CalculatorApplication classes are provided:" +
                    "Based on the add(int a, int b) method, implement the subsequent methods:\n" +
                    "\n" +
                    "int subtract(int a, int b) - subtraction: a - b\n" +
                    "\n" +
                    "int multiply(int a, int b) - multiplication: a * b\n" +
                    "\n" +
                    "double divide(int a, int b) - division: a / b\n" +
                    "\n" +
                    "boolean isPositive(int a) - checks whether the number is positive\n" +
                    "\n" +
                    "boolean isNegative(int a) - checks whether the number is negative\n" +
                    "\n" +
                    "boolean isOdd(int a) - checks whether the number is odd\n" +
                    "\n" +
                    "int min(int a, int b) - returns the smaller of the numbers\n" +
                    "\n" +
                    "int max(int a, int b) - returns the greater of the numbers\n" +
                    "\n" +
                    "double average(int a, int b) - returns the average for the numbers\n" +
                    "\n" +
                    "int power(int a, int x) - returns a^m^ (a to the power m)\n");

            Calculator calculator = new Calculator();
            System.out.print("a=");
            int firstNumberEx8 = scann.nextInt();
            System.out.print("b=");
            int secondNumberEx8 = scann.nextInt();
            int var = -1;
            do {
                System.out.println("1.+  2.-  3.*  4./  5.A+?   6.A-?   7.ODD?   8.MIN?   9.MAX?   10.AVR?   11.POW?   12.Change numbers?");
                var = scann.nextInt();
                switch (var) {
                    case 0:
                        var = 0;
                        break;
                    case 1:
                        System.out.println(calculator.add(firstNumberEx8, secondNumberEx8));
                        break;
                    case 2:
                        System.out.println(calculator.subtract(firstNumberEx8, secondNumberEx8));
                        break;
                    case 3:
                        System.out.println(calculator.multiply(firstNumberEx8, secondNumberEx8));
                        break;
                    case 4:
                        System.out.println(calculator.divide(firstNumberEx8, secondNumberEx8));
                        break;
                    case 5:
                        System.out.println(calculator.isPositive(firstNumberEx8));
                        break;
                    case 6:
                        System.out.println(calculator.isNegative(firstNumberEx8));
                        break;
                    case 7:
                        System.out.println(calculator.isOdd(firstNumberEx8));
                        break;
                    case 8:
                        System.out.println(calculator.min(firstNumberEx8, secondNumberEx8));
                        break;
                    case 9:
                        System.out.println(calculator.max(firstNumberEx8, secondNumberEx8));
                        break;
                    case 10:
                        System.out.println(calculator.average(firstNumberEx8, secondNumberEx8));
                        break;
                    case 11:
                        System.out.println(calculator.power(firstNumberEx8, secondNumberEx8));
                        break;
                    case 12:
                        System.out.print("a=");
                        firstNumberEx8 = scann.nextInt();
                        System.out.print("b=");
                        secondNumberEx8 = scann.nextInt();
                    default:
                        System.out.println("Your choice is invalid. Choose between 1 and 11, or 0 if you want to exit.");
                }
            } while (var != 0);


            System.out.println("9.Implement a stack to store Integer type numbers." +
                    "the constructor creates a count element array for storing Integer type elements\n" +
                    "\n" +
                    "the push() method throws the element onto the stack (to the first free position). If the stack is empty, a relevant message is displayed and nothing happens\n" +
                    "\n" +
                    "the pop() method deletes (returns and removes from the stack) the first element from the “top” of the stack. If the stack is empty, the method displays an appropriate message and nothing is done (null to be returned)\n" +
                    "\n" +
                    "the isEmpty() methods checks whether the stack is empty, i.e. whether there is no element in the array\n" +
                    "\n" +
                    "the isFull() method checks whether the stack is full, i.e. for example at a 5 - element stack, all 5 array elements have a value (other than null)\n" +
                    "\n" +
                    "the toString() method displays the stack contents\n" +
                    "\n" +
                    "hint: enter an additional variable that stores the index of the current or next item in the array and modify its value when implementing the push() and pop() methods`\n");
            Stack stack = new Stack(10);
            System.out.println(stack.toString());
            System.out.println(stack.isEmpty());
            System.out.println(stack.isFull());
            stack.push(10);
            System.out.println(stack.isEmpty());
            System.out.println(stack.toString());
            stack.push(10);
            stack.push(110);
            stack.push(101);
            stack.push(1012);
            stack.push(1330);
            stack.push(41210);
            stack.push(1120);
            stack.push(14120);
            stack.push(410);
            System.out.println(stack.isEmpty());
            System.out.println(stack.isFull());
            System.out.println(stack.toString());
            stack.pop();
            stack.pop();
            System.out.println(stack.toString());
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            System.out.println(stack.toString());
            stack.push(123);
            System.out.println(stack.toString());
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();

        System.out.println("10.Based on the task above, write a program that will \"mimic\" an array of any size " +
                "that can hold values of type Integer.\n" +
                "Functionalities:\n" +
                "\n" +
                "IntArray() - constructor, it should create an initial array with an initial, default size\n" +
                "\n" +
                "void add(Integer value) - adds an element to the next position; enlarges the array if necessary\n" +
                "\n" +
                "creates a new, bigger one\n" +
                "\n" +
                "rewrites the current values\n" +
                "\n" +
                "adds a new item\n" +
                "\n" +
                "void add(Integer value, int idx) - adds an element to the indicated position; if necessary, this is done by the method above\n" +
                "\n" +
                "Integer get(int idx) - returns the item at position idx; if not there, it returns null\n" +
                "\n" +
                "void remove(int idx) - removes the item at position idx\n" +
                "\n" +
                "void swap(int from, int to) - swap items in the from andto positions; enlarges the array if necessary\n" +
                "\n" +
                "String toString() - displays the entire array");

        IntArray array = new IntArray(0);

        array.add(10);
        array.add(121);
        array.add(1321);
        System.out.println(array.toString() + "\n");

        array.add(14);
        array.add(530);
        array.add(410);
        System.out.println(array.toString() + "\n");

        array.add(-1, 1);
        System.out.println(array.toString());
        array.add(-1, 1);
        System.out.println(array.toString());
        array.add(-1, 8);
        System.out.println(array.toString());
        array.add(-1, 15);
        System.out.println(array.toString() + "\n");

        System.out.println(array.get(5));
        System.out.println(array.get(1243) + "\n");

        array.remove(5);
        System.out.println(array.toString());
        array.remove(1);
        System.out.println(array.toString());
        array.remove(1);
        System.out.println(array.toString());
        array.remove(1);
        System.out.println(array.toString());
        array.remove(123);
        System.out.println(array.toString() + "\n");

        array.swap(10, 0);
        System.out.println(array.toString());
        array.swap(4, 10);
        System.out.println(array.toString());
        array.swap(3, 9);
        System.out.println(array.toString() + "\n");
    }
//        System.out.println("11.Account and AccountApplication classes are provided:" +
//                "Set a default value 0 for the balance field\n" +
//                "\n" +
//                "Add (generate) getter and setter type methods for the name field\n" +
//                "\n" +
//                "Add (generate) a getter type method for the balance field\n" +
//                "\n" +
//                "Add a (private) debit field of the boolean type that determines whether the account balance is negative; set the default value to false\n" +
//                "\n" +
//                "Add the possibility to deposit and withdraw money" +
//                "Implement the above methods\n" +
//                "\n" +
//                "The withdraw method is to set the debit field to true when the account balance is negative\n" +
//                "\n" +
//                "Check the operation of the method\n" +
//                "\n" +
//                "Add validation of the amount parameter in the deposit and withdraw methods;\n" +
//                "\n" +
//                "the methods are to perform the logics only when the amount value is positive\n" +
//                "\n" +
//                "otherwise they are to display the following message: \"The deposit/withdrawal amount must be positive!\"\n" +
//                "\n" +
//                "For the withdraw method, add the message display: \"Negative account balance\" if the debit field value is true\n" +
//                "\n" +
//                "For the deposit and withdraw methods, add a summary display like the one below (e.g. for deposit and withdraw, respectively)" +
//                "Add a function to support the maximum debit, e.g.1000. If the amount after the operation is lower, do not execute withdrawal but display the message: \"You cannot perform an operation exceeding the debit\"\n" +
//                "\n" +
//                "Implement the transfer method for transfers from the current account to another one.\n");
    }

    private static void whoWinAtTicTacToe(String userTicTacToe) {
        String matrix[][] = new String[3][3];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = userTicTacToe.substring(index++, index);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        if ((matrix[0][0].equals("X") && matrix[0][1].equals("X") && matrix[0][2].equals("X")) ||
                (matrix[1][0].equals("X") && matrix[1][1].equals("X") && matrix[1][2].equals("X")) ||
                (matrix[2][0].equals("X") && matrix[2][1].equals("X") && matrix[2][2].equals("X")) ||
                (matrix[0][0].equals("X") && matrix[1][0].equals("X") && matrix[2][0].equals("X")) ||
                (matrix[0][1].equals("X") && matrix[1][1].equals("X") && matrix[2][1].equals("X")) ||
                (matrix[0][2].equals("X") && matrix[1][2].equals("X") && matrix[2][2].equals("X")) ||
                (matrix[0][0].equals("X") && matrix[1][1].equals("X") && matrix[2][2].equals("X")) ||
                (matrix[0][2].equals("X") && matrix[1][1].equals("X") && matrix[2][0].equals("X"))) {
            System.out.println("Player X winn!!");

        } else if ((matrix[0][0].equals("O") && matrix[0][1].equals("O") && matrix[0][2].equals("O")) ||
                (matrix[1][0].equals("O") && matrix[1][1].equals("O") && matrix[1][2].equals("O")) ||
                (matrix[2][0].equals("O") && matrix[2][1].equals("O") && matrix[2][2].equals("O")) ||
                (matrix[0][0].equals("O") && matrix[1][0].equals("O") && matrix[2][0].equals("O")) ||
                (matrix[0][1].equals("O") && matrix[1][1].equals("O") && matrix[2][1].equals("O")) ||
                (matrix[0][2].equals("O") && matrix[1][2].equals("O") && matrix[2][2].equals("O")) ||
                (matrix[0][0].equals("O") && matrix[1][1].equals("O") && matrix[2][2].equals("O")) ||
                (matrix[0][2].equals("O") && matrix[1][1].equals("O") && matrix[2][0].equals("O"))) {
            System.out.println("Player O winn!!");
        } else System.out.println("Nobody winn...");

    }

    private static void numberToReduce(long numberToReduce) {
        if (numberToReduce < 10) {
            System.out.println(numberToReduce);
        } else {
            long prod = 1;
            System.out.println(numberToReduce);
            while (numberToReduce > 0) {
                prod *= numberToReduce % 10;
                numberToReduce /= 10;
            }
            numberToReduce(prod);
        }
    }

    private static void displayLine(int[][] matrix) {
        for (int numbers[] : matrix) {
            for (int number : numbers) {
                System.out.print("+---");
            }
            System.out.print("+\n");
            return;
        }

    }
}