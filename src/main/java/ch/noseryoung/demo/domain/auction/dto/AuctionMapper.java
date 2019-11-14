package ch.noseryoung.demo.domain.auction.dto;

import ch.noseryoung.demo.domain.auction.Auction;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuctionMapper {

    AuctionDTO toDTO(Auction auction);

    List<AuctionDTO> toDTOs(List<Auction> auctions);

    Auction fromDTO(AuctionDTO auctionDTO);

    List<Auction> fromDTOs(List<AuctionDTO> auctionDTOS);

}
