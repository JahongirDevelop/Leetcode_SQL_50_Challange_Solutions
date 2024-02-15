package soqq.uz.leetcode.medium;

public class Problem_585 {
    /*
      Paths :
       https://leetcode.com/problems/investments-in-2016
    */


    // Solution :

    /*SELECT CAST(SUM(tiv_2016) AS NUMERIC(10, 2)) AS tiv_2016
FROM Insurance
WHERE tiv_2015 IN (
    SELECT tiv_2015
    FROM Insurance
    GROUP BY tiv_2015
    HAVING COUNT(*) > 1
)
AND (lat, lon) NOT IN (
    SELECT lat, lon
    FROM Insurance
    GROUP BY lat, lon
    HAVING COUNT(*) > 1
);
 */
}
