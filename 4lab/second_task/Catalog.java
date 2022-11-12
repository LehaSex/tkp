package javadoc.lab5;
import java.util.ArrayList;

/**
 * Класс каталог содержащий список файлов
 * <p>Поля:</p>
 */
public class Catalog {
    /**
     * Создание списка файлов
     */
    private ArrayList<File> files = new ArrayList<File>();

    /**
     * Пустой конструктор
     */
    public Catalog() {
    }

    /**
     *Конструктор с аргументом cписка элементов класса File
     * @param files Файлы
     */
    public Catalog(ArrayList<File> files) {
        this.files = files;
    }

    
    /** 
     * 
     * @return Возвращает список элементов класса File
     */
    public ArrayList<File> getFiles() {
        return files;
    }

    
    /** 
     * Присваивает список элементов класса FIle объекту класса Catalog
     * @param files Файлы
     */
    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    
    /** 
     * Добавляет в список объекта класса Catalog элемент класса File
     * @param file Файл
     */
    public void addFile(File file) {
        files.add(file);
    }

    
    /** 
     * Удаляет из списка объекта класса Catalog элемент класса File
     * @param file Файл
     */
    public void removeFile(File file) {
        files.remove(file);
    }

    /**
     *Выводит содержимое объекта класса Catalog
     */
    public void printCatalog() {
        System.out.println("Каталог содержит:");
        for (File f : files) {
            System.out.println("\t" + f.toString());
        }
    }

    /**
     *Подсчитывает количество элементов списка классов AudioFile и VideoFile и выводит их
     */
    public void countFiles() {
        int audioCount = 0;
        int videoCount = 0;
        for (File f : files) {
            if (f instanceof AudioFile) {
                audioCount++;
            } else if (f instanceof VideoFile) {
                videoCount++;
            }
        }
        System.out.println("Количество аудио файлов: " + audioCount);
        System.out.println("Количество видео файлов: " + videoCount);
    }
}
