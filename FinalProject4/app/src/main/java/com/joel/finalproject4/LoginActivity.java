package com.joel.finalproject4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth=FirebaseAuth.getInstance();
//        createRequest();
        btnLogin=findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(v->{
            masuk();
        });
    }

    private void masuk(){
        startActivity(new Intent(getApplicationContext(),RegistrationActivity.class));
    }
//
//    private void createRequest(){
//        gso=new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//                .requestIdToken(getString(R.string.webclientid))
//                .requestEmail()
//                .build();
//
//        gsc= GoogleSignIn.getClient(this,gso);
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        FirebaseUser currUser =mAuth.getCurrentUser();
//        if(currUser!=null){
//            reload();
//        }
//    }
//    private void reload(){
//        startActivity(new Intent(getApplicationContext(),RegistrationActivity.class));
//    }
//
//    private void SignIn() {
//        Intent intent=gsc.getSignInIntent();
//        startActivityForResult(intent,100);
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if(requestCode==100){
//            Task<GoogleSignInAccount> task=GoogleSignIn.getSignedInAccountFromIntent(data);
//            try{
//                GoogleSignInAccount account= task.getResult(ApiException.class);
//                firebaseAuthWithGoogle(account.getIdToken());
//            }catch (ApiException e){
//                Toast.makeText(this,"Error", Toast.LENGTH_SHORT).show();
//            }
//        }
//    }
//    private void firebaseAuthWithGoogle(String idToken){
//        AuthCredential credential = GoogleAuthProvider.getCredential(idToken, null);
//
//        mAuth.signInWithCredential(credential)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if(task.isSuccessful()){
//                            FirebaseUser user = mAuth.getCurrentUser();
//                        }else{
//                            Log.w("GOOGLE SIGN IN","signInWithCredential:failure",task.getException());
//                        }
//                        reload();
//                    }
//                });
//    }

}