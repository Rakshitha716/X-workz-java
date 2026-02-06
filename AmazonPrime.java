class AmazonPrime {
    public static void main(String[] args) {

        String english[] = {"The Tomorrow War","Jack Ryan","Reacher","The Boys","Air",
		"Manchester by the Sea","Sound of Metal","Creed","Top Gun","Mission Impossible",
		"John Wick","Taken","Nope","Smile","Saltburn","Borat","Cinderella","Jack Reacher",
		"The Big Sick","Without Remorse"};

        String hindi[] = {"Shershaah","Sardar Udham","Raazi","Kesari","Article 15",
		"Batla House","Jai Bhim Hindi","Drishyam 2","Jalsa","Sherni","Gulabo Sitabo",
		"Runway 34","Good Newwz","Antim","Mumbai Saga","Laxmii","Satyameva Jayate",
		"Bhoot Police","Gold","Mission Mangal"};

        String tamil[] = {"Vada Chennai","Sarpatta Parambarai","Jai Bhim","Kaithi","Asuran",
		"Karnan","Soorarai Pottru","Vikram Vedha","Thani Oruvan","Ratsasan","Irudhi Suttru",
		"Maanagaram","96","Doctor","Love Today","Beast","Valimai","Vedalam","Viswasam","Veeram"};

        String telugu[] = {"Sita Ramam","Major","Jersey","Athadu","Pokiri","Khaleja","Leader",
		"Gabbar Singh","Magadheera","Eega","Pushpa","Baahubali","Rangasthalam","Khaidi","Ghajini",
		"Oopiri","Sye","Tagore","Chatrapathi","Bharateeyudu"};

        String kannada[] = {"Kantara","777 Charlie","Ugramm","Lucia","ASN","RangiTaranga","Tagaru",
		"Mufti","KGF","KGF 2","Dia","Bell Bottom","Love Mocktail","Rajakumara","Gaalipata","Milana",
		"Mungaru Male","Yuvarathnaa","Pogaru","Roberrt"};
		 System.out.println("English Movies (" + english.length + "):");
        for (int i = 0; i < english.length; i++) {
            System.out.println(english[i]);
        }

        System.out.println();
		System.out.println("Hindi Movies (" + hindi.length + "):");
        for (int i = 0; i < hindi.length; i++) {
            System.out.println(hindi[i]);
        }

        System.out.println();
		System.out.println("Tamil Movies (" + tamil.length + "):");
        for (int i = 0; i < tamil.length; i++) {
            System.out.println(tamil[i]);
        }

        System.out.println();
		System.out.println("Telugu Movies (" + telugu.length + "):");
        for (int i = 0; i < telugu.length; i++) {
            System.out.println(telugu[i]);
        }

        System.out.println();
        System.out.println("Kannada Movies (" + kannada.length + "):");
        for (int i = 0; i < kannada.length; i++) {
            System.out.println(kannada[i]);
        }
    }
}