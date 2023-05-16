package com.example.demo.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class DiscordWebhookMessage {
    @JsonProperty("username")
    private String username;

    @JsonProperty("avatar_url")
    private String avatarUrl;

    @JsonProperty("content")
    private String content;

    public DiscordWebhookMessage() {
    }

    public DiscordWebhookMessage(String username, String avatarUrl, String content) {
        this.username = username;
        this.avatarUrl = avatarUrl;
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
