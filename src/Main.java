package pacotedetreino;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class User {
    private static int count = 1;
    private int userId;
    private String nome;
    private String sobrenome;
    private String email;
    private String password;

    public User(String nome, String sobrenome, String email, String password) {
        this.userId = count++;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserID: " + userId + ", Nome: " + nome + ", Sobrenome: " + sobrenome + ", Email: " + email;
    }
}

class SafetySystem {
    private int safetySystemId;
    private String coordenadas;

    public SafetySystem(int safetySystemId, String coordenadas) {
        this.safetySystemId = safetySystemId;
        this.coordenadas = coordenadas;
    }

    // Getters e setters
    public int getSafetySystemId() {
        return safetySystemId;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setSafetySystemId(int safetySystemId) {
        this.safetySystemId = safetySystemId;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }
}

class Local {
    private int localId;
    private String coordenadas;
    private String regiao;
    private SafetySystem safetySystem;

    public Local(int localId, String coordenadas, String regiao) {
        this.localId = localId;
        this.coordenadas = coordenadas;
        this.regiao = regiao;
        this.safetySystem = null; // Inicialmente não há um sistema de segurança associado
    }

    // Getters e setters
    public int getLocalId() {
        return localId;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public String getRegiao() {
        return regiao;
    }

    public SafetySystem getSafetySystem() {
        return safetySystem;
    }

    public void setLocalId(int localId) {
        this.localId = localId;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public void setSafetySystem(SafetySystem safetySystem) {
        this.safetySystem = safetySystem;
    }
}

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

    // Getters e setters
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

class DataSource {
    private int sourceId;
    private String name;
    private String type;
    private String details;

    public DataSource(int sourceId, String name, String type, String details) {
        this.sourceId = sourceId;
        this.name = name;
        this.type = type;
        this.details = details;
    }

    // Getters e setters
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

class MDSource {
    private int mdSourceId;
    private MaritimeData maritimeData;
    private DataSource dataSource;

    public MDSource(int mdSourceId, MaritimeData maritimeData, DataSource dataSource) {
        this.mdSourceId = mdSourceId;
        this.maritimeData = maritimeData;
        this.dataSource = dataSource;
    }

    // Getters e setters
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

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<User> users = new ArrayList<>();
    private static List<SafetySystem> safetySystems = new ArrayList<>();
    private static List<Local> locals = new ArrayList<>();
    private static List<MaritimeData> maritimeDataList = new ArrayList<>();
    private static List<DataSource> dataSources = new ArrayList<>();
    private static List<MDSource> mdSources = new ArrayList<>();

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\n### Management System ###");
            System.out.println("1. Create User");
            System.out.println("2. List Users");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("5. Create Safety System");
            System.out.println("6. Create Local");
            System.out.println("7. Create Maritime Data");
            System.out.println("8. Create Data Source");
            System.out.println("9. Create MDSource");
            System.out.println("10. Display Information");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (option) {
                case 1:
                    createUser();
                    break;
                case 2:
                    listUsers();
                    break;
                case 3:
                    updateUser();
                    break;
                case 4:
                    deleteUser();
                    break;
                case 5:
                    createSafetySystem();
                    break;
                case 6:
                    createLocal();
                    break;
                case 7:
                    createMaritimeData();
                    break;
                case 8:
                    createDataSource();
                    break;
                case 9:
                    createMDSource();
                    break;
                case 10:
                    displayInformation();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void createUser() {
        System.out.print("Enter first name: ");
        String nome = scanner.nextLine();
        System.out.print("Enter last name: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = new User(nome, sobrenome, email, password);
        users.add(user);
        System.out.println("User created successfully.");
    }

    private static void listUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    private static void updateUser() {
        System.out.print("Enter user ID to update: ");
        int userId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (User user : users) {
            if (user.getUserId() == userId) {
                System.out.print("Enter new first name (leave blank to keep current): ");
                String nome = scanner.nextLine();
                System.out.print("Enter new last name (leave blank to keep current): ");
                String sobrenome = scanner.nextLine();
                System.out.print("Enter new email (leave blank to keep current): ");
                String email = scanner.nextLine();
                System.out.print("Enter new password (leave blank to keep current): ");
                String password = scanner.nextLine();

                if (!nome.isEmpty()) {
                    user.setNome(nome);
                }
                if (!sobrenome.isEmpty()) {
                    user.setSobrenome(sobrenome);
                }
                if (!email.isEmpty()) {
                    user.setEmail(email);
                }
                if (!password.isEmpty()) {
                    user.setPassword(password);
                }

                System.out.println("User updated successfully.");
                return;
            }
        }

        System.out.println("User not found.");
    }

    private static void deleteUser() {
        System.out.print("Enter user ID to delete: ");
        int userId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        users.removeIf(user -> user.getUserId() == userId);
        System.out.println("User deleted successfully.");
    }

    private static void createSafetySystem() {
        System.out.print("Enter safety system ID: ");
        int safetySystemId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter coordinates: ");
        String coordenadas = scanner.nextLine();

        SafetySystem safetySystem = new SafetySystem(safetySystemId, coordenadas);
        safetySystems.add(safetySystem);
        System.out.println("Safety system created successfully.");
    }

    private static void createLocal() {
        System.out.print("Enter local ID: ");
        int localId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter coordinates: ");
        String coordenadas = scanner.nextLine();
        System.out.print("Enter region: ");
        String regiao = scanner.nextLine();

        Local local = new Local(localId, coordenadas, regiao);
        locals.add(local);
        System.out.println("Local created successfully.");
    }

    private static void createMaritimeData() {
        System.out.print("Enter maritime data ID: ");
        int maritimeDataId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.print("Enter local ID: ");
        int localId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        Local local = null;
        for (Local l : locals) {
            if (l.getLocalId() == localId) {
                local = l;
                break;
            }
        }

        if (local == null) {
            System.out.println("Local not found.");
            return;
        }

        System.out.print("Enter temperature: ");
        float temperatura = scanner.nextFloat();
        System.out.print("Enter pH: ");
        float pH = scanner.nextFloat();
        System.out.print("Enter oxygenation: ");
        float oxigenacao = scanner.nextFloat();
        System.out.print("Enter microplastic: ");
        float microplastico = scanner.nextFloat();
        System.out.print("Enter salinity: ");
        float salinidade = scanner.nextFloat();
        System.out.print("Enter water level: ");
        float nivelDaAgua = scanner.nextFloat();
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter date and time (YYYY-MM-DD HH:MM:SS): ");
        String horaStr = scanner.nextLine();
        Date hora = new Date(); // Simplesmente inicializando; seria necessário um parse de string para Date

        MaritimeData maritimeData = new MaritimeData(maritimeDataId, local, temperatura, pH, oxigenacao, microplastico, salinidade, nivelDaAgua, hora);
        maritimeDataList.add(maritimeData);
        System.out.println("Maritime data created successfully.");
    }

    private static void createDataSource() {
        System.out.print("Enter data source ID: ");
        int sourceId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter type: ");
        String type = scanner.nextLine();
        System.out.print("Enter details: ");
        String details = scanner.nextLine();

        DataSource dataSource = new DataSource(sourceId, name, type, details);
        dataSources.add(dataSource);
        System.out.println("Data source created successfully.");
    }

    private static void createMDSource() {
        System.out.print("Enter MDSource ID: ");
        int mdSourceId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.print("Enter maritime data ID: ");
        int maritimeDataId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        MaritimeData maritimeData = null;
        for (MaritimeData md : maritimeDataList) {
            if (md.getMaritimeDataId() == maritimeDataId) {
                maritimeData = md;
                break;
            }
        }

        if (maritimeData == null) {
            System.out.println("Maritime data not found.");
            return;
        }

        System.out.print("Enter data source ID: ");
        int sourceId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        DataSource dataSource = null;
        for (DataSource ds : dataSources) {
            if (ds.getSourceId() == sourceId) {
                dataSource = ds;
                break;
            }
        }

        if (dataSource == null) {
            System.out.println("Data source not found.");
            return;
        }

        MDSource mdSource = new MDSource(mdSourceId, maritimeData, dataSource);
        mdSources.add(mdSource);
        System.out.println("MDSource created successfully.");
    }

    private static void displayInformation() {
        System.out.println("Users:");
        for (User user : users) {
            System.out.println(user);
        }

        System.out.println("\nSafety Systems:");
        for (SafetySystem safetySystem : safetySystems) {
            System.out.println("ID: " + safetySystem.getSafetySystemId() + ", Coordenadas: " + safetySystem.getCoordenadas());
        }

        System.out.println("\nLocals:");
        for (Local local : locals) {
            System.out.println("ID: " + local.getLocalId() + ", Coordenadas: " + local.getCoordenadas() + ", Região: " + local.getRegiao() + ", Safety System: " + (local.getSafetySystem() != null ? local.getSafetySystem().getSafetySystemId() : "None"));
        }

        System.out.println("\nMaritime Data:");
        for (MaritimeData maritimeData : maritimeDataList) {
            System.out.println("ID: " + maritimeData.getMaritimeDataId() + ", Local: " + maritimeData.getLocal().getLocalId() + ", Temperatura: " + maritimeData.getTemperatura() + ", pH: " + maritimeData.getpH() + ", Oxigenação: " + maritimeData.getOxigenacao() + ", Microplástico: " + maritimeData.getMicroplastico() + ", Salinidade: " + maritimeData.getSalinidade() + ", Nível da Água: " + maritimeData.getNivelDaAgua() + ", Hora: " + maritimeData.getHora());
        }

        System.out.println("\nData Sources:");
        for (DataSource dataSource : dataSources) {
            System.out.println("ID: " + dataSource.getSourceId() + ", Nome: " + dataSource.getName() + ", Tipo: " + dataSource.getType() + ", Detalhes: " + dataSource.getDetails());
        }

        System.out.println("\nMDSources:");
        for (MDSource mdSource : mdSources) {
            System.out.println("ID: " + mdSource.getMdSourceId() + ", Maritime Data ID: " + mdSource.getMaritimeData().getMaritimeDataId() + ", Data Source ID: " + mdSource.getDataSource().getSourceId());
        }
    }
}
