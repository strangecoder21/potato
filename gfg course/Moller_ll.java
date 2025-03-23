import java.util.Arrays;

public class Moller_ll {
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    };
    /* 
    static Node push(Node head,int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        return head;
    }
    static boolean isloop(Node head){
        while(head!=null){
            if(head.flag==1){
                return true;
            }
            head.flag=1;
            head=head.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head=null;
        head=push(head, 1);
        head=push(head, 2);
        head=push(head, 3);
        head.next.next=head;
        if(isloop(head)){
            System.out.println("found");
        }else{
            System.out.println("not");
        }
    }

    */
    Node llreverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
    static class node{
        int val;
        node next;
        public node(int val){
            this.val=val;
        }
    }
    node sortedmerge(node a,node b){
        
        node result=null;
        if(a==null){ return b;}
        if(b==null){ return a;}
        if(a.val<=b.val){
            result=a;
            result.next=sortedmerge(a.next, b);
        }
        else{
            result=b;
            result.next=sortedmerge(a, b.next);
        }
        return result;
    }
    node mergesort(node head){
        if(head==null || head.next==null){
            return head;
        }
        node middle=getmid(head);
        node nextofmiddle=middle.next;
        middle.next=null;
        node left=mergesort(head);
        node right=mergesort(nextofmiddle);
        node sortedlist=sortedmerge(left, right);
        return sortedlist;
    }
    public static node getmid(node head){
        if(head==null){ return head;}
        node slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    void removesduplicatesfromsortedlist(node head){
        node curr=head;
        while(curr!=null){
            node temp=curr;
            while(temp!=null && temp.val==curr.val){
                temp=temp.next;
            }
            curr.next=temp;
            curr=curr.next;
        }
    }
    void sortlistof012(Node head){
        int count[]={0,0,0};
        Node ptr=head;
        while(ptr!=null){
            count[ptr.data]++;
            ptr=ptr.next;
        }
        int i=0;
        ptr=head;
        while(ptr!=null){
            if(count[i]==0){
                i++;
            }else{
                ptr.data=i;
                --count[i];
                ptr=ptr.next;
            }
        }
    }
}