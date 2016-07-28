package com.ullink.slack.simpleslackapi.events;

import com.ullink.slack.simpleslackapi.SlackUser;

public interface SlackChannelLeft extends SlackChannelEvent {

    SlackUser getSlackUser();
}
