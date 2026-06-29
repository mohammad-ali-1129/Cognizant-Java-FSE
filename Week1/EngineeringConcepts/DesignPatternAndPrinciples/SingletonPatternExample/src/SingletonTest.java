package EngineeringConcepts.DesignPatternAndPrinciples.SingletonPatternExample.src;

public class SingletonTest {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("My name is Mohammad Ali i am a student of Lovely Professional University");

        Logger logger2 = Logger.getInstance();
        logger2.log("I am learning Java programming and design patterns.");

        // Checking whether both references point to the same object
        if (logger1 == logger2) {
            System.out.println("Only one Logger instance exists.");
        } else {
            System.out.println("Multiple Logger instances exist.");
        }
    }
}
