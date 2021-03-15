For manual intergation of mutiple branches from GIT repository
In the Intergation Stage Project
-->Add remote repository URL
-->Pull/Fetch specific brnach from remote
-->Pull/Fetch another brnach from remote

-->Merge the pulled btanches in ,master.
-->Upodate master branch with chbnages and commit locally.
-->Push the master brnach to remote repositotys master brnach.

These above manual actions will be automated in jenkins
Steps
Specify the SCM git URL with login credentils as trigger point
Configure to monitor multiple branches(Brnaches to build opytion)
As additional behaviour select 'Mmerge before Build' and 
specify the brnaches to merge with Branch to merge to (main or master) branch.
As additional behaviour  Select 'Checkout to Specific local Branch' and specify the branch as main or master.
As part of build step after the build script execution(i.e. ant or maven for example),add as build action-->Execute windows batch command and specify the push action as shown in the command window section

git push http://admin@localhost:1100/gitblit/r/WebLoginApp.git refs/heads/master:refs/heads/master

This will alos ensure that in case of any children brnaches upadte,Jenkins will pull those modified brnaches into local workspace,merge with master(main) branch in local repos and invoke the build aaction.If everything goes success,it will push the local master to remote master.
