package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.verification.Times;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");


    private Timesheet testTimesheet;
    private JdbcTimesheetDao sut;

    @Before
    public void setup() {
        sut = new JdbcTimesheetDao(dataSource);
    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        Timesheet timesheet = sut.getTimesheet(1);
        assertTimesheetsMatch(TIMESHEET_1, timesheet);
        timesheet = sut.getTimesheet(3);
        assertTimesheetsMatch(TIMESHEET_3, timesheet);

    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet timesheet = sut.getTimesheet(6);
        Assert.assertNull(timesheet);
        timesheet = sut.getTimesheet(10);
        Assert.assertNull(timesheet);
    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        List<Timesheet> timesheets = sut.getTimesheetsByEmployeeId(1);
        Assert.assertEquals(1, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_1, timesheets.get(0));

    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> timesheets = sut.getTimesheetsByProjectId(2);
        Assert.assertEquals(1, timesheets);
        assertTimesheetsMatch(TIMESHEET_4, timesheets.get(3));
    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {
        Timesheet createdTimesheet = sut.createTimesheet(testTimesheet);
        Integer newId = createdTimesheet.getTimesheetId();
        Assert.assertTrue(newId > 0);
        testTimesheet.setTimesheetId(newId);
        assertTimesheetsMatch(testTimesheet, createdTimesheet);
    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {
        Timesheet createdTimesheet = sut.createTimesheet(testTimesheet);
        Integer newId = createdTimesheet.getTimesheetId();
        Timesheet retrievedTimesheet = sut.getTimesheet(newId);

       assertTimesheetsMatch(createdTimesheet, retrievedTimesheet);
    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet updatedTimesheet = sut.getTimesheet(3);

        updatedTimesheet.setEmployeeId(1);
        updatedTimesheet.setProjectId(2);


        sut.updateTimesheet(updatedTimesheet);
        Timesheet retrievedTimesheet = sut.getTimesheet(3);
        assertTimesheetsMatch(updatedTimesheet, retrievedTimesheet);
    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {
        sut.deleteTimesheet(1);

        Timesheet retrievedTimesheet = sut.getTimesheet(1);
        Assert.assertNull(retrievedTimesheet);

        List<Timesheet> timesheets = sut.getTimesheetsByEmployeeId(1);
        Assert.assertEquals(1, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_2, timesheets.get(0));
    }

    @Test
    public void getBillableHours_returns_correct_total() {
       sut.getBillableHours(2, 1);

       Timesheet billedTimesheet = sut.getTimesheet(3);
       Assert.assertEquals(.25, billedTimesheet.getHoursWorked(), 0.1);
       assertTimesheetsMatch(TIMESHEET_3, billedTimesheet);

    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
