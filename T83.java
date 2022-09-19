class Solution 
{
    public ListNode deleteDuplicates(ListNode head) 
    {
     if(head==null)
     return null;
     if(head.next==null)
     return head;
     if(head.val==head.next.val)
     {
         head=deleteDuplicates(head.next);
     }
     else
      {
          head.next=deleteDuplicates(head.next);
      }
      return head;
    }
}