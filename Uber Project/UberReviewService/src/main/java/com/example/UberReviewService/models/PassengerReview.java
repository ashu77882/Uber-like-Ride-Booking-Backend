package com.example.UberReviewService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity

public class PassengerReview extends Review{

    @Column(nullable = false)
    private String passengerReviewComment;

    @Column(nullable = false)
    private String passengerRating;
}
