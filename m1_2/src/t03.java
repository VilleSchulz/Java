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



      scanner.close();
    }
}
