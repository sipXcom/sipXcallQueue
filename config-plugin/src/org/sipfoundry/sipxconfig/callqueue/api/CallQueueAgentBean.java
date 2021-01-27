package org.sipfoundry.sipxconfig.callqueue.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.sipfoundry.sipxconfig.api.model.SettingsList;
import org.sipfoundry.sipxconfig.branch.Branch;
import org.sipfoundry.sipxconfig.callqueue.CallQueue;
import org.sipfoundry.sipxconfig.callqueue.CallQueueAgent;

public class CallQueueAgentBean {
    private int m_id;
    private String m_name;
    private String m_extension;
    private String m_description;
    private String m_state;
    private String m_extensionStatus;
    private SettingsList m_settingsList;
    private boolean m_alwaysAvailable;
    private boolean m_useAgentDefaults;
    private boolean m_followCallForwarding;
    private int m_maxNoAnswer;
    private int m_wrapUpTime;
    private int m_rejectDelayTime;
    private int m_busyDelayTime;
    private int m_noAnswerDelayTime;
    private int m_callTimeout;
    public int getId() {
        return m_id;
    }
    public void setId(int id) {
        m_id = id;
    }
    public String getName() {
        return m_name;
    }
    public void setName(String name) {
        m_name = name;
    }
    public String getDescription() {
        return m_description;
    }
    public void setDescription(String description) {
        m_description = description;
    }   
    public String getExtension() {
        return m_extension;
    }
    public void setExtension(String extension) {
        m_extension = extension;
    }
    public String getState() {
        return m_state;
    }
    public void setState(String state) {
        m_state = state;
    }
    public String getExtensionStatus() {
        return m_extensionStatus;
    }
    public void setExtensionStatus(String extensionStatus) {
        m_extensionStatus = extensionStatus;
    }
    public boolean isAlwaysAvailable() {
        return m_alwaysAvailable;
    }
    public void setAlwaysAvailable(boolean alwaysAvailable) {
        m_alwaysAvailable = alwaysAvailable;
    }
    public boolean isUseAgentDefaults() {
        return m_useAgentDefaults;
    }
    public void setUseAgentDefaults(boolean useAgentDefaults) {
        m_useAgentDefaults = useAgentDefaults;
    }
    public boolean isFollowCallForwarding() {
        return m_followCallForwarding;
    }
    public void setFollowCallForwarding(boolean followCallForwarding) {
        m_followCallForwarding = followCallForwarding;
    }
    public int getMaxNoAnswer() {
        return m_maxNoAnswer;
    }
    public void setMaxNoAnswer(int maxNoAnswer) {
        m_maxNoAnswer = maxNoAnswer;
    }
    public int getWrapUpTime() {
        return m_wrapUpTime;
    }
    public void setWrapUpTime(int wrapUpTime) {
        m_wrapUpTime = wrapUpTime;
    }
    public int getRejectDelayTime() {
        return m_rejectDelayTime;
    }
    public void setRejectDelayTime(int rejectDelayTime) {
        m_rejectDelayTime = rejectDelayTime;
    }
    public int getBusyDelayTime() {
        return m_busyDelayTime;
    }
    public void setBusyDelayTime(int busyDelayTime) {
        m_busyDelayTime = busyDelayTime;
    }
    public int getNoAnswerDelayTime() {
        return m_noAnswerDelayTime;
    }
    public void setNoAnswerDelayTime(int noAnswerDelayTime) {
        m_noAnswerDelayTime = noAnswerDelayTime;
    }
    public int getCallTimeout() {
        return m_callTimeout;
    }
    public void setCallTimeout(int callTimeout) {
        m_callTimeout = callTimeout;
    }
    public SettingsList getSettingsList() {
        return m_settingsList;
    }
    public void setSettingsList(SettingsList settingsList) {
        m_settingsList = settingsList;
    }
    public static CallQueueAgentBean convertQueue(CallQueueAgent callQueueAgent) {
        CallQueueAgentBean bean = new CallQueueAgentBean();
        bean.setId(callQueueAgent.getId());
        bean.setName(callQueueAgent.getName());
        bean.setExtension(callQueueAgent.getExtension());
        bean.setDescription(callQueueAgent.getDescription());
        bean.setState(callQueueAgent.getState());
        bean.setSettingsList(SettingsList.convertSettingsList(callQueueAgent.getSettings(), Locale.ENGLISH));
        return bean;
    }
}
