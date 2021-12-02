package subProj_614

import subProj_614.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_614")
    name = "subProj 614"

    buildType(subProj_bt_614_4)
    buildType(subProj_bt_614_3)
    buildType(subProj_bt_614_5)
    buildType(subProj_bt_614_0)
    buildType(subProj_bt_614_2)
    buildType(subProj_bt_614_1)
})
