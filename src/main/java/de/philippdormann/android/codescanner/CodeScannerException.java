package de.philippdormann.android.codescanner;

import android.os.Build;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/**
 * Common class for code scanner runtime exceptions
 */
public final class CodeScannerException extends RuntimeException {

    public CodeScannerException() {
        super();
    }

    public CodeScannerException(@Nullable final String message) {
        super(message);
    }

    public CodeScannerException(@Nullable final String message, @Nullable final Throwable cause) {
        super(message, cause);
    }

    public CodeScannerException(@Nullable final Throwable cause) {
        super(cause);
    }

    @RequiresApi(Build.VERSION_CODES.N)
    public CodeScannerException(@Nullable final String message, @Nullable final Throwable cause,
            final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
