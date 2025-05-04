whenever we power it the first program BIOS gets initialized and it perform hardware check POST (Power On Self Test) to check hardware.once its done it look for bootloader
(GRUB) in the MBR (Mater Boot Record) (this besically contain boot loader like GRUB to run the os & it contains partition info)
then it reads the config file usually /boot/grub/grub.cfg to know which os to load then it loads the linux kernal or temporary root filesystem
finally GRUB hands over control to the linux kernal and it starts running then u know it starts init system(systemd) which bring all the services up and login screen or shell.

POWER > BIOS (POST) > MBR > GRUB > KERNAL > INIT > LOGIN
