import com.opencsv.bean.CsvBindByName;

/**
 * Created by nicolas on 11/15/17.
 */
public class MAl_Bean {
    @CsvBindByName
    private String Title ;

    @CsvBindByName
    private  String Synopsis ;

    @CsvBindByName
    private String Pictures ;

    @CsvBindByName
    private String Type;

    @CsvBindByName
    private String Episodes;

    @CsvBindByName
    private String Status;

    @CsvBindByName
    private String Aired;

    @CsvBindByName
    private String Producers;

    @CsvBindByName
    private String Licensors;

    @CsvBindByName
    private String Studio;

    @CsvBindByName
    private String Source;

    @CsvBindByName
    private String Genre;

    @CsvBindByName
    private String Duration;

    @CsvBindByName
    private String Rating;

    public String getTitle() {
        return Title;
    }

    public String getSynopsis() {
        return Synopsis;
    }

    public String getPictures() {
        return Pictures;
    }

    public String getType() {
        return Type;
    }

    public String getEpisodes() {
        return Episodes;
    }

    public String getStatus() {
        return Status;
    }

    public String getAired() {
        return Aired;
    }

    public String getProducers() {
        return Producers;
    }

    public String getLicensors() {
        return Licensors;
    }

    public String getStudio() {
        return Studio;
    }

    public String getSource() {
        return Source;
    }

    public String getGenre() {
        return Genre;
    }

    public String getDuration() {
        return Duration;
    }

    public String getRating() {
        return Rating;
    }
}
