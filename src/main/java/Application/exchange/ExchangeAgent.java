package Application.exchange;

public class ExchangeAgent {


    Long id;
    Long timeSurley;
    private String description;
    private String clientDirectory;
    private String serverDirectory;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getTimeSurley() {
        return timeSurley;
    }

    public void setTimeSurley(Long timeSurley) {
        this.timeSurley = timeSurley;
    }

    private String directory;

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getClientDirectory() {
        return clientDirectory;
    }

    public void setClientDirectory(String clientDirectory) {
        this.clientDirectory = clientDirectory;
    }

    public String getServerDirectory() {
        return serverDirectory;
    }

    public void setServerDirectory(String serverDirectory) {
        this.serverDirectory = serverDirectory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
