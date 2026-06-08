package com.project.retailproject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "audit_log")
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auditId;

    @NotBlank(message = "Action is required")
    private String action;

    private LocalDateTime timeStamp;



    private Long  userId;

    @NotBlank(message = "Username is required")
    private String userName;

    public AuditLog() {}


    public Long getAuditId() {
        return auditId;
    }
    public void setAuditId(Long auditId) {
        this.auditId = auditId;
    }
    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }
    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AuditLog auditLog = (AuditLog) o;
        return Objects.equals(auditId, auditLog.auditId);
    }

    @Override
    public int hashCode() { return Objects.hash(auditId); }
}