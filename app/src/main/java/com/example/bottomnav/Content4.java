package com.example.bottomnav;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Content4 extends AppCompatActivity {

    TextView tx1,tx2, tx3, tx4, tx5, tx6, tx7, tx8;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content4);

        tx1 = findViewById(R.id.dm1);
        tx1.setText("<application\n" +
                "    ....\n" +
                "    ....\n" +
                "    android:theme=\"@style/ThemeLight\">");

        tx2 = findViewById(R.id.dm2);
        tx2.setText("<resources>\n" +
                "    <attr name=\"card_background\" format=\"color\"/>\n" +
                "</resources>");

        tx3 = findViewById(R.id.dm3);
        tx3.setText("<resources>\n" +
                "    <color name=\"colorPrimary\">#009688</color>\n" +
                "    <color name=\"colorPrimaryDark\">#00897B</color>\n" +
                "    <color name=\"colorAccent\">#D81B60</color>\n" +
                "    <color name=\"colorControlNormal\">#ffffff</color>\n" +
                "    \n" +
                "    <color name=\"windowBackground\">#fafafa</color>\n" +
                "    <color name=\"windowBackgroundDark\">#181818</color>\n" +
                "    \n" +
                "    <color name=\"cardBackground\">#ffffff</color>\n" +
                "    <color name=\"cardBackgroundDark\">#282828</color>\n" +
                "    \n" +
                "    <color name=\"textColor\">#000000</color>\n" +
                "    <color name=\"textColorDark\">#ffffff</color>\n" +
                "</resources>");

        tx4 = findViewById(R.id.dm4);
        tx4.setText("<resources>\n" +
                "    \n" +
                "    <style name=\"ThemeLight\" parent=\"Theme.AppCompat.Light.DarkActionBar\">\n" +
                "        <item name=\"colorPrimary\">@color/colorPrimary</item>\n" +
                "        <item name=\"colorPrimaryDark\">@color/colorPrimaryDark</item>\n" +
                "        <item name=\"colorAccent\">@color/colorAccent</item>\n" +
                "        <item name=\"colorControlNormal\">@color/colorControlNormal</item>\n" +
                "        \n" +
                "        <item name=\"android:windowBackground\">@color/windowBackground</item>\n" +
                "        <item name=\"android:textColorPrimary\">@color/textColor</item>\n" +
                "        <item name=\"android:textColorSecondary\">@color/textColor</item>\n" +
                "        \n" +
                "        <item name=\"card_background\">@color/cardBackground</item>\n" +
                "    </style>\n" +
                "    \n" +
                "    <style name=\"ThemeDark\" parent=\"Theme.AppCompat\">\n" +
                "        <item name=\"colorPrimary\">@color/cardBackgroundDark</item>\n" +
                "        <item name=\"colorPrimaryDark\">@color/cardBackgroundDark</item>\n" +
                "        <item name=\"colorAccent\">@color/colorAccent</item>\n" +
                "        <item name=\"colorControlNormal\">@color/colorControlNormal</item>\n" +
                "        \n" +
                "        <item name=\"android:windowBackground\">@color/windowBackgroundDark</item>\n" +
                "        <item name=\"android:textColorPrimary\">@color/textColorDark</item>\n" +
                "        <item name=\"android:textColorSecondary\">@color/textColorDark</item>\n" +
                "\n" +
                "        <item name=\"card_background\">@color/cardBackgroundDark</item>\n" +
                "    </style>\n" +
                "\n" +
                "</resources>");

        tx5 = findViewById(R.id.dm5);
        tx5.setText("<menu xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                "    \n" +
                "    <item\n" +
                "        android:id=\"@+id/menu_theme\"\n" +
                "        android:title=\"Switch app theme\"/>\n" +
                "    \n" +
                "</menu>");

        tx6 = findViewById(R.id.dm6);
        tx6.setText("<LinearLayout\n" +
                "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:gravity=\"center\">\n" +
                "\n" +
                "    <android.support.v7.widget.CardView\n" +
                "        xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_margin=\"15dp\"\n" +
                "        app:cardBackgroundColor=\"?attr/card_background\">\n" +
                "\n" +
                "        <LinearLayout\n" +
                "            android:orientation=\"vertical\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:padding=\"20dp\">\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"This is Title\"\n" +
                "                android:textSize=\"18sp\"\n" +
                "                android:textColor=\"?android:attr/textColorPrimary\"/>\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"This is a just text preview to demo app. This app is just for demo and simple app. You can copy this code project to your own app project.\"\n" +
                "                android:textSize=\"14sp\"\n" +
                "                android:layout_marginTop=\"10dp\"\n" +
                "                android:lineSpacingExtra=\"3dp\"/>\n" +
                "\n" +
                "        </LinearLayout>\n" +
                "\n" +

                "    </android.support.v7.widget.CardView>\n" +
                "\n" +
                "</LinearLayout>");

        tx7 = findViewById(R.id.dm7);
        tx7.setText("import android.content.*;\n" +
                "import android.preference.*;\n" +
                "\n" +
                "public class Theme\n" +
                "{\n" +
                "    private static SharedPreferences pref;\n" +
                "    private static SharedPreferences.Editor editor;\n" +
                "\n" +
                "    public static void createTheme(Context context)\n" +
                "    {\n" +
                "        pref = PreferenceManager.getDefaultSharedPreferences(context);\n" +
                "        int theme = pref.getInt(\"theme_app\", 0);\n" +
                "        switch (theme) {\n" +
                "            case 0:\n" +
                "                context.setTheme(R.style.ThemeLight);\n" +
                "                break;\n" +
                "\n" +
                "            case 1:\n" +
                "                context.setTheme(R.style.ThemeDark);\n" +
                "                break;\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    public static boolean isThemeLight(Context context)\n" +
                "    {\n" +
                "        pref = PreferenceManager.getDefaultSharedPreferences(context);\n" +
                "        return pref.getBoolean(\"is_theme_light\", true);\n" +
                "    }\n" +
                "\n" +
                "    public static void setTheme(Context context, boolean isLight, int theme)\n" +
                "    {\n" +
                "        pref = PreferenceManager.getDefaultSharedPreferences(context);\n" +
                "        editor = pref.edit();\n" +
                "        editor.putBoolean(\"is_theme_light\", isLight);\n" +
                "        editor.putInt(\"theme_app\", theme);\n" +
                "        editor.commit();\n" +
                "    }\n" +
                "}");

        tx8 = findViewById(R.id.dm8);
        tx8.setText("import android.content.*;\n" +
                "import android.preference.*;\n" +
                "\n" +
                "public class Theme\n" +
                "{\n" +
                "    private static SharedPreferences pref;\n" +
                "    private static SharedPreferences.Editor editor;\n" +
                "\n" +
                "    public static void createTheme(Context context)\n" +
                "    {\n" +
                "        pref = PreferenceManager.getDefaultSharedPreferences(context);\n" +
                "        int theme = pref.getInt(\"theme_app\", 0);\n" +
                "        switch (theme) {\n" +
                "            case 0:\n" +
                "                context.setTheme(R.style.ThemeLight);\n" +
                "                break;\n" +
                "\n" +
                "            case 1:\n" +
                "                context.setTheme(R.style.ThemeDark);\n" +
                "                break;\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    public static boolean isThemeLight(Context context)\n" +
                "    {\n" +
                "        pref = PreferenceManager.getDefaultSharedPreferences(context);\n" +
                "        return pref.getBoolean(\"is_theme_light\", true);\n" +
                "    }\n" +
                "\n" +
                "    public static void setTheme(Context context, boolean isLight, int theme)\n" +
                "    {\n" +
                "        pref = PreferenceManager.getDefaultSharedPreferences(context);\n" +
                "        editor = pref.edit();\n" +
                "        editor.putBoolean(\"is_theme_light\", isLight);\n" +
                "        editor.putInt(\"theme_app\", theme);\n" +
                "        editor.commit();\n" +
                "    }\n" +
                "}");

        tx8 = findViewById(R.id.dm8);
        tx8.setText("import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.*;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity\n" +
                "{\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState)\n" +
                "    {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "\n" +
                "        // create Theme in onCreate\n" +
                "        Theme.createTheme(this);\n" +
                "\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public boolean onCreateOptionsMenu(Menu menu)\n" +
                "    {\n" +
                "        getMenuInflater().inflate(R.menu.menu_theme, menu);\n" +
                "        return super.onCreateOptionsMenu(menu);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public boolean onOptionsItemSelected(MenuItem item)\n" +
                "    {\n" +
                "        switch (item.getItemId()) {\n" +
                "\n" +
                "                // set theme \n" +
                "            case R.id.menu_theme:\n" +
                "                if (Theme.isThemeLight(this)) {\n" +
                "                    Theme.setTheme(this, false, 1);\n" +
                "                    recreate();\n" +
                "                } else {\n" +
                "                    Theme.setTheme(this, true, 0);\n" +
                "                    recreate();\n" +
                "                }\n" +
                "                break;\n" +
                "        }\n" +
                "        return super.onOptionsItemSelected(item);\n" +
                "    }\n" +
                "\n" +
                "}");



    }
    }



