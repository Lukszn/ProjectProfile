package pl.lukszn.ProjectProfile.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private boolean ifBasicAccount;
	
	private String accTitle;
	
	private String accDescription;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Page page;
	
	public Account() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAccTitle() {
		return accTitle;
	}

	public void setAccTitle(String accTitle) {
		this.accTitle = accTitle;
	}

	public String getAccDescription() {
		return accDescription;
	}

	public void setAccDescription(String accDescription) {
		this.accDescription = accDescription;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}
	
	public boolean isIfBasicAccount() {
		return ifBasicAccount;
	}

	public void setIfBasicAccount(boolean ifBasicAccount) {
		this.ifBasicAccount = ifBasicAccount;
	}
	
	
}
