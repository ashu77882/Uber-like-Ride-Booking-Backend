//package com.example.UberReviewService.controllers;
//
//import com.example.UberReviewService.models.Review;
//import com.example.UberReviewService.service.ReviewService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.RequestEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/v1/reviews")
//public class ReviewController {
//
//    private ReviewService reviewService;
//    public ReviewController(ReviewService reviewService){
//        this.reviewService=reviewService;
//    }
//
//    @PostMapping
//    public RequestEntity<Review> publishReview(@RequestBody Review request){
//        Review review = this.reviewService.publishReview(request);
//        return new RequestEntity<>(review, HttpStatus.CREATED);
//    }
//}
