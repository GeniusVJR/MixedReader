package com.francis.mixedreader.news.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.francis.mixedreader.model.NewsBean;
import com.francis.mixedreader.news.ui.adapter.NewsAdapter;
import java.util.List;

/**
 * @author taoc @ Zhihu Inc.
 * @since 09-19-2016
 */
public class NewsListFragment extends Fragment{

	private static final String TAG = "NewsListFragment";

	private SwipeRefreshLayout swipeRefreshLayout;
	private RecyclerView recyclerView;
	private LinearLayoutManager layoutManager;
	private NewsAdapter adapter;
	private List<NewsBean> data;



	public static NewsListFragment newInstance(int type){
		Bundle bundle = new Bundle();
		NewsListFragment fragment = new NewsListFragment();
		bundle.putInt("type", type);
		fragment.setArguments(bundle);
		return fragment;
	}
}
