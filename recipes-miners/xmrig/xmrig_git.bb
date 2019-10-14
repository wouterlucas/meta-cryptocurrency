SUMMARY = "RandomX, CryptoNight and Argon2 CPU miner"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

DEPENDS = "libuv openssl hwloc"

SRC_URI = "git://github.com/xmrig/xmrig.git;protocol=https;branch=master"
SRCREV = "919a6c0cc4af9b943a8f0ac0655f71777fd50bf1"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

do_install() {
    install -d "${D}${bindir}"
    install -m 755 "${B}/xmrig" "${D}${bindir}"
}

INSANE_SKIP_${PN} = "already-stripped"
