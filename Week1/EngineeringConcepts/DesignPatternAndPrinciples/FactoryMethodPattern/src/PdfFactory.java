package EngineeringConcepts.DesignPatternAndPrinciples.FactoryMethodPattern.src;


public class PdfFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}