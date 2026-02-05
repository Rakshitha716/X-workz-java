class Ecommerce {
public static void main(String[] args) {

String name = "Flipkart";
String founder = "Sachin Bansal";
String headquarters = "Bangalore";

String categories[] = {"Mobiles","Electronics","Fashion","Home Appliances","Grocery"};
String sellers[] = {"Cloudtail","RetailNet","SuperComNet"};

System.out.println("The Ecommerce platform info is:");
System.out.println("The name of Ecommerce platform is: " + name);
System.out.println("The founder name is: " + founder);
System.out.println("The headquarters is: " + headquarters);

System.out.println("The no of categories available are: " + categories.length);
System.out.println("The list of categories available are:");
for (String category : categories) {
System.out.println(category);
        }

System.out.println("The no of sellers available are: " + sellers.length);
System.out.println("The list of sellers are:");
for (String seller : sellers) {
System.out.println(seller);
        }
    }
}
