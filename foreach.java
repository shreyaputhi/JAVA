public class foreach {
    public static void main(String[] args) {
        int a[] = {3,5,7,9};
        int d[][] = {{2,4,6,8},{1,3,5,7},{0,9,1,2}};
        // for(int i=0; i<=3; i++)
        // {
        //     System.out.println(a[i]);
        // }

        // for(int arr:a)
        // {
        //     System.out.println(arr);
        // }
        
        for(int k[]:d)
        {
            for(int l:k)
            {
                System.out.print(l + " ");
            }
            System.err.println();
        }
    }
}
