package com.niks.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class Trees {


  public static TreeNode node;

  public static class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
  }

  public static class Linkedlistnode {
    int data;
    Linkedlistnode prev;
    Linkedlistnode next;
  }

  public static void main(String[] args) {

    // Binary Tree
    TreeNode root1 = new TreeNode();
    root1.data = 1;
    root1.left = new TreeNode();
    root1.left.data = 2;
    root1.right = new TreeNode();
    root1.right.data = 2;
    root1.left.left = new TreeNode();
    root1.left.left.data = 3;
    root1.left.right = new TreeNode();
    root1.left.right.data = 3;
    root1.right.left = new TreeNode();
    root1.right.left.data = 3;
    root1.right.right = new TreeNode();
    root1.right.right.data = 3;



    // Binary Tree
    TreeNode root2 = new TreeNode();
    root2.data = 1;
    root2.left = new TreeNode();
    root2.left.data = 2;
    root2.right = new TreeNode();
    root2.right.data = 2;
    root2.left.left = new TreeNode();
    root2.left.left.data = 3;
    root2.left.right = new TreeNode();
    root2.left.right.data = 3;
    root2.right.left = new TreeNode();
    root2.right.left.data = 3;
    root2.right.right = new TreeNode();
    root2.right.right.data = 3;


    // Binary Search Tree
    //
    TreeNode root3 = new TreeNode();
    root3.data = 15;
    root3.left = new TreeNode();
    root3.left.data = 10;
    root3.right = new TreeNode();
    root3.right.data = 20;
    root3.left.left = new TreeNode();
    root3.left.left.data = 9;
    root3.left.right = new TreeNode();
    root3.left.right.data = 12;
    root3.right.left = new TreeNode();
    root3.right.left.data = 16;
    root3.right.right = new TreeNode();
    root3.right.right.data = 24;



    // Binary Search Tree
    //
    TreeNode root4 = new TreeNode();
    root4.data = 15;
    root4.left = new TreeNode();
    root4.left.data = 10;
    root4.right = new TreeNode();
    root4.right.data = 20;
    root4.left.left = new TreeNode();
    root4.left.left.data = 9;
    root4.left.right = new TreeNode();
    root4.left.right.data = 12;
    root4.right.left = new TreeNode();
    root4.right.left.data = 16;
    root4.right.right = new TreeNode();
    root4.right.right.data = 24;
    root4.right.right.right = new TreeNode();
    root4.right.right.right.data = 30;
    // SubTreee



    // Calling code
    Trees t = new Trees();
    // t.inOrderTraversal(root1);
    // t.preOrderTraversal(root1);
    // t.postOrderTraversal(root1);
    // System.out.println(t.isBST(root3, Integer.MIN_VALUE, Integer.MAX_VALUE));
    // t.levelOrderTraversalUsingQueue(root3);
    // t.levelOrderTraversalUsingStacksZigzag(root4);
    t.BSTtoDoubleLinkedList(root3);

  }


  public void inOrderTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    inOrderTraversal(root.left);
    System.out.println(root.data);
    inOrderTraversal(root.left);
  }

  public void preOrderTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    System.out.println(root.data);
    preOrderTraversal(root.left);
    preOrderTraversal(root.right);
  }

  public void postOrderTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    postOrderTraversal(root.left);
    postOrderTraversal(root.right);
    System.out.println(root.data);
  }

  /**
   * 
   */
  public void levelOrderTraversal() {

  }

  /**
   * 
   */
  public void zigzagtraversal() {

  }

  /**
   * 
   */
  public void levelOrderTraversalUsingQueue(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    if (root != null) {
      queue.add(root);
    }
    boolean ltr = false;
    while (queue.size() != 0) {
      TreeNode node = queue.poll();
      System.out.println(node.data);
      if (!ltr) {
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
        ltr = !ltr;
      } else {
        if (node.right != null) {
          queue.add(node.left);
        }
        if (node.left != null) {
          queue.add(node.right);
        }
        ltr = !ltr;
      }
    }

  }



  public void levelOrderTraversalUsingQueueZigzag(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    if (root != null) {
      queue.add(root);
    }
    boolean ltr = false;
    while (queue.size() != 0) {
      TreeNode node = queue.poll();
      System.out.println(node.data);
      if (!ltr) {
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
        ltr = !ltr;
      } else {
        if (node.right != null) {
          queue.add(node.left);
        }
        if (node.left != null) {
          queue.add(node.right);
        }
        ltr = !ltr;
      }
    }

  }



  /**
   * @param root
   */
  public void levelOrderTraversalUsingStacksZigzag(TreeNode root) {

    // Number of levels??

    Stack<TreeNode> evenNodestack = new Stack<>();
    Stack<TreeNode> oddNodestack = new Stack<>();
    evenNodestack.push(root);
    while (!evenNodestack.isEmpty()) {
      TreeNode temp = evenNodestack.pop();
      System.out.println(temp.data);
      if (temp.left != null) {
        oddNodestack.push(temp.left);
      }
      if (temp.right != null) {
        oddNodestack.push(temp.right);
      }
      while (!oddNodestack.isEmpty()) {
        TreeNode temp2 = oddNodestack.pop();
        System.out.println(temp2.data);
        if (temp2.right != null) {
          evenNodestack.push(temp2.right);
        }
        if (temp2.left != null) {
          evenNodestack.push(temp2.left);
        }
      }
    }
  }

  public boolean isMirrorImage(TreeNode root) {
    return true;
  }

  public boolean isSymmetric(TreeNode root) {
    return false;
  }


  /**
   * @param root
   * @param minvalue
   * @param maxvalue
   * @return
   */
  public boolean isBST(TreeNode root, int minvalue, int maxvalue) {
    if (root == null) {
      return true;
    }
    if (root.data < minvalue || root.data > maxvalue) {
      return false;
    }
    return isBST(root.left, minvalue, root.data) && isBST(root.right, root.data, maxvalue);
  }


  public boolean isSymmetricBinaryTree(TreeNode root) {
    if (root == null || (root.left == null && root.right == null)) {
      return true;
    }
    return isIdentical(root.left, root.right) && isIdentical(root.right, root.left);
  }

  /**
   * @param root1
   * @param root2
   * @return
   */
  public boolean isIdentical(TreeNode root1, TreeNode root2) {
    if (root1 != null || root2 != null) {
      return false;
    }
    if ((root1 != null && root2 != null) && (root1.data == root2.data)) {
      return true;
    }
    return false;
  }



  /**
   * @param root
   * @return
   */
  public int heightOfATree(TreeNode root) {
    if (root.left == null && root.right == null) {
      return 1;
    }
    return 1 + Math.max(heightOfATree(root.left), heightOfATree(root.right));
  }

  /**
   * @param root
   * @return
   */
  public int diameterOfATree(TreeNode root) {
    // A diameter can pass thru root Node or may not pass thru RootNode
    // If a diameter passes thru RootNode then Diameter of a tree is height of left sub tree +height
    // of Right Subtree +1
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null) {
      return 1;
    }
    int lheight = heightOfATree(root.left);
    int rheight = heightOfATree(root.right);
    return Math.max(Math.max(diameterOfATree(root.left), diameterOfATree(root.right)),
        lheight + rheight + 1);
  }



  /**
   * @param root
   * @param level
   * @return
   * 
   *         Print all Nodes until a particular level
   */
  public ArrayList<LinkedList<TreeNode>> getAllLinkedListsOfEachLevel(TreeNode root, int depth) {
    int currentDepth = 0;
    ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
    if (currentDepth > depth) {
      return lists;
    }
    Stack<TreeNode> evenStack = new Stack<Trees.TreeNode>();
    if (root != null) {
      evenStack.push(root);
    }
    Stack<TreeNode> oddStack = new Stack<Trees.TreeNode>();
    while (!evenStack.isEmpty() || !oddStack.isEmpty()) {
      LinkedList<TreeNode> ll = new LinkedList<TreeNode>();
      while (!evenStack.isEmpty()) {
        TreeNode temp = evenStack.pop();
        ll.add(temp);
        if (temp.left != null) {
          oddStack.push(temp.left);
        }
        if (temp.right != null) {
          oddStack.push(temp.right);
        }
      }
      lists.add(ll);
      ll = new LinkedList<TreeNode>();
      while (!oddStack.isEmpty()) {
        TreeNode temp2 = oddStack.pop();
        ll.add(temp2);
        if (temp2.left != null) {
          evenStack.push(temp2.left);
        }
        if (temp2.right != null) {
          evenStack.push(temp2.right);
        }
      }
    }
    return lists;
  }

  public TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) {
      return root;
    }
    if (root == p || root == q) {
      return root;
    }
    TreeNode left = findLCA(root.left, p, q);
    TreeNode right = findLCA(root.right, p, q);
    if (left != null && right != null) {
      return root;
    }
    return left != null ? left : right;
  }



  /**
   * @param root
   */
  public ArrayList<LinkedList<Integer>> printAllArrayLists(TreeNode root) {
    ArrayList<LinkedList<Integer>> results = new ArrayList<LinkedList<Integer>>();
    if (root == null) {
      LinkedList<Integer> result = new LinkedList<Integer>();
      results.add(result);
      return results;
    }
    LinkedList<Integer> prefix = new LinkedList<>();
    ArrayList<LinkedList<Integer>> leftSublist = printAllArrayLists(root.left);
    ArrayList<LinkedList<Integer>> rightSublist = printAllArrayLists(root.right);

    for (LinkedList<Integer> leftList : leftSublist) {
      for (LinkedList<Integer> rightList : rightSublist) {
        ArrayList<LinkedList<Integer>> weavedList = new ArrayList<LinkedList<Integer>>();
        weaveList(leftList, rightList, weavedList, prefix);
        results.addAll(weavedList);
      }
    }
    return results;
  }


  private void weaveList(LinkedList<Integer> leftList, LinkedList<Integer> rightList,
      ArrayList<LinkedList<Integer>> weavedList, LinkedList<Integer> prefix) {
    if (leftList.isEmpty() || rightList.isEmpty()) {
      LinkedList<Integer> tempList = (LinkedList<Integer>) prefix.clone();
      tempList.addAll(leftList);
      tempList.addAll(rightList);
      weavedList.add(tempList);
      return;
    }

  }


  public void BSTtoDoubleLinkedList(TreeNode head) {
    Linkedlistnode start;
    if(head==null){
      return 
    }
  }


}
