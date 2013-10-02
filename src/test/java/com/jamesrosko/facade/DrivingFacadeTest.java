package com.jamesrosko.facade;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class DrivingFacadeTest {

    @Test
    public void driveToWork() {

        DrivingFacade drivingFacade = new DrivingFacade();
        drivingFacade.driveToWork();

        List<String> drivingHistory = drivingFacade.getDrivingHistory();

        assertThat(drivingHistory.get(0), is("start"));
        assertThat(drivingHistory.get(1), is("go straight"));
        assertThat(drivingHistory.get(2), is("turn left"));
        assertThat(drivingHistory.get(3), is("go straight"));
        assertThat(drivingHistory.get(4), is("turn right"));
        assertThat(drivingHistory.get(5), is("go straight"));
        assertThat(drivingHistory.get(6), is("turn right"));
        assertThat(drivingHistory.get(7), is("stop"));
        assertThat(drivingHistory.get(8), is("shut off"));
    }

}
