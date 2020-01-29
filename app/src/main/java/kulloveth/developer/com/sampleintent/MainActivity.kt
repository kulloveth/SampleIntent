package kulloveth.developer.com.sampleintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val phoneNo : String = phoneEditText.text.toString()

        sendButton.setOnClickListener {
            val intent = Intent(this,WelcomeActivity::class.java)
            intent.putExtra(PHONE_NO,phoneNo)
            startActivity(intent)
        }



    }


companion object{
    const val PHONE_NO : String = "number_extras"
}
}
