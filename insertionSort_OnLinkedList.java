/*
Algorithm:
Let input linked list is sorted in increasing order.

1) If Linked list is empty then make the node as
   head and return it.
2) If the value of the node to be inserted is smaller
   than the value of the head node, then insert the node
at the start and make it head.
3) In a loop, find the appropriate node after
   which the input node (let 9) is to be inserted.
   To find the appropriate node start from the head,
   keep moving until you reach a node GN (10 in
   the below diagram) who's value is greater than
   the input node. The node just before GN is the
appropriate node (7).
4) Insert the node (9) after the appropriate node
   (7) found in step 3.
 */

public class insertionSort_OnLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next=null;
        }
    }
    void sortedInsert(Node new_node){
        if(head==null||head.data>=new_node.data){
            new_node.next=head;
            head=new_node;

        }else{
            Node current=head;
            while(current.next!=null && current.next.data<new_node.data){
                current=current.next;
            }
            new_node.next=current.next;
            current.next=new_node;
        }
    }
    Node newNode(int data){
        Node x=new Node(data);
        return x;
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print("->"+temp.data);
            temp=temp.next;
        }

    }

    public static void main(String[] args) {
        insertionSort_OnLinkedList ls=new insertionSort_OnLinkedList();
        ls.sortedInsert(ls.newNode(7));
        ls.sortedInsert(ls.newNode(3));
        ls.sortedInsert(ls.newNode(9));
        ls.sortedInsert(ls.newNode(1));
        System.out.println("The list is :- ");
        ls.print();
    }
}
