## Problem  

The application was not accessible via the EC2 public IP despite the container running successfully.  

## Root Cause  

The EC2 Security Group did not allow inbound HTTP traffic on port 80.  

## Solution  

Added an inbound rule to allow HTTP (TCP 80) traffic.  
Once updated, the application became accessible via:  

http://<EC2_PUBLIC_IP>
