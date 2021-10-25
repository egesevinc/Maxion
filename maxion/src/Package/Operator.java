package Package;

import java.util.ArrayList;

public class Operator {
    String name;
    int ID;
    String dept;
    ArrayList<String> mailBox = new ArrayList<>();
    // şifre eklenebilir


    public Operator() {
        this.name="John Doe";
        this.ID=123123;
        this.dept="Default";
    }

    public Operator(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public Operator(String name, int ID, String dept) {
        this.name = name;
        this.ID = ID;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
