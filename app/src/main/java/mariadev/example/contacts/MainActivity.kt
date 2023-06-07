package mariadev.example.contacts

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import mariadev.example.contacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }

    fun displayContacts(){
        val contact1 = ContactList("Maria", "0713030706", "maria@gmail.com", "")
        val contact2 = ContactList("Stephen", "0797196522", "stephen@gmail.com", "")
        val contact3 = ContactList("Ambenge", "0703259286", "ambenge@gmail.com", "")
        val contact4 =ContactList("Irene", "0716636825", "irene@gmail.com", "")
        val contact5 = ContactList("Apiu", "0719395019", "kapiu@gmail.com", "")
        val contact6 = ContactList("Esther", "0719592688", "kamede@gmail.com", "")
        val contact7 = ContactList("Snaida", "0727470737", "snaida@gmail.com", "")
        val contact8 = ContactList("Kenyani", "0723456789", "kenyani@gmail.com", "")
        val contact9 = ContactList("Ndemo", "0713456789", "ndemo@gmail.com", "")
        val contact10 = ContactList("Terry", "0727668216", "terry@gmail.com", "")
        var displayallcontact = listOf<ContactList>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        var contacts = ContactAdapter(displayallcontact)
        binding.rvContacts.adapter = contacts
    }

}