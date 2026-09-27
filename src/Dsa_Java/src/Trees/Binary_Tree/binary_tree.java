package Dsa_Java.src.Trees.Binary_Tree;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}
class binaryTree{
    Node root;
    binaryTree(){
        root = null;
    }
    void inorder(Node node){
        if(node == null) return;
        inorder(node.left);
        System.out.println(node.data + " ");
        inorder(node.right);
    }
    void preorder(Node node){
        if(node == null) return;
        System.out.println(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }
    void postorder(Node node){
        if(node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data + " ");
    }
    void levelorder(){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.remove();
            System.out.print(curr.data+ " ");
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
        System.out.println();
    }
    List<List<Integer>> level_order(){
        List<List<Integer>> main = new ArrayList<>();
        if(root == null) {
            return main;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelsize = q.size();

            List<Integer> sub = new ArrayList<>(levelsize);
            for(int i  = 0;i < levelsize;i++){
                Node curr = q.remove();
                sub.add(curr.data);
                if(curr.left != null){
                    q.add(curr.left);
                }if(curr.right != null){
                    q.add(curr.right);
                }
            }
            main.add(sub);
        }
        return main;
    }
    Node level_order_sucessor(int value){
        if(root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
           Node curr = q.remove();
           if(curr.left != null) {
               q.add(curr.left);
           }
           if(curr.right != null) q.add(curr.right);
           if(curr.data == value) break;
        }
        return q.peek();
    }
}
public class binary_tree{
    public static void main(String[] args){
        binaryTree bt = new binaryTree();
        bt.root = new Node(25);
        bt.root.left = new Node(56);
        bt.root.right = new Node(34);
        bt.root.left.left = new Node(90);
        bt.root.left.right = new Node(23);
        bt.root.right.right = new Node(67);
        bt.root.right.left = new Node(77);
        bt.inorder(bt.root);
        bt.levelorder();
        System.out.println(bt.level_order());
        System.out.println((bt.level_order_sucessor(77).data));
    }
}

