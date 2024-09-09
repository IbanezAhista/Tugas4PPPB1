package ibanez.pppb1.tugaspppb1p5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ibanez.pppb1.tugaspppb1p5.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(MainActivity.EXTRA_USERNAME)
        val email = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val phone = intent.getStringExtra(MainActivity.EXTRA_PHONE)

        with(binding) {
            edtUsername.setText(username)
            edtEmail.setText(email)
            edtPhone.setText(phone)

            btnLogin.setOnClickListener {
                val intentToThirdActivity = Intent(this@SecondActivity, ThirdActivity::class.java)
                intentToThirdActivity.putExtra(MainActivity.EXTRA_USERNAME, edtUsername.text.toString())
                intentToThirdActivity.putExtra(MainActivity.EXTRA_EMAIL, edtEmail.text.toString())
                intentToThirdActivity.putExtra(MainActivity.EXTRA_PHONE, edtPhone.text.toString())
                startActivity(intentToThirdActivity)
            }

            btnRegister.setOnClickListener {
                val intentToMainActivity = Intent(this@SecondActivity, MainActivity::class.java)
                startActivity(intentToMainActivity)
            }
        }
    }
}
