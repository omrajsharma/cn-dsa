package practice;

public class RecordExample {
    public static void main(String[] args) {
        System.out.println("RecordExample");

        UserClass userClass = new UserClass("Omraj Sharma", 10);

        System.out.println("User name: " + userClass.getName());
        System.out.println("User age: " + userClass.getAge());

        UserRecord userRecord = new UserRecord("Ommi", 20);

        System.out.println("User name: " + userRecord.name());
        System.out.println("User age: " + userRecord.age());

        System.out.println(userRecord);
        System.out.println(userRecord.equals(userClass));
    }
}
