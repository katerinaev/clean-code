package hw_2.adapter_1_w;

public class DocumentAdapter implements DocumentProcessor {
    private final DOCProcessor docProcessor;
    private final PDFProcessor pdfProcessor;

    public DocumentAdapter(DOCProcessor docProcessor, PDFProcessor pdfProcessor) {
        this.docProcessor = docProcessor;
        this.pdfProcessor = pdfProcessor;
    }

    @Override
    public void process(String fileName) {
        if (fileName.endsWith(".pdf")) {
            pdfProcessor.process(fileName);
            System.out.println("Converting PDF -> DOC");
            String convertedFileName = fileName.replace(".pdf",".doc");
            System.out.println("Conversion completed: " + convertedFileName);
            docProcessor.process(convertedFileName);
        } else if (fileName.endsWith(".doc")) {
            docProcessor.process(fileName);
        } else {
            System.out.println("Unsupported file format");
        }
    }
}
