package CCI2;

import java.util.ArrayList;

public class paritionLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tailNode = new Node(10);
		Node secondNode = new Node(tailNode, 8);
		Node thirdNode = new Node(secondNode, 6);
		Node fourthNode = new Node(thirdNode, 8);
		Node fifthNode = new Node(fourthNode, 6);
		Node sixthNode = new Node(fifthNode, 7);
		
		Node testNode = partitionLinkedList(8, sixthNode);
		System.out.print(testNode);
	}
	
	public static Node partitionLinkedList(int partitionSplitNumber, Node currentNode) {
		ArrayList<Node> frontNodes = new ArrayList<Node>(0);
		ArrayList<Node> endNodes = new ArrayList<Node>(0);
		while(currentNode.nextNode != null) {
			if(currentNode.nodeValue < partitionSplitNumber) {
				frontNodes.add(currentNode);
			} else {
				endNodes.add(currentNode);
			}
			currentNode = currentNode.nextNode;
		}
		
		if((frontNodes.size() == 0) || (endNodes.size() == 0) ){
			return currentNode;
		}
		
		Node previousNodeInArray = frontNodes.get(0);
		for(int nodeIter = 1; nodeIter < frontNodes.size(); nodeIter++) {
			previousNodeInArray.nextNode = frontNodes.get(nodeIter);
			previousNodeInArray = frontNodes.get(nodeIter);
		}
		Node nextNodeInArray = endNodes.get(0);
		for(int nodeIter = 1; nodeIter < endNodes.size(); nodeIter++) {
			nextNodeInArray.nextNode = endNodes.get(nodeIter);
			nextNodeInArray = endNodes.get(nodeIter);
		}
		
		int frontNodesFinalNodeIndex = frontNodes.size() - 1;
		frontNodes.get(frontNodesFinalNodeIndex).nextNode = endNodes.get(0);
		
		return frontNodes.get(0);
	}

}
