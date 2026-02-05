class Gym {
public static void main(String[] args) {

String name = "PowerFit Gym";
String owner = "Kiran";
String address = "BTM Layout";
String branches[] = {"BTM Layout", "Jayanagar", "Indiranagar", "Yelahanka"};
String trainers[] = {"Arjun", "Suma", "Rohit", "Neha"};

System.out.println("The Gym info is:");
System.out.println("The name of Gym is: " + name);
System.out.println("The owner name is: " + owner);
System.out.println("The address of Gym is: " + address);

System.out.println("The no of branches are: " + branches.length);
System.out.println("The list of branches available are:");
for (String branch : branches) {
System.out.println(branch);
        }

System.out.println("The no of trainers are: " + trainers.length);
System.out.println("The list of trainers available are:");
for (String trainer : trainers) {
System.out.println(trainer);
        }
    }
}
