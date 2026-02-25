package mx.ooz.track.client

import android.app.Application
import org.slf4j.LoggerFactory

class MainApplication : Application() {
    override fun onCreate() {
        LoggerFactory.getILoggerFactory()
        super.onCreate()
    }
}
