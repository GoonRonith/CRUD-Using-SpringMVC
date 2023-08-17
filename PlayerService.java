package Login.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Login.Dao.PlayerDaoImpl;
import Login.Enitites.Players;

@Service
public class PlayerService {

	@Autowired
	private PlayerDaoImpl dao;
	
	public void addPlayer(Players player) {
		dao.addPlayer(player);
	}
	
	public List<Players> getAll(){
		return dao.getAllPlayers();
	}
	
	public void deletePlayer(int id) {
		dao.deletePlayerById(id);
	}
	
	public Players getPlayerById(int id) {
		System.out.println(id+ " in service");
		Players player=dao.getPlayerById(id);
		System.out.println(player);
		return player;
	}
}
