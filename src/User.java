
class User {
    private int userId;
    private String nome;
    private String sobrenome;
    private String email;
    private String password;

    public User() {
    }

    public User(int userId, String nome, String sobrenome, String email, String password) {
        this.userId = userId;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.password = password;
    }

    public int getUserId() { return userId; }
    public String getNome() { return nome; }
    public String getSobrenome() { return sobrenome; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }

    public void setUserId(int userId) { this.userId = userId; }
    public void setNome(String nome) { this.nome = nome; }
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
}

