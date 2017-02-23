FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://wpa_supplicant.conf-maxwen \
"

do_install_append () {
	install -d ${D}${sysconfdir}
	install -m 600 ${WORKDIR}/wpa_supplicant.conf-maxwen ${D}${sysconfdir}/wpa_supplicant.conf
}
