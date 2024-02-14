package soqq.uz.leetcode.easy;

import java.sql.*;

public class Problem_595_Big_Countries {
    /*
      Paths :
        https://leetcode.com/problems/big-countries
    */
    public static void main(String[] args) {
        String input =
                " +-------------+-----------+---------+------------+--------------+\n" +
                "| name        | continent | area    | population | gdp          |\n" +
                "+-------------+-----------+---------+------------+--------------+\n" +
                "| Afghanistan | Asia      | 652230  | 25500100   | 20343000000  |\n" +
                "| Albania     | Europe    | 28748   | 2831741    | 12960000000  |\n" +
                "| Algeria     | Africa    | 2381741 | 37100000   | 188681000000 |\n" +
                "| Andorra     | Europe    | 468     | 78115      | 3712000000   |\n" +
                "| Angola      | Africa    | 1246700 | 20609294   | 100990000000 |\n" +
                "+-------------+-----------+---------+------------+--------------+ ";

        createTable();
    }



    public static void createTable() {
        String sql = "create table if not exists World (" +

                "name varchar," +
                "continent varchar," +
                "area int," +
                "population int," +
                "gdp bigint"+
                ")";

        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/leetcode_sql_50_challange_solutions", "postgres", "1");
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            // SOLUTION ✅ :
            ResultSet resultSet = statement.executeQuery("select name , population , area  from World where area >= 3000000 or  population >= 25000000; ");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name ") + resultSet.getString("population ") + resultSet.getInt("area "));
            }
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
