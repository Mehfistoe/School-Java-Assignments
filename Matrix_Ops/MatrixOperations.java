
public class MatrixOperations {
	
	static int row;
	static int col;
	public static void main(String [] args){
		
		double [][] matrixA = {	{1,1,1},
								{2,5,2},
								{6,7,3}};

		double [][] matrixB = {	{5,9,10},
								{2,5,3},
								{8,1,5}};
		
		double ratio = 5.0;
		//get the size of multi-dimensional array
		row = matrixA.length; //just like regular arrays. Use length
		col = matrixA[row-1].length;// measures the amount of columns
			
		double[][] matrixC = scaleMatrix(matrixA,ratio); //method below
		
		double[][] matrixD = add(matrixA,matrixB); //method below
		
		System.out.println("Matrix A:");
		display(matrixA); //method below
		System.out.println("Matrix A scaled by 5: ");
		display(matrixC);
		System.out.println("Matrices added together: ");
		display(matrixD);
	}
	
	//create a method to scale the elements of a matrix by value ratio
	public static double[][] scaleMatrix(double[][]mat, double ratio) {
		double[][] scaledMat = new double[row][col]; //row and col aren't assigned to any value. 
													//Just there to make sense of it
		for (row = 0; row < mat.length; row++){
			for (col = 0; col < mat[0].length; col++){
				scaledMat[row][col] = mat[row][col] * ratio;
			}
		}
		return scaledMat;
	}
	//create a method to add two matrices A and B and return the sum matrix
	public static double[][] add(double[][]a,double[][]b) {
		double[][] sum = new double[a.length][b[0].length];
		for (int row = 0; row < a.length; row++){
			for (int col = 0; col < b[0].length; col++){
				sum[row][col] = a[row][col] + b[row][col];
			}
		}
		return sum;
	}
	public static void display(double mat[][]){
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
