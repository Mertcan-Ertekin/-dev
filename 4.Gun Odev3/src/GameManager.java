
public class GameManager implements IGameService {

	@Override
	public void Add(Game game) {
		System.out.println(game.getGameName()+ " Oyununuz ma�azaya eklendi. ");
		
	}

	@Override
	public void Uptade(Game game) {
		System.out.println(game.getGameName()+ " Oyununuz g�ncellendi. ");
		
	}

	@Override
	public void Delete(Game game) {
		System.out.println(game.getGameName()+ " Oyununuz silindi. ");
		
	}

}
