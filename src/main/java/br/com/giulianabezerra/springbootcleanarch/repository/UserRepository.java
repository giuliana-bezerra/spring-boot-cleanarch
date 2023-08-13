package br.com.giulianabezerra.springbootcleanarch.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.giulianabezerra.springbootcleanarch.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
