package com.fongmi.android.tv.bean;

import android.text.TextUtils;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.Collections;
import java.util.List;

@Root(name = "tv", strict = false)
public class Tv {

    @ElementList(entry = "channel", inline = true)
    private List<Channel> channel;

    @ElementList(entry = "programme", inline = true)
    private List<Programme> programme;

    public List<Channel> getChannel() {
        return channel == null ? Collections.emptyList() : channel;
    }

    public List<Programme> getProgramme() {
        return programme == null ? Collections.emptyList() : programme;
    }

    @Root(name = "channel")
    public static class Channel {

        @Attribute(name = "id")
        private String id;

        @Element(name = "display-name")
        private String displayName;

        public String getId() {
            return TextUtils.isEmpty(id) ? "" : id;
        }

        public String getDisplayName() {
            return TextUtils.isEmpty(displayName) ? "" : displayName;
        }
    }

    @Root(name = "programme")
    public static class Programme {

        @Attribute(name = "start")
        private String start;

        @Attribute(name = "stop")
        private String stop;

        @Attribute(name = "channel")
        private String channel;

        @Element(name = "title")
        private String title;

        public String getStart() {
            return start;
        }

        public String getStop() {
            return stop;
        }

        public String getChannel() {
            return channel;
        }

        public String getTitle() {
            return title;
        }
    }
}