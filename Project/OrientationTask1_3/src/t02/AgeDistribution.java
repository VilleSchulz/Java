package t02;
public class AgeDistribution {
    public static void main(String[] args) {
        final int REITERATIONS = 36;
        final int MAXAGE = 40;

        int agedistribution[][] = {
                {8, 20},  		// 8 %		// This line matches to random numbers 1..16,  gives age 20
                {16, 21},  		// 8 %    	// This line matches to random numbers 17..34, gives age 21
                {26, 22},		// 10 %    	// ...
                {38, 23},    	// 12 %
                {50, 24},  		// 12 %
                {65, 27}, 		// 15 %
                {75, 29},  		// 10 %
                {90, 30},		// 15 %
                {95, 33},  		// 5 %
                {100,MAXAGE}, 	// 5 %	  	// This line matches to random numbers 99 ja 100
        };


        int generatedAges[] = new int[MAXAGE+1];

        // Generate ages according to the distribution:
        for (int i = 1; i <= REITERATIONS; i++){
            int x = (int)(Math.random()*100)+1; 	// generate a random number 1..100 -> we get the row which gives the age
            int j = 0;
            while (x > agedistribution[j][0]) j++;  // search for the correct row to get the matching age
            generatedAges[agedistribution[j][1]]++; // age founded gives an index to the generated ages count table: increment it (by one)
        }

        // Output the result of the generation:
        System.out.println("Age  count     %-share");
        for (int age = 0; age <= MAXAGE; age++) {
            if (generatedAges[age] != 0) {
                String str = "%-4d %-8d %-8.2f\n";
                System.out.printf(str, age, generatedAges[age], ((double)generatedAges[age])/REITERATIONS*100 );
            }
        }
    }
}