package DesignPatterns.FactoryDesignPattern.DocumentGenerationFactory;

public class Main {
    public static void main(String[] args) {
        DocumentGenerator documentGenerator = DocumentFactory.getInsance("EXCEL");
        documentGenerator.generateDocument();
    }
}
