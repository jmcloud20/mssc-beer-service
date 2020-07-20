package org.springguru.msscbeerservice.web.mappers;

import org.mapstruct.Mapper;
import org.springguru.msscbeerservice.domain.Beer;
import org.springguru.msscbeerservice.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);

}
