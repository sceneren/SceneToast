package wiki.scene.toast;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;

import androidx.annotation.ColorInt;

import com.hjq.toast.style.BaseToastStyle;

/**
 * 初始化Toast的样式，可以传入背景色和字体颜色
 */
public class SceneToastStyle extends BaseToastStyle {

    private @ColorInt
    int bgColor;
    private @ColorInt
    int textColor;

    public SceneToastStyle(Context context, @ColorInt int bgColor, @ColorInt int textColor) {
        super(context);
        this.bgColor = bgColor;
        this.textColor = textColor;
    }

    @Override
    public int getCornerRadius() {
        return dp2px(5);
    }

    @Override
    public int getBackgroundColor() {
        return bgColor;
    }

    @Override
    public int getTextColor() {
        return textColor;
    }

    @Override
    public float getTextSize() {
        return dp2px(14);
    }

    @Override
    public int getPaddingStart() {
        return dp2px(24);
    }

    @Override
    public int getPaddingTop() {
        return dp2px(10);
    }

    @Override
    public int getPaddingBottom() {
        return dp2px(10);
    }

    @Override
    public int getPaddingEnd() {
        return dp2px(24);
    }

    @Override
    public int getGravity() {
        return Gravity.BOTTOM;
    }
}
