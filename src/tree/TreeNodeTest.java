package tree;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 14:40 2020/3/10
 *@Modified By:
 */

//前序遍历的递归实现与非递归实现
import java.util.Stack;
public class TreeNodeTest
{
    public static void main(String[] args)
    {
        TreeNode[] node = new TreeNode[10];//以数组形式生成一棵完全二叉树
        for(int i = 0; i < 10; i++)
        {
            node[i] = new TreeNode(i);
        }
        for(int i = 0; i < 10; i++)
        {
            if(i*2+1 < 10)
                node[i].left = node[i*2+1];
            if(i*2+2 < 10)
                node[i].right = node[i*2+2];
        }

        preOrderRe(node[0]);
    }

    public static void preOrderRe(TreeNode biTree)
    {//递归实现
        System.out.println(biTree.value);
        TreeNode leftTree = biTree.left;
        if(leftTree != null)
        {
            preOrderRe(leftTree);
        }
        TreeNode rightTree = biTree.right;
        if(rightTree != null)
        {
            preOrderRe(rightTree);
        }
    }

    public static void preOrder(TreeNode biTree)
    {//非递归实现
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(biTree != null || !stack.isEmpty())
        {
            while(biTree != null)
            {
                System.out.println(biTree.value);
                stack.push(biTree);
                biTree = biTree.left;
            }
            if(!stack.isEmpty())
            {
                biTree = stack.pop();
                biTree = biTree.right;
            }
        }
    }

    public static void midOrderRe(TreeNode biTree) {
        //递归中序遍历
        if (biTree == null) {
            return;
        }
        midOrderRe(biTree.left);
        System.out.println(biTree.value);
        midOrderRe(biTree.right);
    }

    public static void middleorderTraversal(TreeNode root) {/**
    * @Author:BHR
    * @Description: 非递归中序遍历
    * @Date:2020/3/16 18:05
    */
        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
        TreeNode node = root;
        while (node != null || !treeNodeStack.isEmpty()) {
            while (node != null) {
                treeNodeStack.push(node);
                node = node.left;
            }
            if (!treeNodeStack.isEmpty()) {
                node = treeNodeStack.pop();
                System.out.print(node.value + " ");
                node = node.right;
            }
        }
    }
    public static void postorderTraversal(TreeNode root) {
        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
        TreeNode node = root;
        TreeNode lastVisit = root;
        while (node != null || !treeNodeStack.isEmpty()) {
            while (node != null) {
                treeNodeStack.push(node);
                node = node.left;
            }
            //查看当前栈顶元素
            node = treeNodeStack.peek();
            //如果其右子树也为空，或者右子树已经访问
            //则可以直接输出当前节点的值
            if (node.right == null || node.right == lastVisit) {
                System.out.print(node.value + " ");
                treeNodeStack.pop();
                lastVisit = node;
                node = null;
            } else {
                //否则，继续遍历右子树
                node = node.right;
            }
        }
    }

    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        Mirror(root.left);
        Mirror(root.right);

    }
}

class TreeNode//节点结构
{
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
    }
}


