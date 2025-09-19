//package com.example.UberReviewService.service;
//
//import com.example.UberReviewService.repositories.ReviewRepository;
//import com.example.UberReviewService.models.Review;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ReviewServiceImpl{
//
//    private ReviewRepository reviewRepository;
//
//    public ReviewServiceImpl(ReviewRepository reviewRepository){
//        this.reviewRepository =reviewRepository;
//    }
//
//
//    @Override
//    public Optional<Review> findReviewById(Long id) {
//        return reviewRepository.findById(id);
//    }
//
//    @Override
//    public List<Review> findAllReviews() {
//        return reviewRepository.findAll();
//    }
//
//    @Override
//    public boolean deleteReviewById(Long id) {
//        try {
//            reviewRepository.deleteById(id);
//            return true;
//        }catch (Exception e){
//            return false;
//        }
//
//    }
//}
