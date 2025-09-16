package com.example.UberReviewService.Service;

import com.example.UberReviewService.Repositories.BookingRepository;
import com.example.UberReviewService.Repositories.ReviewRepository;
import com.example.UberReviewService.models.Booking;
import com.example.UberReviewService.models.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;
    private BookingRepository bookingRepository;

    public ReviewService(
            ReviewRepository reviewRepository,
            BookingRepository bookingRepository)
    {
        this.reviewRepository = reviewRepository ;
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("***************");

        Review r = Review.builder()
                .content("Amazing Ride... Loved it!!")
                .rating(4.5)
                .build();


        Booking b = Booking.builder()
                .review(r)
                .startTime(new Date())
                .endTime(new Date())
                .build();


        System.out.print(r);
        reviewRepository.save(r);
        bookingRepository.save(b);

        System.out.println(r.getContent());
        List<Review> reviews = reviewRepository.findAll();

        for (Review review : reviews){
            System.out.println(r.getContent());
        }

    }
}
