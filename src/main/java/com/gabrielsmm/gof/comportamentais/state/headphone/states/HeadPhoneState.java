package com.gabrielsmm.gof.comportamentais.state.headphone.states;

import com.gabrielsmm.gof.comportamentais.state.headphone.HeadPhone;

public interface HeadPhoneState {

    void click(HeadPhone hp);
    void longClick(HeadPhone hp);

}
