include cgminer.inc

SUMMARY = "cgminer for blake256r14"

SRC_URI = "git://github.com/nicehash/cgminer-blake256r14.git;protocol=https;branch=nicehash"
SRCREV = "7fcbd1e0b295df7ab8690516225ceb1cb8753b63"
PV = "4.3.2+gitr${SRCPV}"

LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

PACKAGECONFIG_append = " blake"
PACKAGECONFIG[gridseed]  	= "--enable-blake,,"

# rename to gekko specific cgminer binary, so we can co-exist multiple versions
do_install_append() {
	mv ${D}${bindir}/cgminer ${D}${bindir}/cgminer_blake256r14
}
