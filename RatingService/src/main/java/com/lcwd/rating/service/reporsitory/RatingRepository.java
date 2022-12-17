package com.lcwd.rating.service.reporsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.rating.service.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, String>{

	//custom finder methods
	
	List<Rating> findByUserId(String userId);
	
	List<Rating> findByHotelId(String hotelId);
	
}
