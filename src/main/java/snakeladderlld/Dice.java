package snakeladderlld;

public class Dice {
    private int numberOfDice;

    public int getNumberOfDice() {
		return numberOfDice;
	}

	public void setNumberOfDice(int numberOfDice) {
		this.numberOfDice = numberOfDice;
	}

	Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    int rollDice(){
        return ((int) (Math.random()*(6*numberOfDice - 1*numberOfDice))) + 1;
    }
}
