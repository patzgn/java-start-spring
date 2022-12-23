package com.example.lazyeager;

import org.springframework.data.repository.CrudRepository;

interface AuctionRepository extends CrudRepository<Auction, Long> {
}
