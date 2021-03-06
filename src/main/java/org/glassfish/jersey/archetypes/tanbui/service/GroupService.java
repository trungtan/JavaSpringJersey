package org.glassfish.jersey.archetypes.tanbui.service;

import org.glassfish.jersey.archetypes.tanbui.entity.Group;
import org.glassfish.jersey.archetypes.tanbui.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public class GroupService {
    @Autowired
    private GroupRepository groupRepository;

    public List<Group> getGroups(int page, int size) {
        return groupRepository.findAll(new PageRequest(page, size)).getContent();
    }

    public Group getGroup(String groupId) {
        return groupRepository.findOne(groupId);
    }

    public List<Group> getGroupsByName(String name) {
        return groupRepository.findAllByName(name);
    }
}
