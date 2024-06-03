package ps.android.ss_assignment1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CYVBERSECURITY : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cyvbersecurity)

        val btncysec=findViewById<Button>(R.id.btncyb)
        btncysec.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.checkpoint.com/cyber-hub/cyber-security/what-is-cybersecurity/")
            startActivity(intent)
        }



    }
}