package com.logicify.d2g.services;

import com.logicify.d2g.domain.User;
import com.logicify.d2g.dtos.incomingdtos.UserCreateIncomingDto;
import com.logicify.d2g.dtos.incomingdtos.UserUpdateIncomingDto;
import com.logicify.d2g.dtos.incomingdtos.UserUpdateStatusIncomingDto;
import com.logicify.d2g.dtos.outgoingdtos.UserOutgoingDto;
import com.logicify.d2g.dtos.outgoingdtos.UsersListOutgoingDto;
import com.logicify.d2g.utils.PasswordStorage;

import java.util.UUID;

/**
 * @author knorr
 */
public interface UserService {

    String createPasswordHash(String password) throws PasswordStorage.CannotPerformOperationException;

    void createUser(UserCreateIncomingDto userCreateIncomingDto) throws PasswordStorage.CannotPerformOperationException;

    UsersListOutgoingDto findAll();

    UserOutgoingDto findOne(UUID id);

    void delete(UUID id);

    void updateUser(UUID id, UserUpdateIncomingDto userUpdateIncomingDto) throws PasswordStorage.CannotPerformOperationException;

    void updateStatus(UUID id, UserUpdateStatusIncomingDto userUpdateStatusIncomingDto);

    /**
     * Returns user by it's UUID
     *
     * @param id user uuif
     * @return requested {@link User}
     */
     //TODO: Implement finding user by its uuid


}
