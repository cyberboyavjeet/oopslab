class Arrayminmax
{

  static void max1(int num[])
 {for(int i=0;i<num.length;++i)
 {
   if(int max=num[0]<num[i])
   max=num[i];
   System.out.print(max);
 }}
 static void min1(int num[])
 {for(int i=0;i<num.length;++i)
 {
    if(int min=num[0]>num[i])
    
        min=num[i];
        System.out.print(min);
    
 }
 }
 public static void main(String [] arg)
 {
    int num[]={1,2,3,4,5,6,7,8,99,0};
    max1(num);
    min1(num);
 }

}