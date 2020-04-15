
do_install_append() {
  mkdir -p ${D}${sysconfdir}/systemd/system/bluetooth.target.wants

  ln -sf /lib/systemd/system/bluetooth.service ${D}${sysconfdir}/systemd/system/dbus-org.bluez.service
  ln -sf /lib/systemd/system/bluetooth.service ${D}${sysconfdir}/systemd/system/bluetooth.target.wants/bluetooth.service
}
