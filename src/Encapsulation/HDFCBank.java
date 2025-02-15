package Encapsulation;

import org.w3c.dom.ls.LSOutput;

public class HDFCBank {

    private String Ename;
    private long AvailableBal;
    private String Address;

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public long getAvailableBal() {
        return AvailableBal;
    }

    public void setAvailableBal(long availableBal) {
        AvailableBal = availableBal;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }


    }


