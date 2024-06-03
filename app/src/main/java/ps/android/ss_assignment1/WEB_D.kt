package ps.android.ss_assignment1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WEB_D : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_web_d)

         val btnwebbtn=findViewById<Button>(R.id.btweb)
        btnwebbtn.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.geeksforgeeks.org/web-development/")
            startActivity(intent)
        }





    }
}