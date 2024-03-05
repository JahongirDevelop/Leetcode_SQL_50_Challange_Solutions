package soqq.uz.leetcode.easy;

public class Problem_1667_Fix_Names_in_a_Table {
    /*
      Paths :
       https://leetcode.com/problems/fix-names-in-a-table
    */

    // Solution :
    /* SELECT
    user_id,
    CONCAT(UPPER(SUBSTRING(name, 1, 1)), LOWER(SUBSTRING(name FROM 2))) AS name
FROM
    Users
ORDER BY
    user_id;
     */
}
