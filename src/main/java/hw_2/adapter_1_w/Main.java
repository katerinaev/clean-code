package hw_2.adapter_1_w;
/*
Adapter for working with PDF and DOC files (format conversion):
Description
We have two types of files:
A PDF file, which needs to be processed by a system that only supports the DOC format.
We need to create an adapter that will allow the system to handle both file formats by
converting them whenever necessary.
The task is to create an interface that accepts files with either a PDF or DOC extension,
along with an adapter that converts one format into the other.
1. DocumentProcessor interface: An interface containing a `process()` method, which will be used
to process files.
2. PDFProcessor and DOCProcessor classes: These classes implement the `DocumentProcessor` interface
and contain the logic for processing each document type.
3. DocumentAdapter class: This class adapts the processing method of one document type to another,
effectively converting the format (for example, from PDF to DOC).
*/
public class Main {
    public static void main(String[] args) {
        DocumentProcessor documentAdepter = new DocumentAdapter();
        documentAdepter.process("hello.pdf");
        documentAdepter.process("hi.doc");
        documentAdepter.process("by.txt");
    }
}
