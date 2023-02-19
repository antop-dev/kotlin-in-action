package org.antop.java.chapter4;

public final class ApiResponse {
    public static final int OK = 200;
    public static final int BAD_REQUEST = 400;
    public static final int INTERNAL_SERVER_ERROR = 500;
    public static final int NOT_FOUND = 404;

    private final int statusCode;
    private final String message;

    private ApiResponse(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public static ApiResponse ok(String message) {
        return new ApiResponse(OK, message);
    }

    public static ApiResponse error(String message) {
        return new ApiResponse(INTERNAL_SERVER_ERROR, message);
    }

    public static ApiResponse badRequest(String message) {
        return new ApiResponse(BAD_REQUEST, message);
    }

    public static ApiResponse from(int statusCode, String message) {
        return new ApiResponse(statusCode, message);
    }

}
