# haxe-skeleton
Приложение-скелетон для тестирования возможностей [Haxe](https://haxe.org/) -- кросс-платформенного языка программирования, в котором [заявлена](https://www.opennet.ru/opennews/art.shtml?num=54580) трансляция кода в JavaScript, C++, C#, Java, JVM, Python, Lua, PHP + исполнение на собственной виртуальной машине. Пишешь один раз -- получаешь код, исполняемый на нескольких платформах. Есть множество интересных [библиотек-расширений](https://lib.haxe.org/), включая [React Native](https://lib.haxe.org/p/react-native/).

Плагин Haxe для Intellij Idea оказался нерабочим, зато работает плагин VSCode.

![ide](https://raw.githubusercontent.com/Doctorrr/haxe-skeleton/main/screenshot.jpg)

Для тестирования использовал Linux Ubuntu, надо поставить интересующие языки программирования и библиотеки Haxe примерно так:
```sh
sudo apt-get install default-jdk
sudo apt install php8.1
sudo apt install php8.1-mbstring

haxelib install hxnodejs
haxelib install hxjava

JAVA_HOME=/usr/lib/jvm/java-1.11.0-openjdk-amd64
PATH=$PATH:$HOME/bin:$JAVA_HOME/bin
export JAVA_HOME
export JRE_HOME
export PATH
```

Для сборки программы достаточно запустить build.sh:
```sh
$ ./build.sh 
18:05:41  bulding js...
18:05:41  bulding python...
18:05:42  bulding php...
18:05:42  bulding java...
haxelib run hxjava hxjava_build.txt --haxe-version 4204 --feature-level 1 --out bin/java/Main
javac "-sourcepath" "src" "-d" "obj" "-g:none" "@cmd"

18:05:44  done.
```

Готово, трансляция и компиляция кода на разные языки записана в папку bin.

UPDATE: +см. [pache Thrif](https://thrift.apache.org/)
