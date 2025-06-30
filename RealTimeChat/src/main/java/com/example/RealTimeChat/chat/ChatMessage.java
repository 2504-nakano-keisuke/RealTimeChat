package com.example.RealTimeChat.chat;

public class ChatMessage {
	private MessageType type;
	private String content;
	private User sender;

//	public ChatMessage() {
//	}

	public ChatMessage(MessageType type, String content, User sender) {
		this.type = type;
		this.content = content;
		this.sender = sender;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}



//	@Override
//	public int hashCode() {
//		return Objects.hash(type, content);
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
//		ChatMessage other = (ChatMessage) obj;
//		return type == other.type && Objects.equals(content, other.content);
//	}
//
//	@Override
//	public String toString() {
//		return "ChatMessage [type=" + type + ", content=" + content + ", sender=" + sender +"]";
//	}
}
