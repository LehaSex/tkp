package javadoc.lab5;
/**
 * Класс аудио файл
 * Поля:
 * @author Alexey Reshetnikov
 * @version 1.0
 * @see File
 */
public class AudioFile extends File{

    private int duration;
    private int bitrate;
    private String codec;
    private int frequency;
    private int channels;

    /**
     * Конструктор без аргументов
     */
    public AudioFile() {
        super();
        this.duration = 0;
        this.bitrate = 0;
        this.codec = "AAC";
        this.frequency = 44100;
        this.channels = 2;
    }

    /**
     * Конструктор с аргументами
     * @param name Имя 
     * @param size Размер
     * @param dateOfCreation Дата создания
     * @param dateOfLastChange Дата последнего изменения
     * @param accessRights Права доступа
     * @param duration Длительность
     * @param bitrate Битрейт
     * @param codec Кодек
     * @param frequency Частота
     * @param channels Каналы
     */
    public AudioFile(String name, int size, String dateOfCreation, String dateOfLastChange, String accessRights, int duration, int bitrate, String codec, int frequency, int channels) {
        super(name, size, dateOfCreation, dateOfLastChange, accessRights);
        this.duration = duration;
        this.bitrate = bitrate;
        this.codec = codec;
        this.frequency = frequency;
        this.channels = channels;
    }

    /**
     *
     * @return Возвращает длительность аудиофайла
     */
    public int getDuration() {
        return duration;
    }

    /**
     *Присваивает длительность аудиофайла объекту класса
     * @param duration Частота
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     *
     * @return Возвращает битрейт аудиофайла
     */
    public int getBitrate() {
        return bitrate;
    }

    /**
     *Возвращает битрейт аудиофайла
     * @param bitrate Битрейт
     */
    public void setBitrate(int bitrate) {
        this.bitrate = bitrate;
    }

    /**
     *
     * @return Возвращает кодек аудиофайла
     */
    public String getCodec() {
        return codec;
    }

    /**
     *Присваивает кодек аудиофайла
     * @param codec Кодек
     */
    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     *
     * @return Возвращает частота аудиофайла
     */
    public int getFrequency() {
        return frequency;
    }

    /**
     *Присваивает частоту аудиофайла
     * @param frequency Частота
     */
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    /**
     *
     * @return Возвращает каналы аудиофайла
     */
    public int getChannels() {
        return channels;
    }

    /**
     * Присваивает каналы аудиофайла
     * @param channels Каналы
     */
    public void setChannels(int channels) {
        this.channels = channels;
    }

    /**
     *
     * @return Возвращает текст со всеми параметрами класса
     */
    @Override

    public String toString() {
        return "AudioFile{" + "duration=" + duration + ", bitrate=" + bitrate + ", codec=" + codec + ", frequency=" + frequency + ", channels=" + channels + '}';
    }
}
