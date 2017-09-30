package CCI;

import java.util.ArrayList;

public class zeroMatrix1x8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {{0, 2},{4, 7},{7, 8}};
		int[][] zeroedMatrix = zeroMatrix(matrix);
		
		for(int iterator = 0; iterator < matrix.length; iterator++) {
			for(int subIter = 0; subIter < matrix[0].length; subIter++) {
				System.out.print(zeroedMatrix[iterator][subIter]);
			}
			System.out.println("");
		}
	}
	
	public static int[][] zeroMatrix(int[][] matrixForZeroing){
		int matrixColumnSize = matrixForZeroing.length;
		int matrixRowSize = matrixForZeroing[0].length;
		
		//Simple class that just contains 2 variables to hold Row and Column values and a constructor
		ArrayList<matrixLocation1x8> zeroLocations = new ArrayList<matrixLocation1x8>();
		
		for(int columnIterator = 0; columnIterator < matrixColumnSize; columnIterator++) {
			for(int rowIterator = 0; rowIterator < matrixRowSize; rowIterator++) {
				if (matrixForZeroing[columnIterator][rowIterator] == 0) {
					zeroLocations.add(new matrixLocation1x8(rowIterator, columnIterator));
				}
			}
		}
		
		for(int iteratorForZeros = 0; iteratorForZeros < zeroLocations.size(); iteratorForZeros++) {
			zeroColumnsAndRows(matrixForZeroing, zeroLocations.get(iteratorForZeros));
		}
		return matrixForZeroing;
	}
	
	private static void zeroColumnsAndRows(int[][] matrixForZeroing, matrixLocation1x8 location) {
		int matrixColumnSize = matrixForZeroing.length;
		int matrixRowSize = matrixForZeroing[0].length;
		
		for(int columnIterator = 0; columnIterator < matrixColumnSize; columnIterator++) {
			matrixForZeroing[columnIterator][location.matrixRow] = 0;
		}
		
		for(int rowIterator = 0; rowIterator < matrixRowSize; rowIterator++) {
			matrixForZeroing[location.matrixColumn][rowIterator] = 0;
		}
	}
}


