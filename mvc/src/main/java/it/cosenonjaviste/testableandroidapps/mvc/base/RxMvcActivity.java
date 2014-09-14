package it.cosenonjaviste.testableandroidapps.mvc.base;

import android.support.v7.app.ActionBarActivity;

/**
 * Created by fabiocollini on 14/09/14.
 */
public abstract class RxMvcActivity<M> extends ActionBarActivity implements RxMvcView<M> {

    @Override protected void onStart() {
        super.onStart();
        getController().subscribe(this);
    }

    @Override protected void onStop() {
        getController().unsubscribe();
        super.onStop();
    }

    protected abstract RxMvcController<M> getController();
}