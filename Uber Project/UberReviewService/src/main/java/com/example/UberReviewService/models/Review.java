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
@EntityListeners(AuditingEntityListener.class)
@Table(name = "bookingreview")

public class Review {

    @Id //this annotation defines primary key our table
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Identity :- means auto_increment id value
    private Long id;


    private String content;

    @Column(nullable = false)
    private Double rating;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) // this describes the format of date object to be stored in time, date or both(timestamp)
    @CreatedDate //this annotation say's to only handle it for object creation
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate //this annotation say's to only handle it for object update
    private Date updatedAt;

    @Override
    public String toString(){return "Review"+this.content+" "+this.rating+" "+this.createdAt+" "+this.updatedAt;}
}
