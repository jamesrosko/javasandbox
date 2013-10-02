package com.jamesrosko.patterns.adapter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.jamesrosko.patterns.adapter.Adapter;
import com.jamesrosko.patterns.adapter.EasyToUseClient;
import com.jamesrosko.patterns.adapter.HardToUseAdaptee;

public class AdapterTest {

    @Test
    public void adapter() {
        Adapter adapter = new Adapter();
        EasyToUseClient client = adapter.adapt(new HardToUseAdaptee());

        String actual = client.format("input");
        assertThat(actual, is("INPUT-STRING"));
    }

}
