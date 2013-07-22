bytecode-javassist
==================

* project for studies about manipulation with bytecode using javassist.

* a simple example for change method body and reload the bytecode in runtime.



RUN THE TEST:

* add this arguments for JVM:

-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8000

* for more information about this arguments see:

http://www.csg.ci.i.u-tokyo.ac.jp/~chiba/javassist/html/javassist/util/HotSwapper.html


