package com.review3;

import org.junit.Test;

import junit.framework.Assert;

public class BinaryMain {

	@Test
	public void test() {
		BinaryTree<Integer> values = new BinaryTree<>();
		values.add(10);
		values.add(3);
		values.add(54);
		values.add(23);
		values.add(5);
		values.add(6);
		int size = values.getSizeOfTheTree();
	    Assert.assertEquals(6, size);
	}
}
