class Local {
    private int localId;
    private String coordenadas;
    private String regiao;
    private SafetySystem safetySystem;

    public Local() {
    }

    public Local(int localId, String coordenadas, String regiao, SafetySystem safetySystem) {
        this.localId = localId;
        this.coordenadas = coordenadas;
        this.regiao = regiao;
        this.safetySystem = safetySystem;
    }

    public int getLocalId() {
        return localId;
    }

    public void setLocalId(int localId) {
        this.localId = localId;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public SafetySystem getSafetySystem() {
        return safetySystem;
    }

    public void setSafetySystem(SafetySystem safetySystem) {
        this.safetySystem = safetySystem;
    }

}
