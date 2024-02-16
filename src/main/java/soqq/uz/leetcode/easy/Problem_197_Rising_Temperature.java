package soqq.uz.leetcode.easy;

import soqq.uz.leetcode.DBUtil;

import java.sql.*;

public class Problem_197_Rising_Temperature {
    /*
      Paths :
        https://leetcode.com/problems/rising-temperature/description
    */

    public static void main(String[] args) {
        String input =
                "+----+------------+-------------+\n" +
                 "| id | recordDate | temperature |\n" +
                 "+----+------------+-------------+\n" +
                 "| 1  | 2015-01-01 | 10          |\n" +
                 "| 2  | 2015-01-02 | 25          |\n" +
                 "| 3  | 2015-01-03 | 20          |\n" +
                 "| 4  | 2015-01-04 | 30          |\n" +
                 "+----+------------+-------------+";

        createTable();
    }



    public static void createTable() {
        Connection connection = null;

        String sql = "create table if not exists Weather  (" +
                "id int," +
                "recordDate date," +
                "temperature int" +
                ")";

        try {
            connection = DBUtil.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            // SOLUTION ✅ :
            ResultSet resultSet = statement.executeQuery("SELECT w1.id FROM Weather w1 JOIN Weather w2 ON w1.recordDate = w2.recordDate + INTERVAL '1 day' WHERE w1.temperature > w2.temperature;");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id "));
            }
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
