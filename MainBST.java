package com.greatlearning.GradedProject;

public class MainBST {

	BinarySearchTree node;
	BinarySearchTree prev = null;
	BinarySearchTree nHead = null;
void processBST(BinarySearchTree root)	{
if(root == null)return;
	processBST(root.left);
	BinarySearchTree rightNode = root.right;			
if(nHead == null)		{
	nHead = root;
	root.left = null;
	prev = root;	}
else	{
	prev.right = root;
	root.left = null;
	prev = root;	}
	processBST(rightNode);		}
void traverse(BinarySearchTree root)	{
if(root == null)return;
	System.out.print("    " + root.val +"") ;
	traverse(root.right);	}
public static void main(String[] args) {
System.out.println(" Welcome to Great Learning ") ;			
MainBST tree = new MainBST();
	tree.node = new BinarySearchTree(50);
	tree.node.left = new BinarySearchTree(30);
	tree.node.right = new BinarySearchTree(60);
	tree.node.left.left = new BinarySearchTree(10);
	tree.node.right.left= new BinarySearchTree(55);
	tree.processBST(tree.node);
	tree.traverse(tree.nHead);
}
} 