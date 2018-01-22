FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# set these from your local.conf
SSID ?= ""
PSK ?= ""

do_install_append() {
	install -m 600 ${WORKDIR}/wpa_supplicant.conf ${D}${sysconfdir}/wpa_supplicant.conf

	sed -i 's/%SSID/${SSID}/g' ${D}${sysconfdir}/wpa_supplicant.conf
	sed -i 's/%PSK/${PSK}/g' ${D}${sysconfdir}/wpa_supplicant.conf
}
