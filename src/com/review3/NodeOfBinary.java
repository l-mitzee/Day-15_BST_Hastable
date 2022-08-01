package com.review3;

public class NodeOfBinary<K extends Comparable <K>> {
	K key;
	NodeOfBinary<K> left;
	NodeOfBinary<K> right;
	public NodeOfBinary(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

}
