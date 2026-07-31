class bank 
{
    float getrate()
    {
        return 0.0f;
    }
}
class ICICI extends bank
{
    float getrate()
    {
        return 8.5f;
    }
}
class SBI extends bank
{
    float getrate()
    {
        return 6.0f;
    }
}
class HDFC extends bank
{
    float getrate()
    {
        return 7.5f;
    }
}
class overriding 
{
    public static void main(String args[])
    {
        ICICI i1= new ICICI();
        SBI s1= new SBI();
        HDFC h1= new HDFC();
        System.out.println("ICICI rate="+i1.getrate());
        System.out.println("SBI rate=" + s1.getrate());
        System.out.println("HDFC rate="+ h1.getrate());
    }
}
