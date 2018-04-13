package com.xiaojw.zhixun.adpater;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.common.baseframe.util.DrawableUtils;
import com.common.baseframe.view.rv.BaseRecyclerAdapter;
import com.common.baseframe.view.rv.BaseRecyclerHolder;
import com.xiaojw.zhixun.R;
import com.xiaojw.zhixun.bean.MoviceItem;

import org.w3c.dom.Text;

import java.util.List;

public class MoviceListAdapter extends BaseRecyclerAdapter<MoviceItem> {
    Context mContext;
    public MoviceListAdapter(List<MoviceItem> items) {
        super(items);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext=parent.getContext();
        View itemView= LayoutInflater.from(mContext).inflate(R.layout.item_movice_layout,
                parent
                , false);
        return new MoviceListHolder(itemView);
    }

    class MoviceListHolder extends BaseRecyclerHolder<MoviceItem>{
        ImageView moviceImg;
        TextView moviceTv;
        TextView tagTv;
        TextView categoryTv;
        public MoviceListHolder(View itemView) {
            super(itemView);
            moviceImg=itemView.findViewById(R.id.item_movice_img);
            moviceTv=itemView.findViewById(R.id.item_movice_tv);
            tagTv=itemView.findViewById(R.id.item_movice_tag_tv);
            categoryTv=itemView.findViewById(R.id.item_category_tv);
        }

        @Override
        public void initViewHolder(MoviceItem item) {
            String category=item.getCategory();
            if (!TextUtils.isEmpty(category)){
                categoryTv.setVisibility(View.VISIBLE);
                categoryTv.setText(category);
            }else{
                categoryTv.setVisibility(View.GONE);
            }
            moviceTv.setText(item.getTitle());
            MoviceItem.ImagesBean bean= item.getImages();
            if (bean!=null){
                DrawableUtils.displayImgOnGlide(mContext, moviceImg, bean.getMedium(), R.mipmap.ic_launcher);
            }
            StringBuffer sb=new StringBuffer(item.getYear());
            sb.append(" / ");
            for (String gen:item.getGenres()){
                sb.append(gen+" ");
            }
            sb.append(" / ");
            for (MoviceItem.CastsBean castsBean: item.getCasts()){
                sb.append(castsBean.getName()+" ");
            }
            tagTv.setText(sb.toString());
        }
    }

}
