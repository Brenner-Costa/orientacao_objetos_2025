import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Cliente c1 = new Cliente(random.nextInt(0), "Brenner Costa", "brenner@email.com", 23);
    }

}
