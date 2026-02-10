import java.util.*; 
    
BinarytreeNode{
    int data;
    Node left, right;

    Node(int value) {
            data = value;
            left = right = null;
        }
}

public class Binarytree
{
    Node root=null;

    public void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to insert into the binary tree:");
        int value = sc.nextInt();
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            System.out.println("Inserted at root");
            return;
        }
    Node current = root;
    while (true)  {
        System.out.println("Current node: " + current.data);
        System.out.println("Insert left or right of: " + current.data + "? L=1 or R=0");
        int ch= sc.nextInt();
        if(ch==1){
            if(current.left==null){
                current.left=newNode;
                break;
            }
            else{
            current=current.left;
            break;
            }
        }
        else{
            if(current.right==null){
                current.right=newNode;
                break;
            }
            else{
            current=current.right;
            break;
            }
        }

    }

    
}
}
public void main(String[] args) {
        Binarytree tree = new Binarytree();
        tree.insert();
    }