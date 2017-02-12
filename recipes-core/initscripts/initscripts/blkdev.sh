#!/bin/sh
### BEGIN INIT INFO
# Provides:          blkdev
# Required-Start:    mountall
# Required-Stop: 
# Default-Start:     S
# Default-Stop:
# Short-Description: Change read ahead size
# Description:
### END INIT INFO

. /etc/default/rcS


test "$VERBOSE" != no && echo "Change read ahead size of filesystems..."

blockdev --setra 512 /dev/mmcblk0p2

: exit 0

