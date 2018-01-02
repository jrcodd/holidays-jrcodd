import java.util.Random;

// This recipe adds random numbers until the sum is exactly 2018!!!
//     Happy New Year!

public class HappyNewYear {
	public static void main(String[] args) {
		// 1. Make a variable 'newYear' and initialize it to 2018.
		int newYear = 2018;
		int worst = 0;
		int best = 0;

		// 7. Repeat steps 2 to 6 (10 times)
		for (int f = 0; f < 12; f++) {

			// 2. Make a variable 'sum' and initialize to 0
			int sum = 0;

			// 3. Repeat steps 4 to 6 (500 times)
			for (int i = 0; i < 500; i++) {

				// 4. Get a random number between 0 and 50
				int r = new Random().nextInt(50);

				// 5. If sum is less than newYear then add your random
				// number to your sum, otherwise subtract it.
				if (sum < newYear) {
					sum = sum + r;

				} else {
					sum -= r;
				}
				// 6. If your sum matches newYear, then print the number of tries
				// to the console and use the "break" statement to exit the loop
				if (sum == newYear) {
					System.out.println("It took you " + i + " tries to get to the new year!");
if(i > worst) {
	worst = i;
}
if(best == 0 || i < best) {
	best = i;
}
					break;

				}

			}

		}

		// *** BONUS: Keep track of your best score and worst score, and print
		// the results to the console.
		System.out.println("Your worst score was " + worst);
		System.out.println("Your best score was " + best);
	}
}
