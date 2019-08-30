package com.scanlibrary.ocrme.ocr_result;

import com.scanlibrary.ocrme.ocr_result.tab_fragments.image_pdf.ImagePdfContract;
import com.scanlibrary.ocrme.ocr_result.tab_fragments.image_pdf.ImagePdfFragment;
import com.scanlibrary.ocrme.ocr_result.tab_fragments.image_pdf.ImagePdfPresenter;
import com.scanlibrary.ocrme.ocr_result.tab_fragments.searchable_pdf.SearchablePdfContract;
import com.scanlibrary.ocrme.ocr_result.tab_fragments.searchable_pdf.SearchablePdfFragment;
import com.scanlibrary.ocrme.ocr_result.tab_fragments.searchable_pdf.SearchablePdfPresenter;
import com.scanlibrary.ocrme.ocr_result.tab_fragments.text.TextContract;
import com.scanlibrary.ocrme.ocr_result.tab_fragments.text.TextFragment;
import com.scanlibrary.ocrme.ocr_result.tab_fragments.text.TextPresenter;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class OcrResultModule {

    @Binds
    abstract OcrResultContract.Presenter ocrResultPresenter(OcrResultPresenter presenter);

    @Binds
    abstract SearchablePdfContract.Presenter searchablePdfPresenter(SearchablePdfPresenter presenter);

    @Binds
    abstract ImagePdfContract.Presenter imagePdfPresenter(ImagePdfPresenter presenter);

    @Binds
    abstract TextContract.Presenter textPresenter(TextPresenter presenter);

    @ContributesAndroidInjector
    abstract TextFragment textFragment();

    @ContributesAndroidInjector
    abstract SearchablePdfFragment searchablePdfFragment();

    @ContributesAndroidInjector
    abstract ImagePdfFragment imagePdfFragment();
}