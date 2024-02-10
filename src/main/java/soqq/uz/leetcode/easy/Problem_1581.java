package soqq.uz.leetcode.easy;

public class Problem_1581 {
     /*
      Paths :
        https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions
    */

    // Solution :

    /* select v.customer_id, count(distinct v.visit_id) as count_no_trans
    from Visits as v left join Transactions as t on t.visit_id = v.visit_id where t.visit_id is null
    group by v.customer_id; */
}
