package com.treepractice;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {

	@Test
	public void given3NumberswhenAddedToBSTShouldReturnSize3() {
		MyBinaryTree<Integer>myBinaryTree=new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size=myBinaryTree.getSize();
		int expected=3;
		Assert.assertEquals(expected, size);
	}

}
