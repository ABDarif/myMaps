package ac.bracu.abdullaharif.mymaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // layout manager for recyclerView
        rvMaps.layoutManager = LinearLayoutManager(this)

        // adapter on recyclerView
        rvMaps.adapter = MapsAdapter(this, emptyList<UserMap>())
    }
}