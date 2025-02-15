package Encapsulation;

public class TestEncapsulation
{
    public static void main(String[] args) {
        HDFCBank bank=new HDFCBank();
        bank.setEname("Akshay");
        bank.setAddress("Latur");
        bank.setAvailableBal(100000);
        System.out.println("Name is --> "+bank.getEname());
        System.out.println("Bank Balance --> "+bank.getAvailableBal());
        System.out.println("Address is --> "+bank.getAddress());


    }
}
