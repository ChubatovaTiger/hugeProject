package subProj_716

import subProj_716.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_716")
    name = "subProj 716"

    buildType(subProj_bt_716_3)
    buildType(subProj_bt_716_2)
    buildType(subProj_bt_716_1)
    buildType(subProj_bt_716_0)
    buildType(subProj_bt_716_5)
    buildType(subProj_bt_716_4)
})
