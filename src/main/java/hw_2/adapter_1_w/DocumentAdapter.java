package hw_2.adapter_1_w;

public class DocumentAdapter implements DocumentProcessor {
    private final DOCProcessor docProcessor = new DOCProcessor();
    @Override
    public void process(String fileName) {
        if (fileName.endsWith(".pdf")) {
            System.out.println("Converting PDF -> DOC");
            String convertedFileName = fileName.replace(".pdf",".doc");
            docProcessor.process(convertedFileName);
        } else if (fileName.endsWith(".doc")) {
            docProcessor.process(fileName);
        } else {
            System.out.println("Unsupported file format");
        }
    }
}
