#!/bin/bash

set -o errexit
set -o pipefail
set -o nounset
set -o noglob

location=/appsmith-stacks/heap_dumps/ad-hoc/$(date "+%Y_%m_%d_%H_%S")/heap-profile;
mkdir -p $location; 
jcmd $(pgrep -f -- "-jar\sserver.jar") GC.heap_dump filename=$location/${HOSTNAME}.log