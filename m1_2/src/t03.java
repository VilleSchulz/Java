import java.util.Scanner;
public class t03 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Give weight on grams");
      System.out.println("Weight (g): ");
      int givenWeight = scanner.nextInt();
      // calculating how much is one gram in exact currency
      final double LEIVISKÄ_CONVERSION_FACTOR = 1/(20*32*13.28);
      final double NAULA_CONVERSION_FACTOR = 1/(32*13.28);
      final double LUOTI_CONVERSION_FACTOR = 1/13.28;

      //total amount of leiviskä
      double gramsToLeiviskä = givenWeight*LEIVISKÄ_CONVERSION_FACTOR;

      // non decimal value of leiviskä
      int leiviskät = (int)gramsToLeiviskä;
      double leivisköjenWeight = leiviskät/LEIVISKÄ_CONVERSION_FACTOR;

      //total amount of naula after calculating leiviskä
      double remainingNaula = (givenWeight - leivisköjenWeight) * NAULA_CONVERSION_FACTOR;

      //non decimal value of naula
      int naulat = (int)remainingNaula;
      double naulojenWeight = naulat / NAULA_CONVERSION_FACTOR;

      //calculate luodit from naulojen and leivisköjen weight
      double luodit = (givenWeight - leivisköjenWeight - naulojenWeight) * LUOTI_CONVERSION_FACTOR;



      System.out.printf("Your given weight %d grams is %d leiviskä, %d naula, %.2f luoti",
              givenWeight,leiviskät,naulat,luodit);




    }
}
//Task 3: Obsolete measures
//
//Leiviskä, naula and luoti are medieval Finnish units of measurement.
//
//One leiviskä is 20 naula.
//One naula is 32 luoti.
//One luoti is 13.28 grams.
//Write a program that asks the user for a weight in grams and converts it to medieval measurements: leiviskä, naula, and luoti. The program should work in the following way:
//
//Weight (g): 30000
//30000 grams is 3 leiviskä, 10 naula, and 19.04 luoti.
//That is, leiviskä and naula are printed as integers, and luoti is printed with two decimal places.