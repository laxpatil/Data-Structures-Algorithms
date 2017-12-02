/**
 * 
 */
package leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author lapatil
 *
 */
class WordNode {
	String word;
	int numSteps;

	public WordNode(String word, int numSteps) {
		this.word = word;
		this.numSteps = numSteps;
	}
}

public class WordLadder {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {

		Set<String> wordSet = new HashSet<String>(wordList);
		LinkedList<WordNode> queue = new LinkedList<WordNode>();
		queue.add(new WordNode(beginWord, 1));
		
		if(!wordSet.contains(endWord))
		{
			return 0;
		}
        wordSet.add(endWord);
		
        
        
		while (!queue.isEmpty()) {
			WordNode top =  queue.remove();
			String word = top.word;
			
			if(word.equals(endWord))
			{
				return top.numSteps;
			}
			
			char[] arr =  word.toCharArray();
			for(int i=0;i<arr.length;i++) {
				for(char j='a';j<='z';j++)
				{
					char temp=arr[i];
					if(j!=arr[i])
					{
						arr[i]=j;
					}
					
					String newWord = new String(arr);
					if(wordSet.contains(newWord)) {
						queue.add(new WordNode(newWord, top.numSteps+1));
						wordSet.remove(newWord);
					}
					
					arr[i]=temp;
					
				}
			}
			
		}

		return 0;

	}

}
