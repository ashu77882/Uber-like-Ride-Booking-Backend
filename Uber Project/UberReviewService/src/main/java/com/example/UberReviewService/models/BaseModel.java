package com.example.UberReviewService.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class BaseModel {

    @Id //this annotation defines primary key our table
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Identity :- means auto_increment id value
    private Long id;


    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) // this describes the format of date object to be stored in time, date or both(timestamp)
    @CreatedDate //this annotation say's to only handle it for object creation
    protected Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate //this annotation say's to only handle it for object update
    protected Date updatedAt;
}
