package subProj_1716

import subProj_1716.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1716")
    name = "subProj 1716"

    buildType(subProj_bt_1716_5)
    buildType(subProj_bt_1716_3)
    buildType(subProj_bt_1716_4)
    buildType(subProj_bt_1716_1)
    buildType(subProj_bt_1716_2)
    buildType(subProj_bt_1716_0)
})
