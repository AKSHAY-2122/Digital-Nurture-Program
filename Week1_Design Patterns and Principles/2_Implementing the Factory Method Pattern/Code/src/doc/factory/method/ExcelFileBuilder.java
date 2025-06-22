package doc.factory.method;

public class ExcelFileBuilder extends FileBuilder {
    public DocFile generateFile() {
        return new ExcelFile();
    }
}
