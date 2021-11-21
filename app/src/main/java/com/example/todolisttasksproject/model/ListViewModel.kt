package com.example.todolisttasksproject.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListViewModel:ViewModel()
{

    val _item_title = MutableLiveData<String>()
    var item_title :LiveData<String>=_item_title

   fun Addlist (addTask:String) {

       item_title.add(List(addTask))

   }




    fun Editlist(index:Int){

        item_title.set(index,List(item_title.value.toString()))
    }
fun delate(){


}
}

