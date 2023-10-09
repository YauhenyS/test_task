package tt.authorization.service;

import tt.authorization.domain.request.CreateUserRequest;
import tt.authorization.domain.response.UserInfoResponse;

import java.util.List;

public interface UserService {

    UserInfoResponse getUserInfo(Long id);

    List<UserInfoResponse> getAllUsers();

    void delete(Long id);

    Long createUser(CreateUserRequest request);

}
