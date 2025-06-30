package com.example.RealTimeChat.chat;

import java.util.Objects;

public class ChatMessage {
	private final MessageType type;
	private final String content;
	private final User sender;

	public ChatMessage(MessageType type, String content, User sender) {
		this.type = type;
		this.content = content;
		this.sender = sender;
	}

	public MessageType getType() {
		return type;
	}

	public String getContent() {
		return content;
	}
	
	public User getSender() {
		return sender;
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, content);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChatMessage other = (ChatMessage) obj;
		return type == other.type && Objects.equals(content, other.content);
	}

	@Override
	public String toString() {
		return "ChatMessage [type=" + type + ", content=" + content + ", sender=" + sender +"]";
	}
}
