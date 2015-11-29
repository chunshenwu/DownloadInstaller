package jason.toolBar_TabLayout_ViewPager.view.viewPager.sample;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import jason.toolBar_TabLayout_ViewPager.R;
import jason.toolBar_TabLayout_ViewPager.view.viewPager.templatePattern.ParamsProvider;

/**
 * Created by cs on 15/11/28.
 */
public class SocialParamsProvider extends ParamsProvider {


    public SocialParamsProvider(Context conext) {
        super(conext);
    }

    @Override
    public String getOnSelectTittle() {
        return "Social";
    }

    @Override
    public View.OnClickListener getNavigationIconOnClickListener() {
        return new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "" + getTAGName(), Toast.LENGTH_SHORT).show();
            }
        };
    }

    @Override
    public Toolbar.OnMenuItemClickListener  getMenuOnMenuItemClickListener() {
        return new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(getContext(), getTAGName() + " " + item.getItemId(), Toast.LENGTH_SHORT).show();
                return false;
            }
        };
    }

    @Override
    public int getOnSelectNavigationIconResId() {
        return R.drawable.ab_android;
    }

    @Override
    public int getOnSelectMenuResId() {
        return R.menu.menu_social;
    }

    @Override
    public int getOnSelectResId() {
        return R.drawable.in;
    }

    @Override
    public int getOnUnSelectResId() {
        return R.drawable.out;
    }

    @Override
    public View getOnSelectView() {
        return null;
    }

    @Override
    public String getTAGName() {
        return this.getClass().getSimpleName();
    }

}
