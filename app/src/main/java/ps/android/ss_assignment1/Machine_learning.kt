package ps.android.ss_assignment1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Machine_learning : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_machine_learning)

        val btnml=findViewById<Button>(R.id.btnmachine)
        btnml.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.spiceworks.com/tech/artificial-intelligence/articles/what-is-ml/")
            startActivity(intent)
        }



    }
}