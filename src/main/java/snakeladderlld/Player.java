package snakeladderlld;

class Player {
	private String playerName;
	private int id;

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	Player(String playerName, int id) {
		this.playerName = playerName;
		this.id = id;
	}
}
