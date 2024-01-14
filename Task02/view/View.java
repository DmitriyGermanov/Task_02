package view;

import presenter.Presenter;

public interface View {
    void start();

    public void setPresenter(Presenter presenter);
}
