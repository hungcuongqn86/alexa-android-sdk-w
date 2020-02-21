package com.amazon.sampleapp.impl.AuthProvider;

import com.amazon.aace.AuthProvider.AuthState;
import com.amazon.aace.AuthProvider.AuthError;

// An interface for an observer of authentication state changes
public interface AuthStateObserver {
    // Notify observer of auth state change
    void onAuthStateChanged( AuthState state, AuthError error, String token );
}
