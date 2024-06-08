import java.util.Date;

class MaritimeData {
    private int maritimeDataId;
    private Local local;
    private float temperatura;
    private float pH;
    private float oxigenacao;
    private float microplastico;
    private float salinidade;
    private float nivelDaAgua;
    private Date hora;

    public MaritimeData() {
    }

    public MaritimeData(int maritimeDataId, Local local, float temperatura, float pH, float oxigenacao, float microplastico, float salinidade, float nivelDaAgua, Date hora) {
        this.maritimeDataId = maritimeDataId;
        this.local = local;
        this.temperatura = temperatura;
        this.pH = pH;
        this.oxigenacao = oxigenacao;
        this.microplastico = microplastico;
        this.salinidade = salinidade;
        this.nivelDaAgua = nivelDaAgua;
        this.hora = hora;
    }

    public int getMaritimeDataId() {
        return maritimeDataId;
    }

    public void setMaritimeDataId(int maritimeDataId) {
        this.maritimeDataId = maritimeDataId;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getpH() {
        return pH;
    }

    public void setpH(float pH) {
        this.pH = pH;
    }

    public float getOxigenacao() {
        return oxigenacao;
    }

    public void setOxigenacao(float oxigenacao) {
        this.oxigenacao = oxigenacao;
    }

    public float getMicroplastico() {
        return microplastico;
    }

    public void setMicroplastico(float microplastico) {
        this.microplastico = microplastico;
    }

    public float getSalinidade() {
        return salinidade;
    }

    public void setSalinidade(float salinidade) {
        this.salinidade = salinidade;
    }

    public float getNivelDaAgua() {
        return nivelDaAgua;
    }

    public void setNivelDaAgua(float nivelDaAgua) {
        this.nivelDaAgua = nivelDaAgua;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }
}
