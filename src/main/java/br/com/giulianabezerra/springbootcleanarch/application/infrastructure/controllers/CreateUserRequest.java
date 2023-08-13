package br.com.giulianabezerra.springbootcleanarch.application.infrastructure.controllers;

public record CreateUserRequest(String username, String password, String email) {

}
