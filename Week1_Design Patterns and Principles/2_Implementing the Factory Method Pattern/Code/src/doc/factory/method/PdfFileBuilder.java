package doc.factory.method;

public class PdfFileBuilder extends FileBuilder {
    public DocFile generateFile() {
        return new PdfFile();
    }
}
