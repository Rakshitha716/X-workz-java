class RailwayStation {
public static void main(String[] args) {

String name = "Bangalore City Railway Station";
String stationMaster = "Suresh";
String address = "Majestic, Bengaluru";

String platforms[] = {"Platform 1", "Platform 2", "Platform 3", "Platform 4", "Platform 5"};
String trains[] = {"Rajdhani Express", "Shatabdi Express", "Hampi Express", "Udyan Express"};

System.out.println("The Railway Station info is:");
System.out.println("The name of Railway Station is: " + name);
System.out.println("The Station Master name is: " + stationMaster);
System.out.println("The address of Railway Station is: " + address);

System.out.println("The number of platforms are: " + platforms.length);
System.out.println("The list of platforms available are:");
for (String platform : platforms) {
System.out.println(platform);
 }

System.out.println("The number of trains available are: " + trains.length);
System.out.println("The list of trains are:");
for (String train : trains) {
System.out.println(train);
        }
    }
}
