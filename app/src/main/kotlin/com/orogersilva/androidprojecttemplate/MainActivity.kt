package com.orogersilva.androidprojecttemplate

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by orogersilva on 7/14/2017.
 */
class MainActivity : AppCompatActivity() {

    // region ACTIVITY LIFECYCLE METHODS

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // endregion
}