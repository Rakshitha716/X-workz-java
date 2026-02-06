class Zee5 {
    public static void main(String[] args) {

        String hindi[] = {"The Kashmir Files","Uri","Article 370","Tanhaji","Kesari","Raazi","Batla House",
		"Suraj Pe Mangal","Chhalaang","Jhund","Samrat Prithviraj","Radhe","Antim","Mumbai Saga","Badla",
		"Ludo","Mission Mangal","Gold","Padmaavat","Panipat"};

        String tamil[] = {"Ratsasan","Maanagaram","Pizza","Soodhu Kavvum","Doctor","Love Today",
		"Vikram Vedha","Thani Oruvan","96","Asuran","Karnan","Visaranai","Jai Bhim",
		"Soorarai Pottru","Kaithi","Master","Beast","Leo","Valimai","Varisu"};

        String telugu[] = {"Jersey","Major","Sita Ramam","Athadu","Pokiri","Khaleja","Leader",
		"Magadheera","Eega","Pushpa","Baahubali","Rangasthalam","Gabbar Singh","Chatrapathi",
		"Bharateeyudu","Tagore","Oopiri","Ghajini","Khaidi","Sye"};

        String kannada[] = {"Kantara","KGF","KGF 2","Ugramm","Mufti","Tagaru","Lucia","ASN",
		"RangiTaranga","Dia","777 Charlie","Love Mocktail","Bell Bottom","Rajakumara",
		"Yuvarathnaa","Gaalipata","Milana","Mungaru Male","Pogaru","Roberrt"};

        String english[] = {"Gravity","Arrival","Tenet","Dune","Blade Runner","Matrix",
		"Interstellar","Inception","Avatar","Titanic","Jurassic Park","Jaws","Alien",
		"Predator","Terminator","Mad Max","Dark Knight","Joker","Batman Begins","The Prestige"};
		
		String theKashmirFiles =hindi[0];
		String uri= hindi[1];
		String article370 =hindi[2];
		String tanhaji =hindi[3];
		String kesari =hindi[4];
		System.out.println("the no of hindi movies are:"+ hindi.length);
		System.out.println("the list of movies are:");
		System.out.println("The Kashmir Files"+ " " + "Uri" + " " + "Article 370"+ " "  + "Kesari"+ " "  + "Raazi" + " " + "Batla House" ); 
        System.out.println("The List of movies using for each:");
        for(String movie: hindi) {
	    System.out.println(movie);		
		}
    }
}