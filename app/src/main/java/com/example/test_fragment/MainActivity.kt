package com.example.test_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frM = supportFragmentManager
        val myAdapter = MyAdapter(frM)
        myViewPager.adapter =myAdapter


      /*  val fragmentA = A()
        val fragmentB = B()
        val fragmentC = C()
        btnA.setOnClickListener {
            transaction(fragmentA)
        }

        btnB.setOnClickListener {
            transaction(fragmentB)
        }

        btnC.setOnClickListener {
            transaction(fragmentC)
        }*/
    }

    class MyAdapter(frM : FragmentManager):FragmentPagerAdapter(frM) {

        override fun getItem(position: Int): Fragment {
            var fragment :Fragment? = null
            if (position == 0){ fragment = A() }
            if (position == 1){ fragment = B() }
            if (position == 2){ fragment = C() }
            return fragment!!
        }
        override fun getCount(): Int {
            return 3
        }

        override fun getPageTitle(position: Int): CharSequence? {
            var tittle: String? = null
            if (position == 0 ){
                tittle = "Tap One "
            }
            if (position == 1 ){
                tittle = "Tap Two "
            }
            if (position == 2 ){
                tittle = "Tap Three "
            }
            return tittle
        }

    }
/*
  private fun transaction(fragment:Fragment){
     val transaction = supportFragmentManager.beginTransaction()
     transaction.replace(R.id.main_layout,fragment)
     transaction.commit()
   }
*/
}