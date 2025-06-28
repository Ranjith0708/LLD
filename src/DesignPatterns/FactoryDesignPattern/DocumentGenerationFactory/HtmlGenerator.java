package DesignPatterns.FactoryDesignPattern.DocumentGenerationFactory;

public class HtmlGenerator implements DocumentGenerator{

    @Override
    public void generateDocument() {
        System.out.println("HTML has been generated successfully.");
    }
}
