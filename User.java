package Login.Enitites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
@Id
@Column(name="name")
private String name;
@Column(name="email")
private String email;
@Column(name="password")
private String password;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(String name, String email, String password) {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
}
@Override
public String toString() {
	return "User [name=" + name + ", email=" + email + ", password=" + password + "]";
}




}
