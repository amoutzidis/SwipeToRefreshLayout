package gr.amoutzidis.swipetorefresh_sample

import android.app.UiModeManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import gr.amoutzidis.swipetorefreshlayout.widget.SwipeToRefreshLayout

class MainActivity : AppCompatActivity() {

    companion object{
        private var isLightMode = true
    }

    private lateinit    var swipeToRefreshLayout: SwipeToRefreshLayout
    private lateinit    var buttonThemeMode: Button
    private             val uiMdeService: UiModeManager by lazy { getSystemService(Context.UI_MODE_SERVICE) as UiModeManager }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        swipeToRefreshLayout    = findViewById(R.id.swipe_to_refresh_layout)
        buttonThemeMode         = findViewById(R.id.button_theme_mode)

        swipeToRefreshLayout.isRefreshing = true
        buttonThemeMode.setOnClickListener {
            val modeNight = if(!isLightMode)
                Pair(AppCompatDelegate.MODE_NIGHT_NO, UiModeManager.MODE_NIGHT_NO)
            else
                Pair(AppCompatDelegate.MODE_NIGHT_YES, UiModeManager.MODE_NIGHT_YES)

            isLightMode = modeNight.first == AppCompatDelegate.MODE_NIGHT_NO

            Log.e("{{", isLightMode.toString())
            AppCompatDelegate.setDefaultNightMode(modeNight.first)
            uiMdeService.nightMode = modeNight.second
            recreate()
        }
    }
}