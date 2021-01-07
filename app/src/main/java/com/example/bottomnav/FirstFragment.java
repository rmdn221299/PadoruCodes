package com.example.bottomnav;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

public class FirstFragment extends Fragment {
    Context context;
    View view;

    ImageButton btn1,btn2,btn3,btn4,btn5,btn6, btn7,btn8,btn9,btn10,
            btn11,btn12, btn13,btn14,btn15,btn16,btn17,btn18, btn19, btn20,
            btn21, btn22, btn23, btn24,btn25, btn26, btn27, btn28, btn29, btn30,
            btn31, btn32, btn33, btn34,btn35, btn36, btn37, btn38,btn39, btn40, btn41, btn42, btn43, btn44,
            btn45, btn46, btn47, btn48,btn49, btn50, btn51, btn52,btn53, btn54, btn55;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_first, container, false);

        btn1 = view.findViewById(R.id.button);
        btn2 = view.findViewById(R.id.button2);
        btn3 = view.findViewById(R.id.button3);
        btn4 = view.findViewById(R.id.button4);
        btn5 = view.findViewById(R.id.button5);
        btn6 = view.findViewById(R.id.button6);
        btn7 = view.findViewById(R.id.button7);
        btn8 = view.findViewById(R.id.button8);
        btn9 = view.findViewById(R.id.button9);
        btn10 = view.findViewById(R.id.button10);
        btn11 = view.findViewById(R.id.button11);
        btn12 = view.findViewById(R.id.button12);
        btn13 = view.findViewById(R.id.button13);
        btn14 = view.findViewById(R.id.button14);
        btn15 = view.findViewById(R.id.button15);
        btn16 = view.findViewById(R.id.button16);
        btn17 = view.findViewById(R.id.button17);
        btn18 = view.findViewById(R.id.button18);
        btn19 = view.findViewById(R.id.button19);
        btn20 = view.findViewById(R.id.button20);
        btn21 = view.findViewById(R.id.button21);
        btn22 = view.findViewById(R.id.button22);
        btn23 = view.findViewById(R.id.button23);
        btn24 = view.findViewById(R.id.button24);
        btn25 = view.findViewById(R.id.button25);
        btn26 = view.findViewById(R.id.button26);
        btn27 = view.findViewById(R.id.button27);
        btn28 = view.findViewById(R.id.button28);
        btn29 = view.findViewById(R.id.button29);
        btn30 = view.findViewById(R.id.button30);
        btn31 = view.findViewById(R.id.button31);
        btn32 = view.findViewById(R.id.button32);
        btn33 = view.findViewById(R.id.button33);
        btn34 = view.findViewById(R.id.button34);
        btn35 = view.findViewById(R.id.button35);
        btn36 = view.findViewById(R.id.button36);
        btn37 = view.findViewById(R.id.button37);
        btn38 = view.findViewById(R.id.button38);
        btn39 = view.findViewById(R.id.button39);
        btn40 = view.findViewById(R.id.button40);
        btn41 = view.findViewById(R.id.button41);
        btn42 = view.findViewById(R.id.button42);
        btn43 = view.findViewById(R.id.button43);
        btn44 = view.findViewById(R.id.button44);
        btn45 = view.findViewById(R.id.button45);
        btn46 = view.findViewById(R.id.button46);
        btn47 = view.findViewById(R.id.button47);
        btn48 = view.findViewById(R.id.button48);
        btn49 = view.findViewById(R.id.button49);
        btn50 = view.findViewById(R.id.button50);
        btn51 = view.findViewById(R.id.button51);
        btn52 = view.findViewById(R.id.button52);
        btn53 = view.findViewById(R.id.button53);
        btn54 = view.findViewById(R.id.button54);
        btn55 = view.findViewById(R.id.button55);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("641E16");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#78281F");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#512E5F ");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#4A235A");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#154360 ");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#1B4F72");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#0E6251 ");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#0B5345 ");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#145A32");
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#186A3B");
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#7D6608");
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#7E5109");
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#784212");
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#6E2C00");
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#7B7D7D");
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#626567 ");
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#4D5656 ");
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#424949 ");
            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#1B2631");
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#17202A ");
            }
        });
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#7B241C");
            }
        });

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#943126");
            }
        });

        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#512E5F");
            }
        });

        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#5B2C6F");
            }
        });

        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#1A5276");
            }
        });

        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#21618C");
            }
        });
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#117864");
            }
        });
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#0E6655");
            }
        });
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#196F3D");
            }
        });
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#9A7D0A");
            }
        });
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#9C640C");
            }
        });
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#9C640C");
            }
        });
        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#935116");
            }
        });
        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#873600");
            }
        });
        btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#979A9A");
            }
        });
        btn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#797D7F");
            }
        });
        btn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#5F6A6A ");
            }
        });
        btn38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#515A5A");
            }
        });
        btn39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#212F3C");
            }
        });
        btn40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#1C2833");
            }
        });
        btn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#922B21");
            }
        });
        btn42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#B03A2E");
            }
        });
        btn43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#76448A");
            }
        });
        btn44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#6C3483");
            }
        });

        btn45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#1F618D");
            }
        });
        btn46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#2874A6");
            }
        });
        btn47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#148F77");
            }
        });
        btn48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#117A65");
            }
        });
        btn49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#1E8449");
            }
        });
        btn50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#239B56");
            }
        });
        btn51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#B7950B");
            }
        });
        btn52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#B9770E");
            }
        });
        btn53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#AF601A");
            }
        });
        btn54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#A04000");
            }
        });
        btn55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CopyWarna("#6C3483");
            }
        });

        return view;
    }

    void CopyWarna(String warna){
        ClipboardManager clipBoard = (ClipboardManager) getActivity().getSystemService(context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("asd", warna);
        clipBoard.setPrimaryClip(clip);

        Toast.makeText(getActivity(), "udah dicopy cuy! "+warna, Toast.LENGTH_SHORT).show();
    }
}