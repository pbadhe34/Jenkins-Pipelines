Stage1: HTML Ui page development via TDD
 
//Create a new local git repository and copy the files  and dirs manually to it.  
//THe test/com/server/TestHttpLoginPage.java and WebContent/userLogin.html files
//Switch to Git Repos dierctory created.
//Run the command as  'git add .' to add all from current dir
 //OR git add test/com/server/TestHttpLoginPage.java
//and  git add WebContent/userLogin.html

//View these files into the Git Repositories view

//Add a comment to the files added
//git commit -m "Initial Test login page and html page commit"

 From Eclipse : Add and commit to GIT repos
 /*
  * To add and coommit to the remote repository select the git repository view
  * Right click and select the 'Remotes' folder in view and select create remote
  * OR right click the repose dir and select push branch master 
  * and configure the url and already selected branch master and specify userid and
  * password and select next to push. 
  * 
  * OR select -->remote push 
  * and in next screen view configure PUsh URL of repois as
  * http://admin@localhost:1100/gitblit/r/testLogin.git
  *  and in next screen select the source and desitnation references as refs/heads/master to sepcify the master branch
  *  and click on add 'All Branches Specific' button.
  *  Click next to specify user id and password of repois as admin and admin.  *    *   
  *   
  *   On the remote repos url you can see the comments added in Commit  and the files in tree section.
  */

Stage2: Service code development by TDD
////Create a new local git repository test-login-stage2
//-->git init
//and copy the test and com dir from current project to it manually   
//THe fiiles copied are test/com/server/TestLoginServlet.java,TestUserService.java and com/server/LoginSerevclet.java and  com/data/service *.java files
//Open the terminal and Switch to New Git Repos dierctory created.
 
//Run folowing commands
//git add test/com/server/TestLoginServlet.java
//git add test/com/server/TestUserService.java
//git add com/server/LoginServlet.java
//git add com/data/service/UserService.java   //Ignore warning related to CRLF characters
//git add com/data/service/UserServiceImpl.java


//View these files into the Git Repositories view

//Add a comment to the files added
//git commit -m "The  login  classes to commit"

//To update existing file and then commit
//git add <path/filename>
//git commit -m <message>

//To get the recent status with commit or files added for staging 
//git status

/*To list the remotes configred with local current repos
 * git remote -v
 * 
 * 
 * To add a new remote, use the git remote add command on the terminal, 
 * in the directory your repository is stored at.
 * A remote name, for example, origin and 
   A remote URL, for example, https://github.com/user/repo.git
 * 
 * git remote add master http://admin@localhost:1100/gitblit/r/testLogin.git
 * 
 * git remote -v
 * 

The git remote set-url command takes two arguments:

A remote name, for example, origin
A remote URL, for example, https://github.com/user/repo.git
 * To configure remote repos url
 * The 'git remote set-url' command changes an existing remote repository URL.
 * The git remote set-url command takes two arguments:

An existing remote name. For example, origin or upstream are two common choices.
To chnage with new URL for the remote. For example:

 git remote set-url master http://admin@localhost:1100/gitblit/r/testLogin.git
 
 After this the next time you git fetch, git pull, or git push to the remote repository, 
 you'll be asked for your GitHub username and password.

 */
*  
* Undo a commit and redo
$ git commit -m "Something terribly misguided"              (1)
$ git reset HEAD~                                           (2)
<< edit files as necessary >>                               (3)
$ git add ...                                               (4)
$ git commit -c ORIG_HEAD   

* http://admin@localhost:1100/gitblit/r/testLogin.git
* 
*       *   
*   
*   On the remote repos url you can see the comments added in Commit  and the files in tree section.
*   
*   The command  'git status'  shows  the files  changed since the last push
*   
* Very simple. Just follow these procedure:
1. git status
2. git add {File_Name} //the file name you haven been changed
3. git status
4. git commit -m '{your_message}'
5. git push origin master
*/

		

/*
* To add and coommit to the remote repository select the git repository view
* Right click and select the 'Remotes' folder in view and select create remote
* OR right click the repose dir and select push branch master 
* and configure the url and already selected branch master and specify userid and
* password and select next to push. 
* 
* PUSHING THIS NEW INTERGATED REPOSITORY TO EXISTING, WILL FAIL.
* 
* Use git push to push commits made on your local branch to a remote repository.
*  The git push command takes two arguments: A remote name, for example, origin. A branch name, for example, master.
-->git push origin master
*  
* To push to remote repository which is alreday existing brnach error : fast-forwradb update failed.
* Usually this is caused by another user pushing to the same branch. You can remedy this by 
* fetching and merging the remote branch, or using pull to perform both at once.
*  
* It means there have been other commits pushed to the remote repository that differ 
* from your commits.  
* 
* The git pull is shorthand for git fetch followed by git merge FETCH_HEAD . 
* More precisely, git pull runs git fetch with the given parameters and calls git merge to merge the
*  retrieved branch heads into the current branch. ... <repository> should be the name of a remote repository 
*  as passed to git-fetch[1].

The git pull internally uses( git fetch + git merge )
The git pull and clone are  basically the same, except clone will setup additional remote tracking branches,
 not just master.
 
 git fetch --all sets up additional remote tracking branches
 
 Git Clone : Clones a repository into a newly created directory, creates remote-tracking branches for each branch 
 in the cloned repository (visible using git branch -r), and creates and checks out an initial branch that is 
 forked from the cloned repository's currently active branch.
 
git pull master master --allow-unrelated-histories
before you push

you might want to use force with push operation in this case

git push origin master --force

To pull and update and push new changes
git pull master master
git push master master

********************

Stage3: Intergattion of service code and html ui pages code


Instead of Pull/Fetech and commit and Push to nthe same branch the whole code.
Leave the master branch of remote repositoty empty.Do not add or push anything NOW to it.
Push the HTML Code : Stage1 : Push to html-ui branch of the remote repository.
Push the service code : Stage2 : Push the Service code to service branch of the remote repository.
To intrgarte the service code and html ui code together in
________________________________
 Stage3 of development
__________________________________

Create a new local git repository to receive files from remote repoisitory
->git init
Create a remote repos and add remote repository URL
-->git remote add remote-repos http://admin@localhost:1100/gitblit/r/LoginApp-Repos.git
Verify the remote 
-->git remote -v

Fetch the branches files from remote-repos
-->git fetch remote-repos refs/heads/html-code:refs/heads/html-ui
One more fetch for service code
-->git fetch remote-repos refs/heads/service-code:refs/heads/service-local
Two new local branches will get creayted in current repos.Verify
-->git branch
html-ui
service-local
Create New Web application Project to define the Code intergation from above two branches and init git repos in it.
Now checkout the code files from html-ui branch of the stage3 repository.

-->git remote add remote-repos http://admin@localhost:1100/gitblit/r/LoginApp-Repos.git
 
git remote show  remote-repos 

Switch the local branch
-->git checkout html-ui
Fetch remote branch html_code into local master branch
-->git fetch remote-repos refs/heads/html-code:refs/heads/master
Switch the local branch master
-->git checkout master
Merge the html-ui local branch to master branch
-->git merge html-ui
Merge the service-local local branch to master branch
-->git merge service-local
 Fatal: refusing to merge unrelated histories
 -->git merge service-local --allow-unrelated-histories
 Delete the other two local branches which have been merged into master branch.
 -->git branch -d html-ui
 -->git branch -d service-local

Push the current local master branch to the remote repositiory master branch after the local merge of other branches into master branch.
 
 For Dynamic web application project created in Eclipse(Intergation Project)
 Run the following commands in project dir TO CREATE,INIT,FETCCH AND MERGE AND 	finally test all siatuiations.
 git init
 git remote add remote-repos http://admin@localhost:1100/gitblit/r/LoginApp-Repos.git
 git fetch remote-repos refs/heads/html-code:refs/heads/html-ui
 git fetch remote-repos refs/heads/service-code:refs/heads/service-local
 git checkout html-ui  : To switch the current active branch  
 git branch -av
 git branch master 
 git checkout master
 git merge html-ui
 git merge service-local
 git merge service-local --allow-unrelated-histories
 git branch -av
 git branch -d html-ui
 
 After testing from build,test,analyse,deploy,acceptance test ,use  git add . to add staging and commit all files.
 Now push this local current repository master branch to remote repository.
 -->git remote add webCode http://admin@localhost:1100/gitblit/r/LoginApp-Repos.git
 Push the master branch to remote repository master branch.
 -->git push webCode master


******************************


