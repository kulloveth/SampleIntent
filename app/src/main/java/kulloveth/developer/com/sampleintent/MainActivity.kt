package kulloveth.developer.com.sampleintent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sendButton.setOnClickListener {
            val phoneNo: String = phoneEditText.text.toString()
            Snackbar.make(it,"Welcome $phoneNo",Snackbar.LENGTH_LONG).show()
            val intent = Intent(this, WelcomeActivity::class.java)
            intent.putExtra(PHONE_NO, phoneNo)
            startActivity(intent)
        }


    }


    companion object {
        const val PHONE_NO: String = "number_extras"
    }
}
