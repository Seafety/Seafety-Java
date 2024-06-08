class SafetySystem {
    private int safetySystemId;
    private String coordenadas;

    public SafetySystem() {
    }

    public SafetySystem(int safetySystemId, String coordenadas) {
        this.safetySystemId = safetySystemId;
        this.coordenadas = coordenadas;
    }

    public int getSafetySystemId() {
        return safetySystemId;
    }

    public void setSafetySystemId(int safetySystemId) {
        this.safetySystemId = safetySystemId;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }
}
