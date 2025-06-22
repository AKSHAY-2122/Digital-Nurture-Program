package doc.factory.method;

public class LaunchFactoryDemo {
    public static void main(String[] args) {
        FileBuilder builder;

        builder = new WordFileBuilder();
        DocFile word = builder.generateFile();
        word.displayType();

        builder = new PdfFileBuilder();
        DocFile pdf = builder.generateFile();
        pdf.displayType();

        builder = new ExcelFileBuilder();
        DocFile excel = builder.generateFile();
        excel.displayType();
    }
}
