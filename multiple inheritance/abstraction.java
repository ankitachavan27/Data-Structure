abstract class ATM{
    abstract void  withDraw();
    abstract  void checkBalance();
}
class Bank extends ATM{
    //override
    void withDraw(){
        System.out.println("A");
    }
    void checkBalance(){
        System.out.println("B");
    }
}




public class abstraction{
    public static void main(String args[]){
        Bank b = new Bank();
        b.withDraw();
        ATM a = new Bank();
        a.checkBalance();

    }
}