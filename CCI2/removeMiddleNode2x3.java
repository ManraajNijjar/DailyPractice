package CCI2;

public class removeMiddleNode2x3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tailNode = new Node(10);
		Node secondNode = new Node(tailNode, 8);
		Node thirdNode = new Node(secondNode, 6);
		Node fourthNode = new Node(thirdNode, 8);
		Node fifthNode = new Node(fourthNode, 6);
		Node sixthNode = new Node(fifthNode, 7);
		removeMiddleNode(thirdNode);
	}
	
	public static void removeMiddleNode(Node nodeForRemoval) {
		Node nodeToCopyValue = nodeForRemoval.nextNode;
		nodeForRemoval.nodeValue = nodeToCopyValue.nodeValue;
		nodeForRemoval.nextNode = nodeToCopyValue.nextNode;
	}

}
