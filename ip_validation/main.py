def is_valid_IP(IP_address):
    octets_in_IP = IP_address.split(".")
    octets_booleans = []
    number_of_octets = len(octets_in_IP)
    if number_of_octets == 4:
        for octet_in_IP in octets_in_IP:
            if octet_in_IP.isnumeric():
                if 0 <= int(octet_in_IP) <= 255:
                    if str(octet_in_IP).startswith("0") and len(str(octet_in_IP)) > 1:
                        octets_booleans.append(False)
                    else:
                        octets_booleans.append(True)
                else:
                    octets_in_IP_booleans.append(False)
            else:
                return False
        if all(octets_booleans):
            return True
        else:
            return False
    else:
        return False
print(is_valid_IP("255.255.255.0"))