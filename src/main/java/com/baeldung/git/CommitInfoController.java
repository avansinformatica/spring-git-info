package com.baeldung.git;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CommitInfoController {

//    @Value("${git.commit.time}")
    private String commitMessage;

//    @Value("${git.branch}")
    private String branch;

//    @Value("${git.remote.origin.url}")
    private String remoteOriginUrl;

//    @Value("${git.commit.id}")
    private String commitId;

//    @Value("${git.commit.user.name}")
    private String gitUser;

//    @Value("${info.project.artifact}")
    private String projectArtifact;

    @RequestMapping("/commitId")
    public Map<String, String> getCommitId() {
        Map<String, String> result = new HashMap<>();
        result.put("Commit message", commitMessage);
        result.put("Commit branch", branch);
        result.put("Commit id", commitId);
        result.put("user", gitUser);

        result.put("Info project artifact", projectArtifact);
        return result;
    }
}