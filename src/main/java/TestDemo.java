import java.util.Random;

public class TestDemo {
	
	public int addPositive(int a, int b) {
		if (a > 0 && b > 0) {
			return (a + b);
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}
	
	public int randomNumberSquared() {
		int random = getRandomInt();
		return (random * random); //squared
	}
	
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
}