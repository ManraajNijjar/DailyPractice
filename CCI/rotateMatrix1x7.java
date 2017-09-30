package CCI;

public class rotateMatrix1x7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrixSize = 3;
		int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int[][] rotatedMatrix = rotateMatrix(matrix, matrixSize);
		
		for(int iterator = 0; iterator < matrixSize; iterator++) {
			for(int subIter = 0; subIter < matrixSize; subIter++) {
				System.out.print(rotatedMatrix[iterator][subIter]);
			}
			System.out.println("");
		}
		
		
	}
	//Not in place method
	public static int[][] rotateMatrix(int[][] matrix, int matrixSize){
		int[][] tempMatrix = {new int[matrixSize],new int[matrixSize],new int[matrixSize]};
		
		for(int iterator = 0; iterator < matrixSize; iterator++) {
			for(int subIter = 0; subIter < matrixSize; subIter++) {
				tempMatrix[iterator][subIter] = matrix[2 - subIter][iterator];
			}
		}
		
		return tempMatrix;
	}

}
