public class Arrayrev
{
    static void revArray(int num[])
    {
        System.out.print("Elementin reverse order are:");
        for(int i=num.length-1;i>=0;i--)
        System.out.print(num[i]);
    } 
    public static void main(String [] arg)
    {
        int num[]={1,2,3,4,5,6,7,8,9};
        int len = num.length;
        
        //Print the element of array
        //System.out.println("Element are:");
       // for(int i=0;i<len;++i)
       // System.out.print(num[i]);
        revArray(num);
    }
}