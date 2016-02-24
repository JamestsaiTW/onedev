package com.pmease.gitplex.core.manager;

import com.pmease.gitplex.core.entity.Comment;
import com.pmease.gitplex.core.entity.CommentReply;
import com.pmease.gitplex.core.entity.Depot;
import com.pmease.gitplex.core.entity.PullRequest;
import com.pmease.gitplex.core.entity.User;

public interface UrlManager {
	
	String urlFor(User user);
	
	String urlFor(Depot depot);
	
	String urlFor(PullRequest request);
	
	String urlFor(Comment comment);
	
	String urlFor(CommentReply reply);
}
