package com.review3;


public class BinaryTree<K extends Comparable <K>> {

	private NodeOfBinary<K> root;
	public void add(K key) {
		
	}
	
	private NodeOfBinary<K> addRecursiveElements(NodeOfBinary<K> currentNode, K key){
		
		if(currentNode == null)
			return new NodeOfBinary<>(key);
		int elements = key.compareTo(currentNode.key);
		if(elements == 0)
			return currentNode;
		if(elements < 0) {
			currentNode.left = addRecursiveElements(currentNode.left, key);
		}
		else {
			currentNode.right = addRecursiveElements(currentNode.right, key);
		}
		return currentNode;	
	}
	
	public int getSizeOfTheTree() {
		return getSizeOfTheTreeRecursively(root);
		
	}
	
	private int getSizeOfTheTreeRecursively(NodeOfBinary<K> currentNode) {
		return currentNode == null ? 0
				:1 + this.getSizeOfTheTreeRecursively(currentNode.left) 
				+ this.getSizeOfTheTreeRecursively(currentNode.right);
	}
}


