package com.eam.blogging_platform.dto;

import jakarta.validation.constraints.*;

import java.time.LocalDateTime;

public class PostDto {

    @NotBlank(message = "A title must be provided")
    @Size(min = 1, max = 150, message = "Not a valid title, 1 character as minimum, 150 as maximum")
    private String title;

    @NotBlank(message = "Content must be provided")
    @Size(min = 1, max = 6000, message = "Not valid content, 1 character as minimum, 6000 as maximum")
    private String content;

    @NotNull(message = "User ID must be provided")
    @Min(value = 1, message = "User ID must be greater than or equal to 1")
    private Long userId;

    @NotNull(message = "Status ID must be provided")
    @Min(value = 1, message = "Status ID must be greater than or equal to 1")
    private Long statusId;

    @Min(value = 0, message = "Likes cannot be negative")
    private int likes;

    @Min(value = 0, message = "Dislikes cannot be negative")
    private int dislikes;

    @PastOrPresent(message = "Creation date cannot be in the future")
    private LocalDateTime creationDate;

    @PastOrPresent(message = "Last update date cannot be in the future")
    private LocalDateTime lastUpdateDate;

    @FutureOrPresent(message = "Publication date cannot be in the past")
    private LocalDateTime publicationDate;

    // Getters and Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public LocalDateTime getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDateTime publicationDate) {
        this.publicationDate = publicationDate;
    }
}
