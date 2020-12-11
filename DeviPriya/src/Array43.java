public class Array43 {
    public static void main(String[] args) {  
        // creating the first matrix using arrays
		int[][] a= { { 1, 2, 3 }, { 4, 5, 6 } };

		// creating the second matrix using two dimension array
		int[][]b = { { 1, 1 }, { 2, 2 }, { 3, 3 } };

		// Matrix 1 rows and columns length
		int rows1 = a.length;
		int columns1 = b[0].length;

		// Matrix 2 rows and columns length
		int rows2 = a.length;
		int columns2 = b[1].length;

		// output array for storing the multiplication result
		int[][] result = new int[rows1][columns2];

		// Calling a function for matrix multiplication core logic
		doMatricMultiplication( a,b, rows1,rows2,columns1, columns2, result);

		// printing the result
		//
		doPrintResultMatric(result);

	}

	
	private static void doMatricMultiplication(int[][] a, int[][] b, int rows1,int rows2, int columns1, int columns2,
			int[][] result) {

		// matrix addition core logic
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns2; j++) {
				for (int k = 0; k < columns1; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}

	}

	// prints the given matrix
	private static void doPrintResultMatric(int[][] result) {
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[1].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
