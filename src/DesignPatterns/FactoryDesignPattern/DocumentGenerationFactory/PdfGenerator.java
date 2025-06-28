package DesignPatterns.FactoryDesignPattern.DocumentGenerationFactory;

public class PdfGenerator implements DocumentGenerator{
    @Override
    public void generateDocument() {
        System.out.println("PDF has been generated successfully");
    }
}
