package CCI2;
import java.util.*;

public class removeDuplicates2x1 {

	public static void main(String[] args) {
		Node tailNode = new Node(10);
		Node secondNode = new Node(tailNode, 8);
		Node thirdNode = new Node(secondNode, 6);
		Node fourthNode = new Node(thirdNode, 8);
		Node fifthNode = new Node(fourthNode, 6);
		Node sixthNode = new Node(fifthNode, 7);
		
		removeDuplicates(sixthNode);
		
		
	}
	
	public static void removeDuplicates(Node currentNode) {
		Hashtable<Integer, Boolean> foundVals = new Hashtable<Integer, Boolean>();
		foundVals.put(currentNode.nodeValue, true);
		while(currentNode.nextNode != null) {
			Node nextNode = currentNode.nextNode;
			if(foundVals.get(nextNode.nodeValue) == null) {
				foundVals.put(nextNode.nodeValue, true);
				currentNode = nextNode;
			} else {
				if(nextNode.nextNode != null) {
					currentNode.nextNode = nextNode.nextNode;
				} else {
					currentNode.nextNode = null;
				}
			}
		}

	}

}
