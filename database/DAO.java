package library.database;

public interface DAO {
    void setup() throws Exception;
    void connect() throws Exception;
    void close() throws Exception;
}
