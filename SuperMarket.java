class SuperMarket{
public static void main(String[] SuperMarket){
String groceries[]={"Rice", "Wheat Flour", "Sugar", "Salt", "Cooking Oil", "Toor Dal", "Moong Dal", "Chana Dal", "Tea Powder", 
"Coffee Powder", "Milk", "Butter", "Cheese", "Bread", "Eggs", "Biscuits", "Instant Noodles",
 "Breakfast Cereal", "Spices", "Turmeric Powder", "Red Chilli Powder", "Coriander Powder", "Tomato Ketchup", "Pickle"};
String perfumes[]= {"Fogg", "Denver", "Wild Stone", "Park Avenue", "Nivea", "Engage", 
"Layer'r Shot", "Axe", "Skinn", "Bella Vita", "Ustraa", "Beardo", "The Man Company", 
"Villain", "Set Wet", "Yardley", "Old Spice", "Rasasi", "Ajmal", "Armaf", "Lattafa", "Em5", 
"Zudio Perfume", "Miniso Perfume", "Marks & Spencer Perfume"};
String fruits[]={"Apple", "Banana", "Mango", "Orange", "Grapes", "Pineapple", "Papaya",
 "Watermelon", "Muskmelon", "Guava", "Pomegranate", "Strawberry", "Blueberry", "Kiwi",
"Pear", "Peach", "Plum", "Cherry", "Litchi", "Jackfruit", "Custard Apple", "Dragon Fruit", "Fig", "Apricot"};
String alcohol[]={"Beer", "Wine", "Whiskey", "Vodka", "Rum", "Brandy", "Gin", "Tequila", 
"Scotch", "Bourbon", "Champagne", "Cider", "Absinthe", "Sake", "Mead", "Port Wine", "Sherry", 
"Cognac", "Triple Sec", "Baileys", "Amaretto", "Vermouth", "Sambuca", "Jägermeister"};
String vegetables[] = {"Potato","Tomato","Onion","Carrot","Cabbage","Cauliflower","Spinach",
"Beans","Brinjal","Lady Finger","Pumpkin","Radish","Beetroot","Capsicum","Green Chilli","Garlic",
"Ginger","Cucumber","Bottle Gourd","Bitter Gourd","Drumstick","Sweet Corn","Peas","Mushroom","Broccoli"};
String dairy[] = {"Milk","Curd","Butter","Cheese","Paneer","Cream","Ghee","Flavoured Milk","Milk Powder",
"Condensed Milk","Yogurt","Buttermilk","Cheese Slice","Mozzarella","Cheddar","Ice Cream","Kulfi",
"Milkshake","Lassi","Sour Cream","Whipping Cream","Custard","Flavored Yogurt","Probiotic Drink",
"Skim Milk"};
String beverages[] = {"Tea","Coffee","Green Tea","Black Tea","Cold Coffee","Soft Drink",
"Fruit Juice","Energy Drink","Lemon Juice","Buttermilk","Milkshake","Mocktail","Iced Tea","Soda",
"Tonic Water","Flavored Water","Coconut Water","Apple Juice","Orange Juice","Grape Juice","Mango Juice",
"Cola","Sprite","Fanta","Pepsi"};
String snacks[] = {"Chips","Popcorn","Nachos","Biscuits","Cookies","Rusks","Peanuts","Mixture",
"Murukku","Sev","Samosa","Kachori","Puffs","Cake","Pastries","Chocolate","Candy","Lollipop","Wafers",
"Granola Bar","Protein Bar","Cornflakes","Trail Mix","Salted Nuts","Roasted Chana"};
String bakery[] = {"White Bread","Brown Bread","Buns","Burger Buns","Pav","Croissant","Donut","Muffin",
"Cup Cake","Plum Cake","Fruit Cake","Pastry","Rusk","Toast","Garlic Bread","Pizza Base","Bread Crumbs",
"Cake Base","Sponge Cake","Brownie","Cheese Cake","Swiss Roll","Bagel","Focaccia","Hot Dog Bun"};
String personalCare[] = {"Soap","Shampoo","Conditioner","Face Wash","Toothpaste","Toothbrush","Hair Oil",
"Body Lotion","Face Cream","Perfume","Deodorant","Talcum Powder","Shaving Cream","Razor","Face Mask",
"Hand Wash","Sanitizer","Lip Balm","Hair Gel","Sunscreen","Serum","Body Wash","Scrub","Face Pack","Aftershave"};
String cleaning[] = {"Detergent Powder","Liquid Detergent","Dish Wash Bar","Dish Wash Liquid","Floor Cleaner",
"Toilet Cleaner","Phenyl","Glass Cleaner","Fabric Softener","Bleach","Room Freshener","Disinfectant","Scrubber",
"Mop","Broom","Dustpan","Cleaning Cloth","Sponge","Drain Cleaner","Insect Spray","Mosquito Repellent",
"Air Freshener","Hand Gloves","Garbage Bag","Toilet Brush"};
String frozenFood[] = {"Frozen Peas","Frozen Corn","Frozen Fries","Frozen Nuggets","Frozen Paratha",
"Frozen Pizza","Frozen Burger Patty","Frozen Fish","Frozen Chicken","Frozen Prawns","Frozen Momos",
"Frozen Spring Roll","Frozen Cutlets","Frozen Paneer","Frozen Fruits","Frozen Berries","Frozen Kulfi",
"Frozen Ice Cream","Frozen Sausage","Frozen Waffles","Frozen Garlic Bread","Frozen Snacks","Frozen Dosa","Frozen Idli","Frozen Vada"};
String spices[] = {"Turmeric","Red Chilli","Coriander","Cumin","Mustard","Pepper","Cloves","Cinnamon",
"Cardamom","Bay Leaf","Star Anise","Nutmeg","Mace","Fenugreek","Fennel","Dry Ginger","Asafoetida",
"Chaat Masala","Garam Masala","Sambar Powder","Rasam Powder","Curry Powder","Biryani Masala","Kitchen King","Pav Bhaji Masala"};
String oils[] = {"Sunflower Oil","Groundnut Oil","Coconut Oil","Mustard Oil","Olive Oil","Rice Bran Oil",
"Soybean Oil","Palm Oil","Sesame Oil","Corn Oil","Canola Oil","Avocado Oil","Walnut Oil","Flaxseed Oil",
"Ghee","Butter Oil","Cooking Spray","Blended Oil","Extra Virgin Olive Oil","Cold Pressed Oil","Refined Oil",
"Organic Oil","Arachis Oil","Vegetable Oil","Herbal Oil"};
String cereals[] = {"Cornflakes","Oats","Muesli","Granola","Wheat Flakes","Rice Flakes","Barley","Millets",
"Ragi","Jowar","Bajra","Quinoa","Brown Rice","Red Rice","Black Rice","Poha","Aval","Semolina","Broken Wheat",
"Dalia","Puffed Rice","Chocos","Honey Loops","Oatmeal","Multi Grain Cereal"};
String babyCare[] = {"Baby Soap","Baby Shampoo","Baby Oil","Baby Powder","Baby Lotion","Diapers","Wipes","Baby Cream",
"Baby Massage Oil","Baby Toothpaste","Baby Toothbrush","Baby Wash","Baby Detergent","Baby Feeding Bottle","Baby Food",
"Cerelac","Infant Formula","Baby Bib","Baby Towel","Baby Napkins","Baby Cotton","Baby Balm",
"Baby Sunscreen","Baby Moisturizer","Baby Rash Cream"};
String stationery[] = {"Notebook","Pen","Pencil","Eraser","Sharpener","Scale","Marker","Highlighter",
"Glue","Stapler","Staple Pins","Paper Clips","File","Folder","Sketch Pen","Color Pencil","Crayons",
"Diary","Sticky Notes","Calculator","Correction Pen","White Board Marker","Chart Paper","Drawing Book","Envelope"};
String electronics[] = {"Bulb","LED Lamp","Extension Box","Charger","USB Cable","Power Bank","Earphones",
"Headphones","Torch","Battery","Remote","Electric Kettle","Mixer","Iron Box","Fan","Table Lamp","Switch",
"Socket","Adapter","Smart Plug","Night Lamp","Emergency Light","Electric Heater","Induction Stove","Blender"};
String petCare[] = {"Dog Food","Cat Food","Pet Shampoo","Pet Collar","Pet Leash","Pet Toy","Pet Bowl",
"Pet Treats","Pet Bed","Pet Cage","Pet Grooming Kit","Pet Vitamins","Pet Medicine","Pet Brush",
"Pet Nail Cutter","Pet Training Pad","Pet Litter","Pet Carrier","Pet Feeder","Pet Water Bottle",
"Pet Blanket","Pet Toothpaste","Pet Soap","Pet Harness","Pet Clothing"};

System.out.println("Welcome to Super Market");
        System.out.println("-----------------------");

        System.out.println("Groceries available: " + groceries.length);
        for (String item : groceries) 
			System.out.println(item);

        System.out.println("\nFruits available: " + fruits.length);
        for (String item : fruits) 
			System.out.println(item);

        System.out.println("\nVegetables available: " + vegetables.length);
        for (String item : vegetables) 
			System.out.println(item);

        System.out.println("\nDairy products available: " + dairy.length);
        for (String item : dairy) 
			System.out.println(item);

        System.out.println("\nBeverages available: " + beverages.length);
        for (String item : beverages) 
			System.out.println(item);

        System.out.println("\nSnacks available: " + snacks.length);
        for (String item : snacks) 
			System.out.println(item);

        System.out.println("\nBakery items available: " + bakery.length);
        for (String item : bakery) 
			System.out.println(item);

        System.out.println("\nPersonal Care items available: " + personalCare.length);
        for (String item : personalCare) 
			System.out.println(item);

        System.out.println("\nCleaning items available: " + cleaning.length);
        for (String item : cleaning) 
			System.out.println(item);

        System.out.println("\nFrozen foods available: " + frozenFood.length);
        for (String item : frozenFood) 
			System.out.println(item);

        System.out.println("\nPerfumes available: " + perfumes.length);
        for (String item : perfumes) 
			System.out.println(item);

        System.out.println("\nAlcohol available: " + alcohol.length);
        for (String item : alcohol) 
			System.out.println(item);

        System.out.println("\nPet care items available: " + petCare.length);
        for (String item : petCare) 
			System.out.println(item);
    }
}


