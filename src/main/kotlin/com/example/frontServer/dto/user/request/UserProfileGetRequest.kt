package com.example.frontServer.dto.user.request

import jakarta.validation.constraints.NotNull

data class UserProfileGetRequest(

    @field:NotNull(message = "userId is required")
    val userId: Long,
)