package mariadev.example.contacts

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import mariadev.example.contacts.databinding.ActivityAddcontactsBinding
import mariadev.example.contacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        binding.Fabadd.setOnClickListener {
//            openActivityAddcontactsBinding()
//        }
    }

    override fun onResume() {
        super.onResume()
        displayContacts()

        binding.Fabadd.setOnClickListener {
            val intent = Intent(this,addcontacts::class.java)
            startActivity(intent)
        }
    }

    fun displayContacts(){
        val contact1 = ContactList("Maria", "0713030706", "maria@gmail.com", "https://images.unsplash.com/photo-1531727991582-cfd25ce79613?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8YWZyaWNhbiUyMHByb2ZpbGUlMjBmYWNlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
        val contact2 = ContactList("Stephen", "0797196522", "stephen@gmail.com", "https://images.unsplash.com/photo-1530785602389-07594beb8b73?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8YWZyaWNhbiUyMHByb2ZpbGUlMjBmYWNlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
        val contact3 = ContactList("Ambenge", "0703259286", "ambenge@gmail.com", "https://images.unsplash.com/photo-1506863530036-1efeddceb993?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGFmcmljYW4lMjBwcm9maWxlJTIwZmFjZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60")
        val contact4 =ContactList("Irene", "0716636825", "irene@gmail.com", "https://images.unsplash.com/photo-1519011985187-444d62641929?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTd8fGFmcmljYW4lMjBwcm9maWxlJTIwZmFjZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60")
        val contact5 = ContactList("Apiu", "0719395019", "kapiu@gmail.com", "https://images.unsplash.com/photo-1531475925016-6d33cb7c8344?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDN8fHxlbnwwfHx8fHw%3D&auto=format&fit=crop&w=500&q=60")
        val contact6 = ContactList("Esther", "0719592688", "kamede@gmail.com", "https://images.unsplash.com/photo-1535588706069-af8f2d837332?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDd8fHxlbnwwfHx8fHw%3D&auto=format&fit=crop&w=500&q=60")
        val contact7 = ContactList("Snaida", "0727470737", "snaida@gmail.com", "https://images.unsplash.com/photo-1629003899609-e90c32b7566d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE1fHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60")
        val contact8 = ContactList("Kenyani", "0723456789", "kenyani@gmail.com", "https://images.unsplash.com/photo-1620619795153-65c7996827c5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDEwfHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60")
        val contact9 = ContactList("Ndemo", "0713456789", "ndemo@gmail.com", "https://images.unsplash.com/photo-1618721405821-80ebc4b63d26?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDExfHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60")
        val contact10 = ContactList("Terry", "0727668216", "terry@gmail.com", "https://images.unsplash.com/photo-1534528741775-53994a69daeb?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8YWZyaWNhbiUyMHByb2ZpbGUlMjBmYWNlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var displayallcontact = listOf<ContactList>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        var contacts = ContactAdapter(displayallcontact)
        binding.rvContacts.adapter = contacts
    }
//    fun openActivityAddcontactsBinding(){
//        val intent = Intent(this,ActivityAddcontactsBinding::class.java)
//        startActivity(intent)
//    }

}