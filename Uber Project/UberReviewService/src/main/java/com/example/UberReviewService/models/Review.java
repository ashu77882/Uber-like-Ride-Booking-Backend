package com.example.UberReviewService.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "booking_review")
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel{


    private String content;

    @Column(nullable = false)
    private Double rating;

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Booking booking; // we have defined a 1:1 relationship between booking and review



    @Override
    public String toString(){return "Review"+this.content+" "+this.rating+" "+" booking: "+this.booking.getId()+" "+this.createdAt;}
}
