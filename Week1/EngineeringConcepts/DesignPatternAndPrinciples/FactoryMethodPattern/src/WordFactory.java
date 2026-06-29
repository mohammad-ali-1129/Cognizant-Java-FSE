package EngineeringConcepts.DesignPatternAndPrinciples.FactoryMethodPattern.src;


public class WordFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}