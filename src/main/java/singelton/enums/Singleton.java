package singelton.enums;

import java.sql.Connection;

enum Singleton {
  INSTANCE;

  // instance vars, constructor
  private final Connection connection;

  Singleton() {
    // Initialize the connection
    connection = DB.getConnection();
  }

  // Static getter
  public static Singleton getInstance() {
    return INSTANCE;
  }

  public Connection getConnection() {
    return connection;
  }
}