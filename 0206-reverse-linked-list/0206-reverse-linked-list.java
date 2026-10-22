/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
         if(head == null){
        return null;
    }
    ListNode dummy = new ListNode(head.val);
    ListNode temp = head.next;
    while(temp!= null){
        ListNode newNode=new ListNode(temp.val);
        newNode.next=dummy;
        dummy=newNode;
        temp=temp.next;
    }
    return dummy;
   }
}
    // int count=0;

    // ListNode temp=head;
    // while(temp!=null){
    //     temp=temp.next;
    //     count++;
    // }
    // Integer[] arr=new Integer[count];
    // temp=head;
    // int i=count-1;
    // while(temp!=null){
    //     arr[i]=temp.val;
    //     i--;
    //     temp=temp.next;
    // }
    // temp=head;
    // i=0;
    // while(temp!=null){
    //     temp.val=arr[i];
    //     i++;
    //     temp=temp.next;
    // }
    // return head;
   