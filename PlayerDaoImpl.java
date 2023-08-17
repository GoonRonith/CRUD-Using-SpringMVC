package Login.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import Login.Enitites.Players;

@Repository
public class PlayerDaoImpl {
	@Autowired
	private HibernateTemplate template;
	
	@Transactional
	public void addPlayer(Players player) {
		template.saveOrUpdate(player);
	}
	
	public List<Players> getAllPlayers(){
		List<Players> players=template.loadAll(Players.class);
		return players;
	}
	
	@Transactional
	public void deletePlayerById(int id) {
		Players p=template.load(Players.class,id);
		template.delete(p);
	}
	
	public Players getPlayerById(int id) {
		System.out.println(id+ " in dao");
		Players p=template.get(Players.class,id);
		System.out.println(p);
		return p;
	}

}
