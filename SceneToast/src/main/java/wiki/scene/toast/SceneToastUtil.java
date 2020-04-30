package wiki.scene.toast;

import android.app.Application;
import android.graphics.Color;
import android.text.TextUtils;

import androidx.annotation.ColorInt;
import androidx.annotation.StringRes;

import com.hjq.toast.ToastUtils;

/**
 * 必须调用初始化
 */
public class SceneToastUtil {

    public static void initToast(Application application) {
        initToast(application, Color.BLACK);
    }

    public static void initToast(Application application, @ColorInt int bgColor) {
        initToast(application, bgColor, Color.WHITE);
    }

    public static void initToast(Application application, @ColorInt int bgColor, @ColorInt int textColor) {
        ToastUtils.initStyle(new SceneToastStyle(application, bgColor, textColor));
        ToastUtils.init(application);
    }

    public static void show(String msg) {
        if (!TextUtils.isEmpty(msg)) {
            ToastUtils.show(msg);
        }
    }

    public static void show(@StringRes int msgResId) {
        if (msgResId != 0) {
            ToastUtils.show(msgResId);
        }
    }

    public static void show(Object object) {
        if (object != null) {
            ToastUtils.show(object);
        }
    }

}
