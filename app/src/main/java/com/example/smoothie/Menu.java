package com.example.smoothie;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smoothie.model.menu;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        String menuType = getIntent().getStringExtra("menuType");

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<menu> menu = new ArrayList<>();

        if ("smoothie".equals(menuType)) {
            menu menu1 = new menu();
            menu1.setMenu_name("ชาเขียว");
            menu1.setMenu_image("https://i.pinimg.com/564x/19/1c/87/191c87753eff6e47a0d084c08fa695be.jpg");
            menu1.setMenu_detail("เมนูน้ำ");
            menu1.setMenu_price("50");
            menu.add(menu1);

            menu menu2 = new menu();
            menu2.setMenu_name("กาแฟ");
            menu2.setMenu_image("https://i.pinimg.com/564x/92/af/32/92af32f5eb84b559b42d9e215ef1b3b1.jpg");
            menu2.setMenu_detail("เมนูน้ำ");
            menu2.setMenu_price("30");
            menu.add(menu2);

            menu menu3 = new menu();
            menu3.setMenu_name("นมปั่น");
            menu3.setMenu_image("https://i.pinimg.com/564x/b7/49/8b/b7498b81634d92b04ff158a4963b5756.jpg");
            menu3.setMenu_detail("เมนูน้ำ");
            menu3.setMenu_price("55");
            menu.add(menu3);

        } else if ("food".equals(menuType)) {
            menu menu1 = new menu();
            menu1.setMenu_name("ซาลาเปาทอดไส้ไข่หมูสับ");
            menu1.setMenu_image("https://i.pinimg.com/564x/37/8d/4a/378d4aa07cf39e28828cfebd936cd759.jpg");
            menu1.setMenu_detail("เมนูอาหาร");
            menu1.setMenu_price("30");
            menu.add(menu1);

            menu menu2 = new menu();
            menu2.setMenu_name("สปาเก็ตตี้ผัดขี้เมา");
            menu2.setMenu_image("https://i.pinimg.com/564x/31/16/08/31160834c28e6c10133936f6915b2843.jpg");
            menu2.setMenu_detail("เมนูอาหาร");
            menu2.setMenu_price("40");
            menu.add(menu2);

            menu menu3 = new menu();
            menu3.setMenu_name("แซนวิช");
            menu3.setMenu_image("https://i.pinimg.com/564x/b9/0d/96/b90d969897c9cab8a1c24160b1e13b02.jpg");
            menu3.setMenu_detail("เมนูอาหาร");
            menu3.setMenu_price("50");
            menu.add(menu3);

        } else if ("dessert".equals(menuType)) {
            menu menu1 = new menu();
            menu1.setMenu_name("แพนเค้ก ");
            menu1.setMenu_image("https://i.pinimg.com/564x/8d/f7/3d/8df73d03c77684b283d24504b9627984.jpg");
            menu1.setMenu_detail("เมนของหวาน");
            menu1.setMenu_price("50");
            menu.add(menu1);

            menu menu2 = new menu();
            menu2.setMenu_name("เค้ก");
            menu2.setMenu_image("https://i.pinimg.com/736x/ad/0e/d7/ad0ed7305702e1d0397b2312aafe01e0.jpg");
            menu2.setMenu_detail("เมนของหวาน");
            menu2.setMenu_price("55");
            menu.add(menu2);

            menu menu3 = new menu();
            menu3.setMenu_name("ไอศกรีมโฮมเมด");
            menu3.setMenu_image("https://i.pinimg.com/736x/11/4c/63/114c638dceaf1c640004c9307af18e85.jpg");
            menu3.setMenu_detail("เมนของหวาน");
            menu3.setMenu_price("30");
            menu.add(menu3);

        }

        mAdapter = new MyAdptersmar(menu, this);
        recyclerView.setAdapter(mAdapter);
    }
}
