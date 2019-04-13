package com.github.axet.audiorecorder.bottomsheet;

import android.graphics.Bitmap;
import android.net.Uri;

public class FormFieldOption {
    String label;
    String optionValue;
    Uri fileUri;
    Bitmap image;

    // TODO - developer
    // possibly add chosen image also
    // that could be bitmap or image local path

    public FormFieldOption() {
    }

    public FormFieldOption(String label, String optionValue) {
        this.label = label;
        this.optionValue = optionValue;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    public Uri getFileUri() {
        return fileUri;
    }

    public void setFileUri(Uri fileUri) {
        this.fileUri = fileUri;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }
}
