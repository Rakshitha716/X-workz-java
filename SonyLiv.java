class SonyLiv {
    public static void main(String[] args) {

        String english[] = {"Spider Man","No Way Home","Venom","Uncharted","Bad Boys",
		"Jumanji","Equalizer","Men in Black","Ghostbusters","Zombieland","Hotel Transylvania",
		"Hancock","After Earth","Life","Passengers","2012","Moonfall","San Andreas","Rampage","Godzilla"};

        String hindi[] = {"Shershaah","Bhuj","Rocketry","Tanhaji","Kesari","Raazi","Batla House",
		"URI","Jhund","Gold","Mission Mangal","Panipat","Ludo","Badla","Mumbai Saga","Antim",
		"Radhe","Satyameva Jayate","Kabir Singh","Gadar"};

        String tamil[] = {"Jai Bhim","Asuran","Karnan","Soorarai Pottru","Vikram Vedha",
		"Thani Oruvan","Ratsasan","Doctor","Master","Beast","Leo","Valimai","Viswasam",
		"Vedalam","Mersal","Bigil","Theri","Ghajini","Sivaji","Enthiran"};

        String telugu[] = {"RRR","Baahubali","Pushpa","Jersey","Eega","Athadu","Pokiri",
		"Magadheera","Gabbar Singh","Srimanthudu","Khaleja","Leader","Tagore",
		"Chatrapathi","Bharateeyudu","Sye","Aarya","Julayi","Geetha Govindam","Rangasthalam"};

        String kannada[] = {"KGF","KGF 2","Kantara","Ugramm","Mufti","Tagaru","Lucia","ASN",
		"RangiTaranga","Dia","777 Charlie","Love Mocktail","Bell Bottom","Rajakumara",
		"Yuvarathnaa","Gaalipata","Milana","Mungaru Male","Pogaru","Roberrt"};
		
		String spiderman= english[0];
		String nowayhome= english[1];
		String venom= english[2];
		String uncharted=english[3];
		String badboys=english[4];
		System.out.println("the no of english movies are:"+ english.length);
		System.out.println("the list of movies are:");
		System.out.println("spiderman"+ " " + "nowayhome" + " " + "venom" + " " + "uncharted" + " " + "badboys"); 
        System.out.println("The List of movies using for each:");
        for(String movie: hindi) {
	    System.out.println(movie);		
		}
    }
}