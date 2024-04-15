package com.onur.diplayground

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import retrofit2.Retrofit

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val retrofit = Retrofit.Builder().baseUrl("https://www.google.com").build()
        val userDataFromLocal = UserDataFromLocal()
        val userDataFromRemote = UserDataFromRemote(retrofit)
        val repository = Repository(userDataFromLocal, userDataFromRemote)
        val viewModel = MyViewModel(repository)
        val foo = Foo()
        viewModel.print()
        foo.printFoo()
    }
}