package io.hobaskos.event.eventapp.ui.events.old;

import java.util.List;

import io.hobaskos.event.eventapp.data.model.Event;
import io.hobaskos.event.eventapp.ui.base.old.MvpView;

/**
 * Created by andre on 2/10/2017.
 */

public interface EventsView extends MvpView {
    void showLoading(boolean loading);

    void showError(Throwable e);

    void showContent();

    void setData(List<Event> data);

    void appendData(List<Event> data);
}