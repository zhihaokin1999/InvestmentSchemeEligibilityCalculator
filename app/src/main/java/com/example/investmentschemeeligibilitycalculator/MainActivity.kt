package com.example.investmentschemeeligibilitycalculator

import android.app.DatePickerDialog
import android.icu.lang.UCharacter.getAge
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val c:Calendar=Calendar.getInstance()
        val mYear=c.get(Calendar.YEAR)
        val mMonth = c.get(Calendar.MONTH)
        val mDay = c.get(Calendar.DAY_OF_MONTH)
        var dob =0
        txtDOB.setOnClickListener(){
            val dpd=DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener{
                    view,year,monthOfYear,dayOfMonth ->
                    txtDOB.setText("%d-%d-%d".format(dayOfMonth,monthOfYear,year))
                    dob=year
                },mYear,mMonth,mDay)
            dpd.show()

        }
        btnOk.setOnClickListener(){
          val  c:Calendar = Calendar.getInstance()
           var age=mYear-dob
            var Investment:Double=0.0
            if(age>=16 && age<= 20){
                txtMinBS.text="5000"
                Investment=5000*0.3;
                txtInvestment.text=Investment.toString()
            }else if(age>=21 && age<=25){
                txtMinBS.text="14,000"
                Investment=14000*0.3;
                txtInvestment.text=Investment.toString()
            }else if(age>=26 && age<=30){
                txtMinBS.text="29,000"
                Investment=29000*0.3;
                txtInvestment.text=Investment.toString()
            }else if(age>=31 && age<=35){
                txtMinBS.text="50,000"
                Investment=50000*0.3;
                txtInvestment.text=Investment.toString()
            }else if(age>=36 && age<=40){
                txtMinBS.text="78,000"
                Investment=78000*0.3;
                txtInvestment.text=Investment.toString()
            }else if(age>=41 && age<=45){
                txtMinBS.text="116,000"
                Investment=116000*0.3;
                txtInvestment.text=Investment.toString()
            }else if(age>=46 && age<=50){
                txtMinBS.text="165,000"
                Investment=165000*0.3;
                txtInvestment.text=Investment.toString()
            }else if(age>=51 && age<=55){
                txtMinBS.text="228,000"
                Investment=228000*0.3;
                txtInvestment.text=Investment.toString()
            }

////

            txtAge.text=age.toString()
        }
        btnReset.setOnClickListener(){
            txtDOB.text="Click to Select Date"
            txtAge.text=""
            txtMinBS.text=""
            txtInvestment.text=""

        }

    }
}
