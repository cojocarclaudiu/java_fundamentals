public class Person {

    private String name;
    private String surname;
    private Gender gender;
    private int age;
    private long id;

    public Person(String name, String surname, Gender gender, int age, long id){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.id = id;
    }

    public void hasReachedRetirementAge(){
        switch (this.gender){
            case MALE :
                System.out.println(this.age >= 65 ? "This person must retire" : "This person still needs to work.");
                break;
            case FEMALE:
                System.out.println(this.age >= 60 ? "This person must retire" : "This person still needs to work.");
                break;
            default:
                System.out.println("This person is Sorin. He has to work all his life.");
        }
    }

    public int differenceOfYears(Person person){
        return Math.abs(this.age - person.age);
    }

    public void yearsBeforeRetirement() {
        switch (this.gender) {
            case MALE:
                System.out.println(this.age >= 65 ? "This person must retire" : "This person still needs to work " + (65 - this.age));
                break;
            case FEMALE:
                System.out.println(this.age >= 60 ? "This person must retire" : "This person still needs to work" + (60 - this.age));
                break;
            default:
                System.out.println("This person is Sorin. He has to work all his life.");
        }
    }
}
