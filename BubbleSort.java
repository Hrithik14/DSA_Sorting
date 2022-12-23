public class BubbleSort {
    static public void bSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[]={2,8,5,1,9};
        bSort(arr);
        System.out.println("After Sorting:");
        for(int i:arr)
        System.out.print(i+" ");
    }
}
