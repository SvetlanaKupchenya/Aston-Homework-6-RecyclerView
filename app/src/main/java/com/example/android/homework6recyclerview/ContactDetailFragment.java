/*
 * Copyright (C) 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.homework6recyclerview;


import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.android.homework6recyclerview.content.ContactUtils;
import com.squareup.picasso.Picasso;

public class ContactDetailFragment extends Fragment {

    private static String NAME = "";
    private static String SURNAME = "";
    private static String TELNUMBER = "";
    OnFragmentInteractionListener mListener;
    private ImageView mImageView;
    private Uri mUri;

    public ContactUtils.Contacts mContacts;

    public ContactDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments().containsKey(ContactUtils.CONTACT_ID_KEY)) {
            // Load the content specified by the fragment arguments.
            mContacts = ContactUtils.CONTACT_ITEMS.get(getArguments()
                    .getInt(ContactUtils.CONTACT_ID_KEY));
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.contact_detail,
                container, false);

        // Show the detail information in a TextView.

        if (mContacts != null) {
            ((EditText) rootView.findViewById(R.id.edit_name))
                    .setText(mContacts.contact_name);
            ((EditText) rootView.findViewById(R.id.edit_surname))
                    .setText(mContacts.contact_surname);
            ((EditText) rootView.findViewById(R.id.edit_tel_number))
                    .setText(mContacts.contact_telnumber);

            mUri = Uri.parse(mContacts.contact_photo);
            mImageView = (ImageView) rootView.findViewById(R.id.image_photo);
            Picasso.with(getContext())
                    .load(mUri)
                    .error(R.drawable.error)
                    .into(mImageView);
        }

        /*Button mButtonSave = rootView.findViewById(R.id.button_save);
        mButtonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NAME = ((EditText) rootView.findViewById(R.id.edit_name)).toString();
                SURNAME = ((EditText) rootView.findViewById(R.id.edit_surname)).toString();
                TELNUMBER = ((EditText) rootView.findViewById(R.id.edit_tel_number)).toString();
            }
        });*/

        return rootView;
    }

    public static ContactDetailFragment newInstance (int selectedContact) {
        ContactDetailFragment fragment = new ContactDetailFragment();
        Bundle arguments = new Bundle();
        arguments.putInt(ContactUtils.CONTACT_ID_KEY, selectedContact);
        fragment.setArguments(arguments);
        return fragment;
    }

    public interface OnFragmentInteractionListener {
        void onSavePressed(View view);
    }
}
