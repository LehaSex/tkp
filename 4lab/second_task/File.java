package javadoc.lab5;
import java.text.SimpleDateFormat;
import java.util.Date;
/** 
*Лабораторная работа №5
* <p>Базовый класс File</p>
* @author Alexey Reshetnikov
* @version 1.0
* @see AudioFile
* @see VideoFile
* @see Catalog
*/
public class File {
    /**
     * Представляет собой название
     */
    private String name;
    /**
     * Представляет собой вес файла
     */
    private int size;
    /**
     * Представляет собой дату создания файла
     */
    private String dateOfCreation;
     /**
     * Представляет собой дату последнего изменения файла
     */
    private String dateOfLastChange;
     /**
     * Представляет собой права доступа к файлу
     */
    private String accessRights;
    /**
     * Конструктор без аргументов
     */
    public File() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        name = "Без названия";
        size = 0;
        dateOfCreation = sdf.format(new Date(0));
        dateOfLastChange = sdf.format(new Date(0));
        accessRights = "Без прав";
    }
    /**
     * Конструктор с аргументами
     * @param name Имя 
     * @param size Размер
     * @param dateOfCreation Дата создания
     * @param dateOfLastChange Дата последнего изменения
     * @param accessRights Права доступа
     */
    public File(String name, int size, String dateOfCreation, String dateOfLastChange, String accessRights) {
        this.name = name;
        this.size = size;
        this.dateOfCreation = dateOfCreation;
        this.dateOfLastChange = dateOfLastChange;
        this.accessRights = accessRights;
    }
    /**
     * 
     * @return Возвращает название файла
     */
    public String getName() {
        return name;
    }
    /**
     * Присваивает название файла объекту класса
     * @param name Имя
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 
     * @return Возвращает вес файла
     */
    public int getSize() {
        return size;
    }
    /**
     * Присваивает вес файла объекту класса
     * @param size Размер
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     *
     * @return Возвращает дату создания файла
     */
    public String getDateOfCreation() {
        return dateOfCreation;
    }

    /**
     *Присваивает дату создания файла объекту класса
     * @param dateOfCreation Дата создания
     */
    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    /**
     *
     * @return Возвращает дату последнего изменения файла
     */
    public String getDateOfLastChange() {
        return dateOfLastChange;
    }

    /**
     *Присваивает дату последнего изменения файла объекту класса
     * @param dateOfLastChange Дата последнего изменения
     */
    public void setDateOfLastChange(String dateOfLastChange) {
        this.dateOfLastChange = dateOfLastChange;
    }

    /**
     * 
     * @return Возвращает права доступа к файлу
     */
    public String getAccessRights() {
        return accessRights;
    }

    /**
     *Присваивает права доступа к файлу объекту класса
     * @param accessRights Права доступа
     */
    public void setAccessRights(String accessRights) {
        this.accessRights = accessRights;
    }

}