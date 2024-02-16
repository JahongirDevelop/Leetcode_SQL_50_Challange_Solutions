package soqq.uz.leetcode.medium;

public class Problem_1045 {
    /*
      Paths :
       https://leetcode.com/problems/customers-who-bought-all-products/
    */

    // Solution :
    /* SELECT  customer_id FROM Customer GROUP BY customer_id
        HAVING COUNT(distinct product_key) = (SELECT COUNT(product_key) FROM Product); */
}
