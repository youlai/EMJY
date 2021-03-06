package com.emjiayuan.app.fragment.Personal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.emjiayuan.app.R;
import com.emjiayuan.app.Utils.MyOkHttp;
import com.emjiayuan.app.Utils.MyUtils;
import com.emjiayuan.app.activity.BalanceActivity;
import com.emjiayuan.app.activity.CollectionActivity;
import com.emjiayuan.app.activity.CouponActivity2;
import com.emjiayuan.app.activity.EnterpriseActivity;
import com.emjiayuan.app.activity.HelpActivity;
import com.emjiayuan.app.activity.IntegralActivity;
import com.emjiayuan.app.activity.LoginActivity;
import com.emjiayuan.app.activity.LogisticsActivity;
import com.emjiayuan.app.activity.OrderIntegralActivity;
import com.emjiayuan.app.activity.OrderNormalActivity2;
import com.emjiayuan.app.activity.SettingActivity;
import com.emjiayuan.app.activity.SpitActivity;
import com.emjiayuan.app.activity.VipActivity;
import com.emjiayuan.app.activity.address.AddressActivity;
import com.emjiayuan.app.entity.Global;
import com.emjiayuan.app.entity.User;
import com.emjiayuan.app.event.UpdateEvent;
import com.emjiayuan.app.fragment.BaseLazyFragment;
import com.google.gson.Gson;
import com.qiyukf.unicorn.api.ConsultSource;
import com.qiyukf.unicorn.api.Unicorn;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

import java.io.IOException;

import butterknife.BindView;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Response;


public class PersonalFragment extends BaseLazyFragment implements View.OnClickListener {

    @BindView(R.id.profile_image)
    ImageView profileImage;
    @BindView(R.id.nickname)
    TextView nickname;
    @BindView(R.id.vip)
    TextView vip;
    @BindView(R.id.vip_ll)
    LinearLayout vip_ll;
    @BindView(R.id.balance_ll)
    LinearLayout balance_ll;
    @BindView(R.id.integral_ll)
    LinearLayout integral_ll;
    @BindView(R.id.coupon_ll)
    LinearLayout coupon_ll;
    @BindView(R.id.collection_ll)
    LinearLayout collection_ll;
    @BindView(R.id.spit_ll)
    LinearLayout spit_ll;
    @BindView(R.id.qyjs_ll)
    LinearLayout qyjs_ll;
    @BindView(R.id.wlcx_ll)
    LinearLayout wlcx_ll;
    @BindView(R.id.address_ll)
    LinearLayout address_ll;
    @BindView(R.id.service_ll)
    LinearLayout service_ll;
    @BindView(R.id.help_ll)
    LinearLayout help_ll;
    @BindView(R.id.setting_ll)
    LinearLayout setting_ll;
    @BindView(R.id.normal_ll)
    LinearLayout normalLl;
    @BindView(R.id.integrallp_ll)
    LinearLayout integrallpLl;
    @BindView(R.id.topup_ll)
    LinearLayout topupLl;
    @BindView(R.id.soup_ll)
    LinearLayout soupLl;
    @BindView(R.id.balance)
    TextView balance;
    @BindView(R.id.integral)
    TextView integral;
    @BindView(R.id.count)
    TextView count;
    @BindView(R.id.refreshLayout)
    SmartRefreshLayout refreshLayout;


    @Override
    protected int setLayoutId() {
        return R.layout.fragment_personal2;
    }

    @Override
    protected void initData() {
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
//        if (Global.loginResult == null) {
//            startActivity(new Intent(getActivity(), LoginActivity.class));
//        }
        user();
        refreshLayout.setEnableLoadmore(false);
        refreshLayout.setEnableHeaderTranslationContent(false);
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                user();
            }
        });
    }

    @Override
    protected void setListener() {
        vip_ll.setOnClickListener(this);
        profileImage.setOnClickListener(this);

        balance_ll.setOnClickListener(this);
        integral_ll.setOnClickListener(this);
        coupon_ll.setOnClickListener(this);

//        dfk_ll.setOnClickListener(this);
//        dfh_ll.setOnClickListener(this);
//        dsh_ll.setOnClickListener(this);
//        dpj_ll.setOnClickListener(this);
//        thh_ll.setOnClickListener(this);

        normalLl.setOnClickListener(this);
        integrallpLl.setOnClickListener(this);
        topupLl.setOnClickListener(this);
        soupLl.setOnClickListener(this);

        collection_ll.setOnClickListener(this);
        spit_ll.setOnClickListener(this);
        qyjs_ll.setOnClickListener(this);
        wlcx_ll.setOnClickListener(this);
        address_ll.setOnClickListener(this);
        service_ll.setOnClickListener(this);
        help_ll.setOnClickListener(this);
        setting_ll.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (!MyUtils.isFastClick()) {
            return;
        }
        Intent intent = null;
        switch (view.getId()) {
            case R.id.vip_ll:
                startActivity(new Intent(getActivity(), VipActivity.class));
                break;
            case R.id.balance_ll:
                startActivity(new Intent(getActivity(), BalanceActivity.class));
                break;
            case R.id.integral_ll:
                startActivity(new Intent(getActivity(), IntegralActivity.class));
                break;
            case R.id.coupon_ll:
                startActivity(new Intent(getActivity(), CouponActivity2.class));
                break;
//------------------------------------------------------
            case R.id.normal_ll:
//                startActivity(new Intent(getActivity(), OrderNormalActivity.class));
                intent = new Intent(getActivity(), OrderNormalActivity2.class);
                intent.putExtra("type", 0);
                startActivity(intent);
                break;
            case R.id.topup_ll:
                intent = new Intent(getActivity(), OrderIntegralActivity.class);
                intent.putExtra("type", 2);
                startActivity(intent);
                break;
            case R.id.integrallp_ll:
                intent = new Intent(getActivity(), OrderIntegralActivity.class);
                intent.putExtra("type", 1);
                startActivity(intent);
                break;
            case R.id.soup_ll:
                intent = new Intent(getActivity(), OrderNormalActivity2.class);
                intent.putExtra("type", 3);
                startActivity(intent);
                break;
//            case R.id.thh_ll:
//                startActivity(new Intent(getActivity(), BalanceActivity.class));
            //-----------------------------------------------------------------------------
//                break;
            case R.id.collection_ll:
                startActivity(new Intent(getActivity(), CollectionActivity.class));
                break;
            case R.id.spit_ll:
                startActivity(new Intent(getActivity(), SpitActivity.class));
                break;
            case R.id.qyjs_ll:
                startActivity(new Intent(getActivity(), EnterpriseActivity.class));
                break;
            case R.id.wlcx_ll:
//                startActivity(new Intent(getActivity(), BalanceActivity.class));
                startActivity(new Intent(getActivity(), LogisticsActivity.class));
                break;
            case R.id.address_ll:
                intent = new Intent(getActivity(), AddressActivity.class);
                intent.putExtra("flag", false);
                startActivity(intent);
                break;
            case R.id.service_ll:
                String title = "伊穆家园客服";
                /**
                 * 设置访客来源，标识访客是从哪个页面发起咨询的，用于客服了解用户是从什么页面进入。
                 * 三个参数分别为：来源页面的url，来源页面标题，来源页面额外信息（保留字段，暂时无用）。
                 * 设置来源后，在客服会话界面的"用户资料"栏的页面项，可以看到这里设置的值。
                 */
                ConsultSource source = new ConsultSource("app", "app", "custom information string");
                /**
                 * 请注意： 调用该接口前，应先检查Unicorn.isServiceAvailable()，
                 * 如果返回为false，该接口不会有任何动作
                 *
                 * @param context 上下文
                 * @param title   聊天窗口的标题
                 * @param source  咨询的发起来源，包括发起咨询的url，title，描述信息等
                 */
                Unicorn.openServiceActivity(mActivity, title, source);
//                startActivity(new Intent(getActivity(), KfActivity.class));
                break;
            case R.id.help_ll:
                startActivity(new Intent(getActivity(), HelpActivity.class));
                break;
            case R.id.setting_ll:
                startActivity(new Intent(getActivity(), SettingActivity.class));
                break;
            case R.id.profile_image:
                startActivity(new Intent(getActivity(), SettingActivity.class));
                break;
        }
    }

    public void user() {
        FormBody.Builder formBody = new FormBody.Builder();//创建表单请求体
//        if (Global.loginResult == null) {
//            startActivity(new Intent(mActivity, LoginActivity.class));
//            return;
//        }
        formBody.add("userid", Global.loginResult.getId());

//new call
        Call call = MyOkHttp.GetCall("user.userHome", formBody);
//请求加入调度
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d("------------", e.toString());
//                        myHandler.sendEmptyMessage(1);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result = response.body().string();
                MyUtils.e("------获取用户信息------", result);
                Message message = new Message();
                message.what = 0;
                Bundle bundle = new Bundle();
                bundle.putString("result", result);
                message.setData(bundle);
                myHandler.sendMessage(message);
            }
        });
    }

    private User user;
    Handler myHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Bundle bundle = msg.getData();
            String result = bundle.getString("result");
            switch (msg.what) {

                case 0:
                    try {
                        JSONObject jsonObject = new JSONObject(result);
                        String code = jsonObject.getString("code");
                        String message = jsonObject.getString("message");
                        String data = jsonObject.getString("data");
                        Gson gson = new Gson();
                        if ("200".equals(code)) {
                            user = gson.fromJson(data, User.class);
                            setData();
                        } else {
                            MyUtils.showToast(mActivity, message);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    refreshLayout.finishRefresh();
                    break;


            }
        }
    };


    @Subscribe(threadMode = ThreadMode.MAIN)
    public void Event(UpdateEvent event) {
        user();
    }

    private void setData() {
        nickname.setText(user.getShowname());
        vip.setText(user.getClassname() + "(购物享受" + Double.parseDouble(user.getDiscount())/10 + "折)");
        balance.setText(user.getYue());
        integral.setText(user.getJifen());
        count.setText(user.getCouponcount());
        Glide.with(mActivity).load(user.getHeadimg()).apply(RequestOptions.circleCropTransform().placeholder(R.drawable.default_tx).error(R.drawable.default_tx)).into(profileImage);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }

}