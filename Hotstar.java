class Hotstar {
    public static void main(String[] args) {

        String english[] = {"Avengers","Endgame","Infinity War","Iron Man","Thor","Captain America",
		"Doctor Strange","Black Panther","Spider Man","Ant Man","Guardians","Eternals","Shang Chi",
		"Deadpool","Logan","Avatar","Titanic","Frozen","Pirates","Jungle Cruise"};

        String hindi[] = {"Bajrangi Bhaijaan","Sultan","Tiger Zinda Hai","Ek Tha Tiger","War",
		"Bang Bang","Dhoom","Kick","Wanted","Ghajini","Dabangg","Dabangg 2","Bodyguard","Radhe",
		"Veer","Hum Aapke Hain","Hum Saath Saath","Tere Naam","Ready","Jai Ho"};

        String tamil[] = {"Vikram","Mersal","Bigil","Theri","Master","Leo","Kaththi","Sarkar",
		"Vedalam","Viswasam","Thuppakki","Ghajini","Sivaji","Enthiran","Dasavatharam","Kaala",
		"Kabali","Valimai","Beast","Varisu"};

        String telugu[] = {"RRR","Baahubali","Baahubali 2","Magadheera","Eega","Pushpa","Aarya",
		"Aarya 2","Julayi","Athadu","Pokiri","Srimanthudu","Bharat Ane Nenu","Sye","Leader","Tagore",
		"Chatrapathi","Gabbar Singh","Khaleja","Rangasthalam"};

        String kannada[] = {"KGF","KGF 2","Kantara","Ugramm","Mufti","Tagaru","Bell Bottom",
		"ASN","RangiTaranga","Lucia","777 Charlie","Dia","Gaalipata","Milana","Mungaru Male",
		"Rajakumara","Yuvarathnaa","Pailwaan","Roberrt","Pogaru"};
		
		String avengers= english[0];
		String Endgame= english[1];
		String infinityWar= english[2];
		String ironMan= english[3];
		String thor= english[4];
		System.out.println("the no of engliah movies are:"+ english.length);
		System.out.println("the list of movies are:");
		System.out.println("Avengers"+ " " + "Endgame" + " " + "Infinity War"+ " "  + "Iron Man"+ " "  + "Thor" + " " + "Captain America" ); 
        System.out.println("The List of movies using for each:");
        for(String movie: english) {
	    System.out.println(movie);		
		}
    }
}