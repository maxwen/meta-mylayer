FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://blkdev.sh \
"

do_install_append () {
	install -m 0755    ${WORKDIR}/blkdev.sh		${D}${sysconfdir}/init.d
	update-rc.d -r ${D} blkdev.sh start 05 S .
}


