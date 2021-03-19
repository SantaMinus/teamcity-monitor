[![Build check on PR](https://github.com/SantaMinus/team-city-monitor/actions/workflows/pr_build_check.yml/badge.svg)](https://github.com/SantaMinus/team-city-monitor/actions/workflows/pr_build_check.yml)

This project is aimed to introduce a lightweight client to get data from the TeamCity API.

The main requirement is to get different users' running builds restricting info to the following fields:
- ID
- buildTypeId
- number
- status
- state

E.g., `id="‎3344879" buildTypeId="OpenSourceProjects_Sample_Buld" number="2025" status="UNKNOWN" state="finished"`

**Note**: in order to see the builds run by other users, you need to have a permission to view other users.
