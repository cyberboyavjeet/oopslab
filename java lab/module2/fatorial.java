 class fatorial {
    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]);
        //System.out.println(a);
        System.out.println("FActorial: "+fac(a));
    }
    private static int fac(int n)
    {
        if(n==0||n==1)
            return 1;
        return n*fac(n-1); 
    }
}
