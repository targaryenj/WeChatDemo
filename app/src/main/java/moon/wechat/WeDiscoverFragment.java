package moon.wechat;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import moon.wechat.adapter.RecycleAdapter;
import moon.wechat.entity.RecycleBean;
import moon.wechat.view.Divider;

/**
 * Created by moon.zhong on 2015/2/4.
 */
public class WeDiscoverFragment extends BaseFragment<StaggeredGridLayoutManager> {

    private StaggeredGridLayoutManager mLayoutManager ;

    @Override
    public StaggeredGridLayoutManager getLayoutManager(Context context) {
        mLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL) ;
        return mLayoutManager;
    }

    @Override
    public void initConfig(RecyclerView recyclerView) {
        recyclerView.addItemDecoration(new Divider());
    }
}

