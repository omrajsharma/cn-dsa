public class Error {
    public static void main(String[] args) {
        Student akash = new Student();
        akash.id = 10;
        akash.name = "Akash Sharma";
        akash.age = 10;
        akash.setBankAccNo(12345);

        Student student = new Student();

        student.age = 10;

        int num = 10;
        int $num = 100;
        int _num = 20;

        System.out.println(akash.name + akash.age + akash.getBankAccNo());
    }

//    private static void function1() {
//        float priceOfProduct = 100;
//        float gst = 12;       // actual gst is 5
//        float calcTotal = priceOfProduct * (1 + (gst/100));
//
//        /**
//         * student.getAge().getToString()
//         */
//
//        System.out.println("result : " + calcTotal);
//    }
//
//    private static void function2() {
//        System.out.println("function2 called");
//    }
}
