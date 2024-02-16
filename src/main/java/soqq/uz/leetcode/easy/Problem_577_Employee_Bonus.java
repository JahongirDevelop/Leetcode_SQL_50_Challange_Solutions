package soqq.uz.leetcode.easy;

import soqq.uz.leetcode.DBUtil;

import java.sql.*;

public class Problem_577_Employee_Bonus {
     /*
      Paths :
        https://leetcode.com/problems/employee-bonus
    */

    public static void main(String[] args) {
        String input =
                "Employee table:\n" +
                 "+-------+--------+------------+--------+\n" +
                 "| empId | name   | supervisor | salary |\n" +
                 "+-------+--------+------------+--------+\n" +
                 "| 3     | Brad   | null       | 4000   |\n" +
                 "| 1     | John   | 3          | 1000   |\n" +
                 "| 2     | Dan    | 3          | 2000   |\n" +
                 "| 4     | Thomas | 3          | 4000   |\n" +
                 "+-------+--------+------------+--------+\n" +

                 "Bonus table:\n" +
                 "+-------+-------+\n" +
                 "| empId | bonus |\n" +
                 "+-------+-------+\n" +
                 "| 2     | 500   |\n" +
                 "| 4     | 2000  |\n" +
                 "+-------+-------+";

        createTable();
    }



    public static void createTable() {
        Connection connection = null;
        String sql1 = "create table if not exists Employee (" +
                "empId int," +
                "name varchar," +
                "supervisor int," +
                "salary int" +
                ")";

        String sql2 = "create table if not exists Bonus (" +
                "empId int," +
                "bonus int" +
                ")";

        try {
            connection = DBUtil.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql1);
            statement.executeUpdate(sql2);
            // SOLUTION ✅ :
            ResultSet resultSet = statement.executeQuery("SELECT Employee.name,Bonus.bonus FROM Employee LEFT JOIN Bonus ON Employee.empID = Bonus.empID WHERE bonus < 1000 OR Bonus IS NULL ;");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name ") + resultSet.getInt("bonus"));
            }
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
