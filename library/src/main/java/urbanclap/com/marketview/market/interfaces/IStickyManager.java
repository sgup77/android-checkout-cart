package urbanclap.com.marketview.market.interfaces;

import android.support.annotation.Nullable;
import android.view.View;

/**
 * @author : Adnaan 'Zohran' Ahmed <adnaanahmed@urbanclap.com>
 * @version : 1.0.0
 * @since : 12 Mar 2018 6:46 PM
 */


public interface IStickyManager {
    @Nullable
    View getStickyView(int pos);
}
