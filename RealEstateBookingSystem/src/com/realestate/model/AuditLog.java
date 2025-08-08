package com.realestate.model;

import java.time.LocalDateTime;

public class AuditLog {
	private int id;
	private int userId;
	private String action;
	private LocalDateTime timestamp;

	public AuditLog(int userId, String action, LocalDateTime timestamp) {
		this.userId = userId;
		this.action = action;
		this.timestamp = timestamp;
	}

	public int getUserId() {
		return userId;
	}

	public String getAction() {
		return action;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}
}
