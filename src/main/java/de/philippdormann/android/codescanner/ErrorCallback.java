package de.philippdormann.android.codescanner;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

/**
 * Code scanner error callback
 */
public interface ErrorCallback {

    /**
     * Callback to suppress errors
     */
    @NonNull
    ErrorCallback SUPPRESS = new Utils.SuppressErrorCallback();

    /**
     * Called when error has occurred
     * <br>
     * Note that this method always called on a worker thread
     *
     * @param thrown Throwable that has been thrown
     * @see Handler
     * @see Looper#getMainLooper()
     * @see Activity#runOnUiThread(Runnable)
     */
    @WorkerThread
    void onError(@NonNull Throwable thrown);
}
