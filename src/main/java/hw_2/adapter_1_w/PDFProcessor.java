package hw_2.adapter_1_w;

public class PDFProcessor implements DocumentProcessor {
    @Override
    public void process(String fileName) {
        System.out.println("Processing PDF file: " + fileName);
    }
}
