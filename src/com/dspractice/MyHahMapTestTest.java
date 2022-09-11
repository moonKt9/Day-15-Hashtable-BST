package com.dspractice;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyHahMapTestTest {

	@Test
	public void givenASentenceWhenWordsAreAddedToListShouldReturnWordFrequency() {
		String sentence ="To be or not to be";
		
		MyHashMap<String,Integer>myHashMap=new MyHashMap<>();
		
		String[] words=sentence.toLowerCase().split(sentence);
		for(String word:words) {
			Integer value=myHashMap.get(word);
			if(value==null)
				value=1;
			else value=value+1;
			myHashMap.add(word,value);
		}
		int frequency=myHashMap.get("to");
		System.out.println(myHashMap);
		int expected = 2;
		Assert.assertEquals(expected , frequency);
		
			
		}
	}


