package com.scanlibrary.ocrme.get_more_requests.row.paid_options.option_delegates;

import android.content.Context;

import com.scanlibrary.ocrme.R;
import com.scanlibrary.ocrme.billing.BillingProviderImpl;
import com.scanlibrary.ocrme.billing.model.SkuRowData;
import com.scanlibrary.ocrme.get_more_requests.row.paid_options.PaidOptionRowViewHolder;
import com.scanlibrary.ocrme.get_more_requests.row.paid_options.UiPaidOptionManagingDelegate;

import javax.inject.Inject;

import static com.scanlibrary.ocrme.utils.LogUtil.DEV_TAG;

public class Batch100Delegate extends UiPaidOptionManagingDelegate {
    public static final String TAG = DEV_TAG + Batch100Delegate.class.getSimpleName();

    @Inject
    public Batch100Delegate(BillingProviderImpl billingProvider, Context context) {
        super(billingProvider, context);
    }

    @Override
    public void onBindViewHolder(SkuRowData data, PaidOptionRowViewHolder holder) {
        super.onBindViewHolder(data, holder);

        holder.getTitle().setText(getContext().getResources().getString(R.string.buy_100_requests));

        String subTitle = getContext().getResources().getString(R.string.price_per_1_in_100,
                data.getPriceCurrencyCode(),
                String.format("%.2f", (double) data.getPriceAmountMicros() / 100000000));

        holder.getSubtitleBottom().setText(subTitle);

    }
}