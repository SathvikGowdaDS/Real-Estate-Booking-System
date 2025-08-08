package com.realestate.service;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

import com.realestate.model.AuditLog;

public class AudithService {
	private static final String LOG_FILE = "";

    public void log(AuditLog log) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            String entry = log.getTimestamp().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +
                           " | User ID: " + log.getUserId() +
                           " | Action: " + log.getAction() + "\n";
            writer.write(entry);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }	
}
