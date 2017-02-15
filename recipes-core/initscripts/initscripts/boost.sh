#!/bin/sh
### BEGIN INIT INFO
# Provides:          boost
# Required-Start:    mountall
# Required-Stop: 
# Default-Start:     S
# Default-Stop:
# Short-Description: Change governor to perfromance
# Description:
### END INIT INFO

. /etc/default/rcS


test "$VERBOSE" != no && echo "Change CPU governor ...."

#echo performance > /sys/devices/system/cpu/cpu0/cpufreq/scaling_governor
echo ondemand > /sys/devices/system/cpu/cpu0/cpufreq/scaling_governor

: exit 0

