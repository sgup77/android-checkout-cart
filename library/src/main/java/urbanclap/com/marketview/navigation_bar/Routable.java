package urbanclap.com.marketview.navigation_bar;

/**
 * @author : Adnaan 'Zohran' Ahmed <adnaanahmed@urbanclap.com>
 * @version : 1.0.0
 * @since : 12 Mar 2018 2:15 PM
 */


public interface Routable<T> {
    T getRouteViewModel();

    String getRouteUUID();

    int getRouteViewType();
}
