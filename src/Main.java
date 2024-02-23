import net.ravendb.client.documents.DocumentStore;

// Connecting to the database studio 
public class Main {
    public static void main(String[] args) {
        try (DocumentStore store = new DocumentStore(new String[] { "http://localhost:8080" }, "Northwind")) {
            store.initialize();
            // Print if connection is successful.
            System.out.println("Connected successfully");

        }}
}
