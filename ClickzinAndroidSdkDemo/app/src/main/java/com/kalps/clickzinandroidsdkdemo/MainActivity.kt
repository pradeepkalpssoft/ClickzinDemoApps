package com.kalps.clickzinandroidsdkdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.clickzin.tracking.ClickzinTracker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Step 5 : Clickzin changes starts here
        startTracking()
        // Step 5 : Clickzin changes ends starts here
    }


    // Step 5 : Clickzin changes starts here
    private fun startTracking() {
        ClickzinTracker.getInstance().init(applicationContext, "jumpon", null)
        ClickzinTracker.getInstance().setCustomerId("pradeep")
        ClickzinTracker.getInstance().startTracking("install")
    }
    // Step 5 : Clickzin changes ends starts here

    // After successfull registration, please call this line.
    private fun trackRegisterEvent() {
        // Step 6 : Clickzin changes starts here
        // keyword 'register' should be same as configured in panel.
        ClickzinTracker.getInstance().trackEvents(applicationContext, "register", HashMap())
        // Step 6 : Clickzin changes ends starts here
    }
}