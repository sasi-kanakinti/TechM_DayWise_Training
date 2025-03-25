import java.util.Objects;

public final class Configuration {
    private final String databaseUrl;
    private final String username;
    private final String password;
    private Configuration(String databaseUrl, String username, String password) {
        this.databaseUrl = databaseUrl;
        this.username = username;
        this.password = password;
    }
    public static Configuration of(String databaseUrl, String username, String password) {
        return new Configuration(databaseUrl, username, password);
    }
    public String getDatabaseUrl() {
        return databaseUrl;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Configuration that = (Configuration) o;
        return Objects.equals(databaseUrl, that.databaseUrl) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password);
    }
    @Override
    public int hashCode() {
        return Objects.hash(databaseUrl, username, password);
    }
    @Override
    public String toString() {
        return "Configuration{" +
                "databaseUrl='" + databaseUrl + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}