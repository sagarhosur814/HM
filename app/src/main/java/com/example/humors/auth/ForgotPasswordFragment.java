package com.example.humors.auth;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.humors.R;
public class ForgotPasswordFragment extends Fragment {

    private Button receiveOtpButton;
    private EditText userEmailEditText;

    private String userEmail;

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

    private void setCurrentFragment(Fragment fragment) {
            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.login_fragment_container, fragment).addToBackStack(null).commit();
        }

    private void initialiseVariables() {
        receiveOtpButton = requireView().findViewById(R.id.receive_otp_button);
        userEmailEditText = requireView().findViewById(R.id.user_email_forgot_password);
    }

    private void fetchData() {

    }

    private void setViews() {

    }

    private void setListeners() {
        receiveOtpButton.setOnClickListener(view -> {
            userEmail = userEmailEditText.getText().toString();
            // TODO: CHECK USER AND GIVE OTP
            setCurrentFragment(new ForgotPassVerificationFragment());
        });

    }

    private void setObservers() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forgot_password, container, false);
    }
}