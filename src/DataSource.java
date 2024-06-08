class DataSource {
    private int sourceId;
    private String name;
    private String type;
    private String details;

    public DataSource() {
    }

    public DataSource(int sourceId, String name, String type, String details) {
        this.sourceId = sourceId;
        this.name = name;
        this.type = type;
        this.details = details;
    }

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}