package soqq.uz.leetcode.easy;

public class Problem_197 {
    /*
      Paths :
        https://leetcode.com/problems/rising-temperature/description
    */

    // Solution :

    /* SELECT w1.id FROM Weather w1 JOIN Weather w2 ON w1.recordDate = w2.recordDate + INTERVAL '1 day'
        WHERE w1.temperature > w2.temperature;  */
}
