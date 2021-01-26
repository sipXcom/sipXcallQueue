package org.sipfoundry.sipxconfig.callqueue.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import org.sipfoundry.sipxconfig.api.model.SettingsList;
import org.sipfoundry.sipxconfig.branch.Branch;
import org.sipfoundry.sipxconfig.callqueue.CallQueue;

@XmlRootElement(name = "queue")
public class CallQueueBean {
    private int m_id;
    private boolean m_enabled;
    private SettingsList m_settingsList;
    private String m_name;
    private String m_description;
    private String m_extension;
    private String m_didNumber;
    private List<String> m_locations = new ArrayList<String>();
    private String m_strategy;
    private String m_welcomeAudio;
    private String m_goodbyeAudio;
    private String m_queueAudio;
    private String m_breakawayDigit;
    private String m_transferTo;
    private boolean m_recordCalls;
    private String m_recordCallsDirectory;
    private boolean m_applyTierRules;
    private int m_escalationWait;
    private boolean m_tierRuleWaitMultiply;
    private boolean m_tierRuleNoAgentNoWait;
    private int m_maximumWaitTime;
    private int m_maximumWaitTimeNoAgent;
    private int m_maximumWaitTimeNoAgentTimeReached;
    public int getId() {
        return m_id;
    }
    public void setId(int id) {
        m_id = id;
    }
    public boolean isEnabled() {
        return m_enabled;
    }
    public void setEnabled(boolean enabled) {
        m_enabled = enabled;
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
    public String getDidNumber() {
        return m_didNumber;
    }
    public void setDidNumber(String didNumber) {
        m_didNumber = didNumber;
    }
    public List<String> getLocations() {
        return m_locations;
    }
    public void setLocations(List<String> locations) {
        m_locations = locations;
    }
    public String getStrategy() {
        return m_strategy;
    }
    public void setStrategy(String strategy) {
        m_strategy = strategy;
    }
    public String getWelcomeAudio() {
        return m_welcomeAudio;
    }
    public void setWelcomeAudio(String welcomeAudio) {
        m_welcomeAudio = welcomeAudio;
    }
    public String getGoodbyeAudio() {
        return m_goodbyeAudio;
    }
    public void setGoodbyeAudio(String goodbyeAudio) {
        m_goodbyeAudio = goodbyeAudio;
    }
    public String getQueueAudio() {
        return m_queueAudio;
    }
    public void setQueueAudio(String queueAudio) {
        m_queueAudio = queueAudio;
    }
    public String getBreakawayDigit() {
        return m_breakawayDigit;
    }
    public void setBreakawayDigit(String breakawayDigit) {
        m_breakawayDigit = breakawayDigit;
    }
    public String getTransferTo() {
        return m_transferTo;
    }
    public void setTransferTo(String transferTo) {
        m_transferTo = transferTo;
    }
    public boolean isRecordCalls() {
        return m_recordCalls;
    }
    public void setRecordCalls(boolean recordCalls) {
        m_recordCalls = recordCalls;
    }
    public String getRecordCallsDirectory() {
        return m_recordCallsDirectory;
    }
    public void setRecordCallsDirectory(String recordCallsDirectory) {
        m_recordCallsDirectory = recordCallsDirectory;
    }
    public boolean isApplyTierRules() {
        return m_applyTierRules;
    }
    public void setApplyTierRules(boolean applyTierRules) {
        m_applyTierRules = applyTierRules;
    }
    public int getEscalationWait() {
        return m_escalationWait;
    }
    public void setEscalationWait(int escalationWait) {
        m_escalationWait = escalationWait;
    }
    public boolean isTierRuleWaitMultiply() {
        return m_tierRuleWaitMultiply;
    }
    public void setTierRuleWaitMultiply(boolean tierRuleWaitMultiply) {
        m_tierRuleWaitMultiply = tierRuleWaitMultiply;
    }
    public boolean isTierRuleNoAgentNoWait() {
        return m_tierRuleNoAgentNoWait;
    }
    public void setTierRuleNoAgentNoWait(boolean tierRuleNoAgentNoWait) {
        m_tierRuleNoAgentNoWait = tierRuleNoAgentNoWait;
    }
    public int getMaximumWaitTime() {
        return m_maximumWaitTime;
    }
    public void setMaximumWaitTime(int maximumWaitTime) {
        m_maximumWaitTime = maximumWaitTime;
    }
    public int getMaximumWaitTimeNoAgent() {
        return m_maximumWaitTimeNoAgent;
    }
    public void setMaximumWaitTimeNoAgent(int maximumWaitTimeNoAgent) {
        m_maximumWaitTimeNoAgent = maximumWaitTimeNoAgent;
    }
    public int getMaximumWaitTimeNoAgentTimeReached() {
        return m_maximumWaitTimeNoAgentTimeReached;
    }
    public void setMaximumWaitTimeNoAgentTimeReached(int maximumWaitTimeNoAgentTimeReached) {
        m_maximumWaitTimeNoAgentTimeReached = maximumWaitTimeNoAgentTimeReached;
    }   
    public SettingsList getSettingsList() {
        return m_settingsList;
    }
    public void setSettingsList(SettingsList settingsList) {
        m_settingsList = settingsList;
    }
    
    public static CallQueueBean convertQueue(CallQueue callQueue) {
        CallQueueBean bean = new CallQueueBean();
        bean.setId(callQueue.getId());
        bean.setName(callQueue.getName());
        bean.setDidNumber(callQueue.getDid());
        bean.setEnabled(callQueue.isEnabled());
        bean.setExtension(callQueue.getExtension());
        bean.setSettingsList(SettingsList.convertSettingsList(callQueue.getSettings(), Locale.ENGLISH));
        Set<Branch> locations = callQueue.getLocations();
        List<String> locationNames = new ArrayList<String>();
        for (Branch location : locations) {
            locationNames.add(location.getName());
        }
        bean.setLocations(locationNames);
        return bean;
    }
}
