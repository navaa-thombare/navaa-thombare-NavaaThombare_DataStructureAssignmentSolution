package com.greatlearning.question2.driver;

import com.greatlearning.question2.node.Node;

public class Driver {

	Node nextNode;
	Node prevNode;
	Node newNode;
	
	public static void main(String[] args) {
		Driver tree = new Driver();
		tree.nextNode = new Node(50);
		tree.nextNode.left = new Node(30);
		tree.nextNode.right = new Node(60);
		tree.nextNode.left.left = new Node(10);
		tree.nextNode.right.left = new Node(55);
		
		tree.processBST(tree.nextNode);
		
		tree.traverse(tree.nextNode);
		
		
		

	}
	
	void traverse(Node root)
	{
		if(root == null) return;
		System.out.print(root.getVal() + " ");
		traverse(root.getRight());
		
	}
	
	void processBST(Node root)
	{
		if(root == null) return ;
		processBST(root.left);
		Node rightNode = root.right;
		Node leftNode = root.left;
		
		if(newNode == null)
		{
			newNode = root ;
			root.left = null ;
			prevNode = root ;
		}
		
		else
		{
			prevNode.right = root ;
			root.left = null;
			prevNode = root;
		}
		
		processBST(rightNode);
	}

}
