package com.example.bottomnav;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Content1 extends AppCompatActivity {

    TextView tx2,tx3;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content1);

        tx3 = findViewById(R.id.test2);
        tx3.setText("package com.example.bottomnav;\n" +
                "\n" +
                "import androidx.annotation.NonNull;\n" +
                "import androidx.appcompat.app.ActionBarDrawerToggle;\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import androidx.appcompat.widget.Toolbar;\n" +
                "import androidx.core.view.GravityCompat;\n" +
                "import androidx.drawerlayout.widget.DrawerLayout;\n" +
                "\n" +
                "import android.os.Bundle;\n" +
                "import android.view.MenuItem;\n" +
                "import com.google.android.material.navigation.NavigationView;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {\n" +
                "    private DrawerLayout drawer;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        Toolbar toolbar = findViewById(R.id.toolbar);\n" +
                "        setSupportActionBar(toolbar);\n" +
                "\n" +
                "        drawer = findViewById(R.id.drawer_layout);\n" +
                "        NavigationView navigationView = findViewById(R.id.nav_view);\n" +
                "        navigationView.setNavigationItemSelectedListener(this);\n" +
                "\n" +
                "        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);\n" +
                "        drawer.addDrawerListener(toggle);\n" +
                "        toggle.syncState();\n" +
                "\n" +
                "        if (savedInstanceState == null){\n" +
                "            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SecondFragment()).commit();\n" +
                "            navigationView.setCheckedItem(R.id.nav_code);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public boolean onNavigationItemSelected(@NonNull MenuItem item) {\n" +
                "        switch (item.getItemId()){\n" +
                "            case R.id.nav_code:\n" +
                "                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SecondFragment()).commit();\n" +
                "                break;\n" +
                "            case R.id.nav_color:\n" +
                "                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FirstFragment()).commit();\n" +
                "                break;\n" +
                "\n" +
                "            case R.id.nav_example:\n" +
                "                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ThirdFragment()).commit();\n" +
                "                break;\n" +
                "            }\n" +
                "        drawer.closeDrawer(GravityCompat.START);\n" +
                "        return true;\n" +
                "    }\n" +
                "}");

        tx2 = findViewById(R.id.test);
        tx2.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.drawerlayout.widget.DrawerLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\"\n" +
                "    android:id=\"@+id/drawer_layout\"\n" +
                "    tools:openDrawer=\"start\">\n" +
                "\n" +
                "    <LinearLayout\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        android:orientation=\"vertical\">\n" +
                "\n" +
                "        <androidx.appcompat.widget.Toolbar\n" +
                "            android:id=\"@+id/toolbar\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"?attr/actionBarSize\"\n" +
                "            android:background=\"@color/biru_lngit\"\n" +
                "            android:elevation=\"4dp\"\n" +
                "            android:theme=\"@style/ThemeOverlay.AppCompat.Dark.ActionBar\"\n" +
                "            app:popupTheme=\"@style/ThemeOverlay.AppCompat.Light\" />\n" +
                "\n" +
                "        <FrameLayout\n" +
                "            android:id=\"@+id/fragment_container\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"match_parent\" />\n" +
                "\n" +
                "    </LinearLayout>\n" +
                "\n" +
                "    <com.google.android.material.navigation.NavigationView\n" +
                "        android:id=\"@+id/nav_view\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        android:layout_gravity=\"start\"\n" +
                "        app:headerLayout=\"@layout/nav_header\"\n" +
                "        app:menu=\"@menu/menu_side\" />\n" +
                "</androidx.drawerlayout.widget.DrawerLayout>");
    }
}