package com.domain.cse_ca;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class FragmentA extends Fragment {
    private FragmentAListener listener;
    private EditText editText;
    private Button buttonOk;
    TextView textView;

    public interface FragmentAListener{

        void onInputASent(CharSequence input);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_a, container, false);
        editText = v.findViewById(R.id.edit1);
        buttonOk = v.findViewById(R.id.b1);
        textView = v.findViewById(R.id.txt1);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence input = editText.getText();
                int temp = Integer.parseInt(input.toString());
                temp++;
                String s = Integer.toString(temp);
                listener.onInputASent(s);
                textView.setText(s);
            }
        });

        return v;
    }

    public void updateEditText(CharSequence newText){
        editText.setText(newText);
    }

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
        if(context instanceof FragmentAListener)
            listener = (FragmentAListener) context;
        else
            throw new RuntimeException((context.toString()+"TEST1"));
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
}
