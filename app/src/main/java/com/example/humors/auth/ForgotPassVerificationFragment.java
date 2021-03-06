package com.example.humors.auth;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.humors.R;
import com.example.humors.newUser.NewUserHomeActivity;
import com.example.humors.utils.ExtFunctions;
import com.mukesh.OtpView;

public class ForgotPassVerificationFragment extends Fragment {

    private TextView resendOtpButton;
    private OtpView otpView;
    private Button confirmOtpButton;

    private String otp;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        init();
    }

    private void init() {
        initialiseVariables();
        fetchData();
        setViews();
        setListeners();
        setObservers();
    }

    private void initialiseVariables() {
        resendOtpButton = requireView().findViewById(R.id.resend_otp_textview_forgot_pass);
        otpView = requireView().findViewById(R.id.otp_input_forgot_pass);
        confirmOtpButton = requireView().findViewById(R.id.confirm_otp_button_forgot_pass);
    }

    private void fetchData() {

    }

    private void setViews() {
        ExtFunctions.underlineText(resendOtpButton);
    }

    private void setListeners() {
        confirmOtpButton.setOnClickListener(view -> {
            otp = otpView.getText().toString();
            startActivity(NewUserHomeActivity.newInstance(getContext()));
            // TODO: VERIFY OTP
        });

    }

    private void setObservers() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forgot_pass_verification, container, false);
    }
}