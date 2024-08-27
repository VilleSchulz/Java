import eduni.distributions.Bernoulli;
import eduni.distributions.DiscreteGenerator;

public class eduni_test {
    public static void main(String[] args) {
        Bernoulli source = new Bernoulli(0.7);
        for (int i = 0; i < 10; i++) {
            System.out.println("Sample" +i+"=" + source.sample());

        }
    }
}
