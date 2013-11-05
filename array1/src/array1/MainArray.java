package array1;



public final class MainArray {

	public static void main(String[] args) {
		 int[][] matrix = {{59, 1, 33}, {11, 13, 85}, {5, 25, 30}, {7, 1, 27}};
		   MainArray value = new MainArray();
		   System.out.println("min value is: " + value.min(matrix));
		   System.out.println("max value is: " + value.max(matrix));
		   System.out.println("mean value is: " + value.mean(matrix));
		   System.out.println("mode value is: " + value.modeValue(matrix));
		   System.out.println("Array is:");
		    value.array(matrix);
		    System.out.println();
		    System.out.println("reverse array:");
		    value.REVarray(matrix);
		
		
		
		

	}
	
	
	public void array(int[][]matrix){
		
		 for (int col = 0; col < matrix.length; col++) {
	            for (int row = 0; row < matrix[col].length; row++) {
	             System.out.print(matrix[col][row]);
	             System.out.print("  ");
	            }
	        }	
		
		}
	public void REVarray(int[][]matrix){
		int row=matrix.length;
		int col=matrix[0].length;
		int[][] reverse= new int[row][col];
		 for (int i =row-1; i>=0; i--){
		 for (int j =col-1; j>=0; j--) 
	            {
	             reverse[row-1-i][col-1-j]=matrix[i][j];
	            }
	        }	
		 for (int i = 0; i < row; i++) {
	            for (int j = 0; j<col; j++) {
	             System.out.print(reverse[i][j]);
	             System.out.print("  ");
	            }
	        }	
		 
		 
		}
	
	

   public int min(int[][] matrix) {
       int min = matrix[0][0];
       for (int col = 0; col < matrix.length; col++) {
           for (int row = 0; row < matrix[col].length; row++) {
               if (min > matrix[col][row]) {
                   min = matrix[col][row];
               }
           }
       }
       return min;
   }

   public int max(int[][] matrix) {
       int max = matrix[0][0];
       for (int col = 0; col < matrix.length; col++) {
           for (int row = 0; row < matrix[col].length; row++) {
               if (max < matrix[col][row]) {
                   max = matrix[col][row];
               }
           }
       }
       return max;
   }
   
   public int mean(int[][]matrix)
   {
   	
   	int sum=0;
   	
   	
   	 for (int col = 0; col < matrix.length; col++) {
	            for (int row = 0; row < matrix[col].length; row++) {
	                sum+=matrix[col][row];
	                
	            }
	        }
	        return sum/matrix.length;
	    }
   	
   	
   public int modeValue (int[][]matrix)	
   {
   	int mode=0;
   	int max=0;
   	
   	for(int i=0;i<matrix.length;i++) 
   	{ 
   	for(int j=0;j<matrix[i].length;j++) 
   	{ 
   	int c=0; 

   	for(int k=0;k<matrix.length;k++) 
   	{ 
   	for(int l=0;l<matrix[i].length;l++) 
   	{ 
   	if(matrix[i][j]==matrix[k][l])
   		c++; 
   	} 
   	} 
   	if(c>max){mode=matrix[i][j]; max=c; } 
   	c=0; 
   	} 
   	} 
   	
   	return mode;
   	
   }
   	
   
  
	
		
		
		}
		
		
		
		
	


