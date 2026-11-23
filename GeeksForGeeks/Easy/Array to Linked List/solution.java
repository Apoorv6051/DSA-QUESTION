/* Linked List Node Structure
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
    public Node arrayToList(int arr[]) {
        // code here
       if(arr.length == 0){
           return null;
       }
       // create the head node
       
       Node head = new Node(arr[0]);
       // initially tail points to head
       Node tail = head;
       
       // traverse the array from index 1
       for( int i =1 ; i < arr.length; i++){
           
           // create new node
           Node newNode = new Node(arr[i]);
           
           // connect the previous node to the new Node
           
           tail.next= newNode;
           
           // move tail to the newely created node
           tail = newNode;
           
       }
       // retunr the first node
       return head;
        
    }
}
