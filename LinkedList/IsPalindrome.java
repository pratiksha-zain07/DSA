class Solution
{
    
    public Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        
        Node prev = head;
        Node curr = head.next;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;  // to point <- reverse
            prev = curr;
            curr = next;
        }
        
        head.next = null;
        head = prev;
        
        
        return prev;
    }
    
    public Node findMiddle(Node  head){
        Node fast = head;
        Node slow = head;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
        
    }
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        if(head == null || head.next == null){
            return true;
        }
        
        Node middle = findMiddle(head);
        Node secondHalfStart = reverse(middle.next);
        
        Node firstHalfStart = head;
        while(secondHalfStart != null){
            if(firstHalfStart.data != secondHalfStart.data){
                return false;
            }
            
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
            
        }
        return true;
        
    }    
}
