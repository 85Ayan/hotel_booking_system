package com.phegondev.phegon_hotel.service.interfac;

import com.phegondev.phegon_hotel.dto.LoginRequest;
import com.phegondev.phegon_hotel.dto.Response;
import com.phegondev.phegon_hotel.entity.User;

public interface IUserService {

    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
