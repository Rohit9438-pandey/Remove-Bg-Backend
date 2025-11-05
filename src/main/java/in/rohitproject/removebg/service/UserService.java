package in.rohitproject.removebg.service;

import in.rohitproject.removebg.DTO.UserDTO;

public interface UserService {

    UserDTO saveUser(UserDTO userDTO);

    UserDTO getUserByClerkId(String clerkId);

    void deleteUserByClerkId(String clerkId);
}
