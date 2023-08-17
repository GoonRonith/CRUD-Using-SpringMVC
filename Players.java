
package Login.Enitites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Players")
public class Players {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id")
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Column(name="name")
private String name;
@Column(name="team")
private String team;
@Column(name="position")
private String position;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public Players(int id,String name, String team, String position) {
	super();
	this.id=id;
	this.name = name;
	this.team = team;
	this.position = position;
}
public Players() {
	super();
	// TODO Auto-generated constructor stub
}
}

