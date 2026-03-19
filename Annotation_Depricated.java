class My{
    @Deprecated
    public int addvalue(int a,int b)
    {
        return a+b;
    }
    public int addNumber(int a, int b){
        return a+b;
    }
}
class Annotation_Depricated{
    public static void main(String arg[]){
        My obj= new My();
        System.out.println("Result: "+obj.addNumber(Integer.parseInt(arg[0]),Integer.parseInt(arg[1])));
    }
}
