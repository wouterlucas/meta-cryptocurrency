DESCRIPTION = "Cryptocurrency Miner/Wallet WiFi image for RPIs"
LICENSE = "MIT"

include hodl.inc

IMAGE_INSTALL += " linux-firmware-bcm43430 bluez5 i2c-tools python-smbus bridge-utils hostapd dhcp-server iptables wpa-supplicant"

DISTRO_FEATURES_append += " bluez5 bluetooth wifi"
