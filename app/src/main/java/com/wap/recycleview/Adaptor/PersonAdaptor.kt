package com.wap.recycleview.Adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.wap.recycleview.Model.Person
import com.wap.recycleview.R
import kotlinx.android.synthetic.main.item_person.view.*

class PersonAdaptor(var personList: ArrayList<Person>) :
    RecyclerView.Adapter<PersonAdaptor.PersonViewHolder>() {
    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var person: Person

        fun bindPerson(person: Person) {

            itemView.txtname.text = person.name
            itemView.txtoccuption.text = person.ocuption
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)
        return PersonViewHolder(view)
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bindPerson(personList[position])
    }
}