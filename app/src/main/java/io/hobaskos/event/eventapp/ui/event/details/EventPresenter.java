package io.hobaskos.event.eventapp.ui.event.details;

import java.util.List;

import javax.inject.Inject;

import io.hobaskos.event.eventapp.data.model.Event;
import io.hobaskos.event.eventapp.data.repository.EventRepository;
import io.hobaskos.event.eventapp.ui.base.presenter.BaseRxLcePresenter;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by andre on 1/26/2017.
 */
public class EventPresenter extends BaseRxLcePresenter<EventView, Event> {

    private EventView view;

    private EventRepository eventRepository;
    private Observable<Event> eventObservable = Observable.empty();

    @Inject
    public EventPresenter(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public void getEvent(Long id) {

        eventObservable = eventRepository.get(id);
        subscribe(eventObservable, false);
    }

    public void getEvent(Long id, Observer<Event> eventObserver) {

        eventRepository.get(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(eventObserver);
    }

}

