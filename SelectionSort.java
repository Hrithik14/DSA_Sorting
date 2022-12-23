public class SelectionSort
{
    static public void sSort(int arr[])
    {
        int min,j,i;
        for(i=0;i<arr.length-1;i++)
        {
            min=i;
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            
        }
    }
    public static void main(String[] args)
    {
        int arr1[]={3,6,5,2,8};
        sSort(arr1);
        System.out.println("After Sorting:");
        for (int i:arr1)
        System.out.print(i+" ");
    }
}