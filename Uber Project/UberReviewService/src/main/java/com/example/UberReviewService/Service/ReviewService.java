package com.example.UberReviewService.Service;

import com.example.UberReviewService.Repositories.ReviewRepository;
import com.example.UberReviewService.models.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;
    public ReviewService(ReviewRepository reviewRepository){this.reviewRepository = reviewRepository;}
    @Override
    public void run(String... args) throws Exception {
        System.out.println("***************");
        Review r = Review.builder()
                .content("Amazing Ride... Loved it!!")
                .rating(4.5)
                .build();
        System.out.print(r);
        reviewRepository.save(r);

        System.out.println(r.getContent());
        List<Review> reviews = reviewRepository.findAll();

        for (Review review : reviews){
            System.out.println(r.getContent());
        }

    }
}
