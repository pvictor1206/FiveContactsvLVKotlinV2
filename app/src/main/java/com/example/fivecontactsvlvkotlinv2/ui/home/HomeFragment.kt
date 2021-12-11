package com.example.fivecontactsvlvkotlinv2.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.fivecontactsvlvkotlinv2.R
import com.example.fivecontactsvlvkotlinv2.databinding.FragmentHomeBinding
import android.content.Intent
import android.net.Uri
import com.example.fivecontactsvlvkotlinv2.MainActivity

import androidx.core.app.ActivityCompat





class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.button.setOnClickListener {

            /*
            CODIGO EM JAVA

            String numero = telefone.getText().toString();
    Uri uri = Uri.parse("tel"+numero);

    Intent intent = new Intent(Intent.ACTION_CALL, uri);



    if(ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackegeManager.PERMISSION_GRANTED) {
        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
        return;
    }

    startActivity(intent);
             */



            /*
            CODIGO EM KOTLIN

            val numero: String = telefone.getText().toString()
            val uri = Uri.parse("tel$numero")

            val intent = Intent(Intent.ACTION_CALL, uri)



            if (ActivityCompat.checkSelfPermission(
                    this@MainActivity,
                    Manifest.permission.CALL_PHONE
                ) != PackegeManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@MainActivity,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
                return
            }

            startActivity(intent)



             */


        }

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it

        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}