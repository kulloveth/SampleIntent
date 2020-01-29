package kulloveth.developer.com.sampleintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_welcome.*
import kulloveth.developer.com.sampleintent.MainActivity.Companion.PHONE_NO


class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        setSupportActionBar(toolbar)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val receivedString: String? = intent.getStringExtra(PHONE_NO)
        phoneTextView.text = receivedString
        val phoneNo: String = phoneTextView.text.toString()

        dial.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel: $phoneNo"))
            startActivity(intent)


        }

    }
}
