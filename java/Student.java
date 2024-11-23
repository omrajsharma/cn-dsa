public class Student {
    public int id;
    public String name;
    public int age;
    private int bankAccNo;

    public void setBankAccNo(int accNo) {
        this.bankAccNo = accNo;
    }

    public int getBankAccNo() {
        return this.bankAccNo;
    }
}
