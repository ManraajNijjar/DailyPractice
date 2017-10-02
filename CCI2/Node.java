package CCI2;

public class Node {
	Node nextNode = null;
	int nodeValue;
	
	public Node(Node head, int valueToSet) {
		nextNode = head;
		nodeValue = valueToSet;
	}
	
	public Node(int valueToSet) {
		nodeValue = valueToSet;
	}
	
	public void setNextnode(Node newNext) {
		nextNode = newNext;
	}
}
