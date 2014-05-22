/*
 * UICronTrigger.java
 * 
 * Based on work in Quartz: Copyright James House (c) 2001-2004
 * 
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met: 1.
 * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer. 2. Redistributions in
 * binary form must reproduce the above copyright notice, this list of
 * conditions and the following disclaimer in the documentation and/or other
 * materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR AND CONTRIBUTORS ``AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE AUTHOR OR CONTRIBUTORS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *  
 */
//package org.quartz;
package it.aco.mandragora.common;

import org.quartz.*;

import java.util.*;
import java.util.Calendar;
import java.text.ParseException;

/**
 * <p>
 * A concrete <code>{@link Trigger}</code> that is used to fire a <code>{@link Job}</code>
 * at given moments in time, defined with Unix 'cron-like' definitions.
 * </p>
 *
 * <p>
 * What you should know about this particular trigger is that it is based on
 * org.quartz.CronTrigger, but the the functionality to build the sets from a
 * string are unused. Whereas CronTrigger would essentially deserialize by
 * rebuilding the TreeSets from the cronExpression, this class does not have a
 * cronExpression, and de/serializes the TreeSets in their entirety. This is
 * because the TreeSets map directly to the Struts user interface for set
 * selection, and no effort is made to write an interpreter to map them back
 * and forth between legacy UN*X cron expressions that CronTrigger uses.
 * </p>
 *
 * <p>
 * The method I use with this trigger is to instantiate it, then put it in the
 * ActionForm of a Struts bean, then let Struts manipulate it directly through
 * BeanUtils. You are by no means required to do that, but to fully understand
 * the concepts here, at least until there is better documentation, you should
 * understand how it works within that context first so you can write the
 * appropriate code that Struts does for you for free. I'll try to explain that
 * here.
 * </p>
 *
 * <p>
 * Struts JSP tags allow the user to use Apache BeanUtils to reference
 * components of beans by path. This is to say that a bean <code>Foo</code>
 * that has an accessor method <code>Bar getBar()</code> and given <code>
 * Bar</code>
 * has a primitive type <code>String</code> as a field named <code>splat</code>,
 * one can set the field to <i>"new string value"</i> as follows:
 * </p>
 * <code>
 * // create a new Foo with contained reference to a new Bar
 * Foo fooBean = new Foo();
 * fooBean.setBar(new Bar());
 * // set the splat string in the Bar bean from Foo
 * BeanUtils.setProperty(fooBean, "bar.splat", "new string value");
 * </code>
 * <p>
 * In turn, Struts JSP tags use the bean addressing provided by BeanUtils to
 * address accessor methods within the bean graph that is rooted with the
 * ActionForm that is put into the Action context.
 * </p>
 * <p>
 * Finally, having all this allows you to put direct selection lists on the
 * screen of the UI, then map them directly into the UICronTrigger bean. Given
 * a ActionForm bean that was set up to contain a <code>UICronTrigger</code>
 * in a field called <code>trigger</code>, the following HTML code will
 * completely create your UI in Struts:
 * </p>
 *
 * <code>
 *               <tr class="listRowUnshaded">
 *   <td width="80">Date</td>
 *   <td align="right">
 *   <html:select property="trigger.daysOfWeek" size="5" multiple="true">
 *   <html:options property="trigger.daysOfWeekValues" labelProperty="trigger.daysOfWeekLabels"/>
 *   </html:select>
 *   <html:select property="trigger.daysOfMonth" size="5" multiple="true">
 *   <html:options property="trigger.daysOfMonthValues" labelProperty="trigger.daysOfMonthLabels"/>
 *   </html:select>
 *   <html:select property="trigger.months" size="5" multiple="true">
 *   <html:options property="trigger.monthsValues" labelProperty="trigger.monthsLabels"/>
 *   </html:select>
 *   <html:select property="trigger.years" size="5" multiple="true">
 *   <html:options property="trigger.yearsValues" labelProperty="trigger.yearsLabels"/>
 *   </html:select>
 *   </td>
 *   </tr>
 *   <tr class="listRowShaded">
 *   <td width="80">Time</td>
 *   <td colspan="2" align="right">
 *   <html:select property="trigger.hours" size="5" multiple="true">
 *   <html:options property="trigger.hoursValues" labelProperty="trigger.hoursLabels"/>
 *   </html:select>
 *   <html:select property="trigger.minutes" size="5" multiple="true">
 *   <html:options property="trigger.minutesValues" labelProperty="trigger.minutesLabels"/>
 *   </html:select>
 *   </td>
 *   </tr>
 *   </code>
 * <p>
 * So if you don't want to use Struts, what you have to do is take the
 * information that was submitted on the form in the HTML select ranges,
 * iterate each of them, and add the values to the appropriate sets in the
 * fields of this class. Make sense?
 * </p>
 *
 * Note that this is not as versatile as the standard CronTrigger. There are
 * tricks with "last day of month" and repeating sets that need to be manually
 * selected, and sets that can happen for date ranges much longer than we can
 * reasonably map with direct selection in a UI.
 *
 * @see org.quartz.CronTrigger
 * @see Trigger
 * @see SimpleTrigger
 *
 * @author Brian Topping
 * @author based on code by Sharada Jambula, James House, Mads Henderson
 */

/*Modified by Alessandro Colantoni*/
public class UICronTrigger extends CronTrigger { // it was: extends Trigger

    /*
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *
     * Constants.
     *
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     */

    /**
     * <p>
     * Instructs the <code>{@link Scheduler}</code> that upon a mis-fire
     * situation, the <code>{@link org.quartz.CronTrigger}</code> wants to be
     * fired now by <code>Scheduler</code>.
     * </p>
     */
    public static final int MISFIRE_INSTRUCTION_FIRE_ONCE_NOW = 1;

    /**
     * <p>
     * Instructs the <code>{@link Scheduler}</code> that upon a mis-fire
     * situation, the <code>{@link org.quartz.CronTrigger}</code> wants to
     * have it's next-fire-time updated to the next time in the schedule after
     * the current time, but it does not to be fired now.
     * </p>
     */
    public static final int MISFIRE_INSTRUCTION_DO_NOTHING = 2;

    /*
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *
     * Data members.
     *
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     */

    private static final int ALL_SPEC_INT = 99; // '*'

    private static final int NO_SPEC_INT = 98; // '?'


    private static final Integer ALL_SPEC = new Integer(ALL_SPEC_INT);

    private static final Integer NO_SPEC = new Integer(NO_SPEC_INT);

    private static Map monthMap = new HashMap(20);

    private static Map dayMap = new HashMap(60);

    static {
        monthMap.put("JAN", new Integer(0));
        monthMap.put("FEB", new Integer(1));
        monthMap.put("MAR", new Integer(2));
        monthMap.put("APR", new Integer(3));
        monthMap.put("MAY", new Integer(4));
        monthMap.put("JUN", new Integer(5));
        monthMap.put("JUL", new Integer(6));
        monthMap.put("AUG", new Integer(7));
        monthMap.put("SEP", new Integer(8));
        monthMap.put("OCT", new Integer(9));
        monthMap.put("NOV", new Integer(10));
        monthMap.put("DEC", new Integer(11));

        dayMap.put("SUN", new Integer(1));
        dayMap.put("MON", new Integer(2));
        dayMap.put("TUE", new Integer(3));
        dayMap.put("WED", new Integer(4));
        dayMap.put("THU", new Integer(5));
        dayMap.put("FRI", new Integer(6));
        dayMap.put("SAT", new Integer(7));
    }

    private Date startTime = null;

    private Date endTime = null;

    private Date nextFireTime = null;

    private TimeZone timeZone = null;

    private Date previousFireTime = null;

    private TreeSet seconds = null;

    private TreeSet minutes = null;

    private TreeSet hours = null;

    private TreeSet daysOfMonth = null;

    private TreeSet months = null;

    private TreeSet daysOfWeek = null;

    private TreeSet years = null;

    private transient boolean lastdayOfWeek = false;

    private transient int nthdayOfWeek = 0;

    private transient boolean lastdayOfMonth = false;

    private transient boolean calendardayOfWeek = false;

    private transient boolean calendardayOfMonth = false;

    private String cronExpression = super.getCronExpression();  // added to put it to null when nothingSelected()=true
    /*
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *
     * Constructors.
     *
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     */

    public void reset() {
        seconds = new TreeSet();
        minutes = new TreeSet();
        hours = new TreeSet();
        daysOfMonth = new TreeSet();
        months = new TreeSet();
        daysOfWeek = new TreeSet();
        years = new TreeSet();

        // we always fire on the minute
        seconds.add(new Integer(0));

        minutes.add(new Integer(0));//aded by Alessandro Colantoni
        /*    deleted by Alessandro Colantoni
        minutes.add(ALL_SPEC);
        for (int i = 0; i < 60; i++)
            minutes.add(new Integer(i));
        */

        //hours.add(new Integer(0));//aded by Alessandro Colantoni and deleted on 19/02/2007
        hours.add(new Integer(NOTSELECTED));//aded by Alessandro Colantoni
        /*    deleted by Alessandro Colantoni
        hours.add(ALL_SPEC);
        for (int i = 0; i < 24; i++)
            hours.add(new Integer(i));
        */

        daysOfMonth.add(NO_SPEC); // added by  Alessandro Colantoni
        /*    deleted by Alessandro Colantoni
        daysOfMonth.add(ALL_SPEC);
        for (int i = 1; i <= 31; i++)
            daysOfMonth.add(new Integer(i));
        */


        months.add(ALL_SPEC);
        for (int i = 1; i <= 12; i++)
            months.add(new Integer(i));


        daysOfWeek.add(NO_SPEC);
        //daysOfWeek.add(EMPTY);

        years.add(ALL_SPEC);
        for (int i = 1970; i <= 2099; i++)
            years.add(new Integer(i));

        startTime = new Date();
        setStartTime(startTime);
        setTimeZone(TimeZone.getDefault());

        /******added Alessandro Colantoni************/
        escalationTime = new Integer(NOTSELECTED);
    }

    /**
     * <p>
     * Create a <code>CronTrigger</code> with no settings.
     * </p>
     */
    public UICronTrigger() {
        super();
        reset();
    }

    /**
     * <p>
     * Create a <code>CronTrigger</code> with the given name and group.
     * </p>
     */
    public UICronTrigger(String name, String group) {
        super(name, group);
        reset();
    }

    /**
     * <p>
     * Create a <code>CronTrigger</code> with the given name and group, and
     * associated with the identified <code>{@link Job}</code>.
     * </p>
     */
    public UICronTrigger(String name, String group, String jobName,
            String jobGroup) {
        super(name, group, jobName, jobGroup);
        reset();
    }

    /*
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *
     * Interface.
     *
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     */

    /**
     * <p>
     * Get the time at which the <code>CronTrigger</code> should occur.
     * </p>
     */
    public Date getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Date startTime) {
        if (startTime == null)
                throw new IllegalArgumentException("Start time cannot be null");

        Date eTime = getEndTime();
        if (eTime != null && startTime != null && eTime.before(startTime))
            throw new IllegalArgumentException(
            "End time cannot be before start time");


        // round off millisecond...
        // Note timeZone is not needed here as parameter for
        // Calendar.getInstance(), since time zone is implicit
        // when using a Date in the setTime method.
        Calendar cl = Calendar.getInstance();
        cl.setTime(startTime);
        cl.set(Calendar.MILLISECOND, 0);

        this.startTime = cl.getTime();
    }

    /**
     * <p>
     * Get the time at which the <code>CronTrigger</code> should quit
     * repeating - even if repeastCount isn't yet satisfied.
     * </p>
     *
     * @see #getFinalFireTime()
     */
    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        Date sTime = getStartTime();
        if (sTime != null && endTime != null && sTime.after(endTime))
                throw new IllegalArgumentException(
                        "End time cannot be before start time");

        this.endTime = endTime;
    }

    /**
     * <p>
     * Returns the next time at which the <code>CronTrigger</code> will fire.
     * If the trigger will not fire again, <code>null</code> will be
     * returned. The value returned is not guaranteed to be valid until after
     * the <code>Trigger</code> has been added to the scheduler.
     * </p>
     */
    public Date getNextFireTime() {
        return this.nextFireTime;
    }

    public void updateAfterMisfire(org.quartz.Calendar cal) {
        int instr = getMisfireInstruction();

        if (instr == MISFIRE_INSTRUCTION_SMART_POLICY)
                instr = MISFIRE_INSTRUCTION_DO_NOTHING;

        if (instr == MISFIRE_INSTRUCTION_DO_NOTHING) {
            Date newFireTime = getFireTimeAfter(new Date());
            while (newFireTime != null && cal != null
                    && !cal.isTimeIncluded(newFireTime.getTime())) {
                newFireTime = getFireTimeAfter(newFireTime);
            }

            setNextFireTime(newFireTime);

        } else if (instr == MISFIRE_INSTRUCTION_FIRE_ONCE_NOW) {
            setNextFireTime(new Date());
        }
    }

    public Date getPreviousFireTime() {
        return this.previousFireTime;
    }

    /**
     * <p>
     * Set the previous time at which the <code>SimpleTrigger</code> fired.
     * </p>
     *
     * <p>
     * <b>This method should not be invoked by client code.</b>
     * </p>
     */
    public void setPreviousFireTime(Date previousFireTime) {
        this.previousFireTime = previousFireTime;
    }

    /**
     * <p>
     * Sets the next time at which the <code>CronTrigger</code> will fire. If
     * the trigger will not fire again, <code>null</code> will be returned.
     * </p>
     */
    public void setNextFireTime(Date nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    /**
     * <p>
     * Returns the time zone for which the <code>cronExpression</code> of
     * this <code>CronTrigger</code> will be resolved.
     * </p>
     */
    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    /**
     * <p>
     * Sets the time zone for which the <code>cronExpression</code> of this
     * <code>CronTrigger</code> will be resolved.
     * </p>
     */
    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * <p>
     * Returns the next time at which the <code>CronTrigger</code> will fire,
     * after the given time. If the trigger will not fire after the given time,
     * <code>null</code> will be returned.
     * </p>
     *
     * <p>
     * Note that the date returned is NOT validated against the related
     * org.quartz.Calendar (if any)
     * </p>
     */
    public Date getFireTimeAfter(Date afterTime) {
        if (afterTime == null) afterTime = new Date();

        if (startTime.after(afterTime))
                afterTime = new Date(startTime.getTime() - 1000l);

        Date pot = getTimeAfter(afterTime);
        if (endTime != null && pot != null && pot.after(endTime)) return null;

        return pot;
    }

    /**
     * <p>
     * Returns the final time at which the <code>CronTrigger</code> will
     * fire.
     * </p>
     *
     * <p>
     * Note that the return time *may* be in the past. and the date returned is
     * not validated against org.quartz.calendar
     * </p>
     */
    public Date getFinalFireTime() {
        if (this.endTime != null) return getTimeBefore(this.endTime);
        else
            return null;
    }

    /**
     * <p>
     * Determines whether or not the <code>CronTrigger</code> will occur
     * again.
     * </p>
     */
    public boolean mayFireAgain() {
        return (getNextFireTime() != null);
    }

    protected boolean validateMisfireInstruction(int misfireInstruction) {
        if (misfireInstruction < MISFIRE_INSTRUCTION_SMART_POLICY)
                return false;

        if (misfireInstruction > MISFIRE_INSTRUCTION_DO_NOTHING) return false;

        return true;
    }

    /**
     * <p>
     * Updates the <code>CronTrigger</code>'s state based on the
     * MISFIRE_INSTRUCTION_XXX that was selected when the <code>SimpleTrigger</code>
     * was created.
     * </p>
     *
     * <p>
     * If the misfire instruction is set to MISFIRE_INSTRUCTION_SMART_POLICY,
     * then the following scheme will be used: <br>
     * <ul>
     * <li>The instruction will be interpreted as <code>MISFIRE_INSTRUCTION_DO_NOTHING</code>
     * </ul>
     * </p>
     */
    public void updateAfterMisfire() {
        int instr = getMisfireInstruction();

        if (instr == MISFIRE_INSTRUCTION_SMART_POLICY)
                instr = MISFIRE_INSTRUCTION_DO_NOTHING;

        if (instr == MISFIRE_INSTRUCTION_DO_NOTHING) {
            setNextFireTime(getFireTimeAfter(new Date()));
        } else if (instr == MISFIRE_INSTRUCTION_FIRE_ONCE_NOW) {
            setNextFireTime(new Date());
        }
    }

    /**
     * <p>
     * Determines whether the date & time of the given java.util.Calendar
     * instance falls on a scheduled fire-time of this trigger.
     * </p>
     *
     * <p>
     * Note that the date returned is NOT validated against the related
     * org.quartz.Calendar (if any)
     * </p>
     */
    public boolean willFireOn(Calendar test) {
        Integer second = new Integer(test.get(Calendar.SECOND));
        Integer minute = new Integer(test.get(Calendar.MINUTE));
        Integer hour = new Integer(test.get(Calendar.HOUR_OF_DAY));
        Integer day = new Integer(test.get(Calendar.DAY_OF_MONTH));
        Integer month = new Integer(test.get(Calendar.MONTH));

        if ((seconds.contains(second) || seconds.contains(ALL_SPEC))
                && (minutes.contains(minute) || minutes.contains(ALL_SPEC))
                && (hours.contains(hour) || hours.contains(ALL_SPEC))
                && (daysOfMonth.contains(day) || daysOfMonth.contains(ALL_SPEC))
                && (months.contains(month) || months.contains(ALL_SPEC))) {

        return true; }

        return false;
    }

    /**
     * <p>
     * Called after the <code>{@link Scheduler}</code> has executed the
     * <code>{@link Job}</code> associated with the <code>Trigger</code> in
     * order to get the final instruction code from the trigger.
     * </p>
     *
     * @param context
     *          is the <code>JobExecutionContext</code> that was used by the
     *          <code>Job</code>'s<code>execute(xx)</code> method.
     * @param result
     *          is the <code>JobExecutionException</code> thrown by the
     *          <code>Job</code>, if any (may be null).
     * @return one of the Trigger.INSTRUCTION_XXX constants.
     *
     * @see #INSTRUCTION_NOOP
     * @see #INSTRUCTION_RE_EXECUTE_JOB
     * @see #INSTRUCTION_DELETE_TRIGGER
     * @see #INSTRUCTION_SET_TRIGGER_COMPLETE
     * @see #triggered(Calendar)
     */
    public int executionComplete(JobExecutionContext context,
            JobExecutionException result) {
        if (result != null && result.refireImmediately())
                return Trigger.INSTRUCTION_RE_EXECUTE_JOB;

        if (result != null && result.refireImmediately())
                return INSTRUCTION_RE_EXECUTE_JOB;

        if (result != null && result.unscheduleFiringTrigger())
                return INSTRUCTION_SET_TRIGGER_COMPLETE;

        if (result != null && result.unscheduleAllTriggers())
                return INSTRUCTION_SET_ALL_JOB_TRIGGERS_COMPLETE;

        if (!mayFireAgain()) return INSTRUCTION_DELETE_TRIGGER;

        return INSTRUCTION_NOOP;
    }

    /**
     * <p>
     * Called when the <code>{@link Scheduler}</code> has decided to 'fire'
     * the trigger (execute the associated <code>Job</code>), in order to
     * give the <code>Trigger</code> a chance to update itself for its next
     * triggering (if any).
     * </p>
     *
     * @see #executionComplete(JobExecutionContext, JobExecutionException)
     */
    public void triggered(org.quartz.Calendar calendar) {
        previousFireTime = nextFireTime;
        nextFireTime = getFireTimeAfter(nextFireTime);

        while (nextFireTime != null && calendar != null
                && !calendar.isTimeIncluded(nextFireTime.getTime())) {
            nextFireTime = getFireTimeAfter(nextFireTime);
        }
    }

    /**
     *
     * @see org.quartz.Trigger#updateWithNewCalendar(org.quartz.Calendar, long)
     */
    public void updateWithNewCalendar(org.quartz.Calendar calendar, long misfireThreshold)
    {
        nextFireTime = getFireTimeAfter(previousFireTime);

        Date now = new Date();
        do {
            while (nextFireTime != null && calendar != null
                    && !calendar.isTimeIncluded(nextFireTime.getTime())) {
                nextFireTime = getFireTimeAfter(nextFireTime);
            }

            if(nextFireTime.before(now)) {
                long diff = now.getTime() - nextFireTime.getTime();
                if(diff >= misfireThreshold) {
                    nextFireTime = getFireTimeAfter(nextFireTime);
                    continue;
                }
            }
        }while(false);
    }

    /**
     * <p>
     * Called by the scheduler at the time a <code>Trigger</code> is first
     * added to the scheduler, in order to have the <code>Trigger</code>
     * compute its first fire time, based on any associated calendar.
     * </p>
     *
     * <p>
     * After this method has been called, <code>getNextFireTime()</code>
     * should return a valid answer.
     * </p>
     *
     * @return the first time at which the <code>Trigger</code> will be fired
     *         by the scheduler, which is also the same value <code>getNextFireTime()</code>
     *         will return (until after the first firing of the <code>Trigger</code>).
     *         </p>
     */
    public Date computeFirstFireTime(org.quartz.Calendar calendar) {
        nextFireTime = getFireTimeAfter(new Date(startTime.getTime() - 1000l));

        while (nextFireTime != null && calendar != null
                && !calendar.isTimeIncluded(nextFireTime.getTime())) {
            nextFireTime = getFireTimeAfter(nextFireTime);
        }

        return nextFireTime;
    }

    public String getExpressionSummary() {
        StringBuffer buf = new StringBuffer();

        buf.append("seconds: ");
        buf.append(getExpressionSetSummary(seconds));
        buf.append("\n");
        buf.append("minutes: ");
        buf.append(getExpressionSetSummary(minutes));
        buf.append("\n");
        buf.append("hours: ");
        buf.append(getExpressionSetSummary(hours));
        buf.append("\n");
        buf.append("daysOfMonth: ");
        buf.append(getExpressionSetSummary(daysOfMonth));
        buf.append("\n");
        buf.append("months: ");
        buf.append(getExpressionSetSummary(months));
        buf.append("\n");
        buf.append("daysOfWeek: ");
        buf.append(getExpressionSetSummary(daysOfWeek));
        buf.append("\n");
        buf.append("lastdayOfWeek: ");
        buf.append(lastdayOfWeek);
        buf.append("\n");
        buf.append("lastdayOfMonth: ");
        buf.append(lastdayOfMonth);
        buf.append("\n");
        buf.append("calendardayOfWeek: ");
        buf.append(calendardayOfWeek);
        buf.append("\n");
        buf.append("calendardayOfMonth: ");
        buf.append(calendardayOfMonth);
        buf.append("\n");
        buf.append("years: ");
        buf.append(getExpressionSetSummary(years));
        buf.append("\n");

        return buf.toString();
    }

    public String getExpressionSetSummary(Set set) { // Modified alessandro Colantoni it was a private method. the corrispondent on CronTrigger should be protected

        if (set.contains(NO_SPEC)) return "?";
        if (set.contains(ALL_SPEC)) return "*";

        StringBuffer buf = new StringBuffer();

        Iterator itr = set.iterator();
        boolean first = true;
        while (itr.hasNext()) {
            Integer iVal = (Integer) itr.next();
            String val = iVal.toString();
            if (!first) buf.append(",");
            buf.append(val);
            first = false;
        }

        return buf.toString();
    }

    ////////////////////////////////////////////////////////////////////////////
    //
    // Computation Functions
    //
    ////////////////////////////////////////////////////////////////////////////

    public Date getTimeAfter(Date afterTime) { // Modified alessandro Colantoni it was a private method. the corrispondent on CronTrigger should be protected
        Calendar cl = Calendar.getInstance(timeZone);

        // move ahead one second, since we're computing the time *after* the
        // given time
        afterTime = new Date(afterTime.getTime() + 1000);
        // CronTrigger does not deal with milliseconds
        cl.setTime(afterTime);
        cl.set(Calendar.MILLISECOND, 0);

        boolean gotOne = false;

        // loop until we've computed the next time, or we've past the endTime
        while (!gotOne) {

            if (endTime != null && cl.getTime().after(endTime)) return null;

            SortedSet st = null;
            int t = 0;

            int sec = cl.get(Calendar.SECOND);
            int min = cl.get(Calendar.MINUTE);

            // get second.................................................
            st = seconds.tailSet(new Integer(sec));
            if (st != null && st.size() != 0) {
                sec = ((Integer) st.first()).intValue();
            } else {
                sec = ((Integer) seconds.first()).intValue();
                min++;
                cl.set(Calendar.MINUTE, min);
            }
            cl.set(Calendar.SECOND, sec);

            min = cl.get(Calendar.MINUTE);
            int hr = cl.get(Calendar.HOUR_OF_DAY);
            t = -1;

            // get minute.................................................
            st = minutes.tailSet(new Integer(min));
            if (st != null && st.size() != 0) {
                t = min;
                min = ((Integer) st.first()).intValue();
            } else {
                min = ((Integer) minutes.first()).intValue();
                hr++;
            }
            if (min != t) {
                cl.set(Calendar.SECOND, 0);
                cl.set(Calendar.MINUTE, min);
                cl.set(Calendar.HOUR_OF_DAY, hr);
                continue;
            }
            cl.set(Calendar.MINUTE, min);

            hr = cl.get(Calendar.HOUR_OF_DAY);
            int day = cl.get(Calendar.DAY_OF_MONTH);
            t = -1;

            // get hour...................................................
            st = hours.tailSet(new Integer(hr));
            if (st != null && st.size() != 0) {
                t = hr;
                hr = ((Integer) st.first()).intValue();
            } else {
                hr = ((Integer) hours.first()).intValue();
                day++;
            }
            if (hr != t) {
                cl.set(Calendar.SECOND, 0);
                cl.set(Calendar.MINUTE, 0);
                cl.set(Calendar.HOUR_OF_DAY, hr);
                cl.set(Calendar.DAY_OF_MONTH, day);
                continue;
            }
            cl.set(Calendar.HOUR_OF_DAY, hr);

            day = cl.get(Calendar.DAY_OF_MONTH);
            int mon = cl.get(Calendar.MONTH) + 1; // '+ 1' because calendar is
            // 0-based for this field,
            // and we are 1-based
            t = -1;

            // get day...................................................
            boolean dayOfMSpec = !daysOfMonth.contains(NO_SPEC);
            boolean dayOfWSpec = !daysOfWeek.contains(NO_SPEC);
            if (dayOfMSpec && !dayOfWSpec) { // get day only by day of month
                // rule
                st = daysOfMonth.tailSet(new Integer(day));
                if (lastdayOfMonth) {
                    t = day;
                    day = getLastDayOfMonth(mon);
                } else if (st != null && st.size() != 0) {
                    t = day;
                    day = ((Integer) st.first()).intValue();
                } else {
                    day = ((Integer) daysOfMonth.first()).intValue();
                    mon++;
                }
                if (day != t) {
                    cl.set(Calendar.SECOND, 0);
                    cl.set(Calendar.MINUTE, 0);
                    cl.set(Calendar.HOUR_OF_DAY, 0);
                    cl.set(Calendar.DAY_OF_MONTH, day);
                    cl.set(Calendar.MONTH, mon - 1); // '- 1' because calendar
                    // is 0-based for this
                    // field, and we are
                    // 1-based
                    continue;
                }
            } else if (dayOfWSpec && !dayOfMSpec) { // get day only by day of
                // week rule
                if (lastdayOfWeek) { // are we looking for the last XXX day of
                    // the month?
                    int dow = ((Integer) daysOfWeek.first()).intValue(); // desired
                    // d-o-w
                    int cDow = cl.get(Calendar.DAY_OF_WEEK); // current d-o-w
                    int daysToAdd = 0;
                    if (cDow < dow) daysToAdd = dow - cDow;
                    if (cDow > dow) daysToAdd = dow + (7 - cDow);

                    int lDay = getLastDayOfMonth(mon);

                    if (day + daysToAdd > lDay) { // did we already miss the
                        // last one?
                        cl.set(Calendar.SECOND, 0);
                        cl.set(Calendar.MINUTE, 0);
                        cl.set(Calendar.HOUR_OF_DAY, 0);
                        cl.set(Calendar.DAY_OF_MONTH, 1);
                        cl.set(Calendar.MONTH, mon); // no '- 1' here because
                        // we are promoting the
                        // month
                        continue;
                    }

                    // find date of last occurance of this day in this month...
                    while ((day + daysToAdd + 7) <= lDay)
                        daysToAdd += 7;

                    day += daysToAdd;
                } else if (nthdayOfWeek != 0) { // are we looking for the Nth
                    // XXX day in the month?
                    int dow = ((Integer) daysOfWeek.first()).intValue(); // desired
                    // d-o-w
                    int cDow = cl.get(Calendar.DAY_OF_WEEK); // current d-o-w
                    int daysToAdd = 0;
                    if (cDow < dow) daysToAdd = dow - cDow;
                    else if (cDow > dow) daysToAdd = dow + (7 - cDow);

                    day += daysToAdd;
                    int weekOfMonth = day / 7;
                    if (day % 7 > 0) weekOfMonth++;

                    daysToAdd = (nthdayOfWeek - weekOfMonth) * 7;
                    day += daysToAdd;
                    if (daysToAdd < 0 || day > getLastDayOfMonth(mon)) {
                        cl.set(Calendar.SECOND, 0);
                        cl.set(Calendar.MINUTE, 0);
                        cl.set(Calendar.HOUR_OF_DAY, 0);
                        cl.set(Calendar.DAY_OF_MONTH, 1);
                        cl.set(Calendar.MONTH, mon); // no '- 1' here because
                        // we are promoting the
                        // month
                        continue;
                    }
                } else {
                    int cDow = cl.get(Calendar.DAY_OF_WEEK); // current d-o-w
                    int dow = ((Integer) daysOfWeek.first()).intValue(); // desired
                    // d-o-w
                    st = daysOfWeek.tailSet(new Integer(cDow));
                    if (st != null && st.size() > 0) {
                        dow = ((Integer) st.first()).intValue();
                    }

                    int daysToAdd = 0;
                    if (cDow < dow) daysToAdd = dow - cDow;
                    if (cDow > dow) daysToAdd = dow + (7 - cDow);

                    int lDay = getLastDayOfMonth(mon);

                    if (day + daysToAdd > lDay) { // will we pass the end of
                        // the month?
                        cl.set(Calendar.SECOND, 0);
                        cl.set(Calendar.MINUTE, 0);
                        cl.set(Calendar.HOUR_OF_DAY, 0);
                        cl.set(Calendar.DAY_OF_MONTH, 1);
                        cl.set(Calendar.MONTH, mon); // no '- 1' here because
                        // we are promoting the
                        // month
                        continue;
                    } else if (daysToAdd > 0) { // are we swithing days?
                        cl.set(Calendar.SECOND, 0);
                        cl.set(Calendar.MINUTE, 0);
                        cl.set(Calendar.HOUR_OF_DAY, 0);
                        cl.set(Calendar.DAY_OF_MONTH, day + daysToAdd);
                        cl.set(Calendar.MONTH, mon - 1); // '- 1' because
                        // calendar is 0-based
                        // for this field, and
                        // we are 1-based
                        continue;
                    }
                }
            } else { // dayOfWSpec && !dayOfMSpec
                throw new UnsupportedOperationException(
                        "Support for specifying both a day-of-week AND a day-of-month parameter is not implemented."); // TODO:
            }
            cl.set(Calendar.DAY_OF_MONTH, day);

            mon = cl.get(Calendar.MONTH) + 1; // '+ 1' because calendar is
            // 0-based for this field, and we
            // are 1-based
            int year = cl.get(Calendar.YEAR);
            t = -1;

            // get month...................................................
            st = months.tailSet(new Integer(mon));
            if (st != null && st.size() != 0) {
                t = mon;
                mon = ((Integer) st.first()).intValue();
            } else {
                mon = ((Integer) months.first()).intValue();
                year++;
            }
            if (mon != t) {
                cl.set(Calendar.SECOND, 0);
                cl.set(Calendar.MINUTE, 0);
                cl.set(Calendar.HOUR_OF_DAY, 0);
                cl.set(Calendar.DAY_OF_MONTH, 1);
                cl.set(Calendar.MONTH, mon - 1); // '- 1' because calendar is
                // 0-based for this field, and
                // we are 1-based
                cl.set(Calendar.YEAR, year);
                continue;
            }
            cl.set(Calendar.MONTH, mon - 1); // '- 1' because calendar is
            // 0-based for this field, and we
            // are 1-based

            year = cl.get(Calendar.YEAR);
            t = -1;

            // get year...................................................
            st = years.tailSet(new Integer(year));
            if (st != null && st.size() != 0) {
                t = year;
                year = ((Integer) st.first()).intValue();
            } else
                return null; // ran out of years...

            if (year != t) {
                cl.set(Calendar.SECOND, 0);
                cl.set(Calendar.MINUTE, 0);
                cl.set(Calendar.HOUR_OF_DAY, 0);
                cl.set(Calendar.DAY_OF_MONTH, 1);
                cl.set(Calendar.MONTH, mon - 1); // '- 1' because calendar is
                // 0-based for this field, and
                // we are 1-based
                cl.set(Calendar.YEAR, year);
                continue;
            }
            cl.set(Calendar.YEAR, year);

            gotOne = true;
        } // while( !done )

        return cl.getTime();
    }
    // Modified alessandro Colantoni it was a private method. the corrispondent on CronTrigger should be protected
    public Date getTimeBefore(Date endTime) // TODO: implement
    {
        return null;
    }

    public boolean isLeapYear() {
        Calendar cl = Calendar.getInstance(timeZone);
        int year = cl.get(Calendar.YEAR);

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) return true;
        else
            return false;
    }

    public int getLastDayOfMonth(int monthNum) {

        switch (monthNum) {
        case 1:
            return 31;
        case 2:
            return (isLeapYear()) ? 29 : 28;
        case 3:
            return 31;
        case 4:
            return 30;
        case 5:
            return 31;
        case 6:
            return 30;
        case 7:
            return 31;
        case 8:
            return 31;
        case 9:
            return 30;
        case 10:
            return 31;
        case 11:
            return 30;
        case 12:
            return 31;
        default:
            throw new IllegalArgumentException("Illegal month number: "
                    + monthNum);
        }
    }

    public Integer[] getSecondsValues() {
        Integer list[] = new Integer[60];
        for (int i = 0; i < 60; i++) {
            list[i] = new Integer(i);
        }

        return list;
    }

    public Integer[] getSecondsLabels() {
        return getSecondsValues();
    }

    public Integer[] getSeconds() {
        Integer list[] = new Integer[seconds.size()];
        if (seconds != null) {
            int i = 0;
            for (Iterator it = seconds.iterator(); it.hasNext(); i++) {
                list[i] = (Integer) it.next();
            }
        }
        return list;
    }

    public void setSeconds(Integer[] val) {
        if (seconds != null) seconds.clear();
        else
            seconds = new TreeSet();

        for (int i = 0; i < val.length; i++) {
            seconds.add(val[i]);
        }
    }

    public Integer[] getMinutesValues() {
        Integer list[] = new Integer[60];
        for (int i = 0; i < 60; i++) {
            list[i] = new Integer(i);
        }

        return list;
    }

    public Integer[] getMinutesLabels() {
        return getMinutesValues();
    }

    public Integer[] getMinutes() {
        Integer list[] = new Integer[minutes.size()];
        if (minutes != null) {
            int i = 0;
            for (Iterator it = minutes.iterator(); it.hasNext(); i++) {
                list[i] = (Integer) it.next();
            }
        }
        return list;
    }

    public void setMinutes(Integer[] val) {
        if (minutes != null) minutes.clear();
        else
            minutes = new TreeSet();

        for (int i = 0; i < val.length; i++) {
            minutes.add(val[i]);
        }
    }

    public Integer[] getHoursValues() {
        Integer list[] = new Integer[24];
        for (int i = 0; i < 24; i++) {
            list[i] = new Integer(i);
        }

        return list;
    }

    public String[] getHoursLabels() {
        /* deleted by alessandro on 21-02-2007
        String vals[] = {"12AM (Midnight)", "1AM", "2AM", "3AM", "4AM", "5AM",
                "6AM", "7AM", "8AM", "9AM", "10AM", "11AM", "12PM (Noon)",
                "1PM", "2PM", "3PM", "4PM", "5PM", "6PM", "7PM", "8PM", "9PM",
                "10PM", "11PM"};
        return vals;
        */
        // START added by alessandro  on 21-02-2007
        String vals[] = {prop.getString("hours.12AM.Midnight"), prop.getString("hours.1AM"), prop.getString("hours.2AM"), prop.getString("hours.3AM"),
                         prop.getString("hours.4AM"), prop.getString("hours.5AM"),prop.getString("hours.6AM"), prop.getString("hours.7AM"), prop.getString("hours.8AM"),
                         prop.getString("hours.9AM"), prop.getString("hours.10AM"),prop.getString("hours.11AM"), prop.getString("hours.12PM.Noon"),prop.getString("hours.1PM"),
                         prop.getString("hours.2PM"), prop.getString("hours.3PM"), prop.getString("hours.4PM"), prop.getString("hours.5PM"), prop.getString("hours.6PM"),
                         prop.getString("hours.7PM"), prop.getString("hours.8PM"), prop.getString("hours.9PM"), prop.getString("hours.10PM"), prop.getString("hours.11PM")};
        return vals;
        // end added by alessandro  on 21-02-2007

    }

    public Integer[] getHours() {
        Integer list[] = new Integer[hours.size()];
        if (hours != null) {
            int i = 0;
            for (Iterator it = hours.iterator(); it.hasNext(); i++) {
                list[i] = (Integer) it.next();
            }
        }
        return list;
    }

    public void setHours(Integer[] val) {
        if (hours != null) hours.clear();
        else
            hours = new TreeSet();

        for (int i = 0; i < val.length; i++) {
            hours.add(val[i]);
        }
    }

    public Integer[] getDaysOfMonthValues() {
        Integer list[] = new Integer[31];
        for (int i = 0; i < 31; i++) {
            list[i] = new Integer(i + 1);
        }

        return list;
    }

    public Integer[] getDaysOfMonthLabels() {
        return getDaysOfMonthValues();
    }

    public Integer[] getDaysOfMonth() {
        Integer list[] = new Integer[daysOfMonth.size()];
        if (daysOfMonth != null) {
            int i = 0;
            for (Iterator it = daysOfMonth.iterator(); it.hasNext(); i++) {
                list[i] = (Integer) it.next();
            }
        }
        return list;
    }

    public void setDaysOfMonth(Integer[] val) {
        if (daysOfMonth != null) daysOfMonth.clear();
        else
            daysOfMonth = new TreeSet();

        for (int i = 0; i < val.length; i++) {
            daysOfMonth.add(val[i]);
        }
        /*   deleted by Alessandro Colantoni
        daysOfWeek.clear();
        daysOfWeek.add(NO_SPEC);
        */
    }

    public Integer[] getMonthsValues() {
        Integer list[] = new Integer[12];
        for (int i = 0; i < 12; i++) {
            list[i] = new Integer(i + 1);
        }

        return list;
    }

    public String[] getMonthsLabels() {
        String vals[] = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November",
                "December"};
        return vals;
    }

    public Integer[] getMonths() {
        Integer list[] = new Integer[months.size()];
        if (months != null) {
            int i = 0;
            for (Iterator it = months.iterator(); it.hasNext(); i++) {
                list[i] = (Integer) it.next();
            }
        }
        return list;
    }

    public void setMonths(Integer[] val) {
        if (months != null) months.clear();
        else
            months = new TreeSet();

        for (int i = 0; i < val.length; i++) {
            months.add(val[i]);
        }
    }

    public String[] getDaysOfWeekLabels() {
        /*
        String list[] = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};
        */
        String list[] = {prop.getString("Sunday"), prop.getString("Monday"),prop.getString("Tuesday"),prop.getString("Wednesday"),
                         prop.getString("Thursday"),prop.getString("Friday"),prop.getString("Saturday")};
        return list;
    }

    public Integer[] getDaysOfWeekValues() {
        Integer list[] = new Integer[7];
        for (int i = 0; i < 7; i++)
            list[i] = new Integer(i + 1);
        return list;
    }

    public Integer[] getDaysOfWeek() {
        Integer list[] = new Integer[daysOfWeek.size()];
        if (daysOfWeek != null) {
            int i = 0;
            for (Iterator it = daysOfWeek.iterator(); it.hasNext(); i++) {
                list[i] = (Integer) it.next();
            }
        }
        return list;
    }

    public void setDaysOfWeek(Integer[] val) {
        if (daysOfWeek != null) daysOfWeek.clear();
        else
            daysOfWeek = new TreeSet();

        for (int i = 0; i < val.length; i++) {
            daysOfWeek.add(val[i]);
        }
        /*deleted by alessandro Colantoni
        daysOfMonth.clear();
        daysOfMonth.add(NO_SPEC);
        */
    }

    public Integer[] getYearsValues() {
        Integer list[] = new Integer[20];
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        for (int i = 0; i < 20; i++) {
            list[i] = new Integer(i + year);
        }

        return list;
    }

    public Integer[] getYearsLabels() {
        return getYearsValues();
    }

    public Integer[] getYears() {
        Integer list[] = new Integer[years.size()];
        if (years != null) {
            int i = 0;
            for (Iterator it = years.iterator(); it.hasNext(); i++) {
                list[i] = (Integer) it.next();
            }
        }
        return list;
    }

    public void setYears(Integer[] val) {
        if (years != null) years.clear();
        else
            years = new TreeSet();

        for (int i = 0; i < val.length; i++) {
            years.add(val[i]);
        }
    }
    /*****start added by alessandro Colantoni***********************************************************************************/
    private static ResourceBundle prop = ResourceBundle.getBundle("resources.application");

    private static final int EMPTY_INT = 1000;

    private static final Integer EMPTY = new Integer(EMPTY_INT);

    //private static final int NOTSELECTED = 0;
    private static final int NOTSELECTED = Integer.parseInt(prop.getString("escalationTime.not.selected"));
    /*
    private static final int HOUR = 1;

    private static final int DAY = 2;

    private static final int WEEK = 3;

    private static final int MONTH = 4;
    */
    private static final int SECONDS = 0;

    private static final int MINUTES = 1;

    private static final int HOUR = 2;

    private static final int DAY = 3;

    private static final int MONTH =4;

    private static final int WEEK = 5;

    private static final int YEAR = 6;

    //private static final Integer[] NO_SPEC_ARRAY = new Integer[1];

    private String[] cronExpressionArray = null;

    private Integer escalationTime = null;

    private Integer period = null;

    public String[] getEscalationTimeLabels() {
        //String list[] = {"","Hour", "Day", "Week", "Month"};
        String list[] = {"",prop.getString("Hour"), prop.getString("Day"), prop.getString("Week"), prop.getString("Month")};
        return list;
    }

    public Integer[] getEscalationTimeValues() {
        Integer list[] = new Integer[5];
        /*
        for (int i = 0; i <5; i++)
            list[i] = new Integer(i);
        */
        list[0] = new Integer(NOTSELECTED);
        list[1] = new Integer(HOUR);
        list[2] = new Integer(DAY);
        list[3] = new Integer(WEEK);
        list[4] = new Integer(MONTH);

        return list;
    }

    public Integer getEscalationTime() {
        return escalationTime;
    }

    public void setEscalationTime(Integer escalationTime) {
        this.escalationTime=escalationTime;

    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String[] getCronExpressionArray() {
        return cronExpressionArray;
    }

    public void setCronExpressionArray(String[] cronExpressionArray) {
        this.cronExpressionArray = cronExpressionArray;
    }

    public String buildCronExpression_old() throws ParseException{
        StringBuffer sb = new StringBuffer();
        sb.append(buildCronExpressionField(getSeconds()));
        sb.append(" ");
        sb.append(buildCronExpressionField(getMinutes()));
        sb.append(" ");
        sb.append(buildCronExpressionField(getHours(),HOUR));
        sb.append(" ");
        //if (escalationTime!=null && escalationTime.intValue()==DAY) sb.append("/");
        sb.append(buildCronExpressionField(getDaysOfMonth(),DAY));
        sb.append(" ");
        //if (escalationTime!=null && escalationTime.intValue()==MONTH) sb.append("/");
        sb.append(buildCronExpressionField(getMonths(),MONTH));
        sb.append(" ");
        //if (escalationTime!=null && escalationTime.intValue()==WEEK) sb.append("/");
        sb.append(buildCronExpressionField(getDaysOfWeek(),WEEK));
        sb.append(" ");
        //if (escalationTime!=null && escalationTime.intValue()==YEAR) sb.append("/");
        sb.append(buildCronExpressionField(getYears()));
        try{
            setCronExpression(sb.toString());
        }catch (ParseException e){
            throw new ParseException("ParseException in it.aco.mandragora.common.UICronTrigger.buildCronExpression(). ErrorOffset=",e.getErrorOffset());
        }
        return sb.toString();
    }

    public String buildCronExpression() throws ParseException{
        if (nothingSelected()) {
            setCronExpression(null);
            //setCronExpression((CronExpression)null);  // changed by ale on 19/02/2007  that's for quartz1.5.2
            return null;


        }
        StringBuffer sb = new StringBuffer();
        cronExpressionArray = new String[7];
        cronExpressionArray[0] = buildCronExpressionField(getSeconds());
        cronExpressionArray[1] = buildCronExpressionField(getMinutes());
        cronExpressionArray[2] = buildCronExpressionField(getHours(),HOUR);
        cronExpressionArray[3] = buildCronExpressionField(getDaysOfMonth(),DAY);
        cronExpressionArray[4] = buildCronExpressionField(getMonths(),MONTH);
        cronExpressionArray[5] = buildCronExpressionField(getDaysOfWeek(),WEEK);
        cronExpressionArray[6] = buildCronExpressionField(getYears());
/*
System.out.println("UICronExpression.buildCronExpression :getSeconds()"+getSeconds());
System.out.println("UICronExpression.buildCronExpression :getMinutes()"+getMinutes());
System.out.println("UICronExpression.buildCronExpression :getHours()"+getHours());
System.out.println("UICronExpression.buildCronExpression :getDaysOfMonth()"+getDaysOfMonth());
System.out.println("UICronExpression.buildCronExpression :getMonths()"+getMonths());
System.out.println("UICronExpression.buildCronExpression :getDaysOfWeek()"+getDaysOfWeek());
System.out.println("UICronExpression.buildCronExpression :getYears()"+getYears());
*/
        if (escalationTime!=null  && escalationTime.intValue()==HOUR){
            cronExpressionArray[3]="*";
            cronExpressionArray[4]="*";
            cronExpressionArray[5]="?";
        }
        if (escalationTime!=null && escalationTime.intValue()==DAY){
            cronExpressionArray[4]="*";
            cronExpressionArray[5]="?";
        }
        if (escalationTime!=null && escalationTime.intValue()==MONTH){
            cronExpressionArray[3]="1"; // the first day of the month
            cronExpressionArray[5]="?";
        }
        if (escalationTime!=null && escalationTime.intValue()==WEEK){
            cronExpressionArray[3]="?";
            cronExpressionArray[4]="*";
            /*
            cronExpressionArray[3]="1/"+(getPeriod().intValue()*7);

            cronExpressionArray[4]="*";
            cronExpressionArray[5]="?";
            */
        }

        if (cronExpressionArray[3].equals("?")){
            Integer[] noSpecArray = new Integer[1] ;
            noSpecArray[0] = NO_SPEC;
            setDaysOfMonth(noSpecArray);
        }
        if (cronExpressionArray[5].equals("?")){
            Integer[] noSpecArray = new Integer[1] ;
            noSpecArray[0] = NO_SPEC;
            setDaysOfWeek(noSpecArray);
        }
        for(int i=0; i<7; i++){
            sb.append(cronExpressionArray[i]);
            if (i<6)sb.append(" ");
        }

        try{
//System.out.println("UICronTrigger.buildCronExpression :sb= "+sb.toString());
            setCronExpression(sb.toString());
        }catch (ParseException e){
            throw new ParseException("ParseException in it.aco.mandragora.common.UICronTrigger.buildCronExpression(). ErrorOffset="+e.getErrorOffset(),e.getErrorOffset());
        }
        return sb.toString();
    }

    private String buildCronExpressionField(Integer[] field) {
        StringBuffer sb = new StringBuffer();
        /*
        if (field[field.length-1].compareTo(ALL_SPEC)==0)  {
            return "* ";
        } else if (field[field.length-1].compareTo(NO_SPEC)==0){
            return "? ";
        } else { */
            for(int i=0; i<field.length-1;i++){
               if (field[i].compareTo(ALL_SPEC)==0)return "*";
               //if (field[i].compareTo(NO_SPEC)==0)return "?";
               if (field[i].compareTo(NO_SPEC)==0||field[i].compareTo(new Integer(NOTSELECTED))==0)return "?";
               sb.append(field[i].toString());
               sb.append(",");
            }
            if (field[field.length-1].compareTo(ALL_SPEC)==0)return "*";
            //if (field[field.length-1].compareTo(NO_SPEC)==0)return "?";
            if (field[field.length-1].compareTo(NO_SPEC)==0||field[field.length-1].compareTo(new Integer(NOTSELECTED))==0)return "?";
            sb.append(field[field.length-1].toString());

        //}

        return sb.toString();
    }

    private String buildCronExpressionField(Integer[] fieldValues, int field ) {
        StringBuffer sb = new StringBuffer();

        if (escalationTime!=null && escalationTime.intValue()==field){
            return "*/"+getPeriod().intValue();
            //return "0/"+getPeriod().intValue();
        }
/*
        if (fieldValues[0].compareTo(ALL_SPEC)==0)  {
            return "* ";
        } else if (fieldValues[0].compareTo(NO_SPEC)==0){
            return "? ";
        } else {
            for(int i=0; i<fieldValues.length-1;i++){
               sb.append(fieldValues[i].toString());
               sb.append(",");
            }
            sb.append(fieldValues[fieldValues.length-1].toString());

        }
        return sb.toString();
*/
        return buildCronExpressionField(fieldValues);
    }

    private boolean nothingSelected(){
//System.out.println("------------------->UICronTrigger.nothingSelected daysOfWeek "+((daysOfWeek==null)?" daysOfWeek==null ":daysOfWeek.toString()));
//System.out.println("------------------->UICronTrigger.nothingSelected daysOfMonth"+((daysOfMonth==null)?" daysOfMonth==null ":daysOfMonth.toString())) ;
//System.out.println("------------------->UICronTrigger.nothingSelected escalationTime"+((escalationTime==null)?" escalationTime==null ":""+escalationTime.intValue())) ;
        //if (escalationTime.intValue()==NOTSELECTED && getDaysOfMonth()[0].intValue()==NOTSELECTED && getDaysOfWeek()[0].intValue()==NOTSELECTED) return true;
        // note that hours doesn't appear. If just hours is selected, that's threated ad if  nothing selected
        if (escalationTime.intValue()==NOTSELECTED && (getDaysOfMonth()[0].intValue()==NOTSELECTED || getDaysOfMonth()[0].intValue()==NO_SPEC_INT)&& (getDaysOfWeek()[0].intValue()==NOTSELECTED || getDaysOfWeek()[0].intValue()==NO_SPEC_INT)) return true;
        return false;
    }

    public void setCronExpression(String cronExpression) throws ParseException{
        if (cronExpression!=null){
            super.setCronExpression(cronExpression);
            this.cronExpression = super.getCronExpression();
            setCronFieldsByCronExpression();

        } else this.cronExpression =null;


    }

    public String getCronExpression(){
        return this.cronExpression;
    }

    public void setCronFieldsByCronExpression(){
        boolean periodic =  getCronExpression().indexOf("/")>=0;
        cronExpressionArray=getCronExpression().split(" ");

        for(int i=0 ; i<7; i++){
            int indexOf = cronExpressionArray[i].indexOf("/");
            if (indexOf>=0){
                setPeriod(new Integer(cronExpressionArray[i].substring(indexOf+1)));
                //setEscalationTime(new Integer(cronExpressionArray[i].substring(0,indexOf)));
                setEscalationTime(new Integer(i));
            }else{
                //if(!periodic)setCronField(i,cronExpressionArray[i]); deleted by alex on 19-02-2007
                // start addeb by alex on  19-02-2007
                if(!periodic || i==HOUR){
                    setCronField(i,cronExpressionArray[i]);
                }
                // end addeb by alex on  19-02-2007
            }
        }
    }

    private void setCronField(int fieldNuber,String cronExpressionField){
        String[]  arrayOfString = cronExpressionField.split(",");
        Integer[] arrayOfInteger = new Integer[arrayOfString.length];
        if (cronExpressionField.equals("*")){
            arrayOfInteger[0]=ALL_SPEC;
        } else if (cronExpressionField.equals("?")){
            arrayOfInteger[0]=NO_SPEC;
        } else{
            for (int i=0;i<arrayOfString.length;i++){
                arrayOfInteger[i]=new Integer(arrayOfString[i]);
            }
        }
        switch (fieldNuber){
            case SECONDS: {
                setSeconds(arrayOfInteger);
                break;
            }
            case MINUTES: {
                setMinutes(arrayOfInteger);
                break;
            }
            case HOUR: {
                setHours(arrayOfInteger);
                break;
            }
            case DAY: {
                setDaysOfMonth(arrayOfInteger);
                break;
            }
            case MONTH: {
                setMonths(arrayOfInteger);
                break;
            }
            case WEEK: {
                setDaysOfWeek(arrayOfInteger);
                break;
            }
            case YEAR: {
                setYears(arrayOfInteger);
                break;
            }
        }
    }

    //start added by alessandro on 21-02-2007
    public String[] getHoursSelectedLabels() {
        String[] hoursSelectedLabels;
        Integer[] hours= getHours();
        if  (hours==null || hours.length==0 || hours[0].intValue()==NOTSELECTED || hours[0].intValue()==NO_SPEC_INT) {
            hoursSelectedLabels = new String[0];
        }  else{
            String[] hoursLabels = getHoursLabels();
            hoursSelectedLabels = new String[hours.length];
            for (int i=0; i<hours.length;i++ ){
                //hoursSelectedLabels[i] = hoursLabels[hours[i].intValue()-1];
                hoursSelectedLabels[i] = hoursLabels[hours[i].intValue()];
            }
        }
        return hoursSelectedLabels;
    }
    //end added by alessandro on 21-02-2007

    public String[] getDaysOfWeekSelectedLabels() {
        String[] daysOfWeekSelectedLabels;
        Integer[] daysOfWeek = getDaysOfWeek();
        if  (daysOfWeek==null || daysOfWeek.length==0 || daysOfWeek[0].intValue()==NOTSELECTED || daysOfWeek[0].intValue()==NO_SPEC_INT) {
            daysOfWeekSelectedLabels = new String[0];
        }  else{
            String[] daysOfWeekLabels = getDaysOfWeekLabels();
            //Integer[] daysOfWeekValues = getDaysOfWeekValues();
            //Integer[] daysOfWeek = getDaysOfWeek();

            daysOfWeekSelectedLabels = new String[daysOfWeek.length];
//System.out.println("------------------->UICronTrigger.getDaysOfWeekSelectedLabels daysOfWeekValues"+daysOfWeek) ;
            for (int i=0; i<daysOfWeek.length;i++ ){
//System.out.println("------------------->UICronTrigger.getDaysOfWeekSelectedLabels daysOfWeekValues["+i+"] ="+daysOfWeek[i].intValue()) ;

                daysOfWeekSelectedLabels[i] = daysOfWeekLabels[daysOfWeek[i].intValue()-1];
            }
//System.out.println("------------------->UICronTrigger.getDaysOfWeekSelectedLabels daysOfWeekSelectedLabels ="+daysOfWeekSelectedLabels.toString());
        }
        return daysOfWeekSelectedLabels;

    }

    public Integer[] getDaysOfMonthSelectedLabels() {
        Integer[] daysOfMonthSelectedLabels;
        Integer[] daysOfMonth = getDaysOfMonth();
        if  (daysOfMonth==null || daysOfMonth.length==0 || daysOfMonth[0].intValue()==NOTSELECTED || daysOfMonth[0].intValue()==NO_SPEC_INT) {
            daysOfMonthSelectedLabels = new Integer[0];
        }else{


            Integer[] daysOfMonthLabels = getDaysOfMonthLabels();
            //Integer[] daysOfMonth = getDaysOfMonth();
            daysOfMonthSelectedLabels = new Integer[daysOfMonth.length];
            for (int i=0; i<daysOfMonth.length;i++ ){
                daysOfMonthSelectedLabels[i] = daysOfMonthLabels[daysOfMonth[i].intValue()-1];
            }
        }
        return daysOfMonthSelectedLabels;
    }

    public String getEscalationTimeSelectedLabel() {
        String escalationTimeSelectedLabel ="";
        Integer escalationTime =getEscalationTime();
        if  (escalationTime==null  || escalationTime.intValue()==NOTSELECTED) {
            escalationTimeSelectedLabel = "";
        }  else{
            String[] escalationTimeLabels = getEscalationTimeLabels();
            switch(escalationTime.intValue()){
                case HOUR  : {
                    escalationTimeSelectedLabel = escalationTimeLabels[1];
                    break;
                }
                case DAY  : {
                    escalationTimeSelectedLabel = escalationTimeLabels[2];
                    break;
                }
                case WEEK  : {
                    escalationTimeSelectedLabel = escalationTimeLabels[3];
                    break;
                }
                case MONTH  : {
                    escalationTimeSelectedLabel = escalationTimeLabels[4];
                    break;
                }
            }
        }
        return escalationTimeSelectedLabel;
    }
   /*****end added by alessandro Colantoni***********************************************************************************/
    public static void main(String[] argv) {
        CronTrigger ct = new CronTrigger("a", "a");

        try {
            ct.setCronExpression("0 * * * * ? *");
        } catch (ParseException e) {
            //            log.error("caught an exception", e);
        }
        ct.setStartTime(new Date());
        ct.setTimeZone(TimeZone.getDefault());
        System.out.println(ct.getExpressionSummary());
        ct.computeFirstFireTime(null);

        UICronTrigger uict = new UICronTrigger("a", "a");
        Integer set[] = new Integer[1];
        set[0] = new Integer(1);
        uict.setSeconds(set);
        System.out.println(ct.getExpressionSummary());
        uict.computeFirstFireTime(null);

    }
}
