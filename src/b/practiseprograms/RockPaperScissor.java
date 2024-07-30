package b.practiseprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

enum Moves {
	ROCK(1), PAPER(2), SCISSOR(3);
	private final int value;

	Moves(int value) {
		this.value = value;
	}

	int getValue() {
		return this.value;
	}

	public static Moves findByValue(int value) {
		return Arrays.stream(Moves.values()).filter(m -> m.getValue() == value).findFirst().orElse(null);
	}
}

enum GameResponse {
	WIN(1), LOSE(-1), DRAW(0);
	private final int value;

	GameResponse(int value) {
		this.value = value;
	}

	int getValue() {
		return this.value;
	}

	/*public static GameResponse findByValue(int value) {
		return Arrays.stream(GameResponse.values()).filter(m -> m.getValue() == value).findFirst()
				.orElse(null);
	}*/
}

public class RockPaperScissor {
	static Moves getComputerMove() {
		return Moves.findByValue(new Random().nextInt(3) + 1);
	}

	static GameResponse play(int userMove) {
		Moves computerMove = getComputerMove();
		System.out.println("You : " + Moves.findByValue(userMove).name());
		System.out.println("Computer : " + computerMove.name());
		if (userMove == computerMove.getValue()) {
			return GameResponse.DRAW;
		} else if ((userMove == Moves.ROCK.getValue() && computerMove == Moves.SCISSOR)
				|| (userMove == Moves.PAPER.getValue() && computerMove == Moves.ROCK)
				|| (userMove == Moves.SCISSOR.getValue() && computerMove == Moves.PAPER)) {
			return GameResponse.WIN;
		}
		return GameResponse.LOSE;
	}
	
	static void showFinalWinnerOfGame(List<Integer> gameResponse) {
		IntSummaryStatistics gameFinalWinCount = gameResponse.stream().collect(Collectors.summarizingInt(Integer::intValue));
		if(gameFinalWinCount.getSum() == 0) {
			System.out.println("Finally Draw (@_@)");
		}
		else if (gameFinalWinCount.getSum() > 0) {
			System.out.println("Finally You Win (^_^)");
		}
		else {
			System.out.println("Finally Computer Win (-_-)");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> gameResponse = new ArrayList<>();
		System.out.println("Enter no. of game round you wants to play");
		int rounds = in.nextInt();

		System.out.println("Enter ur choice  \uD83C\uDDEF\uD83C\uDDF2 Jamaica");
		Moves[] arr = Moves.values();
		for (int i = 0; i < Moves.values().length; i++) {
			System.out.println(i + 1 + "(" + arr[i].name() + ")");
		}
		for (int i = 0; i < rounds; i++) {
			int userMove = in.nextInt();
			in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			GameResponse resp = play(userMove);
			if (resp == GameResponse.WIN) {
				System.out.println("You Win (^_^)");
				} else if (resp == GameResponse.LOSE) {
					System.out.println("Computer Win (-_-)");
				} else {
				System.out.println("Draw (@_@)");
			}
			gameResponse.add(resp.getValue());
			System.out.println("================================================================");
		}

		System.out.println("Final Scores : " + gameResponse);
		showFinalWinnerOfGame(gameResponse);
		in.close();
	}

}
