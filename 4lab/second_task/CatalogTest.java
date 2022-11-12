package javadoc.lab5;
/**
     * Тестирование класса Catalog
     */
public class CatalogTest {
    
    /**
     *
     * @param args Аргументы
     */
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        AudioFile file1 = new AudioFile("file1", 100, "01.01.2015", "01.01.2015", "rwx", 100, 100, "AAC", 44100, 2);
        AudioFile file2 = new AudioFile("file2", 200, "01.02.2015", "03.02.2018", "rwx", 200, 200, "AAC", 44100, 2);
        VideoFile file3 = new VideoFile("file3", 300, "01.03.2015", "06.03.2019", "rwx", 300, 300, "H.264", 30, "1920x1080");
        VideoFile file4 = new VideoFile("file4", 400, "01.04.2015", "03.07.2019", "rwx", 400, 400, "H.264", 30, "1920x1080");
        VideoFile file5 = new VideoFile("file5", 500, "01.05.2015", "02.09.2022", "rwx", 500, 500, "H.264", 30, "1920x1080");
        catalog.addFile(file1);
        catalog.addFile(file2);
        catalog.addFile(file3);
        catalog.addFile(file4);
        catalog.addFile(file5);
        catalog.printCatalog();
        catalog.countFiles();
        catalog.removeFile(file1);
        catalog.printCatalog();
        catalog.countFiles();
}
}
