/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
   public ListNode addTwoNumbers(ListNode l1,ListNode l2) {
		int n1,n2,n3;
		int carry=0;  //初始化进位
		ListNode r=null;
		ListNode current = null;
		while(l1!=null || l2!=null){
			//取数操作
			if(l1==null){
				n1 = 0;
			}
			else{
				n1=l1.val;
				l1=l1.next;
			}
			 if (l2 == null){
                 n2 = 0;
             }else {
                 n2 = l2.val;
                 l2 = l2.next;
             }
			 //当前位两个数相加的和，带上进位符carry
			 n3 = n1+n2+carry;
			 carry = 0;
			// 若每位的两个数相加的和大于9，则carry=1
             if (n3 > 9){
                 n3 %= 10;
                 carry = 1;
             }
             // 存数操作
             if (r == null) {
                 r = new ListNode(n3);
                 current = r;
             } else {
                 current.next = new ListNode(n3);
                 current = current.next;
             }
         }
         // 最后如果输入的两个ListNode都遍历完了，但是进位符carry还为1，说明需要再进一位，则在返回的r后再添加1
         if (carry == 1){
             current.next = new ListNode(1);
         }
         return r;
		}
}
