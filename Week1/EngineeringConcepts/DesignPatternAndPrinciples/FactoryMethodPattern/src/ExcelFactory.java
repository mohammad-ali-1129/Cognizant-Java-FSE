package EngineeringConcepts.DesignPatternAndPrinciples.FactoryMethodPattern.src;


public class ExcelFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}