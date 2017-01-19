package com.ashazar.tabdrawerexample;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ashazar.tabdrawer.TabDrawer;
import com.ashazar.tabdrawer.model.Tab;
import com.ashazar.tabdrawer.model.TabArray;
import com.ashazar.tabdrawer.model.TabListItem;

public class BaseActivity extends AppCompatActivity {
    Context context;
    Activity activity;

    TabDrawer tabDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        context = this;
        activity = this;
    }

    private TabArray prepareTabArray() {
        return new TabArray()
                .setCustomTabLayoutResourceId(R.layout.item_tab)
                .setTabBackgroundColor(Color.parseColor("#111111"))
                .setSelectedTabBackgroundColor(Color.parseColor("#333333"))
                .setInactiveSelectedTabBackgroundColor(Color.parseColor("#000000"))
                .setTabTitleColor(Color.parseColor("#ffffff"))
                .setTabTitleSize(12)

                .setTabListItemTextColor(Color.parseColor("#ffffff"))
                .setTabListItemTextSize(16)

                .addTab( new Tab()
                        .setTitle("Demo")
                        .setDrawableId(R.drawable.n_activity)
                        .setTitleSize(14)
                        .setTitleColor(Color.parseColor("#ffffff"))
                        .setSelectedTitleColor(Color.parseColor("#ff0000"))
                        .setInactiveSelectedTitleColor(Color.parseColor("#990000"))
                        .setIconColor(Color.parseColor("#ffffff"))
                        .setSelectedIconColor(Color.parseColor("#ff0000"))
                        .setInactiveSelectedIconColor(Color.parseColor("#990000"))
                        .addTabListItem( new TabListItem("Bottom/Left TabDrawer", R.drawable.ic_home_white_24dp) )
                        .addTabListItem( new TabListItem("Left TabDrawer", R.drawable.ic_action_next_item) )
                        .addTabListItem( new TabListItem("Bottom TabDrawer", R.drawable.ic_action_collapse) )
                        .addTabListItem( new TabListItem("Right TabDrawer", R.drawable.ic_action_previous_item) )
                        .addTabListItem( new TabListItem("Top TabDrawer", R.drawable.ic_action_expand) )
                )

                .addTab( new Tab()
                        .setTitle("Queue")
                        .setDrawableId(R.drawable.n_queue)
                        .setCustomTabLayoutResourceId(R.layout.item_tab2)
                        .setTitleColor(Color.parseColor("#ffffff"))
                        .setSelectedTitleColor(Color.parseColor("#00ff00"))
                        .setIconColor(Color.parseColor("#ffffff"))
                        .setSelectedIconColor(Color.parseColor("#00ff00"))
                        .setCustomDrawerListItemLayoutResourceId(R.layout.list_item)
                        .addTabListItem( new TabListItem("Add to Queue", R.drawable.ic_add_box_white_24dp ) )
                        .addTabListItem( new TabListItem("Archive", R.drawable.ic_archive_white_24dp) )
                        .addTabListItem( new TabListItem("Delete", R.drawable.ic_delete_forever_white_24dp) )
                )

                .addTab( new Tab()
                        .setTitle("Chat")
                        .setDrawableId(R.drawable.n_chat)
                        .setCustomTabLayoutResourceId(R.layout.item_tab3)
                        .setIconColor(Color.parseColor("#6666ee"))
                        .setSelectedIconColor(Color.parseColor("#ffffff"))
                        .setTitleColor(Color.parseColor("#6666ee"))
                        .setSelectedTitleColor(Color.parseColor("#ffffff"))
                        .setBackgroundColor(Color.parseColor("#FF4E4B76"))
                        .setSelectedBackgroundColor(Color.parseColor("#FF726EA9"))
                        .setInactiveSelectedBackgroundColor(Color.parseColor("#FF2F2A79"))
                        .setCustomDrawerLayoutResourceId(R.layout.drawerlayout)
                        .addTabListItem( new TabListItem("Friends", R.drawable.ic_face_white_24dp) )
                        .addTabListItem( new TabListItem("Add Friend", R.drawable.ic_person_add_white_24dp) )
                        .addTabListItem( new TabListItem("Start Group Chat", R.drawable.ic_people_white_24dp) )
                        .addTabListItem( new TabListItem("Funny Moments", R.drawable.ic_sentiment_very_satisfied_white_24dp) )
                )

                .addTab( new Tab()
                        .setTitle("Reports")
                        .setDrawableId(R.drawable.n_report)
                        .setTitleSize(10)
                        .setCustomTabLayoutResourceId(R.layout.item_tab4)
                        .setBackgroundColor(Color.parseColor("#003366"))
                        .setSelectedBackgroundColor(Color.parseColor("#336699"))
                        .setInactiveSelectedBackgroundColor(Color.parseColor("#6699ff"))
                        .addTabListItem( new TabListItem("Completed Jobs", R.drawable.ic_event_available_white_24dp) )
                        .addTabListItem( new TabListItem("Cancelled Jobs", R.drawable.ic_event_busy_white_24dp) )
                        .addTabListItem( new TabListItem("Customer Feedbacks", R.drawable.ic_feedback_white_24dp) )
                        .addTabListItem( new TabListItem("Documents", R.drawable.ic_description_white_24dp) )
                )

                .addTab( new Tab()
                        .setTitle(".more.")
                        .forceDefaultLayout()
                        .setBackgroundColor(Color.parseColor("#990066"))
                        .setSelectedBackgroundColor(Color.parseColor("#660099"))
                        .setInactiveSelectedBackgroundColor(Color.parseColor("#6633ff"))
                        .setCustomDrawerLayoutResourceId(R.layout.drawerlayout_with_gridview)
                        .setCustomDrawerGridViewId(R.id.drawer_gridview)
                        .setCustomDrawerListItemLayoutResourceId(R.layout.list_item2)
                        .setDrawerListColumnNumber(4)
                        .addTabListItem( new TabListItem(R.drawable.ic_settings_white_24dp) )
                        .addTabListItem( new TabListItem(R.drawable.ic_lock_white_24dp) )
                        .addTabListItem( new TabListItem(R.drawable.ic_accessibility_white_24dp) )
                        .addTabListItem( new TabListItem(R.drawable.ic_notifications_white_24dp) )
                        .addTabListItem( new TabListItem(R.drawable.ic_collections_bookmark_white_24dp) )
                        .addTabListItem( new TabListItem(R.drawable.ic_folder_shared_white_24dp) )
                        .addTabListItem( new TabListItem(R.drawable.ic_cast_white_24dp) )
                        .addTabListItem( new TabListItem(R.drawable.ic_apps_white_24dp) )
/*                        .addTabListItem( new TabListItem("General Settings", R.drawable.ic_settings_white_24dp) )
                        .addTabListItem( new TabListItem("My Account", R.drawable.ic_lock_white_24dp) )
                        .addTabListItem( new TabListItem("Accesibility", R.drawable.ic_accessibility_white_24dp) )
                        .addTabListItem( new TabListItem("Notifications", R.drawable.ic_notifications_white_24dp) )
                        .addTabListItem( new TabListItem("Bookmarks", R.drawable.ic_collections_bookmark_white_24dp) )
                        .addTabListItem( new TabListItem("Shared Folders", R.drawable.ic_folder_shared_white_24dp) )
                        .addTabListItem( new TabListItem("Cast to TV", R.drawable.ic_cast_white_24dp) )
                        .addTabListItem( new TabListItem("Other Applications", R.drawable.ic_apps_white_24dp) )*/
                );
    }

    public void prepareTabDrawer() { prepareTabDrawer(false); }

    public void prepareTabDrawer(boolean additional) {
        TabArray tabArrayTemp = prepareTabArray();

        // Clone 3 tabs to the end to fill space when it is Left or Right TabDrawer
        if (additional) {
            TabArray tabArrayTemp2 = prepareTabArray();
            tabArrayTemp.addTab(tabArrayTemp2.getTab(3).setTitle("Add 1"));
            tabArrayTemp.addTab(tabArrayTemp2.getTab(2).setTitle("Add 2"));
            tabArrayTemp.addTab(tabArrayTemp2.getTab(1).setTitle("Add 3"));
        }

        final TabArray tabArray = tabArrayTemp;

        tabDrawer = new TabDrawer(context, activity, R.id.tabDrawer, tabArray) {
            @Override
            public void onTabDrawerClicked(int tabPosition, int itemPosition) {
                super.onTabDrawerClicked(tabPosition, itemPosition);

                String text = tabArray.getTab(tabPosition).getTitle();

                if (tabArray.getTab(tabPosition).hasItems()) {
                    if (tabArray.getTab(tabPosition).getTabItemList().get(itemPosition).getTitle() != null)
                        text += " -> " + tabArray.getTab(tabPosition).getTabItemList().get(itemPosition).getTitle();

                    text += " - ( " + tabPosition + ", " + itemPosition + " )";
                }
                else
                    text += " - ( " + tabPosition + " )";


                Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                toast.show();

                if (tabPosition == 0) {
                    Intent intent;

                    if (itemPosition == 0)
                        intent = new Intent(context, MainActivity.class);
                    else {
                        intent = new Intent(context, NewActivity.class);

                        if (itemPosition == 1)
                            intent.putExtra(NewActivity.POSITION, NewActivity.POSITION_BOTTOM);
                        else if (itemPosition == 2)
                            intent.putExtra(NewActivity.POSITION, NewActivity.POSITION_TOP);
                        else if (itemPosition == 3)
                            intent.putExtra(NewActivity.POSITION, NewActivity.POSITION_LEFT);
                        else if (itemPosition == 4)
                            intent.putExtra(NewActivity.POSITION, NewActivity.POSITION_RIGHT);
                    }

                    startActivity(intent);
                }
            }

            @Override
            public void setUnselectedTabView(LinearLayout tabLayout, ImageView iconView, TextView titleView, int tabPosition) {
                super.setUnselectedTabView(tabLayout, iconView, titleView, tabPosition);

                if (tabPosition == 1)
                    tabLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.tab_bg2));
            }

            @Override
            public void setSelectedTabView(LinearLayout tabLayout, ImageView iconView, TextView titleView, RelativeLayout drawerLayout, int tabPosition) {
                super.setSelectedTabView(tabLayout, iconView, titleView, drawerLayout, tabPosition);

                if (tabPosition == 1) {
                    tabLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.tab_bg1));
                    drawerLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.tab_bg1));
                }
            }

            @Override
            public void setInactiveSelectedTabView(LinearLayout tabLayout, ImageView iconView, TextView titleView, int tabPosition) {
                super.setInactiveSelectedTabView(tabLayout, iconView, titleView, tabPosition);

                if (tabPosition == 1)
                    tabLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.tab_bg2));
            }
        };

        tabDrawer.initialize();
    }

    @Override
    public void onBackPressed() {
        if (tabDrawer.isDrawerOpen())
            tabDrawer.closeDrawer();
        else
            super.onBackPressed();
    }

}
