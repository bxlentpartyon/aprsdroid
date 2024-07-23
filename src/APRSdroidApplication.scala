package org.aprsdroid.app

import android.app.Application
import androidx.multidex.MultiDexApplication

class APRSdroidApplication extends MultiDexApplication {

	override def onCreate() {
		super.onCreate()
		ServiceNotifier.instance.setupChannels(this)
		MapModes.initialize(this)
	}
}
