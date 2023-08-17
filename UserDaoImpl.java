package Login.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import Login.Enitites.Players;
import Login.Enitites.User;

@Repository
public class UserDaoImpl {

	@Autowired
	private HibernateTemplate template;
//	public UserDaoImpl() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public UserDaoImpl(HibernateTemplate template) {
//		super();
//		this.template = template;
//	}
//	public HibernateTemplate getTemplate() {
//		return template;
//	}
//	public void setTemplate(HibernateTemplate template) {
//		this.template = template;
//	}
	
	@Transactional
	public void Insert(User user) {
		// TODO Auto-generated method stub
		template.save(user);
	
		
	}
	
	public User getUser(String name) {
		User user=template.get(User.class, name);
		return user;
		
	}
	
	
	


}
