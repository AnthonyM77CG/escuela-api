package com.school.api.util;

import java.time.LocalDate;

public record RegisterRequest(
        String firstName,
        String lastName,
        String phoneNumber,
        String address,
        LocalDate dateOfBirth,
        String email,
        String password) {
}
