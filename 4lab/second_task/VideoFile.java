package javadoc.lab5;
/**
 * Класс видео файл
 * Поля:
 * @author Alexey Reshetnikov
 * @version 1.0
 * @see File
 */
public class VideoFile extends File {

    private int duration;
    private int bitrate;
    private String codec;
    private int framesPerSecond;
    private String resolution;

    /**
     *Конструктор без аргументов
     */
    public VideoFile() {
        super();
        this.duration = 0;
        this.bitrate = 0;
        this.codec = "H.264";
        this.framesPerSecond = 30;
        this.resolution = "1920x1080";
    }

    /**
     *Конструктор с аргументами
     * @param name Имя
     * @param size Размер
     * @param dateOfCreation Дата создания
     * @param dateOfLastChange Дата последнего изменения
     * @param accessRights Права доступа
     * @param duration Длительность
     * @param bitrate Битрейт
     * @param codec Кодек
     * @param framesPerSecond Частота обновления кадров
     * @param resolution Разрешение
     */
    public VideoFile(String name, int size, String dateOfCreation, String dateOfLastChange, String accessRights, int duration, int bitrate, String codec, int framesPerSecond, String resolution) {
        super(name, size, dateOfCreation, dateOfLastChange, accessRights);
        this.duration = duration;
        this.bitrate = bitrate;
        this.codec = codec;
        this.framesPerSecond = framesPerSecond;
        this.resolution = resolution;
    }

    /**
     *
     * @return Возвращает длительность видеофайла
     */
    public int getDuration() {
        return duration;
    }

    /**
     *Присваивает длительность видеофайла объекту класса
     * @param duration Длительность
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     *
     * @return Возвращает битрейт видеофайла
     */
    public int getBitrate() {
        return bitrate;
    }

    /**
     * Присваивает битрейт видеофайла объекту класса
     * @param bitrate Битрейт
     */
    public void setBitrate(int bitrate) {
        this.bitrate = bitrate;
    }

    /**
     *
     * @return Возвращает кодек видеофайла
     */
    public String getCodec() {
        return codec;
    }

    /**
     * Присваивает кодек видеофайла объекту класса
     * @param codec Кодек
     */
    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     *
     * @return Возвращает частоту кадров видеофайла
     */
    public int getFramesPerSecond() {
        return framesPerSecond;
    }

    /**
     *Присваивает частоту кадров видеофайла объекту класса
     * @param framesPerSecond Частота обновления кадров
     */
    public void setFramesPerSecond(int framesPerSecond) {
        this.framesPerSecond = framesPerSecond;
    }

    /**
     *
     * @return Возвращает разрешение видеофайла
     */
    public String getResolution() {
        return resolution;
    }

    /**
     *Присваивает разрешение видеофайла
     * @param resolution Разрешение
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     *
     * @return Возвращает текст со всеми параметрами класса
     */
    @Override

    public String toString() {
        return "VideoFile{" + "name=" + getName() + ", size=" + getSize() + ", dateOfCreation=" + getDateOfCreation() + ", dateOfLastChange=" + getDateOfLastChange() + ", accessRights=" + getAccessRights() + ", duration=" + duration + ", bitrate=" + bitrate + ", codec=" + codec + ", framesPerSecond=" + framesPerSecond + ", resolution=" + resolution + '}';
    }
    
}
