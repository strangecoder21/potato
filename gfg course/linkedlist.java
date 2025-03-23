public class linkedlist {
    static void rprint(Node head){
        if(head==null){
            return;
        }
        System.out.println(head.data + " ");
        rprint(head.next);
    }
    static Node InsertBegin(Node head, int x){
        Node temp = new Node(x);
        temp.next=head;
        return temp;
    }
    static Node InsertEnd(Node head,int x){
        Node temp = new Node(x);
        if(head==null){
            return temp;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }
    public static void main(String[] args) {
        Node head= new Node(10);
        Node temp1= new Node(20);
        Node temp2= new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        head = InsertBegin(head, 30);
        head = InsertBegin(head, 20);
        head = InsertEnd(head, 50);
        rprint(head);
    }
}
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}