package org.jsp;

public class Test {
	public static void main(String[] args) {
		BST b = new BST();
//		Node root=new Node(50);
		int[] arr = { 50, 20, 8, 35, 90, 65, 98, 5, 12, 61, 75 };
		Node root = new Node(arr[0]);
		for (int i = 1; i <= arr.length - 1; i++) {
			b.insert(root, arr[i]);
		}
		System.out.println("==========preorder============");
		b.preOrder(root);
		System.out.println();
		System.out.println("=============inorder=============");
		b.inOrder(root);
		System.out.println();
		System.out.println("==========postorder============");
		b.postOrder(root);
	}
}
