package com.example.tjss.drawerfragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.tjss.drawerfragment.R;

import static android.R.attr.data;
import static android.app.Activity.RESULT_OK;


public class FragmentOne extends Fragment implements View.OnClickListener{
    ImageView mImageView;
    static final int REQUEST_IMAGE_CAPTURE = 1;
    private FragmentOneInterface mCallback;
    Button mPicturebutton1;

    public FragmentOne() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mCallback = (FragmentOneInterface) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement FragmentOneInterface");
        }

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fragment_one, container, false);

        mImageView = rootView.findViewById(R.id.ImageView01);

        mPicturebutton1 = (Button) rootView.findViewById(R.id.PictureButton01);
        mPicturebutton1.setOnClickListener(this);
        return rootView;
    }


    public void setImage(Bitmap imageBitmap){
        mImageView.setImageBitmap(imageBitmap);
    }




    public static FragmentOne newInstance() {
        FragmentOne fragment = new FragmentOne();
        return fragment;
    }

    @Override
    public void onClick(View view) {
        mCallback.dispatchTakePictureIntent();
    }
/*// Mandatory interface method defined in MainActivity*/


    public interface FragmentOneInterface {
        void dispatchTakePictureIntent();

    }

}