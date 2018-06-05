package pl.lukszn.ProjectProfile.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


@Entity
@Table(name = "user_pages")
public class UserPage {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToMany(mappedBy = "wordGroup",cascade = CascadeType.REMOVE)
	private List<Page> pages = new ArrayList<Page>();
	
	@Column(unique = true)
	private String name;
	
	@Column
	@Type(type="date")
	private Date created;
	
	@Column
	@Type(type="timestamp")
	private Date lastUpdate;
	
	@ManyToOne
	private User user;
	
	
	
	public UserPage(String name) {
		this.name = name;
	}
	
	public UserPage() {
	}
	
	

	public long getId() {
		return id;
	}

	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
