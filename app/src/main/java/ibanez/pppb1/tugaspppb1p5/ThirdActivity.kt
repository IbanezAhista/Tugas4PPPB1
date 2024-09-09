package ibanez.pppb1.tugaspppb1p5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ibanez.pppb1.tugaspppb1p5.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(MainActivity.EXTRA_USERNAME)
        val email = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val phone = intent.getStringExtra(MainActivity.EXTRA_PHONE)

        with(binding) {
            txtName.text = "Welcome, $username"
            txtEmail.text = "Your email, $email, has been activated"
            txtPhone.text = "Your phone, $phone, has been registered"
        }
    }
}
