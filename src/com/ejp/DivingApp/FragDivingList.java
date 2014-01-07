package com.ejp.DivingApp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class FragDivingList extends ListFragment {
    public static final String ARG_SECTION_NUMBER = "placeholder_text";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        setListAdapter(new DivingListAdapter(getActivity()));

        return inflater.inflate(R.layout.fragment_diving_list, container, false);
    }




    class DivingListAdapter extends BaseAdapter {

        private Context context;

        public DivingListAdapter(Context context) {
            super();
            this.context = context;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder viewHolder;
            View rowView;

            // If view is already loaded
            if (convertView != null) {
                rowView = convertView;
                viewHolder = (ViewHolder) convertView.getTag();
            } else {
                viewHolder = new ViewHolder();
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                rowView = inflater.inflate(R.layout.fragment_diving_list__item, parent, false);

                viewHolder.diving_name = (TextView) rowView.findViewById(R.id.diving_name);
                rowView.setTag(viewHolder);
            }

            viewHolder.diving_name.setText(ARG_SECTION_NUMBER);

            return rowView;

        }

        /**
         * How many items are in the data set represented by this Adapter.
         *
         * @return Count of items.
         */
        @Override
        public int getCount() {
            return 100;
        }

        /**
         * Get the data item associated with the specified position in the data set.
         *
         * @param position Position of the item whose data we want within the adapter's
         *                 data set.
         * @return The data at the specified position.
         */
        @Override
        public Object getItem(int position) {
            return null;
        }

        /**
         * Get the row id associated with the specified position in the list.
         *
         * @param position The position of the item within the adapter's data set whose row id we want.
         * @return The id of the item at the specified position.
         */
        @Override
        public long getItemId(int position) {
            return position;
        }

        class ViewHolder {
            private TextView diving_name;
        }
    }


}
