#!/bin/sh
for languageName in 'js' 'python' 'php' 'java'; do
    now=$(date +"%T")
    echo "$now  bulding $languageName..."
    haxe ./build-$languageName.hxml
done
now=$(date +"%T")
echo "\r\n$now  done.\r\n"
