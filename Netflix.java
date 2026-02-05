class Netflix {
    public static void main(String[] args) {

        String english[] = {"Inception","Interstellar","Extraction","Bird Box","Red Notice",
		"The Gray Man","The Irishman","Roma","Mank","Okja","Bright","Hustle","6 Underground",
		"Enola Holmes","Triple Frontier","Army of the Dead","Marriage Story","The Old Guard",
		"Don’t Look Up","The Killer"};

        String hindi[] = {"Dangal","3 Idiots","PK","Queen","Barfi","Kahaani","Drishyam",
		"Andhadhun","Badla","Ludo","Bulbbul","Ghajini","Swades","Dil Se","Dear Zindagi",
		"Gully Boy","Jawan","Animal","Raees","Fan"};

        String tamil[] = {"Master","Vikram","Kaithi","Asuran","Soorarai Pottru","Jai Bhim",
		"Karnan","96","Pizza","Doctor","Beast","Leo","Mersal","Bigil","Thani Oruvan","Sivaji",
		"Enthiran","Dasavatharam","Super Deluxe","Visaranai"};

        String telugu[] = {"Baahubali","Baahubali 2","Pushpa","Rangasthalam","Magadheera","Eega",
		"Jersey","Arjun Reddy","Athadu","Pokiri","Gabbar Singh","Srimanthudu","Leader","Sye","Khaleja",
		"Chatrapathi","Tagore","Bharateeyudu","Ala Vaikunta","Geetha Govindam"};

        String kannada[] = {"KGF","KGF 2","Kantara","Ugramm","Lucia","ASN","RangiTaranga","Dia",
		"Love Mocktail","Mungaru Male","Milana","Gaalipata","Tagaru","Mufti","Bell Bottom",
		"777 Charlie","Rajakumara","Yuvarathnaa","Pailwaan","Pogaru"};
		
		System.out.println("Netflix Movies List\n");

        System.out.println("English Movies:");
        for (String movie : english) {
            System.out.println(movie);
        }

        System.out.println("\nHindi Movies:");
        for (String movie : hindi) {
            System.out.println(movie);
        }

        System.out.println("\nTamil Movies:");
        for (String movie : tamil) {
            System.out.println(movie);
        }

        System.out.println("\nTelugu Movies:");
        for (String movie : telugu) {
            System.out.println(movie);
        }

        System.out.println("\nKannada Movies:");
        for (String movie : kannada) {
            System.out.println(movie);
		}
    }
}