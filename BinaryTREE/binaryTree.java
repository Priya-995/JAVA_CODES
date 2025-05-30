import java.util.*;
public class binaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class binary_tree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes); 
            return newNode;
        }

    }
    public static void preorder(Node root){     //O(n)
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){    //O(n)
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){   //O(n)
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
               System.out.println();
               if(q.isEmpty()){
                break;
               }
               else{
                q.add(null);
               }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }

            }
        }
    }
    public static int countNodes(Node root){  // O(n)
        if(root==null){
            return 0;
        }
       int leftNodes= countNodes(root.left);
       int rightNodes=countNodes(root.right);
       return leftNodes+rightNodes+1;
    }
    public static int sumOfNodes(Node root){  // O(n)
        if(root==null){
            return 0;
        }
       int leftSum= sumOfNodes(root.left);
       int rightSum=sumOfNodes(root.right);
       return leftSum+rightSum+root.data;
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lheight=height(root.left);
        int rheight=height(root.right);
        int myHeight=Math.max(lheight,rheight)+1;
        return myHeight;
    }
    public static int diameter(Node root){    // O(n^2)   //approach 1
        if(root==null){
            return 0;
        }
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3=height(root.left)+height(root.right)+1;
        return Math.max(diam2,Math.max(diam1,diam2));
    }
    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht, int diam){   //constructor
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static TreeInfo diameter2(Node root){   //O(n)     //approach 2 to cal. diameter
         if(root==null){
            return new TreeInfo(0,0);

         }
         TreeInfo left=diameter2(root.left);
         TreeInfo right=diameter2(root.right);
         int myHeight=Math.max(left.ht,right.ht)+1;
         
         int diam1=left.diam;
         int diam2=right.diam;
         int diam3=left.ht+right.ht+1;

         int mydiam=Math.max(Math.max(diam1,diam2),diam3);
         TreeInfo myInfo=new TreeInfo(myHeight,mydiam);
         return myInfo;
    }


    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binary_tree tree=new binary_tree();
        Node root=tree.buildTree(nodes);
        // System.out.println(root.data);
      
        System.out.println(diameter2(root).diam);
        
    }
}
