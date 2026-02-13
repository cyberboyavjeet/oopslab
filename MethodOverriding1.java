class Bank
{
    double Interest()
    {
        return 0;
    }
}
class SBI extends Bank
{
    double Interest()
    {
        return 4.5;
    }
}
class PNB extends Bank
{
    double Interest()
    {
        return 4.8;
    }
}
class HDFC extends Bank{
    double Interest()
    {
        return 5.0;
    }
}
class MethodOverriding1
{
     static void main(String [] arg)
    {
        Bank obj= new HDFC();
        System.out.println("Interest="+obj.Interest());
    }
}