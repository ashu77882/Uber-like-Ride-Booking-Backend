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


    @Override
    public String toString(){return "Review"+this.content+" "+this.rating+" "+this.createdAt;}
}
