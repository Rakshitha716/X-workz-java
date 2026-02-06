class Restaurant {
public static void main(String[] res){

String name="Udupi Restaurant";
String owner="Appu";
String address="Majestic";
String branches[]={"Majestic", "JP Nagar", "Jayanagar", "Rajajinagar"};
String managers[]={"Rani", "Raju", "Chintu"};

System.out.println("The Restaurant info is:");
System.out.println("The name of Restaurant is: " + name);
System.out.println("The owner name is " + owner);

System.out.println("The address of Restaurant is" + address);
System.out.println("The no of branches are:" + branches.length);
System.out.println("The list of branches available are:");
for(String branch : branches) {
System.out.println(branch); 
}
}
}