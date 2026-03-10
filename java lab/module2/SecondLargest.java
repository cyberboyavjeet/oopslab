class SecondLargest {
    public static void main(String [] arg)
    {
        int i;
        int arr[]=new int[arg.length];

        for(i=0;i<arg.length;i++)
        {
            arr[i]=Integer.parseInt(arg[i]);
        }
        sLarge(arr);

    }
    private static void sLarge(int arr[]){
       int max=Integer.MIN_VALUE;
       int secondLa=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++)
       {

            if(arr[i]>max){
                secondLa=max;
                max=arr[i];

            }else
            if(arr[i]>secondLa && arr[i]<max)
            {
                secondLa=arr[i];
            }
            
       }

        if(secondLa==Integer.MIN_VALUE){
         System.out.println("Second lagest Not found :"+-1);
       }

      System.out.println("Second largest :"+secondLa);
    }
}
