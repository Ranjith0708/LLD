package DesignPatterns.FactoryDesignPattern.DocumentGenerationFactory;

public class DocumentFactory {
    public static DocumentGenerator getInsance(String docType){
        DocType doc = DocType.valueOf(docType);
        switch (doc){
            case PDF -> {
                return new PdfGenerator();
            }
            case HTML -> {
                return new HtmlGenerator();
            }
            case EXCEL -> {
                return new ExcelGenerator();
            }
            default -> {
                return null;
            }
        }
    }
}
