# GB_Final_Specialization

<details>
<summary> Задание 1:</summary>

```
wakhsavior@GB-Linux:~/GeekBrains/Final_Project$ cat >> Pets
Dogs
Cats
Hamsters
wakhsavior@GB-Linux:~/GeekBrains/Final_Project$ cat Pets
Dogs
Cats
Hamsters
wakhsavior@GB-Linux:~/GeekBrains/Final_Project$

wakhsavior@GB-Linux:~/GeekBrains/Final_Project$ cat >> Pack_Animals
Horses
Camels
Donkeys
wakhsavior@GB-Linux:~/GeekBrains/Final_Project$ cat Pack_Animals
Horses
Camels
Donkeys
wakhsavior@GB-Linux:~/GeekBrains/Final_Project$



wakhsavior@GB-Linux:~/GeekBrains/Final_Project$ cat P* | cat >> Friends
wakhsavior@GB-Linux:~/GeekBrains/Final_Project$ cat Friends
Horses
Camels
Donkeys
Dogs
Cats
Hamsters
wakhsavior@GB-Linux:~/GeekBrains/Final_Project$
```
</details>

<details>
<summary>Задание 2:</summary>

```
wakhsavior@GB-Linux:~/GeekBrains/Final_Project$ mkdir Animals
wakhsavior@GB-Linux:~/GeekBrains/Final_Project$ mv
Animals/      Friends       .git/         Pack_Animals  Pets          README.md
wakhsavior@GB-Linux:~/GeekBrains/Final_Project$ mv Friends Animals/
wakhsavior@GB-Linux:~/GeekBrains/Final_Project$
```
</details>

<details>
<summary>Задание 3:</summary>

```
wakhsavior@GB-Linux:~/GeekBrains/Final_Project$ wget https://dev.mysql.com/get/mysql-apt-config_0.8.26-1_all.deb
--2023-10-05 16:25:57--  https://dev.mysql.com/get/mysql-apt-config_0.8.26-1_all.deb
Resolving dev.mysql.com (dev.mysql.com)... 184.51.238.43, 2001:2030:21:1a9::2e31, 2001:2030:21:19e::2e31
Connecting to dev.mysql.com (dev.mysql.com)|184.51.238.43|:443... connected.
HTTP request sent, awaiting response... 302 Moved Temporarily
Location: https://repo.mysql.com//mysql-apt-config_0.8.26-1_all.deb [following]
--2023-10-05 16:25:58--  https://repo.mysql.com//mysql-apt-config_0.8.26-1_all.deb
Resolving repo.mysql.com (repo.mysql.com)... 2.22.239.224, 2a02:26f0:e2:782::1d68, 2a02:26f0:e2:780::1d68
Connecting to repo.mysql.com (repo.mysql.com)|2.22.239.224|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 18088 (18K) [application/x-debian-package]
Saving to: ‘mysql-apt-config_0.8.26-1_all.deb’

mysql-apt-config_0.8.26-1_all.deb                          100%[=====================================================================================================================================>]  17,66K  --.-KB/s    in 0,001s

2023-10-05 16:25:58 (18,0 MB/s) - ‘mysql-apt-config_0.8.26-1_all.deb’ saved [18088/18088]

wakhsavior@GB-Linux:~/GeekBrains/Final_Project$ ls
Animals  mysql-apt-config_0.8.26-1_all.deb  Pack_Animals  Pets  README.md
wakhsavior@GB-Linux:~/GeekBrains/Final_Project$ sudo dpkg -i mysql-apt-config_0.8.26-1_all.deb
[sudo] password for wakhsavior:
Selecting previously unselected package mysql-apt-config.
(Reading database ... 251683 files and directories currently installed.)
Preparing to unpack mysql-apt-config_0.8.26-1_all.deb ...
Unpacking mysql-apt-config (0.8.26-1) ...
Setting up mysql-apt-config (0.8.26-1) ...

wakhsavior@GB-Linux:~/GeekBrains/Final_Project$ cat /etc/apt/sources.list.d/mysql.list
### THIS FILE IS AUTOMATICALLY CONFIGURED ###
# You may comment out entries below, but any other modifications may be lost.
# Use command 'dpkg-reconfigure mysql-apt-config' as root for modifications.
deb [signed-by=/usr/share/keyrings/mysql-apt-config.gpg] http://repo.mysql.com/apt/ubuntu/ jammy mysql-apt-config
deb [signed-by=/usr/share/keyrings/mysql-apt-config.gpg] http://repo.mysql.com/apt/ubuntu/ jammy mysql-8.0
deb [signed-by=/usr/share/keyrings/mysql-apt-config.gpg] http://repo.mysql.com/apt/ubuntu/ jammy mysql-tools
#deb [signed-by=/usr/share/keyrings/mysql-apt-config.gpg] http://repo.mysql.com/apt/ubuntu/ jammy mysql-tools-preview
deb-src [signed-by=/usr/share/keyrings/mysql-apt-config.gpg] http://repo.mysql.com/apt/ubuntu/ jammy mysql-8.0
wakhsavior@GB-Linux:~/GeekBrains/Final_Project$
```
</details>

<details>
<summary>Задание 4:</summary>

```
wakhsavior@GB-Linux:~/GeekBrains/Final_Project$ sudo apt update
Hit:1 http://ru.archive.ubuntu.com/ubuntu jammy InRelease
Get:2 http://ru.archive.ubuntu.com/ubuntu jammy-updates InRelease [119 kB]
Get:3 http://ru.archive.ubuntu.com/ubuntu jammy-backports InRelease [109 kB]
Hit:4 https://download.virtualbox.org/virtualbox/debian jammy InRelease
Hit:5 https://download.docker.com/linux/ubuntu jammy InRelease
Get:6 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 Packages [1 056 kB]
Get:7 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main i386 Packages [503 kB]
Get:8 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main Translation-en [232 kB]
Get:9 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 DEP-11 Metadata [101 kB]
Get:10 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 c-n-f Metadata [15,6 kB]
Get:11 http://ru.archive.ubuntu.com/ubuntu jammy-updates/restricted amd64 Packages [969 kB]
Get:12 http://ru.archive.ubuntu.com/ubuntu jammy-updates/restricted i386 Packages [32,3 kB]
Get:13 http://ru.archive.ubuntu.com/ubuntu jammy-updates/restricted Translation-en [156 kB]
Get:14 http://ru.archive.ubuntu.com/ubuntu jammy-updates/restricted amd64 c-n-f Metadata [532 B]
Get:15 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe amd64 Packages [989 kB]
Get:16 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe i386 Packages [658 kB]
Get:17 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe Translation-en [216 kB]
Get:18 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe amd64 DEP-11 Metadata [291 kB]
Get:19 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe DEP-11 48x48 Icons [204 kB]
Get:20 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe DEP-11 64x64 Icons [311 kB]
Get:21 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe amd64 c-n-f Metadata [21,9 kB]
Get:22 http://ru.archive.ubuntu.com/ubuntu jammy-updates/multiverse amd64 Packages [41,6 kB]
Get:23 http://ru.archive.ubuntu.com/ubuntu jammy-updates/multiverse amd64 DEP-11 Metadata [940 B]
Get:24 http://ru.archive.ubuntu.com/ubuntu jammy-updates/multiverse amd64 c-n-f Metadata [472 B]
Get:25 http://ru.archive.ubuntu.com/ubuntu jammy-backports/main amd64 DEP-11 Metadata [4 940 B]
Get:26 http://ru.archive.ubuntu.com/ubuntu jammy-backports/universe i386 Packages [13,4 kB]
Get:27 http://ru.archive.ubuntu.com/ubuntu jammy-backports/universe amd64 Packages [24,3 kB]
Get:28 http://ru.archive.ubuntu.com/ubuntu jammy-backports/universe amd64 DEP-11 Metadata [17,9 kB]
Get:29 http://ru.archive.ubuntu.com/ubuntu jammy-backports/universe amd64 c-n-f Metadata [640 B]
Get:30 http://security.ubuntu.com/ubuntu jammy-security InRelease [110 kB]
Get:31 http://repo.mysql.com/apt/ubuntu jammy InRelease [20,3 kB]
Get:32 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 Sources [963 B]
Get:33 http://repo.mysql.com/apt/ubuntu jammy/mysql-apt-config amd64 Packages [565 B]
Get:34 http://repo.mysql.com/apt/ubuntu jammy/mysql-apt-config i386 Packages [565 B]
Get:35 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 amd64 Packages [12,7 kB]
Get:36 http://repo.mysql.com/apt/ubuntu jammy/mysql-tools amd64 Packages [8 011 B]
Get:37 http://repo.mysql.com/apt/ubuntu jammy/mysql-tools i386 Packages [457 B]
Get:38 http://security.ubuntu.com/ubuntu jammy-security/main i386 Packages [345 kB]
Get:39 http://security.ubuntu.com/ubuntu jammy-security/main amd64 Packages [856 kB]
Get:40 http://security.ubuntu.com/ubuntu jammy-security/main Translation-en [175 kB]
Get:41 http://security.ubuntu.com/ubuntu jammy-security/main amd64 DEP-11 Metadata [43,1 kB]
Get:42 http://security.ubuntu.com/ubuntu jammy-security/main amd64 c-n-f Metadata [11,4 kB]
Get:43 http://security.ubuntu.com/ubuntu jammy-security/restricted i386 Packages [32,0 kB]
Get:44 http://security.ubuntu.com/ubuntu jammy-security/restricted amd64 Packages [953 kB]
Get:45 http://security.ubuntu.com/ubuntu jammy-security/restricted Translation-en [154 kB]
Get:46 http://security.ubuntu.com/ubuntu jammy-security/restricted amd64 c-n-f Metadata [532 B]
Get:47 http://security.ubuntu.com/ubuntu jammy-security/universe i386 Packages [560 kB]
Get:48 http://security.ubuntu.com/ubuntu jammy-security/universe amd64 Packages [788 kB]
Get:49 http://security.ubuntu.com/ubuntu jammy-security/universe Translation-en [144 kB]
Get:50 http://security.ubuntu.com/ubuntu jammy-security/universe amd64 DEP-11 Metadata [40,1 kB]
Get:51 http://security.ubuntu.com/ubuntu jammy-security/universe amd64 c-n-f Metadata [16,7 kB]
Get:52 http://security.ubuntu.com/ubuntu jammy-security/multiverse amd64 Packages [36,5 kB]
Get:53 http://security.ubuntu.com/ubuntu jammy-security/multiverse amd64 c-n-f Metadata [260 B]
Fetched 10,4 MB in 7s (1 422 kB/s)
Reading package lists... Done
Building dependency tree... Done
Reading state information... Done

wakhsavior@GB-Linux:~/GeekBrains/Final_Project$ sudo apt install mysql-server
Reading package lists... Done
Building dependency tree... Done
Reading state information... Done
The following packages were automatically installed and are no longer required:
  libcgi-fast-perl libcgi-pm-perl libevent-pthreads-2.1-7 libfcgi-bin libfcgi-perl libfcgi0ldbl libhtml-template-perl libprotobuf-lite23
Use 'sudo apt autoremove' to remove them.
The following additional packages will be installed:
  mysql-client mysql-common mysql-community-client mysql-community-client-core mysql-community-client-plugins mysql-community-server mysql-community-server-core
The following packages will be REMOVED:
  mysql-client-8.0 mysql-client-core-8.0 mysql-server-8.0 mysql-server-core-8.0
The following NEW packages will be installed:
  mysql-client mysql-community-client mysql-community-client-core mysql-community-client-plugins mysql-community-server mysql-community-server-core
The following packages will be upgraded:
  mysql-common mysql-server
2 upgraded, 6 newly installed, 4 to remove and 131 not upgraded.
Need to get 30,7 MB of archives.
After this operation, 32,6 MB of additional disk space will be used.
Do you want to continue? [Y/n] y
Get:1 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 amd64 mysql-server amd64 8.0.34-1ubuntu22.04 [66,4 kB]
Get:2 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 amd64 mysql-common amd64 8.0.34-1ubuntu22.04 [67,7 kB]
Get:3 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 amd64 mysql-community-client-plugins amd64 8.0.34-1ubuntu22.04 [1 435 kB]
Get:4 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 amd64 mysql-community-client-core amd64 8.0.34-1ubuntu22.04 [2 087 kB]
Get:5 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 amd64 mysql-community-client amd64 8.0.34-1ubuntu22.04 [2 113 kB]
Get:6 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 amd64 mysql-client amd64 8.0.34-1ubuntu22.04 [66,4 kB]
Get:7 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 amd64 mysql-community-server-core amd64 8.0.34-1ubuntu22.04 [24,8 MB]
Get:8 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 amd64 mysql-community-server amd64 8.0.34-1ubuntu22.04 [78,2 kB]
Fetched 30,7 MB in 3s (8 898 kB/s)
Preconfiguring packages ...
(Reading database ... 251688 files and directories currently installed.)
Preparing to unpack .../mysql-server_8.0.34-1ubuntu22.04_amd64.deb ...
Unpacking mysql-server (8.0.34-1ubuntu22.04) over (8.0.34-0ubuntu0.22.04.1) ...
(Reading database ... 251692 files and directories currently installed.)
Removing mysql-server-8.0 (8.0.34-0ubuntu0.22.04.1) ...
update-alternatives: using /etc/mysql/my.cnf.fallback to provide /etc/mysql/my.cnf (my.cnf) in auto mode
Removing mysql-client-8.0 (8.0.34-0ubuntu0.22.04.1) ...
Removing mysql-client-core-8.0 (8.0.34-0ubuntu0.22.04.1) ...
Removing mysql-server-core-8.0 (8.0.34-0ubuntu0.22.04.1) ...
(Reading database ... 251489 files and directories currently installed.)
Preparing to unpack .../0-mysql-common_8.0.34-1ubuntu22.04_amd64.deb ...
Unpacking mysql-common (8.0.34-1ubuntu22.04) over (5.8+1.0.8) ...
Selecting previously unselected package mysql-community-client-plugins.
Preparing to unpack .../1-mysql-community-client-plugins_8.0.34-1ubuntu22.04_amd64.deb ...
Unpacking mysql-community-client-plugins (8.0.34-1ubuntu22.04) ...
Selecting previously unselected package mysql-community-client-core.
Preparing to unpack .../2-mysql-community-client-core_8.0.34-1ubuntu22.04_amd64.deb ...
Unpacking mysql-community-client-core (8.0.34-1ubuntu22.04) ...
Selecting previously unselected package mysql-community-client.
Preparing to unpack .../3-mysql-community-client_8.0.34-1ubuntu22.04_amd64.deb ...
Unpacking mysql-community-client (8.0.34-1ubuntu22.04) ...
Selecting previously unselected package mysql-client.
Preparing to unpack .../4-mysql-client_8.0.34-1ubuntu22.04_amd64.deb ...
Unpacking mysql-client (8.0.34-1ubuntu22.04) ...
Selecting previously unselected package mysql-community-server-core.
Preparing to unpack .../5-mysql-community-server-core_8.0.34-1ubuntu22.04_amd64.deb ...
Unpacking mysql-community-server-core (8.0.34-1ubuntu22.04) ...
Selecting previously unselected package mysql-community-server.
Preparing to unpack .../6-mysql-community-server_8.0.34-1ubuntu22.04_amd64.deb ...
Unpacking mysql-community-server (8.0.34-1ubuntu22.04) ...
Setting up mysql-common (8.0.34-1ubuntu22.04) ...
Installing new version of config file /etc/mysql/conf.d/mysql.cnf ...
Installing new version of config file /etc/mysql/my.cnf.fallback ...
Setting up mysql-community-server-core (8.0.34-1ubuntu22.04) ...
Setting up mysql-community-client-plugins (8.0.34-1ubuntu22.04) ...
Setting up mysql-community-client-core (8.0.34-1ubuntu22.04) ...
Setting up mysql-community-client (8.0.34-1ubuntu22.04) ...
Setting up mysql-client (8.0.34-1ubuntu22.04) ...
Setting up mysql-community-server (8.0.34-1ubuntu22.04) ...
Installing new version of config file /etc/apparmor.d/usr.sbin.mysqld ...
Installing new version of config file /etc/mysql/mysql.cnf ...

Configuration file '/etc/mysql/mysql.conf.d/mysqld.cnf'
 ==> Modified (by you or by a script) since installation.
 ==> Package distributor has shipped an updated version.
   What would you like to do about it ?  Your options are:
    Y or I  : install the package maintainer's version
    N or O  : keep your currently-installed version
      D     : show the differences between the versions
      Z     : start a shell to examine the situation
 The default action is to keep your current version.
*** mysqld.cnf (Y/I/N/O/D/Z) [default=N] ?
update-alternatives: using /etc/mysql/mysql.cnf to provide /etc/mysql/my.cnf (my.cnf) in auto mode
Setting up mysql-server (8.0.34-1ubuntu22.04) ...
Processing triggers for man-db (2.10.2-1) ...
Processing triggers for libc-bin (2.35-0ubuntu3.1) ...
wakhsavior@GB-Linux:~/GeekBrains/Final_Project$


wakhsavior@GB-Linux:~/GeekBrains/Final_Project$ sudo apt purge mysql-server
Reading package lists... Done
Building dependency tree... Done
Reading state information... Done
The following packages were automatically installed and are no longer required:
  libcgi-fast-perl libcgi-pm-perl libevent-pthreads-2.1-7 libfcgi-bin libfcgi-perl libfcgi0ldbl libhtml-template-perl libmecab2 libprotobuf-lite23 mecab-ipadic mecab-ipadic-utf8 mecab-utils mysql-client mysql-common
  mysql-community-client mysql-community-client-core mysql-community-client-plugins mysql-community-server mysql-community-server-core
Use 'sudo apt autoremove' to remove them.
The following packages will be REMOVED:
  mysql-server*
0 upgraded, 0 newly installed, 1 to remove and 131 not upgraded.
After this operation, 77,8 kB disk space will be freed.
Do you want to continue? [Y/n] y
(Reading database ... 251756 files and directories currently installed.)
Removing mysql-server (8.0.34-1ubuntu22.04) ...
wakhsavior@GB-Linux:~/GeekBrains/Final_Project$
```
</details>

<details>
<summary>Задание 5:</summary>

```
wakhsavior@GB-Linux:~/GeekBrains/Final_Project$ history
 1583  cd Final_Project/
 1584  ls
 1585  ls -la
 1586  git push -u origin main
 1587  ssh-keygen
 1588  git push -u origin main
 1589  ssh -vT git@github.com
 1590  cat /home/wakhsavior/.ssh/
 1591  cat /home/wakhsavior/.ssh/id_rsa
 1592  cat /home/wakhsavior/.ssh/id_rsa.pub
 1593  git push -u origin main
 1594  exit
 1595  cd GeekBrains/Final_Project/
 1596  ls
 1597  cat >> Pets
 1598  cat Pets
 1599  cat >> Pack_Animals
 1600  cat Pack_Animals
 1601  git checkout -b Linux_commands
 1602  git status
 1603  git log
 1604  git log --one-line
 1605  git log --one-lines
 1606  git log -one-lines
 1607  git log --all --one-line
 1608  git log --all
 1609  cat * | cat >> Friends
 1610  cat Friends
 1611  rm Friends
 1612  cat P* | cat >> Friends
 1613  cat Friends
 1614  cd Animals
 1615  mkdir Animals
 1616  mv Friends Animals/
 1617  wget https://dev.mysql.com/get/mysql-apt-config_0.8.26-1_all.deb
 1618  ls
 1619  sudo dpkg -i mysql-apt-config_0.8.26-1_all.deb
 1620  cat /etc/apt/sources.list
 1621  cat /etc/apt/sources.list.d/mysql.list
 1622  sudo apt update
 1623  sudo apt install mysql-server
 1624  sudo apt purge mysql-server
 1625  history >> history.list
```

</details>
<details>
<summary>Задание 6:</summary>


</details>
<details>
<summary>Задание 7:</summary>


</details>
<details>
<summary>Задание 8:</summary>

</details>

</details>
<details>
<summary>Задание 9:</summary>

</details>

</details>
<details>
<summary>Задание 10:</summary>

</details>





