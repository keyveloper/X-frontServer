package com.example.frontServer.dto.like

import com.example.frontServer.enum.FrontServerCode

// controller to client
data class LikeSaveResponse(
    val error: FrontServerCode?
) {
    companion object{
        fun of (result: LikeSaveResult): LikeSaveResponse {
            return if (result.error != null) {
                LikeSaveResponse(
                    error = result.error
                )
            } else {
                LikeSaveResponse(
                    error = null
                )
            }
        }
    }
}
