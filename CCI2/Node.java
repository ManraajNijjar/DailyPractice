package CCI2;

public class Node {
	Node nextNode;
	int nodeValue;
	
	public Node(Node head, int valueToSet) {
		nextNode = head;
		nodeValue = valueToSet;
	}
}
