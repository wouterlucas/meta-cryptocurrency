include cgminer.inc

SRC_URI = "git://github.com/ckolivas/cgminer.git;protocol=https;branch=master"
SRCREV = "fc33786a4b8699c95db382ab6fd4969a527cd5dd"
PV = "4.9+gitr${SRCPV}"

# rename to gekko specific cgminer binary, so we can co-exist multiple versions
do_install_append() {
	mv ${D}/usr/bin/cgminer ${D}/usr/bin/${PN}
}
