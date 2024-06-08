class MDSource {
    private int mdSourceId;
    private MaritimeData maritimeData;
    private DataSource dataSource;

    public MDSource() {
    }

    public MDSource(int mdSourceId, MaritimeData maritimeData, DataSource dataSource) {
        this.mdSourceId = mdSourceId;
        this.maritimeData = maritimeData;
        this.dataSource = dataSource;
    }

    public int getMdSourceId() {
        return mdSourceId;
    }

    public void setMdSourceId(int mdSourceId) {
        this.mdSourceId = mdSourceId;
    }

    public MaritimeData getMaritimeData() {
        return maritimeData;
    }

    public void setMaritimeData(MaritimeData maritimeData) {
        this.maritimeData = maritimeData;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}