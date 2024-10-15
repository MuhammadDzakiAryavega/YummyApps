package com.dzaki_aryavega.yummyapps

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dzaki_aryavega.yummyapps.adapter.OrderAdapter
import com.dzaki_aryavega.yummyapps.model.ModelListOrder

class ListOrderActivity : AppCompatActivity() {
    private lateinit var RecyclerViewMakanan : RecyclerView
    private lateinit var AdapterMakanan : OrderAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_order)

        val menuMakanan = listOf(
            ModelListOrder(
                R.drawable.pizza,
                "Pizza Hut",
                "29 nov, 01.09 pm",
                "$30.00",
                "2 Items"
            ),
            ModelListOrder(R.drawable.taco, "Taco de sioso", "10 mei, 06.10 pm", "$10.00", "2 Items"),
            ModelListOrder(R.drawable.sushi, "Sushi", "06 nov, 02.09 pm", "$25.00", "2 Items"),
            ModelListOrder(R.drawable.pizza, "Pizza Hut", "07 nov, 07.45 pm", "$30.00", "2 Items"),
            ModelListOrder(R.drawable.rendang, "Strawberry", "24 june, 07.00 pm", "$40.00", "2 Items")

        )


        RecyclerViewMakanan = findViewById(R.id.RvMakanan)
        RecyclerViewMakanan.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        AdapterMakanan = OrderAdapter(menuMakanan)
        RecyclerViewMakanan.adapter = AdapterMakanan
    }
}