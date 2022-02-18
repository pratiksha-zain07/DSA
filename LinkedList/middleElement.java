class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         //check if linkedlist has no node or contains only one node.
         if(head == null || head.next == null){
             return head.data;
         }
        
        
        //getmiddle 
        Node slow = head;
        Node fast = head;
        
        //if fast = null then null.next will give an error
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
         
         
         
    }
}
