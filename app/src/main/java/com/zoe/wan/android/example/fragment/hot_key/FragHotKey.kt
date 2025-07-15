package com.zoe.wan.android.example.fragment.hot_key

import com.zoe.wan.android.example.R
import com.zoe.wan.android.example.databinding.FragmentHomeBinding
import com.zoe.wan.base.BaseFragment
import com.zoe.wan.android.example.BR

class FragHotKey: BaseFragment<FragmentHomeBinding,FragHotKeyViewModel>() {
    override fun getLayoutId(): Int {
        return R.layout.fragment_hot_key
    }

    override fun getViewModelId(): Int {
        return BR.HotKeyVm
    }

    override fun initViewData() {

    }
}