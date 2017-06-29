package com.brenopolanski.movies.callback;

import com.brenopolanski.movies.model.Review;

import java.util.List;

/**
 * Created by brenopolanski on 16/06/17.
 */

public interface ReviewsCallback {
    void success(List<Review> reviews);

    void error(Exception error);
}
