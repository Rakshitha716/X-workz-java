class TeaShop {
    public static void main(String[] args) {

        String teaVarieties[] = {"Black Tea","Green Tea","White Tea","Oolong Tea","Masala Tea",
		"Ginger Tea","Cardamom Tea","Lemon Tea","Tulsi Tea","Elaichi Tea","Assam Tea","Darjeeling Tea","Nilgiri Tea",
		"Kashmiri Kahwa","Irani Chai","Kesar Tea","Mint Tea","Honey Lemon Tea","Saffron Tea","Rose Tea",
		"Chamomile Tea","Hibiscus Tea","Jasmine Tea","Lavender Tea","Butter Tea"};
		
		String blackTea = teaVarieties[0];
        String greenTea = teaVarieties[1];
        String whiteTea = teaVarieties[2];

        System.out.println("The number of tea varieties available: " + teaVarieties.length);
        System.out.println("The list of tea varieties available:");
        System.out.println(blackTea + " " + greenTea + " " + whiteTea);

        System.out.println("The List of Tea Varieties using for each:");
        for (String tea : teaVarieties) {
            System.out.println(tea);
		}
           }
             }
