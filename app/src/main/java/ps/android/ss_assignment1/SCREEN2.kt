package ps.android.ss_assignment1

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SCREEN2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_screen2)

        val button2=findViewById<Button>(R.id.btn2)
        val AADev=findViewById<CardView>(R.id.android)
        val WEBDev=findViewById<CardView>(R.id.webd)
        val IOSANDev=findViewById<CardView>(R.id.ios)
        val ML=findViewById<CardView>(R.id.machinelearn)
        val cybsec=findViewById<CardView>(R.id.cybersec)
        val block=findViewById<CardView>(R.id.blkch)



        block.setOnClickListener{
            intent=Intent(applicationContext,BLOCKCHAIN::class.java)
            startActivity(intent)
        }




        cybsec.setOnClickListener{
            intent=Intent(applicationContext,CYVBERSECURITY::class.java)
            startActivity(intent)
        }




        ML.setOnClickListener{
            intent=Intent(applicationContext,Machine_learning::class.java)
            startActivity(intent)
        }




        IOSANDev.setOnClickListener{
            intent=Intent(applicationContext,IOS_appdev::class.java)
            startActivity(intent)
        }




        AADev.setOnClickListener{
            intent=Intent(applicationContext,android::class.java)
            startActivity(intent)
        }


        WEBDev.setOnClickListener{
            intent=Intent(applicationContext,WEB_D::class.java)
            startActivity(intent)
        }







        button2.setOnClickListener{
            val callIntent = Intent(Intent.ACTION_CALL)
            callIntent.data = Uri.parse("tel:1234567890")

                startActivity(callIntent)
            }
        }
    }
