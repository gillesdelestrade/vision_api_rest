package fr.d4immobilier.visionapirest.config;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

/**
 * Configures Jakarta RESTful Web Services for the application.
 * @author Juneau
 */
@ApplicationPath("api")
public class RestApplication extends Application {
    // Configuration JAX-RS
    // Tous les endpoints seront disponibles sous /api/*
}
