package com.example.UberReviewService.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bookingreview")

public class Review extends BaseModel{


    private String content;

    @Column(nullable = false)
    private Double rating;


    @Override
    public String toString(){return "Review"+this.content+" "+this.rating+" "+this.createdAt;}
}
