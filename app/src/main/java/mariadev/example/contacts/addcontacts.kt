package mariadev.example.contacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.Toast
import mariadev.example.contacts.databinding.ActivityAddcontactsBinding

class addcontacts : AppCompatActivity() {
    lateinit var  binding: ActivityAddcontactsBinding


    override fun onCreate(savedInstanceState:Bundle?) {
        binding = ActivityAddcontactsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }

        override fun onResume() {
            super.onResume()
            binding.tvadd.setOnClickListener{
                val intent =Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

            validateSignUp()
            clearErrorOnType()
        }

        fun validateSignUp() {
            val firstName = binding.etName.text.toString()
            val email = binding.etEmail.text.toString()
            val phone = binding.etNumber.text.toString()
            var error = false

            if (firstName.isBlank()) {
                binding.etName.error= "First name is required"
                error = true
            } else {
                binding.tilName.error = null
            }

            if (email.isBlank()) {
                binding.etEmail.error = "Email is required"
                error = true
//            } else {
//                binding.tilEmail.error = null
            }

            if (phone.isEmpty()) {
                binding.etNumber.error = "Phone Number is required"
                error = true
            } else {
                binding.tilNumber.error = null
            }

            if (!error) {
                Toast.makeText(this, "$firstName $email $phone", Toast.LENGTH_LONG).show()
            }
        }
        fun clearErrorOnType() {
            binding.tilName.editText?.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    binding.tilName.error = null
                }

                override fun afterTextChanged(s: Editable?) {

                }
            })


//
            binding.tilNumber.editText?.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    binding.tilNumber.error = null
                }

                override fun afterTextChanged(s: Editable?) {

                }
            })

            binding.tilEmail.editText?.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                    // No action needed
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    binding.tilEmail.error = null
                    binding.tilEmail.requestLayout() // or binding.tilEmail.invalidate()
                }

                override fun afterTextChanged(s: Editable?) {
                    // No action needed
                }
            })

        }
    }

