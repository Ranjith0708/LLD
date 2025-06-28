package DesignPatterns.FactoryDesignPattern.DocumentGenerationFactory;

public class ExcelGenerator implements DocumentGenerator{
    @Override
    public void generateDocument() {
        System.out.println("Excel has been generated successfully");
    }
}
