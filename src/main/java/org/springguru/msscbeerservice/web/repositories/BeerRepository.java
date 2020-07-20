package org.springguru.msscbeerservice.web.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springguru.msscbeerservice.web.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
