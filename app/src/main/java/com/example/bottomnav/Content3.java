package com.example.bottomnav;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Content3 extends AppCompatActivity {

    TextView tx1,tx2, tx3, tx4, tx5;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content3);

        tx1 = findViewById(R.id.cv1);
        tx1.setText("<android.support.v7.widget.CardView\n" +
                "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    android:layout_height=\"wrap_content\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_margin=\"8dp\">\n" +
                "\n" +
                "    <LinearLayout\n" +
                "        android:layout_width=\"fill_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:gravity=\"center_horizontal\"\n" +
                "        android:background=\"?attr/selectableItemBackground\"\n" +
                "        android:orientation=\"vertical\">\n" +
                "\n" +
                "        <ImageView\n" +
                "            android:layout_height=\"50dp\"\n" +
                "            android:layout_width=\"50dp\"\n" +
                "            android:id=\"@+id/image\"\n" +
                "            android:layout_margin=\"15dp\"/>\n" +
                "\n" +
                "        <View\n" +
                "            android:background=\"?android:attr/dividerVertical\"\n" +
                "            android:layout_height=\"1dp\"\n" +
                "            android:layout_width=\"match_parent\"/>\n" +
                "\n" +
                "        <TextView\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:text=\"Text\"\n" +
                "            android:layout_margin=\"15dp\"\n" +
                "            android:textSize=\"16sp\"\n" +
                "            android:id=\"@+id/title\"\n" +
                "            android:gravity=\"center\"/>\n" +
                "\n" +
                "    </LinearLayout>\n" +
                "\n" +
                "</android.support.v7.widget.CardView>");

        tx2 = findViewById(R.id.cv2);
        tx2.setText("<RelativeLayout\n" +
                "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:layout_width=\"match_parent\">\n" +
                "    \n" +
                "    <android.support.v7.widget.RecyclerView\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        android:padding=\"8dp\"\n" +
                "        android:clipToPadding=\"false\"\n" +
                "        android:id=\"@+id/recycler_view\"/>\n" +
                "    \n" +
                "    <android.support.design.widget.FloatingActionButton\n" +
                "        android:layout_width=\"55dp\"\n" +
                "        android:layout_height=\"55dp\"\n" +
                "        android:layout_marginRight=\"20dp\"\n" +
                "        android:layout_marginBottom=\"20dp\"\n" +
                "        android:layout_gravity=\"bottom|right\"\n" +
                "        android:layout_alignParentRight=\"true\"\n" +
                "        android:layout_alignParentBottom=\"true\"\n" +
                "        app:backgroundTint=\"?attr/colorAccent\"\n" +
                "        app:srcCompat=\"@drawable/ic_toolbar_gird\"\n" +
                "        android:id=\"@+id/fab\"/>\n" +
                "    \n" +
                "</RelativeLayout>");

        tx3 = findViewById(R.id.cv3);
        tx3.setText("public class Data\n" +
                "{\n" +
                "    public String mTitle;\n" +
                "    public int mImage;\n" +
                "}");

        tx4 = findViewById(R.id.cv4);
        tx4.setText("import android.content.*;\n" +
                "import android.support.v7.widget.*;\n" +
                "import android.view.*;\n" +
                "import android.widget.*;\n" +
                "import com.bumptech.glide.*;\n" +
                "import java.util.*;\n" +
                "\n" +
                "public class Adapter extends RecyclerView.Adapter <RecyclerView.ViewHolder>\n" +
                "{\n" +
                "    private Context mContext;\n" +
                "    private LayoutInflater inflater;\n" +
                "    private List <Data> data;\n" +
                "    Data current;\n" +
                "\n" +
                "    public Adapter(Context mContext, List<Data> data)\n" +
                "    {\n" +
                "        this.mContext = mContext;\n" +
                "        inflater = LayoutInflater.from(mContext);\n" +
                "        this.data = data;\n" +
                "        data = new ArrayList<>();\n" +
                "        data.addAll(data);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)\n" +
                "    {\n" +
                "        View view = inflater.inflate(R.layout.item_list, parent, false);\n" +
                "        MyHolder holder = new MyHolder(view);\n" +
                "        return holder;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position)\n" +
                "    {\n" +
                "        MyHolder myHolder = (MyHolder) holder;\n" +
                "        Data item = data.get(position);\n" +
                "\n" +
                "        myHolder.title.setText(item.mTitle);\n" +
                "        Glide.with(mContext).load(item.mImage).into(myHolder.image);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public int getItemCount()\n" +
                "    {\n" +
                "        return data.size();\n" +
                "    }\n" +
                "\n" +
                "    class MyHolder extends RecyclerView.ViewHolder\n" +
                "    {\n" +
                "        ImageView image;\n" +
                "        TextView title;\n" +
                "        public MyHolder(View itemView)\n" +
                "        {\n" +
                "            super(itemView);\n" +
                "            title = itemView.findViewById(R.id.title);\n" +
                "            image = itemView.findViewById(R.id.image);\n" +
                "            itemView.setOnClickListener(new \n" +
                "                View.OnClickListener(){\n" +
                "                    @Override\n" +
                "                    public void onClick(View v)\n" +
                "                    {\n" +
                "                        Context mContext = v.getContext();\n" +
                "                        Toast.makeText(mContext, data.get(getAdapterPosition()).mTitle + \" has clicked\", Toast.LENGTH_LONG).show();\n" +
                "                    }\n" +
                "                });\n" +
                "        }\n" +
                "    }\n" +
                "}");

        tx5 = findViewById(R.id.cv5);
        tx5.setText("import android.content.res.*;\n" +
                "import android.os.*;\n" +
                "import android.support.design.widget.*;\n" +
                "import android.support.v7.app.*;\n" +
                "import android.support.v7.widget.*;\n" +
                "import android.view.*;\n" +
                "import android.view.View.*;\n" +
                "import java.util.*;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity\n" +
                "{\n" +
                "    private RecyclerView mRecyclerView;\n" +
                "    private Adapter mAdapter;\n" +
                "    private FloatingActionButton mFab;\n" +
                "    private int mViewType;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState)\n" +
                "    {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "        mRecyclerView = findViewById(R.id.recycler_view);\n" +
                "        mFab = findViewById(R.id.fab);\n" +
                "\n" +
                "        mViewType = 0;\n" +
                "        mRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));\n" +
                "        mFab.setOnClickListener(new OnClickListener(){\n" +
                "                @Override\n" +
                "                public void onClick(View v)\n" +
                "                {\n" +
                "                    if (mViewType == 0) {\n" +
                "                        mViewType = 1;\n" +
                "                        mFab.setImageResource(R.drawable.ic_toolbar_list);\n" +
                "                        mRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));\n" +
                "                    } else {\n" +
                "                        mViewType = 0;\n" +
                "                        mFab.setImageResource(R.drawable.ic_toolbar_gird);\n" +
                "                        mRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));\n" +
                "                    }\n" +
                "                }\n" +
                "            });\n" +
                "\n" +
                "        mRecyclerView.addOnScrollListener(new \n" +
                "            RecyclerView.OnScrollListener(){\n" +
                "                @Override\n" +
                "                public void onScrolled(RecyclerView mRecycler, int dx, int dy)\n" +
                "                {\n" +
                "                    if (dy > 0) {\n" +
                "                        mFab.hide();\n" +
                "                    } else if (dy < 0) {\n" +
                "                        mFab.show();\n" +
                "                    }\n" +
                "                }\n" +
                "            });\n" +
                "\n" +
                "        new AsyncLogin().execute();\n" +
                "    }\n" +
                "\n" +
                "    private class AsyncLogin extends AsyncTask<String, String, String>\n" +
                "    {\n" +
                "        @Override\n" +
                "        protected void onPreExecute()\n" +
                "        {\n" +
                "            super.onPreExecute();\n" +
                "        }\n" +
                "        @Override\n" +
                "        protected String doInBackground(String... params)\n" +
                "        {\n" +
                "            return null;\n" +
                "        }\n" +
                "        @Override\n" +
                "        protected void onPostExecute(String result)\n" +
                "        {\n" +
                "            List<Data> data=new ArrayList<>();\n" +
                "            String[] titles;\n" +
                "            int[] images;\n" +
                "\n" +
                "            titles = getResources().getStringArray(R.array.titles);\n" +
                "            TypedArray a = getResources().obtainTypedArray(R.array.images);\n" +
                "            images = new int[a.length()];\n" +
                "\n" +
                "            try {\n" +
                "                for (int i = 0; i < titles.length; i++) {\n" +
                "                    Data itemData = new Data();\n" +
                "                    images[i] = a.getResourceId(i, 0);\n" +
                "                    itemData.mTitle = titles[i];\n" +
                "                    itemData.mImage = images[i];\n" +
                "                    data.add(itemData);\n" +
                "                }\n" +
                "                mRecyclerView.setHasFixedSize(true);\n" +
                "                mRecyclerView.setItemAnimator(new DefaultItemAnimator());\n" +
                "                mAdapter = new Adapter(MainActivity.this, data);\n" +
                "                mRecyclerView.setAdapter(mAdapter);\n" +
                "            } catch (Exception e) {\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}");
    }
}