package EngineeringConcepts.DesignPatternAndPrinciples.FactoryMethodPattern.src;


public class WordDocument implements Document {

    @Override
    public void open() {
        System.out.println("Word Document Opened.");
    }
}