
Create a New account on GitHub if you donot have it.

----------------------------------------
From cmd Line
 
 git init

 git add .

 git commit -m "code commit satge1"

 git remote add origin  <remote github respository>

 git push -u origin master



  From Eclipse Environment
  
  1. Right Click the Project-->New Git Respository

  2. Select the Local directory as Git Repsitotry path e.g. 
     D:\MyWebApp-Repos   

  3.Click Finish.-->Initliaze the local empty git repository

  4. Right click->Project->Team->Share Project  and select the local respository created above and click on Finish.

 5. Either Index all files or in strgaing area ad  all the files to staging and then locally commit.

 6. Add remote  gitHub respository to local git repository.
  Team->Push->Path of remore gitHub repository
 set the master as source and remore master acciordingly.


 7. Team->Push --to psuh the changes to github repository.



-------------------------
Remove File from Git Repository
 
First, unstage the  file  

To unstage a file, use the “git reset” command and specify the HEAD as source.

$ git reset HEAD newfile

use the “git rm” command with the “–cached” option in order to remove this file from the Git index ( 

$ git rm --cached newfile

Resonse-->rm 'newfile'

 git status
 
use the “git ls-files” command to list files that belong to the index.

$ git ls-files
-------------------------------


https://github.com/pbadhe34/LoginWebApp-Project

-----------------------------------
Clone the project 

git clone https://github.com/pbadhe34/WebLoginApp

Modify the code  and check status
git status

Aded the modified file to staging
git add *

 or
 git add <filename with path>

Commit the code
git commit -m "Login updated"

To push the code

//git remote add origin  https://github.com/pbadhe34/WebLoginApp

//fatal: remote origin already exists

git push -u origin master

// New remote add 

git remote add origin https://github.com/Hp-User/loginWebApp.git
git push -u origin main




 