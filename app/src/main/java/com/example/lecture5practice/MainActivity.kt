package com.example.lecture5practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.SeekBar
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.lecture5practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {
                binding.textView.text = binding.editTextTextPersonName.text
            }

        })
        binding.editTextTextPersonName.setOnClickListener{
            binding.textView.text = getString(R.string.editTextClick)
        }
        binding.editTextTextPersonName.addTextChangedListener{
            binding.textView.text = getString(R.string.editTextTextChanging)
        }






           binding.seekBar.setOnSeekBarChangeListener (object:SeekBar.OnSeekBarChangeListener{
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                }
                override fun onStartTrackingTouch(p0: SeekBar?) {
                               }
                override fun onStopTrackingTouch(p0: SeekBar?) {
                    Toast.makeText(this@MainActivity,
                        "Progress is: " + seekBar.progress + "%",

                        Toast.LENGTH_SHORT).show()


                }

            })

            binding.switch1.setOnCheckedChangeListener { it, isChecked ->
                val message = if (isChecked) "Switch1:ON" else "Switch1:OFF"
                Toast.makeText(this@MainActivity, message,
                    Toast.LENGTH_SHORT).show()
            }



        }


    }






