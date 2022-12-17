package com.lcwd.rating.service.services;

import java.util.List;

import com.lcwd.rating.service.entity.Rating;

public interface RatingService {

	//create
	Rating createRating(Rating rating);
	
	//get all rating
	List<Rating> getAllRating();
	
	//get all rating by user id
	List<Rating> getRatingByUserId(String userId);
	
	//get all rating by hotel id
	List<Rating> getRatingByHotelId(String hotelId);
}
