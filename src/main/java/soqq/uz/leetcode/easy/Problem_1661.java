package soqq.uz.leetcode.easy;

public class Problem_1661 {
    /*
      Paths :
        https://leetcode.com/problems/average-time-of-process-per-machine
    */

    // Solution :

    /* SELECT
    machine_id,
    ROUND(AVG(end_time - start_time)::numeric, 3) AS processing_time
FROM (
    SELECT
        machine_id,
        process_id,
        MAX(CASE WHEN activity_type = 'start' THEN timestamp END) AS start_time,
        MAX(CASE WHEN activity_type = 'end' THEN timestamp END) AS end_time
    FROM
        Activity
    GROUP BY
        machine_id,
        process_id
) AS subquery
GROUP BY
    machine_id;
      */
}
