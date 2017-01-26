package io.hobaskos.event.eventapp.event;

import io.hobaskos.event.eventapp.models.Event;

/**
 * Created by andre on 1/26/2017.
 */

public interface EventView {
    void showWait();

    void removeWait();

    void onFailure(String errorMessage);

    void setEvent(Event event);
}
