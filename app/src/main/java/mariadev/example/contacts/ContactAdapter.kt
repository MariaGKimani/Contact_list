package mariadev.example.contacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import mariadev.example.contacts.databinding.ContactListBinding

class ContactAdapter(var Contactdata: List<ContactList>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding = ContactListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  ContactViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var  contactDetails = Contactdata[position]
        holder.binding.apply {
            tvname.text = contactDetails.name
            tvEmail.text =contactDetails.email
            tvPhoneNumber.text= contactDetails.phoneNumber

        }
    }

    override fun getItemCount(): Int {
      return  Contactdata.size
    }
}

class ContactViewHolder(var binding: ContactListBinding ):RecyclerView.ViewHolder(binding.root){

}

