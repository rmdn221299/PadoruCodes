package com.example.bottomnav;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Content5 extends AppCompatActivity {

        TextView tx1, tx2, tx3;

        @SuppressLint("SetTextI18n")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_content5);

            tx1 = findViewById(R.id.bn1);
            tx1.setText("<menu xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    tools:showIn=\"navigation_view\">\n" +
                    "\n" +
                    "    <item\n" +
                    "        android:id=\"@+id/nav_home\"\n" +
                    "        android:icon=\"@drawable/ic_toolbar_home\"\n" +
                    "        android:title=\"Home\" />\n" +
                    "    <item\n" +
                    "        android:id=\"@+id/nav_notification\"\n" +
                    "        android:icon=\"@drawable/ic_toolbar_notification\"\n" +
                    "        android:title=\"Notification\" />\n" +
                    "    <item\n" +
                    "        android:id=\"@+id/nav_dashboard\"\n" +
                    "        android:icon=\"@drawable/ic_toolbar_dashboard\"\n" +
                    "        android:title=\"Dashboard\" />\n" +
                    "\n" +
                    "</menu>");

            tx2 = findViewById(R.id.bn2);
            tx2.setText("<android.support.design.widget.CoordinatorLayout\n" +
                    "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    android:id=\"@+id/main_layout\">\n" +
                    "\n" +
                    "    <LinearLayout\n" +
                    "        android:layout_height=\"match_parent\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:orientation=\"vertical\"\n" +
                    "        android:gravity=\"center\">\n" +
                    "\n" +
                    "        <LinearLayout\n" +
                    "            android:layout_height=\"match_parent\"\n" +
                    "            android:layout_width=\"match_parent\"\n" +
                    "            android:orientation=\"vertical\"\n" +
                    "            android:layout_weight=\"1.0\"\n" +
                    "            android:gravity=\"center\">\n" +
                    "\n" +
                    "            <TextView\n" +
                    "                android:layout_height=\"wrap_content\"\n" +
                    "                android:layout_width=\"wrap_content\"\n" +
                    "                android:text=\"Hello World !\"\n" +
                    "                android:textSize=\"18sp\"\n" +
                    "                android:id=\"@+id/message\"/>\n" +
                    "\n" +
                    "        </LinearLayout>\n" +
                    "\n" +
                    "        <android.support.design.widget.BottomNavigationView\n" +
                    "            android:id=\"@+id/bottom_navigation\"\n" +
                    "            android:layout_width=\"match_parent\"\n" +
                    "            android:layout_height=\"wrap_content\"\n" +
                    "            android:background=\"#ffffff\"\n" +
                    "            app:menu=\"@menu/menu_bottom_navigation\"/>\n" +
                    "\n" +
                    "    </LinearLayout>\n" +
                    "\n" +
                    "</android.support.design.widget.CoordinatorLayout>");

            tx3 = findViewById(R.id.bn3);
            tx3.setText("import android.support.v7.app.AppCompatActivity;\n" +
                    "import android.os.Bundle;\n" +
                    "import android.support.design.*;\n" +
                    "import android.widget.*;\n" +
                    "import android.view.*;\n" +
                    "import android.support.design.widget.*;\n" +
                    "\n" +
                    "public class MainActivity extends AppCompatActivity\n" +
                    "{\n" +
                    "    private BottomNavigationView mBottomNav;\n" +
                    "    private TextView mTextMessage;\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void onCreate(Bundle savedInstanceState)\n" +
                    "    {\n" +
                    "        super.onCreate(savedInstanceState);\n" +
                    "        setContentView(R.layout.activity_main);\n" +
                    "\n" +
                    "        mBottomNav = findViewById(R.id.bottom_navigation);\n" +
                    "        mTextMessage = findViewById(R.id.message);\n" +
                    "\n" +
                    "        mTextMessage.setText(\"Home\");\n" +
                    "        setupBottomNav();\n" +
                    "    }\n" +
                    "\n" +
                    "    private void setupBottomNav()\n" +
                    "    {\n" +
                    "        mBottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){\n" +
                    "                @Override\n" +
                    "                public boolean onNavigationItemSelected(MenuItem item)\n" +
                    "                {\n" +
                    "                    // set action by clicked item by id\n" +
                    "                    switch (item.getItemId()) {\n" +
                    "                        case R.id.nav_home:\n" +
                    "                            mTextMessage.setText(\"Home\");\n" +
                    "                            break;\n" +
                    "                        case R.id.nav_notification:\n" +
                    "                            mTextMessage.setText(\"Notification\");\n" +
                    "                            break;\n" +
                    "                        case R.id.nav_dashboard:\n" +
                    "                            mTextMessage.setText(\"Dashboard\");\n" +
                    "                            break;\n" +
                    "                    }\n" +
                    "                    item.setCheckable(true);\n" +
                    "                    item.setChecked(true);\n" +
                    "                    return false;\n" +
                    "                }\n" +
                    "            });\n" +
                    "    }\n" +
                    "}");
        }
    }