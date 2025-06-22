package doc.factory.method;

public class WordFileBuilder extends FileBuilder {
    public DocFile generateFile() {
        return new WordFile();
    }
}
