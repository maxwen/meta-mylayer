FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://blkdev.sh \
	file://boost.sh \
"

do_install_append () {
	install -m 0755    ${WORKDIR}/blkdev.sh		${D}${sysconfdir}/init.d
	update-rc.d -r ${D} blkdev.sh start 05 S .
	install -m 0755    ${WORKDIR}/boost.sh		${D}${sysconfdir}/init.d
	update-rc.d -r ${D} boost.sh start 06 S .
}


