package EngineeringConcepts.DesignPatternAndPrinciples.FactoryMethodPattern.src;


public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("PDF Document Opened.");
    }
}