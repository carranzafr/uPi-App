package com.carranza.upi;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DocumentFragment extends Fragment {

    protected ImageView ivIcon;
    protected TextView tvItemName;

    public static final String IMAGE_RESOURCE_ID = "iconResourceID";
    public static final String ITEM_NAME = "itemName";

    public DocumentFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_document, container,
                false);

        ivIcon = (ImageView) view.findViewById(R.id.document_icon);
        tvItemName = (TextView) view.findViewById(R.id.document_text);

        tvItemName.setText(getArguments().getString(ITEM_NAME));
        ivIcon.setImageDrawable(view.getResources().getDrawable(
                getArguments().getInt(IMAGE_RESOURCE_ID)));
        return view;
    }
}