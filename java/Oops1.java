public class Oops1 {
    public static void main(String[] args) {
        Developer aryan = new Developer("Aryan", 15, "MTS - 1", 10, "Java");
        Developer diptanu = new Developer("Diptanu", 15, "MTS - 1", 10, "Java");

//        System.out.println(aryan.name);
//        System.out.println(aryan.programmingLanguage);

        System.out.println(diptanu.age);
        diptanu.display();
        System.out.println(diptanu.toString());

        TeamMember om = new Developer("Omraj Sharma", 12, "SDE", 3, "java");
        System.out.println(om.name);

        TeamMember.companyName = "CN";
        System.out.println(TeamMember.companyName);
        System.out.println(om.companyName);
        System.out.println(aryan.companyName);

        om.companyName = "NC";

        System.out.println(aryan.getCompanyName());

        System.out.println(aryan.companyName);

        TeamMember member = new TeamMember();

        aryan.printObj();
        System.out.println(aryan.toString());

        Demand demand = new Demand(1, "Delhi", "Jaipur", 1000);

        demand.addExpense(100);
        demand.addDelayCharges(50);
        demand.addExpense(20);
        demand.addExpense(200);

        System.out.println(demand.totalPrice());
    }
}

class TeamMember {
    String name;
    int age;
    String role;
    static String companyName;

    static String getCompanyName() {
        return companyName;
    }

    TeamMember () {
        this.name = "Default User Value";
        this.age = 0;
        this.role = "Role not present";
    }

    TeamMember(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public void printObj () {
        System.out.println(name + " " + age + " " + role);
    }

    @Override
    public String toString() {
        return "TeamMember [name=" + name + ", age=" + age + ", role=" + role + "]";
    }
}

class Manager extends TeamMember {
    int teamSize;

    Manager(String name, int age, String role, int teamSize) {
        super(name, age, role);
        this.teamSize = teamSize;
    }
}

class Developer extends TeamMember {
    int yoe;
    String programmingLanguage;

    public Developer(String name, int age, String role, int yoe, String programmingLanguage) {
        super(name, age, role);
        this.yoe = yoe;
        this.programmingLanguage = programmingLanguage;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
        System.out.println("Yoe: " + yoe);
        System.out.println("Programming Language: " + programmingLanguage);
    }

    @Override
    public void printObj () {
        System.out.println(name + " " + age + " " + role + " " + yoe + " " + programmingLanguage);
    }
}

class Demand {
    int id;
    String startPlace;
    String endPlace;
    float price;
    float gstPercentage;
    float expenses;
    float delayCharges;

    Demand(int id, String startPlace, String endPlace, float price) {
        this.id = id;
        this.startPlace = startPlace;
        this.endPlace = endPlace;
        this.price = price;
        this.gstPercentage = 0.08f;
        this.expenses = 0;
        this.delayCharges = 0;
    }

    public void addExpense(float expense) {
        this.expenses += expense;
    }

    public void addDelayCharges(float delayCharges) {
        this.delayCharges += delayCharges;
    }

    public float totalPrice() {
        return (price + expenses + delayCharges) * ( 1 + gstPercentage);
    }
}