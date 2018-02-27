# FAQ - how to work with it?
## This program works in relation to IDEA, but with the correct configuration you can work with it differently.

### At first you need to set your MySQL database settings:
1. Go to src\main\webapp\WEB-INF\mvc-dispatcher-servlet.xml
2. Find bean "dataSource" and put your settings there.
5. Install the programm using maven.
3. Create schema with name you put in "url" value.
   There create table "maint" with colunms:
  1) id - int - primekey, autoinc
  2) name - varchar
  3) date - varchar
  4) type - varchar
  5) sum - int
  6) place - varchar
  7) ch - boolean
4. Run this on your SM (i used Tomcat 8.5)

### If you have no IDE you can try to interact with files i put in NISF branch (just put them in your server gtp)
