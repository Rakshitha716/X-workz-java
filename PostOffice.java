class PostOffice {
public static void main(String[] args) {

String name = "India Post";
String postMaster = "Suresh";
String address = "MG Road";
String branches[] = {"MG Road", "Jayanagar", "BTM Layout", "Yeshwanthpur"};
String employees[] = {"Ramesh", "Suma", "Anil", "Kavya"};

System.out.println("The Post Office info is:");
System.out.println("The name of Post Office is: " + name);
System.out.println("The Post Master name is: " + postMaster);
System.out.println("The address of Post Office is: " + address);

System.out.println("The number of branches are: " + branches.length);
System.out.println("The list of branches available are:");
for(String branch : branches) {
System.out.println(branch);
}

System.out.println("The number of employees are: " + employees.length);
System.out.println("The list of employees are:");
for(String employee : employees) {
System.out.println(employee);
}
}
}
