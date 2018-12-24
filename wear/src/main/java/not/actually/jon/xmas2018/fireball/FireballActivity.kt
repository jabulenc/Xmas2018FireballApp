package not.actually.jon.xmas2018.fireball

import android.os.Bundle
import android.support.wearable.activity.WearableActivity

class FireballActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fireball)

        // Enables Always-on
        setAmbientEnabled()
    }
}
