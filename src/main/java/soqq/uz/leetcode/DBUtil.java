package soqq.uz.leetcode;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    @SneakyThrows
    public static Connection getConnection() {
        String dbUrl = System.getenv("DB_URL");
        String dbUser = System.getenv("DB_USER");
        String dbPassword = System.getenv("DB_PASSWORD");
        Class.forName("org.postgresql.Driver"); // 1 - step (Register Driver -> driverni ro'yxatdan o'tkazish) Buni yozmasa ham bo'laveradi
        return DriverManager.getConnection(dbUrl, dbUser, dbPassword); // 2 - step (Get connection -> db blan connection o'rnatish)
    }
}
