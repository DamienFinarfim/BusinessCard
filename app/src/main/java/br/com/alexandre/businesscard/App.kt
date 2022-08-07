package br.com.alexandre.businesscard

import android.app.Application
import br.com.alexandre.businesscard.data.AppDatabase
import br.com.alexandre.businesscard.data.BusinessCardRepository

class App : Application(){
    val database by lazy { AppDatabase.getDatabase(this)}
    val repository by lazy { BusinessCardRepository(database.businessDao())}
}