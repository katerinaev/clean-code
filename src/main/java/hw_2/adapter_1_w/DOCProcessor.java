package hw_2.adapter_1_w;

public class DOCProcessor implements DocumentProcessor {
    @Override
    public void process(String fileName) {
        System.out.println("Processing DOC file " + fileName);
    }
}
