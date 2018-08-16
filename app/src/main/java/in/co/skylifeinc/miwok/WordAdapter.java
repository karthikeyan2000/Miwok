package in.co.skylifeinc.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mbc;

    public WordAdapter(Activity context, ArrayList<Word> word, int bc) {
        super(context, 0, word);
        mbc = bc;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }
        View sbc = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mbc);
        sbc.setBackgroundColor(color);
        final Word local_word = getItem(position);
        TextView miwokTextView = listItemView.findViewById(R.id.miwok);
        miwokTextView.setText(local_word.getMiwokTranslation());
        TextView defaultTextView = listItemView.findViewById(R.id.eng);
        defaultTextView.setText(local_word.getDefaultTranslation());
        ImageView icon = listItemView.findViewById(R.id.ic);
        icon.setImageResource(local_word.getMid());
        if (local_word.getMid() == 0) icon.setVisibility(View.GONE);
        else icon.setVisibility(View.VISIBLE);
        return listItemView;
    }
}
