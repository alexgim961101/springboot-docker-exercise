package com.example.demo.dto;

public class WebhookRequest {

    private String webhookUrl;
    private String sender;
    private String senderProfile;
    private String message;

    public WebhookRequest() {
    }

    public WebhookRequest(String webhookUrl, String sender, String senderProfile, String message) {
        this.webhookUrl = webhookUrl;
        this.sender = sender;
        this.senderProfile = senderProfile;
        this.message = message;
    }

    public DiscordWebhookMessage toDiscordWebhookMessage() {
        DiscordWebhookMessage discordWebhookMessage = new DiscordWebhookMessage();
        discordWebhookMessage.setUsername(getSender());
        discordWebhookMessage.setAvatarUrl(getSenderProfile());
        discordWebhookMessage.setContent(getMessage());
        return discordWebhookMessage;
    }

    public String getWebhookUrl() {
        return webhookUrl;
    }

    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSenderProfile() {
        return senderProfile;
    }

    public void setSenderProfile(String senderProfile) {
        this.senderProfile = senderProfile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
