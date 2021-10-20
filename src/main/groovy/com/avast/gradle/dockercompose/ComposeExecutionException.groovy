package com.avast.gradle.dockercompose

/**
 * Represents an exception that occurs when actually calling docker-compose
 */
class ComposeExecutionException extends RuntimeException {
    ComposeExecutionException(String message) {
        super(message)
    }
}
