/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yaopeixinmac
 */
public class CommunityCatalog {
       private List<Community> communityCatalog;
        public CommunityCatalog() {
        communityCatalog = new ArrayList<Community>();
    }

    public List<Community> getCommunityCatalog() {
        return communityCatalog;
    }

    public void setCommunityCatalog(List<Community> communityCatalog) {
        this.communityCatalog = communityCatalog;
    }
  public Community addCommunity() {
        Community c = new Community();
        communityCatalog.add(c);
        return c;
    }

    public void removeCommunity(Community c) {
        communityCatalog.remove(c);
    }

    public Community searchCommunity(String communityName) {
        for (Community community : communityCatalog) {
            if (community.getCommunityName().equals(communityName)) {
                return community;
            }
        }
        return null;
    }
      public void addCommunity(Community c) {
        communityCatalog.add(c);
    }
}
