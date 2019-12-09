package com.example.insurancepremiumcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sumbitButton.setOnClickListener(){
            var totalAmount = 0;
            if(ageSpinner.selectedItem.toString().equals("Less than 17"))
            {
                totalAmount += 60
            }
            else if (ageSpinner.selectedItem.toString().equals("17 - 25"))
            {
                totalAmount += 70
                if(maleButton.isChecked)
                    totalAmount += 50
                if(smoker.isChecked)
                    totalAmount += 100
            }
            else if (ageSpinner.selectedItem.toString().equals("26 - 30"))
            {
                totalAmount += 90
                if(maleButton.isChecked)
                    totalAmount += 100
                if(smoker.isChecked)
                    totalAmount += 150
            }
            else if (ageSpinner.selectedItem.toString().equals("31 - 40"))
            {
                totalAmount += 120
                if(maleButton.isChecked)
                    totalAmount += 150
                if(smoker.isChecked)
                    totalAmount += 200
            }
            else if (ageSpinner.selectedItem.toString().equals("41 - 55"))
            {
                totalAmount += 150
                if(maleButton.isChecked)
                    totalAmount += 200
                if(smoker.isChecked)
                    totalAmount += 250
            }
            else
            {
                totalAmount += 150
                if(maleButton.isChecked)
                    totalAmount += 200
                if(smoker.isChecked)
                    totalAmount += 300
            }

            insurancePremium.text = "Life Insurance Premium Amount: " + totalAmount.toString()
        }
    }
}
