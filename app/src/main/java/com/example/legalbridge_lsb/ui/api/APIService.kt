package com.example.legal_bridge.api

import com.example.legal_bridge.model.PhoneVerification.OTPRequest.otpRequest
import com.example.legal_bridge.model.PhoneVerification.OTPRequest.otpResponse
import com.example.legal_bridge.model.PhoneVerification.OTPVerification.OTPverifyRequest
import com.example.legal_bridge.model.PhoneVerification.OTPVerification.otpVerifyResponse
import com.example.legal_bridge.model.emailcheck.CheckEmailRequest
import com.example.legal_bridge.model.emailcheck.CheckEmailResponse
import com.example.legal_bridge.model.user.LoginLSPResquest
import com.example.legal_bridge.model.user.UserResponse
import com.example.legal_bridge.model.user.RegisterUserResquest
import com.example.legal_bridge.model.user.EditUserDetails
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path

interface APIService {

    @POST("api/v1/auth/registerUser")
    fun registerUser(@Body userRequest: RegisterUserResquest): Call<UserResponse>

    @POST("api/v1/auth/loginLSP")
    fun loginLSP(@Body userRequest: LoginLSPResquest): Call<UserResponse>

//    @POST("api/v1/auth/forgotPassword/user")
//    fun forgotPassword(@Body request: forgetPasswordRequest): Call<forgetPasswordResponse>

    @POST("api/v1/auth/emailCheckUser")
    fun checkEmailExists(@Body request: CheckEmailRequest): Call<CheckEmailResponse>

    @POST("api/v1/auth/sendOTP")
    fun sendOTP(@Body request: otpRequest): Call<otpResponse>

    @POST("api/v1/auth/verifyOTP")
    fun OTPVerify(@Body request: OTPverifyRequest): Call<otpVerifyResponse>

    @PATCH("api/v1/user/{id}")
    fun updateUserDetails(
        @Header("Authorization") token: String,
        @Path("id") userId: String,
        @Body request: EditUserDetails // Ensure this matches your request body structure
    ): Call<UserResponse> // Ensure this matches your expected response



//    @POST("api/v1/auth/forgotPassword")
//    fun forgotPassword(@Body request: ): Call<forgetPasswordResponse>

}
