package ps.android.ss_assignment1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class android : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_android)

        val btnan=findViewById<Button>(R.id.btnandro)
        btnan.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://kotlinlang.org/")
            startActivity(intent)
        }







    }
}