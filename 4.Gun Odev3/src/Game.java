
public class Game implements Entity {
	int Id;
	String PriceOfGame;
	String GameName;

	
	public Game()  {
		
	}
	
	public Game(int id, String priceOfGame, String gameName) {
		super();
		Id = id;
		PriceOfGame = priceOfGame;
		GameName = gameName;
	}


	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getPriceOfGame() {
		return PriceOfGame;
	}

	public void setPriceOfGame(String priceOfGame) {
		PriceOfGame = priceOfGame;
	}

	public String getGameName() {
		return GameName;
	}

	public void setGameName(String gameName) {
		GameName = gameName;
	}

	
}
