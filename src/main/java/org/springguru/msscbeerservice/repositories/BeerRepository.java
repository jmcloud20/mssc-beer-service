package org.springguru.msscbeerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springguru.msscbeerservice.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
