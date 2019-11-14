package ch.noseryoung.demo.domain.user.dto;

import ch.noseryoung.demo.domain.user.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserDTO toDTO(User user);

    List<UserDTO> toDTOs(List<User> users);

    User fromDTO(UserDTO dto);

    List<UserDTO> fromDTOs(List<UserDTO> dtos);

}
