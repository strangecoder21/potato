import java.util.LinkedList;
import java.util.Queue;

public class MolleTree {
    static class node{
        node left;
        node right;
        int key;
        node(int x){
            key=x;
        }
    }
    void inorder(node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key);
            inorder(root.right);
        }
    }
    void preorder(node root){
        if(root!=null){
            System.out.print(root.key);
            preorder(root.left);
            preorder(root.right);
        }
    }
    int height(node root){
        if(root==null){
            return 0;
        }else{
            return Math.max(height(root.left),height(root.right))+1;
        }
    }
    int getmax(node root){
        if(root==null){
            return 0;
        }else{
            return Math.max(root.key, Math.max(getmax(root.left), getmax(root.right)));
        }
    }
    node searchinbst(node root, int x){
        if(root ==null || root.key==x){
            return root;
        }
        if(root.key<x){
            return searchinbst(root.right,x);
        }
        else{
            return searchinbst(root.left,x);
        }
    }
    static void printlevelordertraversallinebyline(node root){
        if(root==null){
            return ;
        }
        Queue<node> q =new LinkedList<node>();
        q.add(root);
        while (true) {
            int nodeCount=q.size();
            if(nodeCount==0){
                break;
            }
            while(nodeCount>0){
                node node=q.peek();
                System.out.print(node.key);
                q.remove();
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
                nodeCount--;
            }
            System.out.println();
        }
    }
    static int maxwidth(node root){
        if(root==null){
            return 0;
        }
        Queue<node> q= new LinkedList<node>();
        q.push(root);

    }
    public static void main(String[] args) {
        MolleTree obj = new MolleTree();
        node root=new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.right=new node(6);
 
        printlevelordertraversallinebyline(root);
    }
}

