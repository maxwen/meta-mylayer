#
# Copyright (C) 2010 Intel Corporation
#

SUMMARY = "Linux Standard Base (LSB)"
DESCRIPTION = "Packages required to satisfy the Linux Standard Base (LSB) specification"
PR = "r10"
LICENSE = "MIT"

inherit packagegroup

VIRTUAL-RUNTIME_initscripts ?= "initscripts"
VIRTUAL-RUNTIME_init_manager ?= "sysvinit"
VIRTUAL-RUNTIME_login_manager ?= "busybox"
VIRTUAL-RUNTIME_syslog ?= "sysklogd"

PACKAGES = "\
    packagegroup-core-lsb-small \
"

RDEPENDS_packagegroup-core-lsb-small = "\
    ${VIRTUAL-RUNTIME_initscripts} \
    ${VIRTUAL-RUNTIME_init_manager} \
    ethtool \
    ${VIRTUAL-RUNTIME_login_manager} \
    ${VIRTUAL-RUNTIME_syslog} \
    curl \
    dhcp-client \
    gamin \
    libaio \
    lrzsz \
    lzo \
    mdadm \
    neon \
    parted \
    screen \
    setserial \
    sysstat \
    udev-extraconf \
    unzip \
    watchdog \
    wget \
    which \
    xinetd \
    zip \
    db \
    sqlite3 \
    gdbm \
    zlib \
    expat \
    gdbm \
    gmp \
    ncurses \
    openssl \
    readline \
    zip \
    chkconfig \
    gettext \
    gettext-runtime \
    lsbinitscripts \
    lsbtest \
    lsof \
    strace \
    libusb1 \
    usbutils \
    rpm \
    bash \
    bc \
    binutils \
    binutils-symlinks \
    coreutils \
    cpio \
    diffutils \
    ed \
    glibc-utils \
    elfutils \
    file \
    findutils \
    fontconfig-utils \
    gawk \
    grep \
    gzip \
    localedef \
    lsb \
    m4 \
    make \
    man \
    mktemp \
    msmtp \
    patch \
    pax \
    procps \
    psmisc \
    sed \
    shadow \
    tar \
    time \
    util-linux \
    xdg-utils \
    glibc \
    libgcc \
    libpam \
    libxml2 \
    ncurses \
    zlib \
    nspr \
    libpng12 \
    nss \
"

