class ChatShop{
public static void main(String[] chats) {
String chatNames[]={"Papdi Chat", "Dahi Puri", "Samosa Masala"};
String papdiChat= chatNames[0];
String dahiPuri= chatNames[1];
String samosaMasala= chatNames[2];
System.out.println("the no of chats available:"+ chatNames.length);
System.out.println("the list of chats available:");
System.out.println(papdiChat+ " " + dahiPuri+ " "+ samosaMasala);
System.out.println("The List of Chat Names using for each");
for(String chatName: chatNames) {
	System.out.println(chatName);
}
}
}
