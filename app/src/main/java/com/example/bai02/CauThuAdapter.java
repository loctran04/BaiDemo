package com.example.bai02;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CauThuAdapter extends BaseAdapter {
    private List<CauThu> listCT;
    private Context context;
    private int layoutInflater;

    public CauThuAdapter(List<CauThu> listCT, Context context, int layoutInflater) {
        this.listCT = listCT;
        this.context = context;
        this.layoutInflater = layoutInflater;
    }

    @Override
    public int getCount() {
        return listCT.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.bai05_item,null);
        ImageView img1 = view.findViewById(R.id.img1);
        ImageView img2 = view.findViewById(R.id.img2);
        TextView tvName = view.findViewById(R.id.name);
        TextView tvYear = view.findViewById(R.id.year);

        CauThu cauThu = this.listCT.get(i);
        img1.setBackgroundResource(cauThu.getHinh1());
        img2.setBackgroundResource(cauThu.getHinh2());
        tvName.setText(cauThu.getName());
        tvYear.setText(cauThu.getYear());


        return view;
    }
}
