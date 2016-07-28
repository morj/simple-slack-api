package com.ullink.slack.simpleslackapi.impl;

import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackUser;
import com.ullink.slack.simpleslackapi.events.SlackEventType;
import com.ullink.slack.simpleslackapi.events.SlackChannelLeft;

class SlackChannelLeftImpl implements SlackChannelLeft {
    private SlackChannel slackChannel;
    private SlackUser slackUser;

    SlackChannelLeftImpl(SlackChannel slackChannel, SlackUser slackUser)
    {
        this.slackChannel = slackChannel;
        this.slackUser = slackUser;
    }

    @Override
    public SlackChannel getSlackChannel()
    {
        return slackChannel;
    }

    void setSlackChannel(SlackChannel slackChannel)
    {
        this.slackChannel = slackChannel;
    }

    @Override
    public SlackUser getSlackUser() {
        return slackUser;
    }

    void setSlackUser(SlackUser slackUser) {
        this.slackUser = slackUser;
    }

    @Override
    public SlackEventType getEventType()
    {
        return SlackEventType.SLACK_CHANNEL_LEFT;
    }

}
