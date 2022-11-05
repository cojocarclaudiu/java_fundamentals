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
    }
}