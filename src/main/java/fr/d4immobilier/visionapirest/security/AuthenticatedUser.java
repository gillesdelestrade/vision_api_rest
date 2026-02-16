// AuthenticatedUser.java
package fr.d4immobilier.visionapirest.security;

import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class AuthenticatedUser {

    private UserPrincipal user;

    public UserPrincipal getUser() {
        return user;
    }

    public void setUser(UserPrincipal user) {
        this.user = user;
    }
}