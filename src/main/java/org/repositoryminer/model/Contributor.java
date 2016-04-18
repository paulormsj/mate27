package org.repositoryminer.model;

import java.util.List;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;

/**
 * This class represents the "personIdent" object in the database. This class
 * represents a person who contributes to the repository.
 */
public class Contributor {

	private String name;
	private String email;

	public Contributor() {
	}

	public Contributor(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public BasicDBObject toDBObject() {
		BasicDBObject obj = new BasicDBObject();
		obj.append("name", name).append("email", "email");
		return obj;
	}

	public static BasicDBList toDBList(List<Contributor> contributors) {
		BasicDBList list = new BasicDBList();
		for (Contributor c : contributors) {
			list.add(c.toDBObject());
		}
		return list;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contributor other = (Contributor) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

}