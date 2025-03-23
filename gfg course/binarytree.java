import java.util.*;

class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key=k;
    }
}
public class binarytree{
    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.key+" ");
            inorder(root.right);
        }
    }
    static void preorder(Node root){
        if(root!=null){
            System.out.println(root.key+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.key+" ");
        }
    }
    static int height(Node root){
        /*if(root==null){
            return 0;
        }else{                  for recursive way but the second one is iterative and travels all nodes only once
            return Math.max(height(root.left),height(root.right));
        }*/
        if(root == null){ return 0;}
        Queue<Node> q=new LinkedList();
        q.add(root);
        int height=0;
        while(1==1){
        int nodecount=q.size();
        if(nodecount==0){return height;}
        height++;
        while(nodecount>0){
            Node newnode = q.peek();
            q.remove();
            if(newnode.left!=null){
                q.add(newnode.left);
            }
            if(newnode.right!=null){
                q.add(newnode.right);
            }
            nodecount--;
        }
        }
    }
    static void printKDist(Node root,int k){
        if(root==null){ return;}
        if(k==0){ System.out.print(root.key+" ");}
        else{
            printKDist(root.left, k-1);
            printKDist(root.right, k-1);
        }
    }
    static void printLevel(Node root){
        if(root==null) return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty()==false){
            Node curr = q.poll();
            System.out.print(curr.key+"");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }
    static void printLevelOrderLine(Node root){
        if(root==null) return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while(q.size()>1){
            Node curr = q.poll();
            if(curr==null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.key+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }
    static void printLevelOrderLine2(Node root){
        if(root==null) return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty()==false){
            int count = q.size();
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                System.out.print(curr.key+" ");
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            System.out.println();
        }
    }
    static int getSize(Node root){
        if(root==null){
            return 0;
        }
        else{
            return 1+getSize(root.left)+getSize(root.right);
        }
    }
    static int getMax(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }else{
            return Math.max(root.key,Math.max(getMax(root.left), getMax(root.right)));
        }
    }
    static int maxlevel=0;
    static void printLeft(Node root,int level){
        if(root==null) return;
        if(maxlevel<level){
            System.out.println(root.key+" ");
            maxlevel=level;
        }
        printLeft(root.left, level+1);
        printLeft(root.right, level+1);
        
    }
    static void printLeftView(Node root){
        printLeft(root, 1);
    }
    static void printLeftIterative(Node root){
        if(root==null){ return;}
        Queue<Node> q =new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty()==false){
            int count = q.size();
            for(int i=0;i<count;i++){
                Node curr = q.poll();
                if(i==0){
                    System.out.println(curr.key+" ");
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    static boolean isCSum(Node root){
        if(root == null){ return true;}
        if(root.left == null && root.right==null){
            return true;
        }
        int sum=0;
        if(root.left!=null){ sum+=root.left.key;}
        if(root.right!=null){sum+=root.right.key;}
        return(root.key==sum && isCSum(root.left) && isCSum(root.right));
    }
    static int isBalanced(Node root){
        if(root==null){return 0;}
        int lh = isBalanced(root.left);
        if(lh==-1){ return -1;}
        int rh = isBalanced(root.right);
        if(rh==-1){ return -1;}
        if(Math.abs(lh-rh)>1){
            return -1;
        }else{
            return Math.max(lh, rh)+1;
        }
    }
    static int maxWidth(Node root){
        if(root == null){return 0;}
        Queue<Node> q= new LinkedList<Node>();
        q.add(root);
        int res=0;
        while(q.isEmpty()==false){
            int count=q.size();
            res=Math.max(res,count);
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return res;
    }
    static Node prev=null;
    static Node BTToDLL(Node root){
        if(root==null){return root;}
        Node head= BTToDLL(root.left);
        if(prev==null){ head=root;}
        else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        BTToDLL(root.right);
        return head;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
    }
}