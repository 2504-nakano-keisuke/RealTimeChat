package com.example.RealTimeChat.chat;

public class User {
	private String id;

	private String name;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		User other = (User) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}
//
//	@Override
//	public String toString() {
//		return "Item [id=" + id + ", name=" + name + "]";
//	}
}
