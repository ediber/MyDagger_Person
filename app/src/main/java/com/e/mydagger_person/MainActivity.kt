package com.e.mydagger_person

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import javax.inject.Inject

//

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var person: IPerson

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as MyApplication).myComponent.inject(this)


        findViewById<View>(R.id.button).setOnClickListener(View.OnClickListener {
            Log.d("Main activity", person.useComputer())
            Log.d("Main activity", person.usePhone())

        })
    }
}
