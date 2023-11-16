package com.rentalhive.repositories;

import com.rentalhive.models.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long>{
}