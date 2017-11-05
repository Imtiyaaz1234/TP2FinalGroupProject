package com.TPFinalGroupAssign.TheatreSystem.Repositories;

import TheatreSystem.Domain.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long> {
}
