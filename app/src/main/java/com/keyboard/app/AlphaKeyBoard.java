package com.keyboard.app;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.LinearLayout;

public class AlphaKeyBoard extends LinearLayout implements View.OnClickListener{

    private Button buttonA, buttonB, buttonC, buttonD,
            buttonE, buttonF,
            buttonG, buttonH, buttonI, buttonJ,
            buttonK, buttonL,
            buttonM, buttonN, buttonO, buttonP,
            buttonQ, buttonR,
            buttonS, buttonT, buttonU, buttonV,
            buttonW, buttonX,
            buttonY, buttonZ, button1, button2,
            button3, button4,
            button5, button6, button7, button8,
            button9, button0,
            buttonSpace, buttonDelete;

    private SparseArray<String> keyValues = new SparseArray<>();
    private InputConnection inputConnection;

    public AlphaKeyBoard(Context context) {
        this(context, null, 0);
    }

    public AlphaKeyBoard(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AlphaKeyBoard(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        LayoutInflater.from(context).inflate(R.layout.custom_keyboard, this, true);

        buttonA = (Button) findViewById(R.id.button_a);
        buttonA.setOnClickListener(this);

        buttonB = (Button) findViewById(R.id.button_b);
        buttonB.setOnClickListener(this);

        buttonC = (Button) findViewById(R.id.button_c);
        buttonC.setOnClickListener(this);

        buttonD = (Button) findViewById(R.id.button_d);
        buttonD.setOnClickListener(this);

        buttonE = (Button) findViewById(R.id.button_e);
        buttonE.setOnClickListener(this);

        buttonF = (Button) findViewById(R.id.button_f);
        buttonF.setOnClickListener(this);

        buttonG = (Button) findViewById(R.id.button_g);
        buttonG.setOnClickListener(this);

        buttonH = (Button) findViewById(R.id.button_h);
        buttonH.setOnClickListener(this);

        buttonI = (Button) findViewById(R.id.button_i);
        buttonI.setOnClickListener(this);

        buttonJ = (Button) findViewById(R.id.button_j);
        buttonJ.setOnClickListener(this);

        buttonK = (Button) findViewById(R.id.button_k);
        buttonK.setOnClickListener(this);

        buttonL = (Button) findViewById(R.id.button_l);
        buttonL.setOnClickListener(this);

        buttonM = (Button) findViewById(R.id.button_m);
        buttonM.setOnClickListener(this);

        buttonN = (Button) findViewById(R.id.button_n);
        buttonN.setOnClickListener(this);

        buttonO = (Button) findViewById(R.id.button_o);
        buttonO.setOnClickListener(this);

        buttonP = (Button) findViewById(R.id.button_p);
        buttonP.setOnClickListener(this);

        buttonQ = (Button) findViewById(R.id.button_q);
        buttonQ.setOnClickListener(this);

        buttonR = (Button) findViewById(R.id.button_r);
        buttonR.setOnClickListener(this);

        buttonS = (Button) findViewById(R.id.button_s);
        buttonS.setOnClickListener(this);

        buttonT = (Button) findViewById(R.id.button_t);
        buttonT.setOnClickListener(this);

        buttonU = (Button) findViewById(R.id.button_u);
        buttonU.setOnClickListener(this);

        buttonV = (Button) findViewById(R.id.button_v);
        buttonV.setOnClickListener(this);

        buttonW = (Button) findViewById(R.id.button_w);
        buttonW.setOnClickListener(this);

        buttonX = (Button) findViewById(R.id.button_x);
        buttonX.setOnClickListener(this);

        buttonY = (Button) findViewById(R.id.button_y);
        buttonY.setOnClickListener(this);

        buttonZ = (Button) findViewById(R.id.button_z);
        buttonZ.setOnClickListener(this);


        button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(this);

        button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(this);

        button3 = (Button) findViewById(R.id.button_3);
        button3.setOnClickListener(this);

        button4 = (Button) findViewById(R.id.button_4);
        button4.setOnClickListener(this);

        button5 = (Button) findViewById(R.id.button_5);
        button5.setOnClickListener(this);

        button6 = (Button) findViewById(R.id.button_6);
        button6.setOnClickListener(this);

        button7 = (Button) findViewById(R.id.button_7);
        button7.setOnClickListener(this);

        button8 = (Button) findViewById(R.id.button_8);
        button8.setOnClickListener(this);

        button9 = (Button) findViewById(R.id.button_9);
        button9.setOnClickListener(this);

        button0 = (Button) findViewById(R.id.button_0);
        button0.setOnClickListener(this);


        buttonDelete = (Button) findViewById(R.id.button_delete);
        buttonDelete.setOnClickListener(this);

        buttonSpace = (Button) findViewById(R.id.button_space);
        buttonSpace.setOnClickListener(this);

        keyValues.put(R.id.button_a, "a");
        keyValues.put(R.id.button_b, "b");
        keyValues.put(R.id.button_c, "c");
        keyValues.put(R.id.button_d, "d");
        keyValues.put(R.id.button_e, "e");
        keyValues.put(R.id.button_f, "f");
        keyValues.put(R.id.button_g, "g");
        keyValues.put(R.id.button_h, "h");
        keyValues.put(R.id.button_i, "i");
        keyValues.put(R.id.button_j, "j");
        keyValues.put(R.id.button_k, "k");
        keyValues.put(R.id.button_l, "l");
        keyValues.put(R.id.button_m, "m");
        keyValues.put(R.id.button_n, "n");
        keyValues.put(R.id.button_o, "o");
        keyValues.put(R.id.button_p, "p");
        keyValues.put(R.id.button_q, "q");
        keyValues.put(R.id.button_r, "r");
        keyValues.put(R.id.button_s, "s");
        keyValues.put(R.id.button_t, "t");
        keyValues.put(R.id.button_u, "u");
        keyValues.put(R.id.button_v, "v");
        keyValues.put(R.id.button_w, "w");
        keyValues.put(R.id.button_x, "x");
        keyValues.put(R.id.button_y, "y");
        keyValues.put(R.id.button_z, "z");
        keyValues.put(R.id.button_1, "1");
        keyValues.put(R.id.button_2, "2");
        keyValues.put(R.id.button_3, "3");
        keyValues.put(R.id.button_4, "4");
        keyValues.put(R.id.button_5, "5");
        keyValues.put(R.id.button_6, "6");
        keyValues.put(R.id.button_7, "7");
        keyValues.put(R.id.button_8, "8");
        keyValues.put(R.id.button_9, "9");
        keyValues.put(R.id.button_0, "0");

        keyValues.put(R.id.button_space, " ");


    }

    @Override
    public void onClick(View view) {
        if (inputConnection == null)
            return;

        if (view.getId() == R.id.button_delete) {
            CharSequence selectedText = inputConnection.getSelectedText(0);

            if (TextUtils.isEmpty(selectedText)) {
                inputConnection.deleteSurroundingText(1, 0);
            } else {
                inputConnection.commitText("", 1);
            }
        } else {
            String value = keyValues.get(view.getId());
            inputConnection.commitText(value, 1);
        }
    }

    public void setInputConnection(InputConnection ic) {
        inputConnection = ic;
    }
}