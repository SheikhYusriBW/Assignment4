// Kabelo's Binary Tree
// 10/04/2023
// Kabelo Mbayi

public class BinaryTreeNode<Account>
{
   Account account;
   BinaryTreeNode<Account> left;
   BinaryTreeNode<Account> right;
   
   public BinaryTreeNode (Account account)
   {
      this.account = account;
      this.left = null;
      this.right = null;
   }
   
   BinaryTreeNode<Account> getLeft () { return left; }
   BinaryTreeNode<Account> getRight () { return right; }
}
