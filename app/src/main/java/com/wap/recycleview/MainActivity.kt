package com.wap.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.wap.recycleview.Adaptor.PersonAdaptor
import com.wap.recycleview.Model.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var personList=ArrayList<Person>()
        personList.add(Person("Jneey","Ahdroid"))
        personList.add(Person("John","web"))
        recyclerview.layoutManager=GridLayoutManager(this,2)
            //LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true)
        recyclerview.adapter=PersonAdaptor(personList)
    }
}