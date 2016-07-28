package com.ullink.slack.simpleslackapi.events;

import com.ullink.slack.simpleslackapi.SlackUser;

public interface SlackChannelJoined extends SlackChannelEvent {

    SlackUser getSlackUser();
}
