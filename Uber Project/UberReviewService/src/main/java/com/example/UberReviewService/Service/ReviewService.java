package com.example.UberReviewService.Service;

import com.example.UberReviewService.models.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewService {

    public Optional<Review> findReviewById(Long Id);

    public List<Review> findAllReviews();

    public boolean deleteReviewById(Long Id);

}
