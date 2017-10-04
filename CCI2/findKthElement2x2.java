package CCI2;

import java.util.ArrayList;

public class findKthElement2x2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tailNode = new Node(10);
		Node secondNode = new Node(tailNode, 8);
		Node thirdNode = new Node(secondNode, 6);
		Node fourthNode = new Node(thirdNode, 8);
		Node fifthNode = new Node(fourthNode, 6);
		Node sixthNode = new Node(fifthNode, 7);
		System.out.print(findKthElement(sixthNode, 2));
		
	}
	
	public static Node findKthElement(Node currentNode, int specifiedDistance) {
		ArrayList<Node> listOfNodes = new ArrayList<Node>();
		listOfNodes.add(currentNode);
		
		while(currentNode.nextNode != null) {
			currentNode = currentNode.nextNode;
			listOfNodes.add(currentNode);
		}
		if (listOfNodes.size() < specifiedDistance) {
			return null;
		}
		
		return listOfNodes.get(listOfNodes.size() - specifiedDistance);
	}

}
