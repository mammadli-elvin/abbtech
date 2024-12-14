package az.abbtech.lesson_10.lesson.design_patterns.creational.signleton;

/**
 *  Instance class ichinde static oldugundan Eager installation problem, and multithread vulnerability
 */

public final class HTTPClient {
    private static HTTPClient instance;
    private String host;
    private int port;
    private String username;
    private String password;

    private HTTPClient(String host, int port, String username, String password) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    public static HTTPClient getInstance(String host, int port, String username, String password) {
        if (instance == null) {
            instance =  new HTTPClient(host, port, username, password);
        }
        return instance;
    }
}
