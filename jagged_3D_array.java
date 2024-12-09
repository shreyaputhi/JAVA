public class jagged_3D_array {
    public static void main(String[] args) {
        // int nums1[][]=new int [3][]; //jagged
		// nums1[0]=new int [3];
		// nums1[1]=new int [4];
		// nums1[2]=new int [2];
		
        // for(int i=0;i<nums1.length;i++)
		// {
		// 	for(int j=0;j<nums1[i].length;j++)
		// 	{
		// 		nums1[i][j]=(int)(Math.random()*10);
		// 	}
		// }

        // for(int arr[]: nums1)
        // {
        //     for(int m:arr)
        //     {
        //     System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }
    


		int nums[][][]=new int [3][4][5]; // three dimensional
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
                for(int k=0;k<nums[i][j].length;k++)
                {
				nums[i][j][k]=(int)(Math.random()*10);
			}
		}
    }

// Nested Loops:

// The first loop (i) goes through the depth (3 layers).
// The second loop (j) goes through the rows within each layer.
// The third loop (k) goes through the columns within each row.

// Accessing the Array Properly:

// nums[i][j].length is the correct way to access the length of the third dimension of the array 
// because you're iterating over i and j before accessing the columns (k).

// 3D Array: int nums[][][] = new int[3][4][5]; defines a 3D array with 3 layers (depth), 
// each layer containing 4 rows, and each row containing 5 columns.

        for(int arr[][]: nums)                  // Iterates over each 2D array (layer)
        {
            for(int m[]:arr)                    // Iterates over each 1D array (row) in the layer
            {
            for(int n: m)                       // Iterates over each element in the row
            {
            System.out.print(n + " ");
            }
            System.out.println();               // Moves to the next row
        }
        System.out.println();                   // Moves to the next layer
    }
    }
}

// int arr[][] means that for each iteration, 
// arr will refer to a 2D array (one of the "sheets" of the 3D array).

// Enhanced for-each loops:

// for (int[][] layer : nums) loops through each 2D array (layer) in the 3D array.
// for (int[] row : layer) loops through each 1D array (row) in the 2D array (layer).
// for (int element : row) loops through each integer element in the row.
// In each loop, the current element (layer, row, or element) is automatically retrieved and can be used directly.
