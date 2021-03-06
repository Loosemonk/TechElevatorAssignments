package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int raccoonsInWoods = 3;
		int raccoonsEating = 2;
		int raccoonsLeft =  raccoonsInWoods - raccoonsEating; 
		/*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
	    int differenceInFlowersAndBees = flowers - bees;
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
	    int lonelyPigeon = 1;
	    int regPigeon = 1;
	    int breadcrumbEaters = lonelyPigeon + regPigeon;
	  
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
	    int fenceSittingOwls = 3;
	    int joiningOwls = 2;
	    int owlsOnTheFence = fenceSittingOwls + joiningOwls;
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
	    int beaversWorking = 2;
	    int beaversSwimming = 1;
	    int beaversLeft = beaversWorking - beaversSwimming;
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
	    int toucansInTree = 2;
	    int toucansJoining = 1;
	    int toucansAll = toucansInTree + toucansJoining;
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
	    int squirrels = 4;
	    int nuts = 2;
	    int howManyMoreSquirrels = squirrels - nuts;
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
	    int quarter = 25;
	     int dime = 10;
	    int twoNickels = 10;
	    String mrsHiltHas = quarter + dime + twoNickels + " cents";
	    System.out.println(mrsHiltHas);
	    
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
	    int mrsBrierClassMuffins = 18;
	    int mrsFlanneryClassMuffins = 17;
	    int mrsMacAdamsClassMuffins = 20;
	    String firstGradeMuffins = mrsBrierClassMuffins + mrsFlanneryClassMuffins + mrsMacAdamsClassMuffins + " Muffins";
	    		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
	    int yoyo =  24;
	    int whistle = 14;
	    String hiltSpent = yoyo + whistle + " cents";
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
	    int largeMarshmallows = 8;
	    int miniMarsh = 10;
	    String riceKrispyTreat = largeMarshmallows + miniMarsh + " marshmallows";
	   
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
	    String inches = " Inches of snow";
	    int hiltsHouseSnow = 29;
	    int brecknockSnow = 17;
	    String differenceOfSnow = (hiltsHouseSnow - brecknockSnow) + inches;
	    System.out.println(differenceOfSnow);
	   
	    	
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
	    int hiltMoney = 10;
	    int truck = 3;
	    int pencil = 2;
	    String dollars = "$";
		String hiltMoneyLeft = dollars + (hiltMoney - truck - pencil);
	    System.out.println(hiltMoneyLeft);
		   
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
	    int joshMarbs = 16;
	    int marbsLost = 7;
	    String marbs = " Marbles";
	    String marbsNow = joshMarbs - marbsLost + marbs;
	    System.out.println(marbsNow);
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
	    int meganShells = 19;
	    int moreShells = 25;
	    String seaShells = " Seashells";
	    String shellCollect = moreShells - meganShells + seaShells;
	    	
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
	    int bradBalloons = 17;
	    int redBalloons = 8;
	    String greenBallons = bradBalloons - redBalloons + " balloons";
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
	    int shelfBooksFirst = 38;
	    int addedBooks = 10;
	    int booksNow = shelfBooksFirst + addedBooks; 
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
	    int beesLegs = 6;
	    int amountOfBees = 8;
	    String totalBeesLegs = (beesLegs * amountOfBees) + " bee legs";
	    System.out.println(totalBeesLegs); 
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
	    double iceCreamCone = 0.99;
	    int amountOfCones = 2;
	    String conePriceTotal = "$" + (0.99 * 2);
	    System.out.println(conePriceTotal);
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
	    int hiltsRocksNow = 64;
	    int borderNeed = 125;
	    String completeBorder = borderNeed - hiltsRocksNow + " rocks";
	    System.out.println(completeBorder);
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
	    int hadMarbles = 38;
	    int lostMarbles = 15;
	    String marblesNow = hadMarbles - lostMarbles + " marbles";
	    System.out.println(marblesNow);
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
	    int milesHome = 78;
	    int milesDriven = 32;
	    String milesLeft = milesHome - milesDriven + " miles";
	    System.out.println(milesLeft);
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
	    int satMorning = 90;
	    int satAfternoon = 45;
	    String totalTime = satMorning + satAfternoon + " minutes"; 
	    
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
	    double hotdogTotal = 6.00;
	   double hotdogCost = .50;
	    String costOfAllDogs = "$" + (hotdogTotal * hotdogCost);
	    System.out.println(costOfAllDogs);
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
	    int pencilCost =  7;
	    int hiltBudget =  50;
	    int boughtPencils = (hiltBudget / pencilCost); 
	    		System.out.println(boughtPencils);
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
	    int seenButter = 33;
	    int orangeButter = 20;
	    int redButterflys = seenButter - orangeButter;
	    		
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
	    int candyCost = 54;
	    int kateCash = 100;
	    String kateChange = kateCash - candyCost + " cents";
	    System.out.println(kateChange);
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
	    int markTrees = 13;
	    int treesMaybe = 12;
	    String potentialTrees = markTrees + treesMaybe + " trees";
	    System.out.println(potentialTrees);
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
	    int hoursInDay = 24;
	    int daysTillG = 2;
	    int hoursTillG = daysTillG * hoursInDay;
	   
	    	
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
	    int kimCousin = 4;
	    int givenGums = 5;
	    int cousinGumCount = kimCousin * givenGums;
	    
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
	    double danMoney = 3.00; 
	    double candyPrice = 1.00;
	    String moneyLeft = "$" + (danMoney - candyPrice);
	    System.out.println(moneyLeft);
	    		
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
	    int boats = 5;
	    int peopleEachBoat = 3;
	    int totalPeople = boats * peopleEachBoat; 
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
	    int ellenLegos = 380;
	    int lostLegos = 57;
	    int currentLegos = ellenLegos - lostLegos;
        /*;
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
	    int muffinGoal = 83;
	    int artMuffin = 35;
	    int needMuffin = muffinGoal - artMuffin;
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
	    int willyCrayon = 1400;
	    int lucyCrayon = 290;
	    int crayonDiff = willyCrayon - lucyCrayon;
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
	    int stickersPerPage = 10;
	    int pages = 22;
	    int totalStickers = stickersPerPage * pages; 
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
	    int cupcakes = 96;
	    int children = 8;
	    int equalShare = cupcakes / children;
	    System.out.println(equalShare);
	    		
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
	    int gingerCookAmount = 47;
	    int cookiesNeeded = 6;
	    int leftCookies = gingerCookAmount % cookiesNeeded;
	    System.out.println(leftCookies);
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
	    int croissants = 59;
	    int neighbors = 8;
	    int leftForMarian = croissants % neighbors;
	    System.out.println(leftForMarian);
	    
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
	    int marianCookies = 276;
	    int cookiePerTray = 12;
	    int traysNeeded = marianCookies / cookiePerTray;
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
	    int biteSizedPretzles = 480;
	    int pretzlesPerServing = 12;
	    int preparedServings = biteSizedPretzles / pretzlesPerServing;
	   
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
	    int lemonCupcakes = 53;
	    int missingLemonCs= 2;
	    int cupcakesPerBox = 3;
	    int boxesGiven = (lemonCupcakes - missingLemonCs) / cupcakesPerBox;
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
	    int carrotSticks = 74;
	    int carrotsServed = 12;
	    int carrotsLeft = carrotSticks % carrotsServed;
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
	    int tedAmount = 98;
	    int shelfSpace = 7;
	    int filledShelves = tedAmount / shelfSpace;
	    System.out.println(filledShelves);
	    
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
	    int pictureTotal = 480;
	    int picPerAlbum = 20;
	    int albumsNeeded = pictureTotal / picPerAlbum;
	    System.out.println(albumsNeeded);
	    
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
	    int joeCards = 94;
	    int boxMax = 8;
	    int filledBoxes = joeCards / boxMax;
	    int unfilledBoxCardCount = joeCards % boxMax;
	    System.out.println(unfilledBoxCardCount);
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
	    int books = 210;
	    int shelves = 10;
	    int onShelves = books / shelves;
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
	    int crisCros = 17;
	    int guestsForCris = 7;
	    int crosServings = crisCros / guestsForCris;
	    System.out.println(crosServings);
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
	    double billsRatePerHour = 1.0/2.15;
	    double jillsRatePerHour = 1.0/1.90;
	    double billJillComboPerHour = billsRatePerHour + jillsRatePerHour;
	    double roomAmount = 5.0;
	    String timeToPaintAllRooms = (roomAmount / billJillComboPerHour) + " hours"; 
	    System.out.println(timeToPaintAllRooms);
	    //challenge of the challenge
	    double hoursOfWorkDay = 8.0;
	    double amountOfRooms = 623.0;
	    String daysToPaintAll = ((amountOfRooms / billJillComboPerHour) / hoursOfWorkDay) + " days";
	    System.out.println(daysToPaintAll);
	    		
	    		
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
	    String firstName = "Benjamin";
	    String lastName = "Hines";
	    String middleInitial = "D";
	    String fullName = '"' +  lastName + ", " + firstName + " " + middleInitial + "." + '"'; 
	    System.out.println(fullName);
	    	
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
	    double totalDistance = 800.0;
	    double distanceTraveled = 537.0;
	    double percentageTraveled = distanceTraveled / totalDistance;
	    System.out.println(percentageTraveled);
	    //challenge of the CHALLENGE
	    double convertPercentage = 100.0;
	    int integerOfPercent = (int)(percentageTraveled * convertPercentage);
	    System.out.println(integerOfPercent);
	    
	    		
	    	

	}

}
