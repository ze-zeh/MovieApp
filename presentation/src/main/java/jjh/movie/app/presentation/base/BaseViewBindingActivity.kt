package jjh.movie.app.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseViewBindingActivity<VB : ViewBinding>(
    private val bindingInflater: (inflater: LayoutInflater) -> VB,
) : AppCompatActivity() {

    private var _binding: VB? = null

    protected val binding: VB
        get() = _binding ?: error("Binding is null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = bindingInflater(layoutInflater)
        setContentView(binding.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
