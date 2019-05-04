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


public class FragmentB extends Fragment {
    private FragmentBListener listener;
    private EditText editText;
    private Button buttonOk;
    TextView textView;


    public interface FragmentBListener{

        void onInputBSent(CharSequence input);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_b, container, false);
        editText = v.findViewById(R.id.edit2);
        buttonOk = v.findViewById(R.id.b2);
        textView = v.findViewById(R.id.txt2);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence input = editText.getText();
                int temp = Integer.parseInt(input.toString());
                temp++;
                String s = Integer.toString(temp);
                listener.onInputBSent(s);
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
        if(context instanceof FragmentBListener)
            listener = (FragmentBListener) context;
        else
            throw new RuntimeException((context.toString()+"TEST2"));
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
}
