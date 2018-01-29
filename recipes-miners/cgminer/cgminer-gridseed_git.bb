include cgminer.inc

SUMMARY = "cgminer for the gridseed mining pods"

SRC_URI = "git://github.com/dmaxl/cgminer.git;protocol=https;branch=master"
SRCREV = "d1761d9f2a2adca568794ef267fb18d59e389964"
PV = "4.3.2+gitr${SRCPV}"

LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

PACKAGECONFIG_append 		= " gridseed"
PACKAGECONFIG[gridseed]  	= "--enable-scrypt --enable-gridseed,,"

# rename to cgminer_packagename, so we can co-exist multiple versions
do_install_append() {
	mv ${D}${bindir}/cgminer ${D}${bindir}/${PN}
}
